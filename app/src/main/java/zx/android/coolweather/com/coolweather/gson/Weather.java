package zx.android.coolweather.com.coolweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by xizhang on 2019/5/31.
 */

public class Weather {
    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Sugesstion suggestion;
    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
