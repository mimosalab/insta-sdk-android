package me.aravi.instapi;

import androidx.annotation.Nullable;

import java.util.ArrayList;

public class PostBean {

    private String id;
    private String displayUrl;
    private boolean isVideo;
    private Long takenAt;
    private boolean userLikedIt;
    private boolean userSavedIt;
    private ArrayList<String> displayResources;
    private String shortCode;
    private long likeCount;
    private long commentCount;
    @Nullable
    private String ownerInfo;
    @Nullable
    private String location;
    @Nullable
    private String caption;
    @Nullable
    private String thumbnailSrc;

    public PostBean() {
        // empty constructor
    }

    public PostBean(String id, String displayUrl, boolean isVideo, Long takenAt, boolean userLikedIt, boolean userSavedIt, ArrayList<String> displayResources, String shortCode, long likeCount, long commentCount, @Nullable String ownerInfo, @Nullable String location, @Nullable String caption, @Nullable String thumbnailSrc) {
        this.id = id;
        this.displayUrl = displayUrl;
        this.isVideo = isVideo;
        this.takenAt = takenAt;
        this.userLikedIt = userLikedIt;
        this.userSavedIt = userSavedIt;
        this.displayResources = displayResources;
        this.shortCode = shortCode;
        this.likeCount = likeCount;
        this.commentCount = commentCount;
        this.ownerInfo = ownerInfo;
        this.location = location;
        this.caption = caption;
        this.thumbnailSrc = thumbnailSrc;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDisplayUrl() {
        return displayUrl;
    }

    public void setDisplayUrl(String displayUrl) {
        this.displayUrl = displayUrl;
    }

    public boolean isVideo() {
        return isVideo;
    }

    public void setVideo(boolean video) {
        isVideo = video;
    }

    public Long getTakenAt() {
        return takenAt;
    }

    public void setTakenAt(Long takenAt) {
        this.takenAt = takenAt;
    }

    public boolean isUserLikedIt() {
        return userLikedIt;
    }

    public void setUserLikedIt(boolean userLikedIt) {
        this.userLikedIt = userLikedIt;
    }

    public boolean isUserSavedIt() {
        return userSavedIt;
    }

    public void setUserSavedIt(boolean userSavedIt) {
        this.userSavedIt = userSavedIt;
    }

    public ArrayList<String> getDisplayResources() {
        return displayResources;
    }

    public void setDisplayResources(ArrayList<String> displayResources) {
        this.displayResources = displayResources;
    }

    public String getShortCode() {
        return shortCode;
    }

    public void setShortCode(String shortCode) {
        this.shortCode = shortCode;
    }

    public long getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(long likeCount) {
        this.likeCount = likeCount;
    }

    public long getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(long commentCount) {
        this.commentCount = commentCount;
    }

    @Nullable
    public String getOwnerInfo() {
        return ownerInfo;
    }

    public void setOwnerInfo(@Nullable String ownerInfo) {
        this.ownerInfo = ownerInfo;
    }

    @Nullable
    public String getLocation() {
        return location;
    }

    public void setLocation(@Nullable String location) {
        this.location = location;
    }

    @Nullable
    public String getCaption() {
        return caption;
    }

    public void setCaption(@Nullable String caption) {
        this.caption = caption;
    }

    @Nullable
    public String getThumbnailSrc() {
        return thumbnailSrc;
    }

    public void setThumbnailSrc(@Nullable String thumbnailSrc) {
        this.thumbnailSrc = thumbnailSrc;
    }


    @Override
    public String toString() {
        return "PostBean{" +
                "id=" + id +
                ", displayUrl='" + displayUrl + '\'' +
                ", isVideo=" + isVideo +
                ", takenAt=" + takenAt +
                ", userLikedIt=" + userLikedIt +
                ", userSavedIt=" + userSavedIt +
                ", displayResources=" + displayResources +
                ", shortCode='" + shortCode + '\'' +
                ", likeCount=" + likeCount +
                ", commentCount=" + commentCount +
                ", ownerInfo='" + ownerInfo + '\'' +
                ", location='" + location + '\'' +
                ", caption='" + caption + '\'' +
                ", thumbnailSrc='" + thumbnailSrc + '\'' +
                '}';
    }
}
