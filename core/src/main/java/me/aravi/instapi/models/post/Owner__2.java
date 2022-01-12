
package me.aravi.instapi.models.post;

import androidx.annotation.Keep;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Keep
public class Owner__2 {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("is_verified")
    @Expose
    private Boolean isVerified;
    @SerializedName("profile_pic_url")
    @Expose
    private String profilePicUrl;
    @SerializedName("username")
    @Expose
    private String username;
    @SerializedName("blocked_by_viewer")
    @Expose
    private Boolean blockedByViewer;
    @SerializedName("restricted_by_viewer")
    @Expose
    private Boolean restrictedByViewer;
    @SerializedName("followed_by_viewer")
    @Expose
    private Boolean followedByViewer;
    @SerializedName("full_name")
    @Expose
    private String fullName;
    @SerializedName("has_blocked_viewer")
    @Expose
    private Boolean hasBlockedViewer;
    @SerializedName("is_embeds_disabled")
    @Expose
    private Boolean isEmbedsDisabled;
    @SerializedName("is_private")
    @Expose
    private Boolean isPrivate;
    @SerializedName("is_unpublished")
    @Expose
    private Boolean isUnpublished;
    @SerializedName("requested_by_viewer")
    @Expose
    private Boolean requestedByViewer;
    @SerializedName("pass_tiering_recommendation")
    @Expose
    private Boolean passTieringRecommendation;
    @SerializedName("edge_owner_to_timeline_media")
    @Expose
    private EdgeOwnerToTimelineMedia edgeOwnerToTimelineMedia;
    @SerializedName("edge_followed_by")
    @Expose
    private EdgeFollowedBy edgeFollowedBy;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Owner__2() {
    }

    /**
     * 
     * @param blockedByViewer
     * @param isEmbedsDisabled
     * @param followedByViewer
     * @param requestedByViewer
     * @param passTieringRecommendation
     * @param isVerified
     * @param isUnpublished
     * @param fullName
     * @param isPrivate
     * @param hasBlockedViewer
     * @param edgeOwnerToTimelineMedia
     * @param edgeFollowedBy
     * @param profilePicUrl
     * @param restrictedByViewer
     * @param id
     * @param username
     */
    public Owner__2(String id, Boolean isVerified, String profilePicUrl, String username, Boolean blockedByViewer, Boolean restrictedByViewer, Boolean followedByViewer, String fullName, Boolean hasBlockedViewer, Boolean isEmbedsDisabled, Boolean isPrivate, Boolean isUnpublished, Boolean requestedByViewer, Boolean passTieringRecommendation, EdgeOwnerToTimelineMedia edgeOwnerToTimelineMedia, EdgeFollowedBy edgeFollowedBy) {
        super();
        this.id = id;
        this.isVerified = isVerified;
        this.profilePicUrl = profilePicUrl;
        this.username = username;
        this.blockedByViewer = blockedByViewer;
        this.restrictedByViewer = restrictedByViewer;
        this.followedByViewer = followedByViewer;
        this.fullName = fullName;
        this.hasBlockedViewer = hasBlockedViewer;
        this.isEmbedsDisabled = isEmbedsDisabled;
        this.isPrivate = isPrivate;
        this.isUnpublished = isUnpublished;
        this.requestedByViewer = requestedByViewer;
        this.passTieringRecommendation = passTieringRecommendation;
        this.edgeOwnerToTimelineMedia = edgeOwnerToTimelineMedia;
        this.edgeFollowedBy = edgeFollowedBy;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Boolean getBlockedByViewer() {
        return blockedByViewer;
    }

    public void setBlockedByViewer(Boolean blockedByViewer) {
        this.blockedByViewer = blockedByViewer;
    }

    public Boolean getRestrictedByViewer() {
        return restrictedByViewer;
    }

    public void setRestrictedByViewer(Boolean restrictedByViewer) {
        this.restrictedByViewer = restrictedByViewer;
    }

    public Boolean getFollowedByViewer() {
        return followedByViewer;
    }

    public void setFollowedByViewer(Boolean followedByViewer) {
        this.followedByViewer = followedByViewer;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Boolean getHasBlockedViewer() {
        return hasBlockedViewer;
    }

    public void setHasBlockedViewer(Boolean hasBlockedViewer) {
        this.hasBlockedViewer = hasBlockedViewer;
    }

    public Boolean getIsEmbedsDisabled() {
        return isEmbedsDisabled;
    }

    public void setIsEmbedsDisabled(Boolean isEmbedsDisabled) {
        this.isEmbedsDisabled = isEmbedsDisabled;
    }

    public Boolean getIsPrivate() {
        return isPrivate;
    }

    public void setIsPrivate(Boolean isPrivate) {
        this.isPrivate = isPrivate;
    }

    public Boolean getIsUnpublished() {
        return isUnpublished;
    }

    public void setIsUnpublished(Boolean isUnpublished) {
        this.isUnpublished = isUnpublished;
    }

    public Boolean getRequestedByViewer() {
        return requestedByViewer;
    }

    public void setRequestedByViewer(Boolean requestedByViewer) {
        this.requestedByViewer = requestedByViewer;
    }

    public Boolean getPassTieringRecommendation() {
        return passTieringRecommendation;
    }

    public void setPassTieringRecommendation(Boolean passTieringRecommendation) {
        this.passTieringRecommendation = passTieringRecommendation;
    }

    public EdgeOwnerToTimelineMedia getEdgeOwnerToTimelineMedia() {
        return edgeOwnerToTimelineMedia;
    }

    public void setEdgeOwnerToTimelineMedia(EdgeOwnerToTimelineMedia edgeOwnerToTimelineMedia) {
        this.edgeOwnerToTimelineMedia = edgeOwnerToTimelineMedia;
    }

    public EdgeFollowedBy getEdgeFollowedBy() {
        return edgeFollowedBy;
    }

    public void setEdgeFollowedBy(EdgeFollowedBy edgeFollowedBy) {
        this.edgeFollowedBy = edgeFollowedBy;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Owner__2 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("isVerified");
        sb.append('=');
        sb.append(((this.isVerified == null)?"<null>":this.isVerified));
        sb.append(',');
        sb.append("profilePicUrl");
        sb.append('=');
        sb.append(((this.profilePicUrl == null)?"<null>":this.profilePicUrl));
        sb.append(',');
        sb.append("username");
        sb.append('=');
        sb.append(((this.username == null)?"<null>":this.username));
        sb.append(',');
        sb.append("blockedByViewer");
        sb.append('=');
        sb.append(((this.blockedByViewer == null)?"<null>":this.blockedByViewer));
        sb.append(',');
        sb.append("restrictedByViewer");
        sb.append('=');
        sb.append(((this.restrictedByViewer == null)?"<null>":this.restrictedByViewer));
        sb.append(',');
        sb.append("followedByViewer");
        sb.append('=');
        sb.append(((this.followedByViewer == null)?"<null>":this.followedByViewer));
        sb.append(',');
        sb.append("fullName");
        sb.append('=');
        sb.append(((this.fullName == null)?"<null>":this.fullName));
        sb.append(',');
        sb.append("hasBlockedViewer");
        sb.append('=');
        sb.append(((this.hasBlockedViewer == null)?"<null>":this.hasBlockedViewer));
        sb.append(',');
        sb.append("isEmbedsDisabled");
        sb.append('=');
        sb.append(((this.isEmbedsDisabled == null)?"<null>":this.isEmbedsDisabled));
        sb.append(',');
        sb.append("isPrivate");
        sb.append('=');
        sb.append(((this.isPrivate == null)?"<null>":this.isPrivate));
        sb.append(',');
        sb.append("isUnpublished");
        sb.append('=');
        sb.append(((this.isUnpublished == null)?"<null>":this.isUnpublished));
        sb.append(',');
        sb.append("requestedByViewer");
        sb.append('=');
        sb.append(((this.requestedByViewer == null)?"<null>":this.requestedByViewer));
        sb.append(',');
        sb.append("passTieringRecommendation");
        sb.append('=');
        sb.append(((this.passTieringRecommendation == null)?"<null>":this.passTieringRecommendation));
        sb.append(',');
        sb.append("edgeOwnerToTimelineMedia");
        sb.append('=');
        sb.append(((this.edgeOwnerToTimelineMedia == null)?"<null>":this.edgeOwnerToTimelineMedia));
        sb.append(',');
        sb.append("edgeFollowedBy");
        sb.append('=');
        sb.append(((this.edgeFollowedBy == null)?"<null>":this.edgeFollowedBy));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
