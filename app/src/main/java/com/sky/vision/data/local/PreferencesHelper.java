package com.sky.vision.data.local;

import android.content.Context;
import android.content.SharedPreferences;

import com.sky.vision.injection.ApplicationContext;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * 项目名称：Vision
 * 类描述：
 * 创建人：tonycheng
 * 创建时间：2017/4/3 22:13
 * 邮箱：tonycheng93@outlook.com
 * 修改人：
 * 修改时间：
 * 修改备注：
 */
@Singleton
public class PreferencesHelper {

    public static final String PREF_FILE_NAME = "vision_pref_file";

    private final SharedPreferences mPref;

    @Inject
    public PreferencesHelper(@ApplicationContext Context context) {
        mPref = context.getSharedPreferences(PREF_FILE_NAME, Context.MODE_PRIVATE);
    }

    public void clear() {
        mPref.edit().clear().apply();
    }
}
