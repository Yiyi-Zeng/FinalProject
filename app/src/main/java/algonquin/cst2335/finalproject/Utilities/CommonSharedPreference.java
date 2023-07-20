package algonquin.cst2335.finalproject.Utilities;

import android.content.Context;
import android.content.SharedPreferences;

/**
 *  CommonSharedPreference is a utility class for handling shared preferences in Android applications.
 */
public class CommonSharedPreference  {

    static SharedPreferences.Editor editor;

    // setting a value in shared preferences
    public static void setsharedText(Context context, String key, String value) {
        SharedPreferences preferences = context.getSharedPreferences(context.getPackageName(), Context.MODE_PRIVATE);
        SharedPreferences.Editor prefsEditor = preferences.edit();
        prefsEditor.putString(key, value);
        prefsEditor.apply();
    }

    // getting a value from shared preferences
    public static String getsharedText(Context context, String key) {
        SharedPreferences preferences = context.getSharedPreferences(context.getPackageName(), Context.MODE_PRIVATE);
        String value = preferences.getString(key, "");
        return value;
    }
    public static void setsharedFloat(Context context, String key, float value) {
        SharedPreferences preferences = context.getSharedPreferences(context.getPackageName(), Context.MODE_PRIVATE);
        SharedPreferences.Editor prefsEditor = preferences.edit();
        prefsEditor.putFloat(key, value);
        prefsEditor.apply();
    }

    // getting a value from shared preferences
    public static double getsharedFloat(Context context, String key) {
        SharedPreferences preferences = context.getSharedPreferences(context.getPackageName(), Context.MODE_PRIVATE);
        float value = preferences.getFloat(key, 0.0f);
        return value;
    }

}