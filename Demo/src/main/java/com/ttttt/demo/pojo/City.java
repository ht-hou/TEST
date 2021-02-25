package com.ttttt.demo.pojo;

import java.io.Serializable;

public class City implements Serializable {
    private String id;
    private String pid;
    private String cityCode;
    private String cityName;

    @Override
    public String toString() {
        return "City{" +
                "id='" + id + '\'' +
                ", pid='" + pid + '\'' +
                ", cityCode='" + cityCode + '\'' +
                ", cityName='" + cityName + '\'' +
                '}';
    }

    public City() {
    }

    public City(String id, String pid, String cityCode, String cityName) {
        this.id = id;
        this.pid = pid;
        this.cityCode = cityCode;
        this.cityName = cityName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}
