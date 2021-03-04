package com.ttttt.demo.common;

import com.alibaba.fastjson.JSON;
import com.ttttt.demo.pojo.City;
import com.ttttt.demo.pojo.CityMoreWeather;
import com.ttttt.demo.pojo.CityNowWeather;
import com.ttttt.demo.service.WeatherService;
import org.apache.http.HttpEntity;
import org.apache.http.HttpException;
import org.apache.http.StatusLine;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Map;

@Component
public class HourGet {
    private static CloseableHttpClient client = HttpClientBuilder.create().build();
    private static String json = null;
    private static HttpGet httpGet = new HttpGet();
    private static CloseableHttpResponse response = null;
    static Integer time = 0;

    @Resource
    WeatherService weatherService;

    public synchronized void doGetWeather(List<City> cities) throws IOException {

        System.out.println(cities.size());
        System.out.println(cities.get(0));


        for (City city : cities) {
            try {
                Thread.sleep(30 * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            boolean get = httpGetCity(city);

            while (!get) {
                System.out.println("请求失败");
                return;
            }

        }


    }


    private synchronized boolean httpGetCity(City city)
        //  @Test
        // public void httpGet()
            throws IOException {

        // 设置参数
        String cityCode = city.getCityCode();
        String id = city.getCityCode();
        //String id = "2";
        System.out.println(cityCode);
        try {
            httpGet.setURI(new URI("http://t.weather.itboy.net/api/weather/city/" + cityCode));
            //  httpGet.setURI(new URI("http://t.weather.itboy.net/api/weather/city/" + "101040400"));
        } catch (URISyntaxException e) {
            try {
                throw new HttpException("请求url格式错误。" + e.getMessage());
            } catch (HttpException e1) {
                e1.printStackTrace();
            }
        }
        // 发送请求
        response = client.execute(httpGet);
        // 获取返回的数据
        HttpEntity entity = response.getEntity();
        byte[] body = EntityUtils.toByteArray(entity);
        StatusLine sL = response.getStatusLine();
        int statusCode = sL.getStatusCode();
        if (statusCode == 200) {
            json = new String(body);
            Map map = (Map) JSON.parse(json);
            String s = map.get("status").toString();
            if ("200".equals(s)) {
                Map data = (Map) map.get("data");
                toDX(data, id);
            }
            return true;
        } else {

            try {
                throw new HttpException("statusCode=" + statusCode);

            } catch (HttpException e) {
                e.printStackTrace();
            }
        }
        //  System.out.println(json);
        return false;
    }

    private synchronized void toDX(Map data, String code) {
        String id = code.trim();
        CityNowWeather cityNowWeather = new CityNowWeather();
        cityNowWeather.setShidu(data.get("shidu").toString());
        cityNowWeather.setPm25(data.get("pm25").toString());
        cityNowWeather.setPm10(data.get("pm10").toString());
        cityNowWeather.setGanmao(data.get("ganmao").toString());
        cityNowWeather.setWendu(data.get("wendu").toString());
        cityNowWeather.setQuality(data.get("quality").toString());
        cityNowWeather.setId(id);
        String yesterdayData = String.valueOf(data.get("yesterday"));
        String forecast = String.valueOf(data.get("forecast"));
        // String forecast = (String) data.get("forecast");
        CityMoreWeather yesterday = JSON.parseObject(yesterdayData, CityMoreWeather.class);
        List<CityMoreWeather> cityMoreWeathers = JSON.parseArray(forecast, CityMoreWeather.class);
        cityMoreWeathers.add(yesterday);
        for (CityMoreWeather cityMoreWeather :
                cityMoreWeathers) {
            cityMoreWeather.setId(id);
        }

        weatherService.SetWeather(cityNowWeather, cityMoreWeathers);

    }

}
