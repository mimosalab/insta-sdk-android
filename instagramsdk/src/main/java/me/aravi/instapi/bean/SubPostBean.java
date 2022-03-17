package me.aravi.instapi.bean;


import androidx.annotation.Keep;
import androidx.annotation.Nullable;

@Keep
public class SubPostBean {

    @Nullable
    private String id;

    private boolean isVideo;

    @Nullable
    private String source;

    @Nullable
    private String thumbnail;

    public SubPostBean() {

    }

    public SubPostBean(@Nullable String id, boolean isVideo, @Nullable String source, @Nullable String thumbnail) {
        this.id = id;
        this.isVideo = isVideo;
        this.source = source;
        this.thumbnail = thumbnail;
    }

    @Override
    public String toString() {
        return "SubPostBean{" +
                "id='" + id + '\'' +
                ", isVideo=" + isVideo +
                ", source='" + source + '\'' +
                ", thumbnail='" + thumbnail + '\'' +
                '}';
    }

    @Nullable
    public String getId() {
        return id;
    }

    public void setId(@Nullable String id) {
        this.id = id;
    }

    public boolean isVideo() {
        return isVideo;
    }

    public void setVideo(boolean video) {
        isVideo = video;
    }

    @Nullable
    public String getSource() {
        return source;
    }

    public void setSource(@Nullable String source) {
        this.source = source;
    }

    @Nullable
    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(@Nullable String thumbnail) {
        this.thumbnail = thumbnail;
    }
}
