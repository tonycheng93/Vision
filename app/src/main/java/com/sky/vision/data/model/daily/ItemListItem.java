package com.sky.vision.data.model.daily;

import android.os.Parcelable;

import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;

@AutoValue
public abstract class ItemListItem implements Parcelable{

    @SerializedName("data")
    public abstract Data data();

    @SerializedName("tag")
    public abstract Object tag();

    @SerializedName("type")
    public abstract String type();

    public static TypeAdapter<ItemListItem> typeAdapter(Gson gson) {
        return new AutoValue_ItemListItem.GsonTypeAdapter(gson);
    }
}