package com.sky.vision.data.model.daily;

import android.os.Parcelable;

import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;

import java.util.List;

@AutoValue
public abstract class Daily implements Parcelable{

    @SerializedName("nextPublishTime")
    public abstract long nextPublishTime();

    @SerializedName("dialog")
    public abstract Object dialog();

    @SerializedName("newestIssueType")
    public abstract String newestIssueType();

    @SerializedName("nextPageUrl")
    public abstract String nextPageUrl();

    @SerializedName("issueList")
    public abstract List<IssueListItem> issueList();

    public static TypeAdapter<Daily> typeAdapter(Gson gson) {
        return new AutoValue_Daily.GsonTypeAdapter(gson);
    }
}