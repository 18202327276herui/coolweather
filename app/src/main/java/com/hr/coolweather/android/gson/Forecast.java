package com.hr.coolweather.android.gson;

import android.support.design.widget.Snackbar;

import com.google.gson.annotations.SerializedName;

/**
 * Created by herui on 2018/1/4.
 */

public class Forecast {
    public String date;
    @SerializedName("tmp")
    public Temperature temperature;
    @SerializedName("cond")
    public More more;
    public class Temperature {
        public String max;
        public String min;
    }
    public class More {
        @SerializedName("txt_d")
        public String info;
    }
}
