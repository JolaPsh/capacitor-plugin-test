package com.crossoft.plugin.test;

import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

@CapacitorPlugin(name = "JoannaPlugin")
public class JoannaPluginPlugin extends Plugin {

    private JoannaPlugin implementation = new JoannaPlugin();

    @PluginMethod
    public void echo(PluginCall call) {
        String value = call.getString("value");

        JSObject ret = new JSObject();
        ret.put("value", implementation.echo(value));
        call.resolve(ret);
    }

    @PluginMethod()
    public void printSmthOnScreen(PluginCall call) {
        String value = call.getString("value");
        String senderName = call.getString("senderName");
        JSObject messageData = new JSObject();
        messageData.put("value", value);
        messageData.put("senderName", senderName);
        call.resolve(messageData);
    }

    @PluginMethod()
    public void displayNotification(PluginCall call) {
        String value = call.getString("value");
        String senderName = call.getString("senderName");
        JSObject notificationData = new JSObject();
        notificationData.put("value", value);
        notificationData.put("senderName", senderName);
        call.resolve(notificationData);
    }
}
