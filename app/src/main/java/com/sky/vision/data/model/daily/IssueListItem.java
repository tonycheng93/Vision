package com.sky.vision.data.model.daily;

import android.os.Parcelable;

import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;

import java.util.List;

@AutoValue
public abstract class IssueListItem implements Parcelable{

    @SerializedName("date")
    public abstract long date();

    @SerializedName("publishTime")
    public abstract long publishTime();

    @SerializedName("releaseTime")
    public abstract long releaseTime();

    @SerializedName("count")
    public abstract int count();

    @SerializedName("itemList")
    public abstract List<ItemListItem> itemList();

    @SerializedName("type")
    public abstract String type();

    public static TypeAdapter<IssueListItem> typeAdapter(Gson gson) {
        return new AutoValue_IssueListItem.GsonTypeAdapter(gson);
    }
}