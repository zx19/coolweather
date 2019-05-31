package zx.android.coolweather.com.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by xizhang on 2019/5/31.
 */

public class Sugesstion {
    @SerializedName("comf")
    public Comfort comfort;
    @SerializedName("cw")
    public CarWash carWash;

    public Sport sport;

    public class Comfort {
        @SerializedName("txt")
        public String info;
    }
    public class CarWash {
        @SerializedName("txt")
        public String info;
    }
    public class Sport {
        @SerializedName("txt")
        public String info;
    }

}
