package com.sky.vision.data;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;

import javax.inject.Inject;

import rx.Subscription;

/**
 * 项目名称：Vision
 * 类描述：
 * 创建人：tonycheng
 * 创建时间：2017/4/3 22:23
 * 邮箱：tonycheng93@outlook.com
 * 修改人：
 * 修改时间：
 * 修改备注：
 */

public class SyncService extends Service {
    @Inject
    DataManager mDataManager;
    private Subscription mSubscription;

    private static Intent getStartIntent(Context context) {
        return new Intent(context, SyncService.class);
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
