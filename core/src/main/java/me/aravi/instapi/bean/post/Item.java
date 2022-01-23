
package me.aravi.instapi.bean.post;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Item {

    @SerializedName("taken_at")
    @Expose
    private Integer takenAt;
    @SerializedName("pk")
    @Expose
    private Long pk;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("device_timestamp")
    @Expose
    private Long deviceTimestamp;
    @SerializedName("media_type")
    @Expose
    private Integer mediaType;
    @SerializedName("code")
    @Expose
    private String code;
    @SerializedName("client_cache_key")
    @Expose
    private String clientCacheKey;
    @SerializedName("filter_type")
    @Expose
    private Integer filterType;
    @SerializedName("is_unified_video")
    @Expose
    private Boolean isUnifiedVideo;
    @SerializedName("user")
    @Expose
    private User user;
    @SerializedName("can_viewer_reshare")
    @Expose
    private Boolean canViewerReshare;
    @SerializedName("caption_is_edited")
    @Expose
    private Boolean captionIsEdited;
    @SerializedName("like_and_view_counts_disabled")
    @Expose
    private Boolean likeAndViewCountsDisabled;
    @SerializedName("featured_products_cta")
    @Expose
    private Object featuredProductsCta;
    @SerializedName("commerciality_status")
    @Expose
    private String commercialityStatus;
    @SerializedName("is_paid_partnership")
    @Expose
    private Boolean isPaidPartnership;
    @SerializedName("is_visual_reply_commenter_notice_enabled")
    @Expose
    private Boolean isVisualReplyCommenterNoticeEnabled;
    @SerializedName("original_media_has_visual_reply_media")
    @Expose
    private Boolean originalMediaHasVisualReplyMedia;
    @SerializedName("comment_likes_enabled")
    @Expose
    private Boolean commentLikesEnabled;
    @SerializedName("comment_threading_enabled")
    @Expose
    private Boolean commentThreadingEnabled;
    @SerializedName("has_more_comments")
    @Expose
    private Boolean hasMoreComments;
    @SerializedName("max_num_visible_preview_comments")
    @Expose
    private Integer maxNumVisiblePreviewComments;
    @SerializedName("preview_comments")
    @Expose
    private List<Object> previewComments = null;
    @SerializedName("comments")
    @Expose
    private List<Object> comments = null;
    @SerializedName("can_view_more_preview_comments")
    @Expose
    private Boolean canViewMorePreviewComments;
    @SerializedName("comment_count")
    @Expose
    private Integer commentCount;
    @SerializedName("hide_view_all_comment_entrypoint")
    @Expose
    private Boolean hideViewAllCommentEntrypoint;
    @SerializedName("inline_composer_display_condition")
    @Expose
    private String inlineComposerDisplayCondition;
    @SerializedName("image_versions2")
    @Expose
    private ImageVersions2 imageVersions2;
    @SerializedName("original_width")
    @Expose
    private Integer originalWidth;
    @SerializedName("original_height")
    @Expose
    private Integer originalHeight;
    @SerializedName("like_count")
    @Expose
    private Integer likeCount;
    @SerializedName("has_liked")
    @Expose
    private Boolean hasLiked;
    @SerializedName("top_likers")
    @Expose
    private List<Object> topLikers = null;
    @SerializedName("facepile_top_likers")
    @Expose
    private List<Object> facepileTopLikers = null;
    @SerializedName("photo_of_you")
    @Expose
    private Boolean photoOfYou;
    @SerializedName("can_see_insights_as_brand")
    @Expose
    private Boolean canSeeInsightsAsBrand;
    @SerializedName("caption")
    @Expose
    private Caption caption;
    @SerializedName("can_viewer_save")
    @Expose
    private Boolean canViewerSave;
    @SerializedName("organic_tracking_token")
    @Expose
    private String organicTrackingToken;
    @SerializedName("sharing_friction_info")
    @Expose
    private SharingFrictionInfo sharingFrictionInfo;
    @SerializedName("comment_inform_treatment")
    @Expose
    private CommentInformTreatment commentInformTreatment;
    @SerializedName("product_type")
    @Expose
    private String productType;
    @SerializedName("is_in_profile_grid")
    @Expose
    private Boolean isInProfileGrid;
    @SerializedName("profile_grid_control_enabled")
    @Expose
    private Boolean profileGridControlEnabled;
    @SerializedName("deleted_reason")
    @Expose
    private Integer deletedReason;
    @SerializedName("integrity_review_decision")
    @Expose
    private String integrityReviewDecision;
    @SerializedName("music_metadata")
    @Expose
    private MusicMetadata musicMetadata;

    public Integer getTakenAt() {
        return takenAt;
    }

    public void setTakenAt(Integer takenAt) {
        this.takenAt = takenAt;
    }

    public Long getPk() {
        return pk;
    }

    public void setPk(Long pk) {
        this.pk = pk;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getDeviceTimestamp() {
        return deviceTimestamp;
    }

    public void setDeviceTimestamp(Long deviceTimestamp) {
        this.deviceTimestamp = deviceTimestamp;
    }

    public Integer getMediaType() {
        return mediaType;
    }

    public void setMediaType(Integer mediaType) {
        this.mediaType = mediaType;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getClientCacheKey() {
        return clientCacheKey;
    }

    public void setClientCacheKey(String clientCacheKey) {
        this.clientCacheKey = clientCacheKey;
    }

    public Integer getFilterType() {
        return filterType;
    }

    public void setFilterType(Integer filterType) {
        this.filterType = filterType;
    }

    public Boolean getIsUnifiedVideo() {
        return isUnifiedVideo;
    }

    public void setIsUnifiedVideo(Boolean isUnifiedVideo) {
        this.isUnifiedVideo = isUnifiedVideo;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Boolean getCanViewerReshare() {
        return canViewerReshare;
    }

    public void setCanViewerReshare(Boolean canViewerReshare) {
        this.canViewerReshare = canViewerReshare;
    }

    public Boolean getCaptionIsEdited() {
        return captionIsEdited;
    }

    public void setCaptionIsEdited(Boolean captionIsEdited) {
        this.captionIsEdited = captionIsEdited;
    }

    public Boolean getLikeAndViewCountsDisabled() {
        return likeAndViewCountsDisabled;
    }

    public void setLikeAndViewCountsDisabled(Boolean likeAndViewCountsDisabled) {
        this.likeAndViewCountsDisabled = likeAndViewCountsDisabled;
    }

    public Object getFeaturedProductsCta() {
        return featuredProductsCta;
    }

    public void setFeaturedProductsCta(Object featuredProductsCta) {
        this.featuredProductsCta = featuredProductsCta;
    }

    public String getCommercialityStatus() {
        return commercialityStatus;
    }

    public void setCommercialityStatus(String commercialityStatus) {
        this.commercialityStatus = commercialityStatus;
    }

    public Boolean getIsPaidPartnership() {
        return isPaidPartnership;
    }

    public void setIsPaidPartnership(Boolean isPaidPartnership) {
        this.isPaidPartnership = isPaidPartnership;
    }

    public Boolean getIsVisualReplyCommenterNoticeEnabled() {
        return isVisualReplyCommenterNoticeEnabled;
    }

    public void setIsVisualReplyCommenterNoticeEnabled(Boolean isVisualReplyCommenterNoticeEnabled) {
        this.isVisualReplyCommenterNoticeEnabled = isVisualReplyCommenterNoticeEnabled;
    }

    public Boolean getOriginalMediaHasVisualReplyMedia() {
        return originalMediaHasVisualReplyMedia;
    }

    public void setOriginalMediaHasVisualReplyMedia(Boolean originalMediaHasVisualReplyMedia) {
        this.originalMediaHasVisualReplyMedia = originalMediaHasVisualReplyMedia;
    }

    public Boolean getCommentLikesEnabled() {
        return commentLikesEnabled;
    }

    public void setCommentLikesEnabled(Boolean commentLikesEnabled) {
        this.commentLikesEnabled = commentLikesEnabled;
    }

    public Boolean getCommentThreadingEnabled() {
        return commentThreadingEnabled;
    }

    public void setCommentThreadingEnabled(Boolean commentThreadingEnabled) {
        this.commentThreadingEnabled = commentThreadingEnabled;
    }

    public Boolean getHasMoreComments() {
        return hasMoreComments;
    }

    public void setHasMoreComments(Boolean hasMoreComments) {
        this.hasMoreComments = hasMoreComments;
    }

    public Integer getMaxNumVisiblePreviewComments() {
        return maxNumVisiblePreviewComments;
    }

    public void setMaxNumVisiblePreviewComments(Integer maxNumVisiblePreviewComments) {
        this.maxNumVisiblePreviewComments = maxNumVisiblePreviewComments;
    }

    public List<Object> getPreviewComments() {
        return previewComments;
    }

    public void setPreviewComments(List<Object> previewComments) {
        this.previewComments = previewComments;
    }

    public List<Object> getComments() {
        return comments;
    }

    public void setComments(List<Object> comments) {
        this.comments = comments;
    }

    public Boolean getCanViewMorePreviewComments() {
        return canViewMorePreviewComments;
    }

    public void setCanViewMorePreviewComments(Boolean canViewMorePreviewComments) {
        this.canViewMorePreviewComments = canViewMorePreviewComments;
    }

    public Integer getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    public Boolean getHideViewAllCommentEntrypoint() {
        return hideViewAllCommentEntrypoint;
    }

    public void setHideViewAllCommentEntrypoint(Boolean hideViewAllCommentEntrypoint) {
        this.hideViewAllCommentEntrypoint = hideViewAllCommentEntrypoint;
    }

    public String getInlineComposerDisplayCondition() {
        return inlineComposerDisplayCondition;
    }

    public void setInlineComposerDisplayCondition(String inlineComposerDisplayCondition) {
        this.inlineComposerDisplayCondition = inlineComposerDisplayCondition;
    }

    public ImageVersions2 getImageVersions2() {
        return imageVersions2;
    }

    public void setImageVersions2(ImageVersions2 imageVersions2) {
        this.imageVersions2 = imageVersions2;
    }

    public Integer getOriginalWidth() {
        return originalWidth;
    }

    public void setOriginalWidth(Integer originalWidth) {
        this.originalWidth = originalWidth;
    }

    public Integer getOriginalHeight() {
        return originalHeight;
    }

    public void setOriginalHeight(Integer originalHeight) {
        this.originalHeight = originalHeight;
    }

    public Integer getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(Integer likeCount) {
        this.likeCount = likeCount;
    }

    public Boolean getHasLiked() {
        return hasLiked;
    }

    public void setHasLiked(Boolean hasLiked) {
        this.hasLiked = hasLiked;
    }

    public List<Object> getTopLikers() {
        return topLikers;
    }

    public void setTopLikers(List<Object> topLikers) {
        this.topLikers = topLikers;
    }

    public List<Object> getFacepileTopLikers() {
        return facepileTopLikers;
    }

    public void setFacepileTopLikers(List<Object> facepileTopLikers) {
        this.facepileTopLikers = facepileTopLikers;
    }

    public Boolean getPhotoOfYou() {
        return photoOfYou;
    }

    public void setPhotoOfYou(Boolean photoOfYou) {
        this.photoOfYou = photoOfYou;
    }

    public Boolean getCanSeeInsightsAsBrand() {
        return canSeeInsightsAsBrand;
    }

    public void setCanSeeInsightsAsBrand(Boolean canSeeInsightsAsBrand) {
        this.canSeeInsightsAsBrand = canSeeInsightsAsBrand;
    }

    public Caption getCaption() {
        return caption;
    }

    public void setCaption(Caption caption) {
        this.caption = caption;
    }

    public Boolean getCanViewerSave() {
        return canViewerSave;
    }

    public void setCanViewerSave(Boolean canViewerSave) {
        this.canViewerSave = canViewerSave;
    }

    public String getOrganicTrackingToken() {
        return organicTrackingToken;
    }

    public void setOrganicTrackingToken(String organicTrackingToken) {
        this.organicTrackingToken = organicTrackingToken;
    }

    public SharingFrictionInfo getSharingFrictionInfo() {
        return sharingFrictionInfo;
    }

    public void setSharingFrictionInfo(SharingFrictionInfo sharingFrictionInfo) {
        this.sharingFrictionInfo = sharingFrictionInfo;
    }

    public CommentInformTreatment getCommentInformTreatment() {
        return commentInformTreatment;
    }

    public void setCommentInformTreatment(CommentInformTreatment commentInformTreatment) {
        this.commentInformTreatment = commentInformTreatment;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public Boolean getIsInProfileGrid() {
        return isInProfileGrid;
    }

    public void setIsInProfileGrid(Boolean isInProfileGrid) {
        this.isInProfileGrid = isInProfileGrid;
    }

    public Boolean getProfileGridControlEnabled() {
        return profileGridControlEnabled;
    }

    public void setProfileGridControlEnabled(Boolean profileGridControlEnabled) {
        this.profileGridControlEnabled = profileGridControlEnabled;
    }

    public Integer getDeletedReason() {
        return deletedReason;
    }

    public void setDeletedReason(Integer deletedReason) {
        this.deletedReason = deletedReason;
    }

    public String getIntegrityReviewDecision() {
        return integrityReviewDecision;
    }

    public void setIntegrityReviewDecision(String integrityReviewDecision) {
        this.integrityReviewDecision = integrityReviewDecision;
    }

    public MusicMetadata getMusicMetadata() {
        return musicMetadata;
    }

    public void setMusicMetadata(MusicMetadata musicMetadata) {
        this.musicMetadata = musicMetadata;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Item.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("takenAt");
        sb.append('=');
        sb.append(((this.takenAt == null)?"<null>":this.takenAt));
        sb.append(',');
        sb.append("pk");
        sb.append('=');
        sb.append(((this.pk == null)?"<null>":this.pk));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("deviceTimestamp");
        sb.append('=');
        sb.append(((this.deviceTimestamp == null)?"<null>":this.deviceTimestamp));
        sb.append(',');
        sb.append("mediaType");
        sb.append('=');
        sb.append(((this.mediaType == null)?"<null>":this.mediaType));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("clientCacheKey");
        sb.append('=');
        sb.append(((this.clientCacheKey == null)?"<null>":this.clientCacheKey));
        sb.append(',');
        sb.append("filterType");
        sb.append('=');
        sb.append(((this.filterType == null)?"<null>":this.filterType));
        sb.append(',');
        sb.append("isUnifiedVideo");
        sb.append('=');
        sb.append(((this.isUnifiedVideo == null)?"<null>":this.isUnifiedVideo));
        sb.append(',');
        sb.append("user");
        sb.append('=');
        sb.append(((this.user == null)?"<null>":this.user));
        sb.append(',');
        sb.append("canViewerReshare");
        sb.append('=');
        sb.append(((this.canViewerReshare == null)?"<null>":this.canViewerReshare));
        sb.append(',');
        sb.append("captionIsEdited");
        sb.append('=');
        sb.append(((this.captionIsEdited == null)?"<null>":this.captionIsEdited));
        sb.append(',');
        sb.append("likeAndViewCountsDisabled");
        sb.append('=');
        sb.append(((this.likeAndViewCountsDisabled == null)?"<null>":this.likeAndViewCountsDisabled));
        sb.append(',');
        sb.append("featuredProductsCta");
        sb.append('=');
        sb.append(((this.featuredProductsCta == null)?"<null>":this.featuredProductsCta));
        sb.append(',');
        sb.append("commercialityStatus");
        sb.append('=');
        sb.append(((this.commercialityStatus == null)?"<null>":this.commercialityStatus));
        sb.append(',');
        sb.append("isPaidPartnership");
        sb.append('=');
        sb.append(((this.isPaidPartnership == null)?"<null>":this.isPaidPartnership));
        sb.append(',');
        sb.append("isVisualReplyCommenterNoticeEnabled");
        sb.append('=');
        sb.append(((this.isVisualReplyCommenterNoticeEnabled == null)?"<null>":this.isVisualReplyCommenterNoticeEnabled));
        sb.append(',');
        sb.append("originalMediaHasVisualReplyMedia");
        sb.append('=');
        sb.append(((this.originalMediaHasVisualReplyMedia == null)?"<null>":this.originalMediaHasVisualReplyMedia));
        sb.append(',');
        sb.append("commentLikesEnabled");
        sb.append('=');
        sb.append(((this.commentLikesEnabled == null)?"<null>":this.commentLikesEnabled));
        sb.append(',');
        sb.append("commentThreadingEnabled");
        sb.append('=');
        sb.append(((this.commentThreadingEnabled == null)?"<null>":this.commentThreadingEnabled));
        sb.append(',');
        sb.append("hasMoreComments");
        sb.append('=');
        sb.append(((this.hasMoreComments == null)?"<null>":this.hasMoreComments));
        sb.append(',');
        sb.append("maxNumVisiblePreviewComments");
        sb.append('=');
        sb.append(((this.maxNumVisiblePreviewComments == null)?"<null>":this.maxNumVisiblePreviewComments));
        sb.append(',');
        sb.append("previewComments");
        sb.append('=');
        sb.append(((this.previewComments == null)?"<null>":this.previewComments));
        sb.append(',');
        sb.append("comments");
        sb.append('=');
        sb.append(((this.comments == null)?"<null>":this.comments));
        sb.append(',');
        sb.append("canViewMorePreviewComments");
        sb.append('=');
        sb.append(((this.canViewMorePreviewComments == null)?"<null>":this.canViewMorePreviewComments));
        sb.append(',');
        sb.append("commentCount");
        sb.append('=');
        sb.append(((this.commentCount == null)?"<null>":this.commentCount));
        sb.append(',');
        sb.append("hideViewAllCommentEntrypoint");
        sb.append('=');
        sb.append(((this.hideViewAllCommentEntrypoint == null)?"<null>":this.hideViewAllCommentEntrypoint));
        sb.append(',');
        sb.append("inlineComposerDisplayCondition");
        sb.append('=');
        sb.append(((this.inlineComposerDisplayCondition == null)?"<null>":this.inlineComposerDisplayCondition));
        sb.append(',');
        sb.append("imageVersions2");
        sb.append('=');
        sb.append(((this.imageVersions2 == null)?"<null>":this.imageVersions2));
        sb.append(',');
        sb.append("originalWidth");
        sb.append('=');
        sb.append(((this.originalWidth == null)?"<null>":this.originalWidth));
        sb.append(',');
        sb.append("originalHeight");
        sb.append('=');
        sb.append(((this.originalHeight == null)?"<null>":this.originalHeight));
        sb.append(',');
        sb.append("likeCount");
        sb.append('=');
        sb.append(((this.likeCount == null)?"<null>":this.likeCount));
        sb.append(',');
        sb.append("hasLiked");
        sb.append('=');
        sb.append(((this.hasLiked == null)?"<null>":this.hasLiked));
        sb.append(',');
        sb.append("topLikers");
        sb.append('=');
        sb.append(((this.topLikers == null)?"<null>":this.topLikers));
        sb.append(',');
        sb.append("facepileTopLikers");
        sb.append('=');
        sb.append(((this.facepileTopLikers == null)?"<null>":this.facepileTopLikers));
        sb.append(',');
        sb.append("photoOfYou");
        sb.append('=');
        sb.append(((this.photoOfYou == null)?"<null>":this.photoOfYou));
        sb.append(',');
        sb.append("canSeeInsightsAsBrand");
        sb.append('=');
        sb.append(((this.canSeeInsightsAsBrand == null)?"<null>":this.canSeeInsightsAsBrand));
        sb.append(',');
        sb.append("caption");
        sb.append('=');
        sb.append(((this.caption == null)?"<null>":this.caption));
        sb.append(',');
        sb.append("canViewerSave");
        sb.append('=');
        sb.append(((this.canViewerSave == null)?"<null>":this.canViewerSave));
        sb.append(',');
        sb.append("organicTrackingToken");
        sb.append('=');
        sb.append(((this.organicTrackingToken == null)?"<null>":this.organicTrackingToken));
        sb.append(',');
        sb.append("sharingFrictionInfo");
        sb.append('=');
        sb.append(((this.sharingFrictionInfo == null)?"<null>":this.sharingFrictionInfo));
        sb.append(',');
        sb.append("commentInformTreatment");
        sb.append('=');
        sb.append(((this.commentInformTreatment == null)?"<null>":this.commentInformTreatment));
        sb.append(',');
        sb.append("productType");
        sb.append('=');
        sb.append(((this.productType == null)?"<null>":this.productType));
        sb.append(',');
        sb.append("isInProfileGrid");
        sb.append('=');
        sb.append(((this.isInProfileGrid == null)?"<null>":this.isInProfileGrid));
        sb.append(',');
        sb.append("profileGridControlEnabled");
        sb.append('=');
        sb.append(((this.profileGridControlEnabled == null)?"<null>":this.profileGridControlEnabled));
        sb.append(',');
        sb.append("deletedReason");
        sb.append('=');
        sb.append(((this.deletedReason == null)?"<null>":this.deletedReason));
        sb.append(',');
        sb.append("integrityReviewDecision");
        sb.append('=');
        sb.append(((this.integrityReviewDecision == null)?"<null>":this.integrityReviewDecision));
        sb.append(',');
        sb.append("musicMetadata");
        sb.append('=');
        sb.append(((this.musicMetadata == null)?"<null>":this.musicMetadata));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
