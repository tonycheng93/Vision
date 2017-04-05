package com.sky.vision.data.model.daily;

import android.os.Parcelable;

import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;

@AutoValue
public abstract class Data implements Parcelable{

    @SerializedName("image")
    public abstract String image();

    @SerializedName("dataType")
    public abstract String dataType();

    @SerializedName("actionUrl")
    public abstract String actionUrl();

    @SerializedName("shade")
    public abstract boolean shade();

    @SerializedName("description")
    public abstract String description();

    @SerializedName("id")
    public abstract int id();

    @SerializedName("label")
    public abstract Object label();

    @SerializedName("title")
    public abstract String title();

    @SerializedName("adTrack")
    public abstract Object adTrack();

    public static TypeAdapter<Data> typeAdapter(Gson gson) {
        return new AutoValue_Data.GsonTypeAdapter(gson);
    }
}