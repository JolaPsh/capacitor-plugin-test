package com.crossoft.plugin.test;

import android.util.Log;

public class JoannaPlugin {

    public String echo(String value) {
        Log.i("Echo", value);
        return value;
    }
}
