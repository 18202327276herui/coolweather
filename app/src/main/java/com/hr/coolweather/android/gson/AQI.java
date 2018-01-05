package com.hr.coolweather.android.gson;

/**
 * Created by herui on 2018/1/4.
 */

public class AQI {
    public AQICity city;
    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
