package com.sky.vision;

import android.app.Application;
import android.content.Context;

import timber.log.Timber;

/**
 * 项目名称：Vision
 * 类描述：
 * 创建人：tonycheng
 * 创建时间：2017/4/2 22:51
 * 邮箱：tonycheng93@outlook.com
 * 修改人：
 * 修改时间：
 * 修改备注：
 */

public class VisionApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        if (BuildConfig.DEBUG) {
            Timber.plant(new Timber.DebugTree());
        }
    }

    public static VisionApplication get(Context context) {
        return (VisionApplication) context.getApplicationContext();
    }
}
