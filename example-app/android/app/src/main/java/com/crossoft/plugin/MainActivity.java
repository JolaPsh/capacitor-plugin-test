package com.crossoft.plugin;

import android.os.Bundle;

import com.getcapacitor.BridgeActivity;
import com.crossoft.plugin.test.JoannaPluginPlugin;

public class MainActivity extends BridgeActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        registerPlugin(JoannaPluginPlugin.class);
        super.onCreate(savedInstanceState);

//        WebView webView = (WebView) findViewById(R.id.webview);
//        WebSettings webSettings = webView.getSettings();
//
//        // The Magic
//        webSettings.setUseWideViewPort(true);
//        webSettings.setLoadWithOverviewMode(true);
    }
}
