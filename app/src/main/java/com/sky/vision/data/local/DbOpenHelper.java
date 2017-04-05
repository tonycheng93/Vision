package com.sky.vision.data.local;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.sky.vision.injection.ApplicationContext;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * 项目名称：Vision
 * 类描述：
 * 创建人：tonycheng
 * 创建时间：2017/4/3 21:17
 * 邮箱：tonycheng93@outlook.com
 * 修改人：
 * 修改时间：
 * 修改备注：
 */
@Singleton
public class DbOpenHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = ".db";
    private static final int DATABASE_VERSION = 1;

    @Inject
    public DbOpenHelper(@ApplicationContext Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.beginTransaction();
        try {
            db.execSQL("");
            db.setTransactionSuccessful();
        } finally {
            db.endTransaction();
        }

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
