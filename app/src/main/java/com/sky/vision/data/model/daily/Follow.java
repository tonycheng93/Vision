package com.sky.vision.data.model.daily;

import android.os.Parcelable;

import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;

@AutoValue
public abstract class Follow implements Parcelable{

    @SerializedName("itemId")
    public abstract int itemId();

    @SerializedName("itemType")
    public abstract String itemType();

    @SerializedName("followed")
    public abstract boolean followed();

    public static TypeAdapter<Follow> typeAdapter(Gson gson) {
        return new AutoValue_Follow.GsonTypeAdapter(gson);
    }
}