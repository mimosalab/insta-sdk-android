
package me.aravi.instapi.models.post;

import java.util.List;
import androidx.annotation.Keep;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Keep
public class ShortcodeMedia {

    @SerializedName("__typename")
    @Expose
    private String typename;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("shortcode")
    @Expose
    private String shortcode;
    @SerializedName("dimensions")
    @Expose
    private Dimensions dimensions;
    @SerializedName("gating_info")
    @Expose
    private Object gatingInfo;
    @SerializedName("fact_check_overall_rating")
    @Expose
    private Object factCheckOverallRating;
    @SerializedName("fact_check_information")
    @Expose
    private Object factCheckInformation;
    @SerializedName("sensitivity_friction_info")
    @Expose
    private Object sensitivityFrictionInfo;
    @SerializedName("sharing_friction_info")
    @Expose
    private SharingFrictionInfo sharingFrictionInfo;
    @SerializedName("media_overlay_info")
    @Expose
    private Object mediaOverlayInfo;
    @SerializedName("media_preview")
    @Expose
    private Object mediaPreview;
    @SerializedName("display_url")
    @Expose
    private String displayUrl;
    @SerializedName("display_resources")
    @Expose
    private List<DisplayResource> displayResources = null;
    @SerializedName("is_video")
    @Expose
    private Boolean isVideo;
    @SerializedName("tracking_token")
    @Expose
    private String trackingToken;
    @SerializedName("upcoming_event")
    @Expose
    private Object upcomingEvent;
    @SerializedName("edge_media_to_tagged_user")
    @Expose
    private EdgeMediaToTaggedUser edgeMediaToTaggedUser;
    @SerializedName("edge_media_to_caption")
    @Expose
    private EdgeMediaToCaption edgeMediaToCaption;
    @SerializedName("can_see_insights_as_brand")
    @Expose
    private Boolean canSeeInsightsAsBrand;
    @SerializedName("caption_is_edited")
    @Expose
    private Boolean captionIsEdited;
    @SerializedName("has_ranked_comments")
    @Expose
    private Boolean hasRankedComments;
    @SerializedName("like_and_view_counts_disabled")
    @Expose
    private Boolean likeAndViewCountsDisabled;
    @SerializedName("edge_media_to_parent_comment")
    @Expose
    private EdgeMediaToParentComment edgeMediaToParentComment;
    @SerializedName("edge_media_to_hoisted_comment")
    @Expose
    private EdgeMediaToHoistedComment edgeMediaToHoistedComment;
    @SerializedName("edge_media_preview_comment")
    @Expose
    private EdgeMediaPreviewComment edgeMediaPreviewComment;
    @SerializedName("comments_disabled")
    @Expose
    private Boolean commentsDisabled;
    @SerializedName("commenting_disabled_for_viewer")
    @Expose
    private Boolean commentingDisabledForViewer;
    @SerializedName("taken_at_timestamp")
    @Expose
    private Long takenAtTimestamp;
    @SerializedName("edge_media_preview_like")
    @Expose
    private EdgeMediaPreviewLike edgeMediaPreviewLike;
    @SerializedName("edge_media_to_sponsor_user")
    @Expose
    private EdgeMediaToSponsorUser edgeMediaToSponsorUser;
    @SerializedName("is_affiliate")
    @Expose
    private Boolean isAffiliate;
    @SerializedName("is_paid_partnership")
    @Expose
    private Boolean isPaidPartnership;
    @SerializedName("location")
    @Expose
    private Object location;
    @SerializedName("viewer_has_liked")
    @Expose
    private Boolean viewerHasLiked;
    @SerializedName("viewer_has_saved")
    @Expose
    private Boolean viewerHasSaved;
    @SerializedName("viewer_has_saved_to_collection")
    @Expose
    private Boolean viewerHasSavedToCollection;
    @SerializedName("viewer_in_photo_of_you")
    @Expose
    private Boolean viewerInPhotoOfYou;
    @SerializedName("viewer_can_reshare")
    @Expose
    private Boolean viewerCanReshare;
    @SerializedName("owner")
    @Expose
    private Owner__2 owner;
    @SerializedName("is_ad")
    @Expose
    private Boolean isAd;
    @SerializedName("edge_web_media_to_related_media")
    @Expose
    private EdgeWebMediaToRelatedMedia edgeWebMediaToRelatedMedia;
    @SerializedName("coauthor_producers")
    @Expose
    private List<Object> coauthorProducers = null;
    @SerializedName("edge_sidecar_to_children")
    @Expose
    private EdgeSidecarToChildren edgeSidecarToChildren;
    @SerializedName("edge_related_profiles")
    @Expose
    private EdgeRelatedProfiles edgeRelatedProfiles;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ShortcodeMedia() {
    }

    /**
     * 
     * @param trackingToken
     * @param hasRankedComments
     * @param likeAndViewCountsDisabled
     * @param canSeeInsightsAsBrand
     * @param upcomingEvent
     * @param viewerInPhotoOfYou
     * @param shortcode
     * @param isPaidPartnership
     * @param viewerHasSavedToCollection
     * @param edgeMediaToCaption
     * @param edgeRelatedProfiles
     * @param takenAtTimestamp
     * @param mediaOverlayInfo
     * @param viewerCanReshare
     * @param edgeMediaPreviewComment
     * @param viewerHasLiked
     * @param id
     * @param edgeMediaToSponsorUser
     * @param isAd
     * @param sensitivityFrictionInfo
     * @param owner
     * @param viewerHasSaved
     * @param gatingInfo
     * @param edgeMediaToTaggedUser
     * @param commentingDisabledForViewer
     * @param isVideo
     * @param captionIsEdited
     * @param isAffiliate
     * @param displayUrl
     * @param sharingFrictionInfo
     * @param edgeMediaToParentComment
     * @param coauthorProducers
     * @param factCheckOverallRating
     * @param commentsDisabled
     * @param edgeMediaPreviewLike
     * @param mediaPreview
     * @param factCheckInformation
     * @param location
     * @param edgeMediaToHoistedComment
     * @param edgeWebMediaToRelatedMedia
     * @param typename
     * @param dimensions
     * @param displayResources
     * @param edgeSidecarToChildren
     */
    public ShortcodeMedia(String typename, String id, String shortcode, Dimensions dimensions, Object gatingInfo, Object factCheckOverallRating, Object factCheckInformation, Object sensitivityFrictionInfo, SharingFrictionInfo sharingFrictionInfo, Object mediaOverlayInfo, Object mediaPreview, String displayUrl, List<DisplayResource> displayResources, Boolean isVideo, String trackingToken, Object upcomingEvent, EdgeMediaToTaggedUser edgeMediaToTaggedUser, EdgeMediaToCaption edgeMediaToCaption, Boolean canSeeInsightsAsBrand, Boolean captionIsEdited, Boolean hasRankedComments, Boolean likeAndViewCountsDisabled, EdgeMediaToParentComment edgeMediaToParentComment, EdgeMediaToHoistedComment edgeMediaToHoistedComment, EdgeMediaPreviewComment edgeMediaPreviewComment, Boolean commentsDisabled, Boolean commentingDisabledForViewer, Long takenAtTimestamp, EdgeMediaPreviewLike edgeMediaPreviewLike, EdgeMediaToSponsorUser edgeMediaToSponsorUser, Boolean isAffiliate, Boolean isPaidPartnership, Object location, Boolean viewerHasLiked, Boolean viewerHasSaved, Boolean viewerHasSavedToCollection, Boolean viewerInPhotoOfYou, Boolean viewerCanReshare, Owner__2 owner, Boolean isAd, EdgeWebMediaToRelatedMedia edgeWebMediaToRelatedMedia, List<Object> coauthorProducers, EdgeSidecarToChildren edgeSidecarToChildren, EdgeRelatedProfiles edgeRelatedProfiles) {
        super();
        this.typename = typename;
        this.id = id;
        this.shortcode = shortcode;
        this.dimensions = dimensions;
        this.gatingInfo = gatingInfo;
        this.factCheckOverallRating = factCheckOverallRating;
        this.factCheckInformation = factCheckInformation;
        this.sensitivityFrictionInfo = sensitivityFrictionInfo;
        this.sharingFrictionInfo = sharingFrictionInfo;
        this.mediaOverlayInfo = mediaOverlayInfo;
        this.mediaPreview = mediaPreview;
        this.displayUrl = displayUrl;
        this.displayResources = displayResources;
        this.isVideo = isVideo;
        this.trackingToken = trackingToken;
        this.upcomingEvent = upcomingEvent;
        this.edgeMediaToTaggedUser = edgeMediaToTaggedUser;
        this.edgeMediaToCaption = edgeMediaToCaption;
        this.canSeeInsightsAsBrand = canSeeInsightsAsBrand;
        this.captionIsEdited = captionIsEdited;
        this.hasRankedComments = hasRankedComments;
        this.likeAndViewCountsDisabled = likeAndViewCountsDisabled;
        this.edgeMediaToParentComment = edgeMediaToParentComment;
        this.edgeMediaToHoistedComment = edgeMediaToHoistedComment;
        this.edgeMediaPreviewComment = edgeMediaPreviewComment;
        this.commentsDisabled = commentsDisabled;
        this.commentingDisabledForViewer = commentingDisabledForViewer;
        this.takenAtTimestamp = takenAtTimestamp;
        this.edgeMediaPreviewLike = edgeMediaPreviewLike;
        this.edgeMediaToSponsorUser = edgeMediaToSponsorUser;
        this.isAffiliate = isAffiliate;
        this.isPaidPartnership = isPaidPartnership;
        this.location = location;
        this.viewerHasLiked = viewerHasLiked;
        this.viewerHasSaved = viewerHasSaved;
        this.viewerHasSavedToCollection = viewerHasSavedToCollection;
        this.viewerInPhotoOfYou = viewerInPhotoOfYou;
        this.viewerCanReshare = viewerCanReshare;
        this.owner = owner;
        this.isAd = isAd;
        this.edgeWebMediaToRelatedMedia = edgeWebMediaToRelatedMedia;
        this.coauthorProducers = coauthorProducers;
        this.edgeSidecarToChildren = edgeSidecarToChildren;
        this.edgeRelatedProfiles = edgeRelatedProfiles;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getShortcode() {
        return shortcode;
    }

    public void setShortcode(String shortcode) {
        this.shortcode = shortcode;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public void setDimensions(Dimensions dimensions) {
        this.dimensions = dimensions;
    }

    public Object getGatingInfo() {
        return gatingInfo;
    }

    public void setGatingInfo(Object gatingInfo) {
        this.gatingInfo = gatingInfo;
    }

    public Object getFactCheckOverallRating() {
        return factCheckOverallRating;
    }

    public void setFactCheckOverallRating(Object factCheckOverallRating) {
        this.factCheckOverallRating = factCheckOverallRating;
    }

    public Object getFactCheckInformation() {
        return factCheckInformation;
    }

    public void setFactCheckInformation(Object factCheckInformation) {
        this.factCheckInformation = factCheckInformation;
    }

    public Object getSensitivityFrictionInfo() {
        return sensitivityFrictionInfo;
    }

    public void setSensitivityFrictionInfo(Object sensitivityFrictionInfo) {
        this.sensitivityFrictionInfo = sensitivityFrictionInfo;
    }

    public SharingFrictionInfo getSharingFrictionInfo() {
        return sharingFrictionInfo;
    }

    public void setSharingFrictionInfo(SharingFrictionInfo sharingFrictionInfo) {
        this.sharingFrictionInfo = sharingFrictionInfo;
    }

    public Object getMediaOverlayInfo() {
        return mediaOverlayInfo;
    }

    public void setMediaOverlayInfo(Object mediaOverlayInfo) {
        this.mediaOverlayInfo = mediaOverlayInfo;
    }

    public Object getMediaPreview() {
        return mediaPreview;
    }

    public void setMediaPreview(Object mediaPreview) {
        this.mediaPreview = mediaPreview;
    }

    public String getDisplayUrl() {
        return displayUrl;
    }

    public void setDisplayUrl(String displayUrl) {
        this.displayUrl = displayUrl;
    }

    public List<DisplayResource> getDisplayResources() {
        return displayResources;
    }

    public void setDisplayResources(List<DisplayResource> displayResources) {
        this.displayResources = displayResources;
    }

    public Boolean getIsVideo() {
        return isVideo;
    }

    public void setIsVideo(Boolean isVideo) {
        this.isVideo = isVideo;
    }

    public String getTrackingToken() {
        return trackingToken;
    }

    public void setTrackingToken(String trackingToken) {
        this.trackingToken = trackingToken;
    }

    public Object getUpcomingEvent() {
        return upcomingEvent;
    }

    public void setUpcomingEvent(Object upcomingEvent) {
        this.upcomingEvent = upcomingEvent;
    }

    public EdgeMediaToTaggedUser getEdgeMediaToTaggedUser() {
        return edgeMediaToTaggedUser;
    }

    public void setEdgeMediaToTaggedUser(EdgeMediaToTaggedUser edgeMediaToTaggedUser) {
        this.edgeMediaToTaggedUser = edgeMediaToTaggedUser;
    }

    public EdgeMediaToCaption getEdgeMediaToCaption() {
        return edgeMediaToCaption;
    }

    public void setEdgeMediaToCaption(EdgeMediaToCaption edgeMediaToCaption) {
        this.edgeMediaToCaption = edgeMediaToCaption;
    }

    public Boolean getCanSeeInsightsAsBrand() {
        return canSeeInsightsAsBrand;
    }

    public void setCanSeeInsightsAsBrand(Boolean canSeeInsightsAsBrand) {
        this.canSeeInsightsAsBrand = canSeeInsightsAsBrand;
    }

    public Boolean getCaptionIsEdited() {
        return captionIsEdited;
    }

    public void setCaptionIsEdited(Boolean captionIsEdited) {
        this.captionIsEdited = captionIsEdited;
    }

    public Boolean getHasRankedComments() {
        return hasRankedComments;
    }

    public void setHasRankedComments(Boolean hasRankedComments) {
        this.hasRankedComments = hasRankedComments;
    }

    public Boolean getLikeAndViewCountsDisabled() {
        return likeAndViewCountsDisabled;
    }

    public void setLikeAndViewCountsDisabled(Boolean likeAndViewCountsDisabled) {
        this.likeAndViewCountsDisabled = likeAndViewCountsDisabled;
    }

    public EdgeMediaToParentComment getEdgeMediaToParentComment() {
        return edgeMediaToParentComment;
    }

    public void setEdgeMediaToParentComment(EdgeMediaToParentComment edgeMediaToParentComment) {
        this.edgeMediaToParentComment = edgeMediaToParentComment;
    }

    public EdgeMediaToHoistedComment getEdgeMediaToHoistedComment() {
        return edgeMediaToHoistedComment;
    }

    public void setEdgeMediaToHoistedComment(EdgeMediaToHoistedComment edgeMediaToHoistedComment) {
        this.edgeMediaToHoistedComment = edgeMediaToHoistedComment;
    }

    public EdgeMediaPreviewComment getEdgeMediaPreviewComment() {
        return edgeMediaPreviewComment;
    }

    public void setEdgeMediaPreviewComment(EdgeMediaPreviewComment edgeMediaPreviewComment) {
        this.edgeMediaPreviewComment = edgeMediaPreviewComment;
    }

    public Boolean getCommentsDisabled() {
        return commentsDisabled;
    }

    public void setCommentsDisabled(Boolean commentsDisabled) {
        this.commentsDisabled = commentsDisabled;
    }

    public Boolean getCommentingDisabledForViewer() {
        return commentingDisabledForViewer;
    }

    public void setCommentingDisabledForViewer(Boolean commentingDisabledForViewer) {
        this.commentingDisabledForViewer = commentingDisabledForViewer;
    }

    public Long getTakenAtTimestamp() {
        return takenAtTimestamp;
    }

    public void setTakenAtTimestamp(Long takenAtTimestamp) {
        this.takenAtTimestamp = takenAtTimestamp;
    }

    public EdgeMediaPreviewLike getEdgeMediaPreviewLike() {
        return edgeMediaPreviewLike;
    }

    public void setEdgeMediaPreviewLike(EdgeMediaPreviewLike edgeMediaPreviewLike) {
        this.edgeMediaPreviewLike = edgeMediaPreviewLike;
    }

    public EdgeMediaToSponsorUser getEdgeMediaToSponsorUser() {
        return edgeMediaToSponsorUser;
    }

    public void setEdgeMediaToSponsorUser(EdgeMediaToSponsorUser edgeMediaToSponsorUser) {
        this.edgeMediaToSponsorUser = edgeMediaToSponsorUser;
    }

    public Boolean getIsAffiliate() {
        return isAffiliate;
    }

    public void setIsAffiliate(Boolean isAffiliate) {
        this.isAffiliate = isAffiliate;
    }

    public Boolean getIsPaidPartnership() {
        return isPaidPartnership;
    }

    public void setIsPaidPartnership(Boolean isPaidPartnership) {
        this.isPaidPartnership = isPaidPartnership;
    }

    public Object getLocation() {
        return location;
    }

    public void setLocation(Object location) {
        this.location = location;
    }

    public Boolean getViewerHasLiked() {
        return viewerHasLiked;
    }

    public void setViewerHasLiked(Boolean viewerHasLiked) {
        this.viewerHasLiked = viewerHasLiked;
    }

    public Boolean getViewerHasSaved() {
        return viewerHasSaved;
    }

    public void setViewerHasSaved(Boolean viewerHasSaved) {
        this.viewerHasSaved = viewerHasSaved;
    }

    public Boolean getViewerHasSavedToCollection() {
        return viewerHasSavedToCollection;
    }

    public void setViewerHasSavedToCollection(Boolean viewerHasSavedToCollection) {
        this.viewerHasSavedToCollection = viewerHasSavedToCollection;
    }

    public Boolean getViewerInPhotoOfYou() {
        return viewerInPhotoOfYou;
    }

    public void setViewerInPhotoOfYou(Boolean viewerInPhotoOfYou) {
        this.viewerInPhotoOfYou = viewerInPhotoOfYou;
    }

    public Boolean getViewerCanReshare() {
        return viewerCanReshare;
    }

    public void setViewerCanReshare(Boolean viewerCanReshare) {
        this.viewerCanReshare = viewerCanReshare;
    }

    public Owner__2 getOwner() {
        return owner;
    }

    public void setOwner(Owner__2 owner) {
        this.owner = owner;
    }

    public Boolean getIsAd() {
        return isAd;
    }

    public void setIsAd(Boolean isAd) {
        this.isAd = isAd;
    }

    public EdgeWebMediaToRelatedMedia getEdgeWebMediaToRelatedMedia() {
        return edgeWebMediaToRelatedMedia;
    }

    public void setEdgeWebMediaToRelatedMedia(EdgeWebMediaToRelatedMedia edgeWebMediaToRelatedMedia) {
        this.edgeWebMediaToRelatedMedia = edgeWebMediaToRelatedMedia;
    }

    public List<Object> getCoauthorProducers() {
        return coauthorProducers;
    }

    public void setCoauthorProducers(List<Object> coauthorProducers) {
        this.coauthorProducers = coauthorProducers;
    }

    public EdgeSidecarToChildren getEdgeSidecarToChildren() {
        return edgeSidecarToChildren;
    }

    public void setEdgeSidecarToChildren(EdgeSidecarToChildren edgeSidecarToChildren) {
        this.edgeSidecarToChildren = edgeSidecarToChildren;
    }

    public EdgeRelatedProfiles getEdgeRelatedProfiles() {
        return edgeRelatedProfiles;
    }

    public void setEdgeRelatedProfiles(EdgeRelatedProfiles edgeRelatedProfiles) {
        this.edgeRelatedProfiles = edgeRelatedProfiles;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ShortcodeMedia.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("typename");
        sb.append('=');
        sb.append(((this.typename == null)?"<null>":this.typename));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("shortcode");
        sb.append('=');
        sb.append(((this.shortcode == null)?"<null>":this.shortcode));
        sb.append(',');
        sb.append("dimensions");
        sb.append('=');
        sb.append(((this.dimensions == null)?"<null>":this.dimensions));
        sb.append(',');
        sb.append("gatingInfo");
        sb.append('=');
        sb.append(((this.gatingInfo == null)?"<null>":this.gatingInfo));
        sb.append(',');
        sb.append("factCheckOverallRating");
        sb.append('=');
        sb.append(((this.factCheckOverallRating == null)?"<null>":this.factCheckOverallRating));
        sb.append(',');
        sb.append("factCheckInformation");
        sb.append('=');
        sb.append(((this.factCheckInformation == null)?"<null>":this.factCheckInformation));
        sb.append(',');
        sb.append("sensitivityFrictionInfo");
        sb.append('=');
        sb.append(((this.sensitivityFrictionInfo == null)?"<null>":this.sensitivityFrictionInfo));
        sb.append(',');
        sb.append("sharingFrictionInfo");
        sb.append('=');
        sb.append(((this.sharingFrictionInfo == null)?"<null>":this.sharingFrictionInfo));
        sb.append(',');
        sb.append("mediaOverlayInfo");
        sb.append('=');
        sb.append(((this.mediaOverlayInfo == null)?"<null>":this.mediaOverlayInfo));
        sb.append(',');
        sb.append("mediaPreview");
        sb.append('=');
        sb.append(((this.mediaPreview == null)?"<null>":this.mediaPreview));
        sb.append(',');
        sb.append("displayUrl");
        sb.append('=');
        sb.append(((this.displayUrl == null)?"<null>":this.displayUrl));
        sb.append(',');
        sb.append("displayResources");
        sb.append('=');
        sb.append(((this.displayResources == null)?"<null>":this.displayResources));
        sb.append(',');
        sb.append("isVideo");
        sb.append('=');
        sb.append(((this.isVideo == null)?"<null>":this.isVideo));
        sb.append(',');
        sb.append("trackingToken");
        sb.append('=');
        sb.append(((this.trackingToken == null)?"<null>":this.trackingToken));
        sb.append(',');
        sb.append("upcomingEvent");
        sb.append('=');
        sb.append(((this.upcomingEvent == null)?"<null>":this.upcomingEvent));
        sb.append(',');
        sb.append("edgeMediaToTaggedUser");
        sb.append('=');
        sb.append(((this.edgeMediaToTaggedUser == null)?"<null>":this.edgeMediaToTaggedUser));
        sb.append(',');
        sb.append("edgeMediaToCaption");
        sb.append('=');
        sb.append(((this.edgeMediaToCaption == null)?"<null>":this.edgeMediaToCaption));
        sb.append(',');
        sb.append("canSeeInsightsAsBrand");
        sb.append('=');
        sb.append(((this.canSeeInsightsAsBrand == null)?"<null>":this.canSeeInsightsAsBrand));
        sb.append(',');
        sb.append("captionIsEdited");
        sb.append('=');
        sb.append(((this.captionIsEdited == null)?"<null>":this.captionIsEdited));
        sb.append(',');
        sb.append("hasRankedComments");
        sb.append('=');
        sb.append(((this.hasRankedComments == null)?"<null>":this.hasRankedComments));
        sb.append(',');
        sb.append("likeAndViewCountsDisabled");
        sb.append('=');
        sb.append(((this.likeAndViewCountsDisabled == null)?"<null>":this.likeAndViewCountsDisabled));
        sb.append(',');
        sb.append("edgeMediaToParentComment");
        sb.append('=');
        sb.append(((this.edgeMediaToParentComment == null)?"<null>":this.edgeMediaToParentComment));
        sb.append(',');
        sb.append("edgeMediaToHoistedComment");
        sb.append('=');
        sb.append(((this.edgeMediaToHoistedComment == null)?"<null>":this.edgeMediaToHoistedComment));
        sb.append(',');
        sb.append("edgeMediaPreviewComment");
        sb.append('=');
        sb.append(((this.edgeMediaPreviewComment == null)?"<null>":this.edgeMediaPreviewComment));
        sb.append(',');
        sb.append("commentsDisabled");
        sb.append('=');
        sb.append(((this.commentsDisabled == null)?"<null>":this.commentsDisabled));
        sb.append(',');
        sb.append("commentingDisabledForViewer");
        sb.append('=');
        sb.append(((this.commentingDisabledForViewer == null)?"<null>":this.commentingDisabledForViewer));
        sb.append(',');
        sb.append("takenAtTimestamp");
        sb.append('=');
        sb.append(((this.takenAtTimestamp == null)?"<null>":this.takenAtTimestamp));
        sb.append(',');
        sb.append("edgeMediaPreviewLike");
        sb.append('=');
        sb.append(((this.edgeMediaPreviewLike == null)?"<null>":this.edgeMediaPreviewLike));
        sb.append(',');
        sb.append("edgeMediaToSponsorUser");
        sb.append('=');
        sb.append(((this.edgeMediaToSponsorUser == null)?"<null>":this.edgeMediaToSponsorUser));
        sb.append(',');
        sb.append("isAffiliate");
        sb.append('=');
        sb.append(((this.isAffiliate == null)?"<null>":this.isAffiliate));
        sb.append(',');
        sb.append("isPaidPartnership");
        sb.append('=');
        sb.append(((this.isPaidPartnership == null)?"<null>":this.isPaidPartnership));
        sb.append(',');
        sb.append("location");
        sb.append('=');
        sb.append(((this.location == null)?"<null>":this.location));
        sb.append(',');
        sb.append("viewerHasLiked");
        sb.append('=');
        sb.append(((this.viewerHasLiked == null)?"<null>":this.viewerHasLiked));
        sb.append(',');
        sb.append("viewerHasSaved");
        sb.append('=');
        sb.append(((this.viewerHasSaved == null)?"<null>":this.viewerHasSaved));
        sb.append(',');
        sb.append("viewerHasSavedToCollection");
        sb.append('=');
        sb.append(((this.viewerHasSavedToCollection == null)?"<null>":this.viewerHasSavedToCollection));
        sb.append(',');
        sb.append("viewerInPhotoOfYou");
        sb.append('=');
        sb.append(((this.viewerInPhotoOfYou == null)?"<null>":this.viewerInPhotoOfYou));
        sb.append(',');
        sb.append("viewerCanReshare");
        sb.append('=');
        sb.append(((this.viewerCanReshare == null)?"<null>":this.viewerCanReshare));
        sb.append(',');
        sb.append("owner");
        sb.append('=');
        sb.append(((this.owner == null)?"<null>":this.owner));
        sb.append(',');
        sb.append("isAd");
        sb.append('=');
        sb.append(((this.isAd == null)?"<null>":this.isAd));
        sb.append(',');
        sb.append("edgeWebMediaToRelatedMedia");
        sb.append('=');
        sb.append(((this.edgeWebMediaToRelatedMedia == null)?"<null>":this.edgeWebMediaToRelatedMedia));
        sb.append(',');
        sb.append("coauthorProducers");
        sb.append('=');
        sb.append(((this.coauthorProducers == null)?"<null>":this.coauthorProducers));
        sb.append(',');
        sb.append("edgeSidecarToChildren");
        sb.append('=');
        sb.append(((this.edgeSidecarToChildren == null)?"<null>":this.edgeSidecarToChildren));
        sb.append(',');
        sb.append("edgeRelatedProfiles");
        sb.append('=');
        sb.append(((this.edgeRelatedProfiles == null)?"<null>":this.edgeRelatedProfiles));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
