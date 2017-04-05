package com.sky.vision.data.model.daily;

import android.os.Parcelable;

import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;

@AutoValue
public abstract class Author implements Parcelable{

    @SerializedName("icon")
    public abstract String icon();

    @SerializedName("name")
    public abstract String name();

    @SerializedName("link")
    public abstract String link();

    @SerializedName("description")
    public abstract String description();

    @SerializedName("latestReleaseTime")
    public abstract long latestReleaseTime();

    @SerializedName("id")
    public abstract int id();

    @SerializedName("videoNum")
    public abstract int videoNum();

    @SerializedName("follow")
    public abstract Follow follow();

    @SerializedName("adTrack")
    public abstract Object adTrack();

    public static TypeAdapter<Author> typeAdapter(Gson gson) {
        return new AutoValue_Author.GsonTypeAdapter(gson);
    }
}