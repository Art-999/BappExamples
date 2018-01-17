package com.example.arturmusayelyan.bappexamples;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by artur.musayelyan on 17/01/2018.
 */

public class PreferencesUtils {
    public static void removePreferences(Context context, String key) {
        context.getSharedPreferences(Constants.PREFERENCES_TAG, Context.MODE_PRIVATE).edit().remove(key).apply();
    }
    public static void putString(Context context,String key,String value){
        SharedPreferences sPref = context.getSharedPreferences(Constants.PREFERENCES_TAG, Context.MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(key, value);
        ed.apply();
    }
    public static String getString(Context context,String key,String defValue){
        SharedPreferences sPref = context.getSharedPreferences(Constants.PREFERENCES_TAG, Context.MODE_PRIVATE);
        return sPref.getString(key,defValue);
    }
}
