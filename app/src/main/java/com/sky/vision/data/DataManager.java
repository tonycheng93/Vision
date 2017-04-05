package com.sky.vision.data;

import com.sky.vision.data.local.DatabaseHelper;
import com.sky.vision.data.local.PreferencesHelper;
import com.sky.vision.data.remote.VisionService;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * 项目名称：Vision
 * 类描述：
 * 创建人：tonycheng
 * 创建时间：2017/4/3 22:18
 * 邮箱：tonycheng93@outlook.com
 * 修改人：
 * 修改时间：
 * 修改备注：
 */
@Singleton
public class DataManager {
    private final VisionService mVisionService;
    private final DatabaseHelper mDatabaseHelper;
    private final PreferencesHelper mPreferencesHelper;

    @Inject
    public DataManager(VisionService visionService, DatabaseHelper databaseHelper,
                          PreferencesHelper preferencesHelper) {
        mVisionService = visionService;
        mDatabaseHelper = databaseHelper;
        mPreferencesHelper = preferencesHelper;
    }

    public PreferencesHelper getPreferencesHelper() {
        return mPreferencesHelper;
    }
}
