
package me.aravi.instapi.models.profile;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Keep
public class User {

    @SerializedName("biography")
    @Expose
    private String biography;
    @SerializedName("external_url")
    @Expose
    private String externalUrl;
    @SerializedName("edge_followed_by")
    @Expose
    private EdgeFollowedBy edgeFollowedBy;
    @SerializedName("edge_follow")
    @Expose
    private EdgeFollow edgeFollow;
    @SerializedName("full_name")
    @Expose
    private String fullName;
    @SerializedName("highlight_reel_count")
    @Expose
    private Integer highlightReelCount;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("is_business_account")
    @Expose
    private Boolean isBusinessAccount;
    @SerializedName("is_professional_account")
    @Expose
    private Boolean isProfessionalAccount;
    @SerializedName("is_joined_recently")
    @Expose
    private Boolean isJoinedRecently;
    @SerializedName("is_private")
    @Expose
    private Boolean isPrivate;
    @SerializedName("is_verified")
    @Expose
    private Boolean isVerified;
    @SerializedName("profile_pic_url")
    @Expose
    private String profilePicUrl;
    @SerializedName("profile_pic_url_hd")
    @Expose
    private String profilePicUrlHd;
    @SerializedName("username")
    @Expose
    private String username;
    @SerializedName("edge_owner_to_timeline_media")
    @Expose
    private EdgeOwnerToTimelineMedia edgeOwnerToTimelineMedia;

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }

    public String getExternalUrl() {
        return externalUrl;
    }

    public void setExternalUrl(String externalUrl) {
        this.externalUrl = externalUrl;
    }

    public EdgeFollowedBy getEdgeFollowedBy() {
        return edgeFollowedBy;
    }

    public void setEdgeFollowedBy(EdgeFollowedBy edgeFollowedBy) {
        this.edgeFollowedBy = edgeFollowedBy;
    }

    public EdgeFollow getEdgeFollow() {
        return edgeFollow;
    }

    public void setEdgeFollow(EdgeFollow edgeFollow) {
        this.edgeFollow = edgeFollow;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Integer getHighlightReelCount() {
        return highlightReelCount;
    }

    public void setHighlightReelCount(Integer highlightReelCount) {
        this.highlightReelCount = highlightReelCount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Boolean getIsBusinessAccount() {
        return isBusinessAccount;
    }

    public void setIsBusinessAccount(Boolean isBusinessAccount) {
        this.isBusinessAccount = isBusinessAccount;
    }

    public Boolean getIsProfessionalAccount() {
        return isProfessionalAccount;
    }

    public void setIsProfessionalAccount(Boolean isProfessionalAccount) {
        this.isProfessionalAccount = isProfessionalAccount;
    }

    public Boolean getIsJoinedRecently() {
        return isJoinedRecently;
    }

    public void setIsJoinedRecently(Boolean isJoinedRecently) {
        this.isJoinedRecently = isJoinedRecently;
    }

    public Boolean getIsPrivate() {
        return isPrivate;
    }

    public void setIsPrivate(Boolean isPrivate) {
        this.isPrivate = isPrivate;
    }

    public Boolean getIsVerified() {
        return isVerified;
    }

    public void setIsVerified(Boolean isVerified) {
        this.isVerified = isVerified;
    }

    public String getProfilePicUrl() {
        return profilePicUrl;
    }

    public void setProfilePicUrl(String profilePicUrl) {
        this.profilePicUrl = profilePicUrl;
    }

    public String getProfilePicUrlHd() {
        return profilePicUrlHd;
    }

    public void setProfilePicUrlHd(String profilePicUrlHd) {
        this.profilePicUrlHd = profilePicUrlHd;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public EdgeOwnerToTimelineMedia getEdgeOwnerToTimelineMedia() {
        return edgeOwnerToTimelineMedia;
    }

    public void setEdgeOwnerToTimelineMedia(EdgeOwnerToTimelineMedia edgeOwnerToTimelineMedia) {
        this.edgeOwnerToTimelineMedia = edgeOwnerToTimelineMedia;
    }


    @NonNull
    @Override
    public String toString() {
        return "Username:" + getUsername() +
                "Followers:" + getEdgeFollowedBy().getCount() +
                "Following:" + getEdgeFollow().getCount() +
                "Private:" + getIsPrivate() +
                "Verified:" + getIsVerified() +
                "Professional:" + getIsProfessionalAccount();
    }
}
