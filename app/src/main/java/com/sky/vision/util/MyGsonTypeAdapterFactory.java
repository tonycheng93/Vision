package com.sky.vision.util;

import com.google.gson.TypeAdapterFactory;
import com.ryanharter.auto.value.gson.GsonTypeAdapterFactory;

/**
 * 项目名称：Vision
 * 类描述：
 * 创建人：tonycheng
 * 创建时间：2017/4/3 22:59
 * 邮箱：tonycheng93@outlook.com
 * 修改人：
 * 修改时间：
 * 修改备注：
 */
@GsonTypeAdapterFactory
public abstract class MyGsonTypeAdapterFactory implements TypeAdapterFactory {
    public static TypeAdapterFactory create(){
        return new AutoValueGson_MyGsonTypeAdapterFactory();
    }
}
