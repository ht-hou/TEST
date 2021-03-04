package com.ex.coor.common;

import com.ex.coor.entity.pojo.ParamData;

import java.util.HashMap;

import static java.lang.Math.PI;

public class CoorUtils {
    private static Double CR = 6378.1370;//赤道半径
    private static Double JR = 6356.7523;//极半径
    //经纬度
    //球面上的圆
    //已知 圆心  一个点的坐标  圆弧长度 半径
    //（0.0.0）  （经，纬，z）  ？ 米      R
    //求四个点 同纬度两个 同经度两个
    // （x1，纬，z），（x2，纬，z），（经，Y1，z）（经，Y2，z）
    //
    //确定切面方程
    //圈定范围
    //城运
    //圆的范围
    //(x-a)²+(y-b)²=r²
    //在圆内
    //(x-a)²+(y-b)²<r²

    //Gps和高德
    public double[] GPSAndGd(ParamData paramData) {

        //  System.out.println(Math.cos((31.2037)));
        //  System.out.println(Math.cos((31.2037)*(PI/180)));
        //  System.out.println(v);
        // ParamData paramData = new ParamData(121.6515, 31.2037, 3, 123);
        Double latitude = paramData.getX();
        Double longitude = paramData.getY();

        //单位距离对应经度
        Double degree = (JR * 2 * PI * 1000) / 360.0;

        double v = CR * (Math.cos((31.2037) * (PI / 180)));
        //单位距离对应纬度
        double degree1 = (v * 2 * PI * 1000) / 360;


        double raidusMile = paramData.getRaidus();

        Double dpmLat = 1 / degree1;
        Double radiusLat = dpmLat * raidusMile;
        Double minLat = latitude - radiusLat;
        Double maxLat = latitude + radiusLat;

        // Double mpdLng = degree * Math.cos(latitude * (PI / 180));
        Double dpmLng = 1 / degree;
        Double radiusLng = dpmLng * raidusMile;
        Double minLng = longitude - radiusLng;
        Double maxLng = longitude + radiusLng;
//        HashMap<String, Object> map = new HashMap<>();
//        map.put("minLat",minLat);
//        map.put("minLng",minLng);
//        map.put("maxLat",maxLat);
//        map.put("maxLng",maxLng);
        // return map;
        return new double[]{minLat, minLng, maxLat, maxLng};
        //   System.out.println(minLat+"-"+ minLng+"-"+ maxLat+"-"+maxLng);
    }
}
