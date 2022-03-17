
package me.aravi.instapi.bean.post;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class User__1 {

    @SerializedName("pk")
    @Expose
    private Long pk;
    @SerializedName("username")
    @Expose
    private String username;
    @SerializedName("full_name")
    @Expose
    private String fullName;
    @SerializedName("is_private")
    @Expose
    private Boolean isPrivate;
    @SerializedName("profile_pic_url")
    @Expose
    private String profilePicUrl;
    @SerializedName("profile_pic_id")
    @Expose
    private String profilePicId;
    @SerializedName("friendship_status")
    @Expose
    private FriendshipStatus__1 friendshipStatus;
    @SerializedName("is_verified")
    @Expose
    private Boolean isVerified;
    @SerializedName("follow_friction_type")
    @Expose
    private Long followFrictionType;
    @SerializedName("has_anonymous_profile_picture")
    @Expose
    private Boolean hasAnonymousProfilePicture;
    @SerializedName("is_unpublished")
    @Expose
    private Boolean isUnpublished;
    @SerializedName("is_favorite")
    @Expose
    private Boolean isFavorite;
    @SerializedName("latest_reel_media")
    @Expose
    private Long latestReelMedia;
    @SerializedName("has_highlight_reels")
    @Expose
    private Boolean hasHighlightReels;
    @SerializedName("live_broadcast_id")
    @Expose
    private Object liveBroadcastId;
    @SerializedName("live_broadcast_visibility")
    @Expose
    private Object liveBroadcastVisibility;

    public Long getPk() {
        return pk;
    }

    public void setPk(Long pk) {
        this.pk = pk;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Boolean getIsPrivate() {
        return isPrivate;
    }

    public void setIsPrivate(Boolean isPrivate) {
        this.isPrivate = isPrivate;
    }

    public String getProfilePicUrl() {
        return profilePicUrl;
    }

    public void setProfilePicUrl(String profilePicUrl) {
        this.profilePicUrl = profilePicUrl;
    }

    public String getProfilePicId() {
        return profilePicId;
    }

    public void setProfilePicId(String profilePicId) {
        this.profilePicId = profilePicId;
    }

    public FriendshipStatus__1 getFriendshipStatus() {
        return friendshipStatus;
    }

    public void setFriendshipStatus(FriendshipStatus__1 friendshipStatus) {
        this.friendshipStatus = friendshipStatus;
    }

    public Boolean getIsVerified() {
        return isVerified;
    }

    public void setIsVerified(Boolean isVerified) {
        this.isVerified = isVerified;
    }

    public Long getFollowFrictionType() {
        return followFrictionType;
    }

    public void setFollowFrictionType(Long followFrictionType) {
        this.followFrictionType = followFrictionType;
    }

    public Boolean getHasAnonymousProfilePicture() {
        return hasAnonymousProfilePicture;
    }

    public void setHasAnonymousProfilePicture(Boolean hasAnonymousProfilePicture) {
        this.hasAnonymousProfilePicture = hasAnonymousProfilePicture;
    }

    public Boolean getIsUnpublished() {
        return isUnpublished;
    }

    public void setIsUnpublished(Boolean isUnpublished) {
        this.isUnpublished = isUnpublished;
    }

    public Boolean getIsFavorite() {
        return isFavorite;
    }

    public void setIsFavorite(Boolean isFavorite) {
        this.isFavorite = isFavorite;
    }

    public Long getLatestReelMedia() {
        return latestReelMedia;
    }

    public void setLatestReelMedia(Long latestReelMedia) {
        this.latestReelMedia = latestReelMedia;
    }

    public Boolean getHasHighlightReels() {
        return hasHighlightReels;
    }

    public void setHasHighlightReels(Boolean hasHighlightReels) {
        this.hasHighlightReels = hasHighlightReels;
    }

    public Object getLiveBroadcastId() {
        return liveBroadcastId;
    }

    public void setLiveBroadcastId(Object liveBroadcastId) {
        this.liveBroadcastId = liveBroadcastId;
    }

    public Object getLiveBroadcastVisibility() {
        return liveBroadcastVisibility;
    }

    public void setLiveBroadcastVisibility(Object liveBroadcastVisibility) {
        this.liveBroadcastVisibility = liveBroadcastVisibility;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(User__1 .class.getName()).append('@').append(Long.toHexString(System.identityHashCode(this))).append('[');
        sb.append("pk");
        sb.append('=');
        sb.append(((this.pk == null)?"<null>":this.pk));
        sb.append(',');
        sb.append("username");
        sb.append('=');
        sb.append(((this.username == null)?"<null>":this.username));
        sb.append(',');
        sb.append("fullName");
        sb.append('=');
        sb.append(((this.fullName == null)?"<null>":this.fullName));
        sb.append(',');
        sb.append("isPrivate");
        sb.append('=');
        sb.append(((this.isPrivate == null)?"<null>":this.isPrivate));
        sb.append(',');
        sb.append("profilePicUrl");
        sb.append('=');
        sb.append(((this.profilePicUrl == null)?"<null>":this.profilePicUrl));
        sb.append(',');
        sb.append("profilePicId");
        sb.append('=');
        sb.append(((this.profilePicId == null)?"<null>":this.profilePicId));
        sb.append(',');
        sb.append("friendshipStatus");
        sb.append('=');
        sb.append(((this.friendshipStatus == null)?"<null>":this.friendshipStatus));
        sb.append(',');
        sb.append("isVerified");
        sb.append('=');
        sb.append(((this.isVerified == null)?"<null>":this.isVerified));
        sb.append(',');
        sb.append("followFrictionType");
        sb.append('=');
        sb.append(((this.followFrictionType == null)?"<null>":this.followFrictionType));
        sb.append(',');
        sb.append("hasAnonymousProfilePicture");
        sb.append('=');
        sb.append(((this.hasAnonymousProfilePicture == null)?"<null>":this.hasAnonymousProfilePicture));
        sb.append(',');
        sb.append("isUnpublished");
        sb.append('=');
        sb.append(((this.isUnpublished == null)?"<null>":this.isUnpublished));
        sb.append(',');
        sb.append("isFavorite");
        sb.append('=');
        sb.append(((this.isFavorite == null)?"<null>":this.isFavorite));
        sb.append(',');
        sb.append("latestReelMedia");
        sb.append('=');
        sb.append(((this.latestReelMedia == null)?"<null>":this.latestReelMedia));
        sb.append(',');
        sb.append("hasHighlightReels");
        sb.append('=');
        sb.append(((this.hasHighlightReels == null)?"<null>":this.hasHighlightReels));
        sb.append(',');
        sb.append("liveBroadcastId");
        sb.append('=');
        sb.append(((this.liveBroadcastId == null)?"<null>":this.liveBroadcastId));
        sb.append(',');
        sb.append("liveBroadcastVisibility");
        sb.append('=');
        sb.append(((this.liveBroadcastVisibility == null)?"<null>":this.liveBroadcastVisibility));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
