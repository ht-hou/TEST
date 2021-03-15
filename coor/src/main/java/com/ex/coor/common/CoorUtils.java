package com.ex.coor.common;

import com.ex.coor.entity.pojo.ParamData;
import com.ex.coor.entity.pojo.ParamDto;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.Bean;

import static java.lang.Math.PI;


public class CoorUtils {
    private static Double CR = 6378.1370;//赤道半径
    private static Double JR = 6356.7523;//极半径

//    private static Double R = 6370.8560;//平均半径

//    @Test
//    //理想球体
//    public void test() {
//        ParamData paramData = new ParamData(121.6515, 31.2037, 3, 999999);
//        ParamDto paramDto = GPSAndGd(paramData);
//        //单位经度的长度
//        Double degree = (R * 2 * PI * 1000) / 360.0;
//        //单位纬度的长度
//        //double v = R * (Math.cos((paramData.getY()) * (PI / 180)));
//        //单位纬度对应距离
//        double degree1 = (R * (Math.cos((paramData.getY()) * (PI / 180))) * 2 * PI * 1000) / 360;
//
//    }

    //经纬度
    //球的方程
    //      （r,|90-纬|,经）
    //球坐标系(r,θ,φ)
    //X^2+Y^2+Z^2=R^2
    //x=rsinθcosφ.
    //y=rsinθsinφ.
    //z=rcosθ.
    //球面上的圆
    //已知 圆心  一个点的坐标  圆弧长度 半径
    //（0.0.0）
    // （经，纬，z）  ？ 米      R
    //(121.6515, 31.2037,z)
    // 123
    //求四个点 同纬度两个 同经度两个
    // （x1，纬，z）                     （x2，纬，z），
    //(121.65020818659615, 31.2037,z)(121.65279181340385, 31.2037,z)
//    （经，Y1，z）                      （经，Y2，z）
//    (121.6515, 31.202591355121687,z),(121.6515, 31.204808644878316,z)
    //确定切面方程
    //圈定范围
    //城运
    //圆的范围
    //(x-a)²+(y-b)²=r²
    //在圆内
    //(x-a)²+(y-b)²<r²
    // @Test
    //Gps和高德 非理想球
    public static ParamDto GPSAndGd(ParamData paramData) {
//    public void GPSAndGd( ) {
        //  System.out.println(Math.cos((31.2037)));
        //  System.out.println(Math.cos((31.2037)*(PI/180)));
        //  System.out.println(v);
        //  ParamData paramData = new ParamData(121.6515, 31.2037, 3, 999999);
        Double longitude = paramData.getX();
        Double latitude = paramData.getY();

        //单位经度对应距离
        Double degree = (JR * 2 * PI * 1000) / 360.0;

        double v = CR * (Math.cos((latitude) * (PI / 180)));

        //单位纬度对应距离
        double degree1 = (v * 2 * PI * 1000) / 360;


        double raidusMile = paramData.getRaidus();

        Double dpmLat = 1 / degree1;
        double radiusLat = dpmLat * raidusMile;
        //  System.out.println(radiusLat);
//        Double minLat = latitude - radiusLat;
//        Double maxLat = latitude + radiusLat;

        // Double mpdLng = degree * Math.cos(latitude * (PI / 180));
        Double dpmLng = 1 / degree;
        double radiusLng = dpmLng * raidusMile;
        //  System.out.println(radiusLng);
//        Double minLng = longitude - radiusLng;
//        Double maxLng = longitude + radiusLng;

        return new ParamDto(paramData.getCtId(), radiusLat, radiusLng, paramData.getX(), paramData.getY());
//        HashMap<String, Object> map = new HashMap<>();
//        map.put("minLat",minLat);
//        map.put("minLng",minLng);
//        map.put("maxLat",maxLat);
//        map.put("maxLng",maxLng);
//        return map;
        //pow((x-jingdu),2)/pow(radiusLat,2)+pow((y-weidu),2)/pow(radiusLng,2)<1
        //  System.out.println(minLat + "-" + minLng + "-" + maxLat + "-" + maxLng);
//        return new ParamDto(paramData.getCtId(), minLat, minLng, maxLat, maxLng);
        // return new ParamDto(paramData.getCtId(), minLat, minLng, maxLat, maxLng,radiusLat,radiusLng,paramData.getX(),paramData.getY());
        // System.out.println(minLat*PI/180 + "-" + minLng*PI/180 + "-" + maxLat*PI/180 + "-" + maxLng*PI/180);
        // System.out.println(minLat + "-" + minLng + "-" + maxLat + "-" + maxLng);
    }
}
