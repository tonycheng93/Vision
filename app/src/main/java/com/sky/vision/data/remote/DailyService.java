package com.sky.vision.data.remote;

import com.sky.vision.data.model.daily.Daily;

import io.reactivex.Flowable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * 项目名称：Vision
 * 类描述：
 * 创建人：tonycheng
 * 创建时间：2017/4/5 22:56
 * 邮箱：tonycheng93@outlook.com
 * 修改人：
 * 修改时间：
 * 修改备注：
 */

public interface DailyService {

    /**
     * 获取每日视频
     *
     * @param date
     * @return
     */
    @GET("v2/feed?num=2")
    Flowable<Daily> getDaily(@Query("date") long date);

    @GET("v2/feed?num=2")
    Flowable<Daily> getDaily();
}
