package io.ionic.starter;

import android.os.Bundle;
import com.getcapacitor.BridgeActivity;
import com.crossoft.plugin.test.JoannaPluginPlugin;

public class MainActivity extends BridgeActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        registerPlugin(JoannaPluginPlugin.class);
        super.onCreate(savedInstanceState);
    }
}
