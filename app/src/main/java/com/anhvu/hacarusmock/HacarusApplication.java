package com.anhvu.hacarusmock;

import android.app.Application;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

/**
 * Created by leanh on 10/19/16.
 */

public class HacarusApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/AvenirNext-Regular.ttf")
                .setFontAttrId(R.attr.fontPath).build());
    }
}
