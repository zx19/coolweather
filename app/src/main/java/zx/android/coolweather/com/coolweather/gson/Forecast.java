package zx.android.coolweather.com.coolweather.gson;

import com.bumptech.glide.load.model.StreamEncoder;
import com.google.gson.annotations.SerializedName;

/**
 * Created by xizhang on 2019/5/31.
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
