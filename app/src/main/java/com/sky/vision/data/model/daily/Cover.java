package com.sky.vision.data.model.daily;

import android.os.Parcelable;

import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;

@AutoValue
public abstract class Cover implements Parcelable{

    @SerializedName("feed")
    public abstract String feed();

    @SerializedName("detail")
    public abstract String detail();

    @SerializedName("sharing")
    public abstract Object sharing();

    @SerializedName("blurred")
    public abstract String blurred();

    public static TypeAdapter<Cover> typeAdapter(Gson gson) {
        return new AutoValue_Cover.GsonTypeAdapter(gson);
    }
}