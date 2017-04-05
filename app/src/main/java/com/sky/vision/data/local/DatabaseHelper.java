package com.sky.vision.data.local;

import com.squareup.sqlbrite.BriteDatabase;
import com.squareup.sqlbrite.SqlBrite;

import javax.inject.Inject;
import javax.inject.Singleton;

import rx.schedulers.Schedulers;

/**
 * 项目名称：Vision
 * 类描述：
 * 创建人：tonycheng
 * 创建时间：2017/4/3 21:09
 * 邮箱：tonycheng93@outlook.com
 * 修改人：
 * 修改时间：
 * 修改备注：
 */
@Singleton
public class DatabaseHelper {

    private final BriteDatabase mDb;

    @Inject
    public DatabaseHelper(DbOpenHelper dbOpenHelper) {
        SqlBrite.Builder builder = new SqlBrite.Builder();
        mDb = builder.build().wrapDatabaseHelper(dbOpenHelper, Schedulers.immediate());
    }

    public BriteDatabase getBriteDb() {
        return mDb;
    }
}
