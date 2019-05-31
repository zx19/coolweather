package zx.android.coolweather.com.coolweather.gson;

import java.lang.ref.SoftReference;
import java.security.PublicKey;

/**
 * Created by xizhang on 2019/5/31.
 */

public class AQI {

    public AQICity city;

    public class AQICity {

        public String aqi;
        public String pm25;
    }
}

