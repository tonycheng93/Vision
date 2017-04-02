package com.sky.vision.injection.component;

import android.app.Application;
import android.content.Context;

import com.sky.vision.injection.ApplicationContext;
import com.sky.vision.injection.module.ApplicationModule;

import javax.inject.Singleton;

import dagger.Subcomponent;

/**
 * 项目名称：Vision
 * 类描述：
 * 创建人：tonycheng
 * 创建时间：2017/4/2 23:39
 * 邮箱：tonycheng93@outlook.com
 * 修改人：
 * 修改时间：
 * 修改备注：
 */
@Singleton
@Subcomponent(modules = ApplicationModule.class)
public interface ApplicationComponent {
    @ApplicationContext
    Context context();

    Application application();
}
