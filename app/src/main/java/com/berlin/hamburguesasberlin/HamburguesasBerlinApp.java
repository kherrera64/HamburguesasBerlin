package com.berlin.hamburguesasberlin;
import android.app.Application;
import com.facebook.appevents.AppEventsLogger;
/**
 * Created by kherrera on 16/08/2017.
 */


public class HamburguesasBerlinApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        AppEventsLogger.activateApp(this);
    }
}