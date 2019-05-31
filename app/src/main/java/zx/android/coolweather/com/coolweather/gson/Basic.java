package zx.android.coolweather.com.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by xizhang on 2019/5/31.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherId;
    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }

}
