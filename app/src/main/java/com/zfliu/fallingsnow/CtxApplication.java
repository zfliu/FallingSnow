package com.zfliu.fallingsnow;

import android.app.Application;
import android.content.Context;

/**
 * Created by zfliu on 12/18/2016.
 */

public class CtxApplication extends Application {

    private static Context context;
    private static String phoneNumber;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
    }

    public static Context getContext(){
        return context;
    }

    public static String getPhoneNumber(){
        return phoneNumber.length() == 11 ? phoneNumber : null;
    }

    public static void setPhoneNumber(String number){
        phoneNumber = number;
    }
}
