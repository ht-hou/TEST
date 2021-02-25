package com.ttttt.demo.pojo;

import java.io.Serializable;

public class CityNowWeather implements Serializable {
    private String id;
    private String shidu;
    private String pm10;
    private String quality;
    private String wendu;
    private String ganmao;
    private String pm25;

    @Override
    public String toString() {
        return "CityNowWeather{" +
                "id='" + id + '\'' +
                ", shidu='" + shidu + '\'' +
                ", pm10='" + pm10 + '\'' +
                ", quality='" + quality + '\'' +
                ", wendu='" + wendu + '\'' +
                ", ganmao='" + ganmao + '\'' +
                ", pm25='" + pm25 + '\'' +
                '}';
    }

    public CityNowWeather() {
    }

    public CityNowWeather(String id, String shidu, String pm10, String quality, String wendu, String ganmao, String pm25) {
        this.id = id;
        this.shidu = shidu;
        this.pm10 = pm10;
        this.quality = quality;
        this.wendu = wendu;
        this.ganmao = ganmao;
        this.pm25 = pm25;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getShidu() {
        return shidu;
    }

    public void setShidu(String shidu) {
        this.shidu = shidu;
    }

    public String getPm10() {
        return pm10;
    }

    public void setPm10(String pm10) {
        this.pm10 = pm10;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public String getWendu() {
        return wendu;
    }

    public void setWendu(String wendu) {
        this.wendu = wendu;
    }

    public String getGanmao() {
        return ganmao;
    }

    public void setGanmao(String ganmao) {
        this.ganmao = ganmao;
    }

    public String getPm25() {
        return pm25;
    }

    public void setPm25(String pm25) {
        this.pm25 = pm25;
    }
}
