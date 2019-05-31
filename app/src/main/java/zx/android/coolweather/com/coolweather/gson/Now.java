package zx.android.coolweather.com.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by xizhang on 2019/5/31.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More more;
    public class More {
        @SerializedName("txt")
        public String info;

    }
}
