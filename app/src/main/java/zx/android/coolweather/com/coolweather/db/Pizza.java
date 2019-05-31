package zx.android.coolweather.com.coolweather.db;

import android.support.v7.app.AlertDialog;

/**
 * Created by xizhang on 2019/5/28.
 */

public class Pizza {
    private int size;
    private boolean cheese;
    private boolean bacon;

    public static class Builder {
        // require
        private final int size;

        private boolean cheese = false;
        private boolean bacon = false;
        public Builder(int size) {
            this.size = size;
        }

        public Builder cheese(boolean value) {
            cheese = value;
            return this;
        }
        public Builder bacon(boolean value) {
            bacon = value;
            return this;
        }
        public Pizza build() {
            return new Pizza(this);
        }

    }
    private Pizza(Builder builder) {
        size = builder.size;
        cheese = builder.cheese;
        bacon = builder.bacon;
    }
}
