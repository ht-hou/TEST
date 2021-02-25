package com.t.ud.utils;

public class FileControl {



    public static final String[] MEDIA_EXTENSION = {"swf", "flv", "mp3", "wav", "wma", "wmv", "mid", "avi", "mpg",
            "asf", "rm", "rmvb","swf", "flv","bmp", "gif", "jpg", "jpeg", "png"};


    public static boolean LJ(String lastName){

        for (String TG:
             MEDIA_EXTENSION) {
            boolean equals = TG.equals(lastName);
            if (equals){
                return true;
            }
        }
        return false;
    }
}
