//package com.ttttt.demo.common;
//
//import com.alibaba.fastjson.JSON;
//import org.junit.jupiter.api.Test;
//
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Map;
//
//
//public class test {
//private String json=null;
////    @Test
//    public void test(){
//        String s = "[{\"d\":\"dd\",\"a\":\"aa\"}]";
//        //String substring = s.substring(1, s.length() - 1);
//     //   System.out.println(substring);
//        json=new String(s);
//        List parse = (List)JSON.parse(json);
//        Map parse1 = (Map)JSON.parse( parse.get(0).toString());
//        System.out.println(parse1.get("d"));
//    }
////    @Test
//    public void testtt() {
//
//                OkHttpApi api = new OkHttpApi();
//                String run = null;
//                String Authorization = "Bearer 33769fc4-e13a-4439-8fe1-e78c50d47ece";
//                String beginTime = "2021-02-01";
//                String endTime = "2021-02-24";
//                String current = "1";
//                String size = "1";
//                try {
//                    run = api.run("http://172.20.99.165:9100/prod-api/session/user/getCallLogReport?beginTime=" + beginTime + "&endTime=" + endTime + "&current=" + current + "&size=" + size + "&Authorization=" + Authorization);
//                } catch (IOException e) {
//                    System.out.println("连接错误");
//                }
//
//                //map存储前台传过来的数据
//                Map map = (Map) JSON.parse(run);
//                 Map map1 = (Map)  JSON.parse(map.get("data").toString());
//              List<Map> records =(List<Map>) JSON.parse(map1.get("records").toString());
//
//                System.out.println(map);
//                System.out.println(map.get("data"));
//                System.out.println(records.get(0).get("talkTime"));
//             //   System.out.println(map.get("data").get("records").get("talkTime"));
//            }
//        }
