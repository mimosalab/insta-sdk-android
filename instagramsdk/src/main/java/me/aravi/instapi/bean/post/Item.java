
package me.aravi.instapi.bean.post;

import androidx.annotation.Nullable;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Item {

    @SerializedName("taken_at")
    @Expose
    private Long takenAt;
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
    private Long mediaType;
    @SerializedName("code")
    @Expose
    private String code;
    @SerializedName("client_cache_key")
    @Expose
    private String clientCacheKey;
    @SerializedName("filter_type")
    @Expose
    private Long filterType;
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
    private Long maxNumVisiblePreviewComments;
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
    private Long commentCount;
    @SerializedName("hide_view_all_comment_entrypoint")
    @Expose
    private Boolean hideViewAllCommentEntrypoint;
    @SerializedName("inline_composer_display_condition")
    @Expose
    private String inlineComposerDisplayCondition;

    @Nullable
    @SerializedName("image_versions2")
    @Expose
    private ImageVersions2 imageVersions2;

    @SerializedName("carousel_media_count")
    @Expose
    private Long carouselMediaCount;

    @SerializedName("carousel_media")
    @Expose
    private List<CarouselMedium> carouselMedia;

    @SerializedName("original_width")
    @Expose
    private Long originalWidth;
    @SerializedName("original_height")
    @Expose
    private Long originalHeight;
    @SerializedName("like_count")
    @Expose
    private Long likeCount;
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
    private Long deletedReason;
    @SerializedName("integrity_review_decision")
    @Expose
    private String integrityReviewDecision;
    @SerializedName("music_metadata")
    @Expose
    private MusicMetadata musicMetadata;

    public Long getTakenAt() {
        return takenAt;
    }

    public void setTakenAt(Long takenAt) {
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

    public Long getMediaType() {
        return mediaType;
    }

    public void setMediaType(Long mediaType) {
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

    public Long getFilterType() {
        return filterType;
    }

    public void setFilterType(Long filterType) {
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

    public Long getMaxNumVisiblePreviewComments() {
        return maxNumVisiblePreviewComments;
    }

    public void setMaxNumVisiblePreviewComments(Long maxNumVisiblePreviewComments) {
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

    public Long getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Long commentCount) {
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

    public Long getOriginalWidth() {
        return originalWidth;
    }

    public void setOriginalWidth(Long originalWidth) {
        this.originalWidth = originalWidth;
    }

    public Long getOriginalHeight() {
        return originalHeight;
    }

    public void setOriginalHeight(Long originalHeight) {
        this.originalHeight = originalHeight;
    }

    public Long getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(Long likeCount) {
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

    public Long getDeletedReason() {
        return deletedReason;
    }

    public void setDeletedReason(Long deletedReason) {
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

    public Long getCarouselMediaCount() {
        return carouselMediaCount;
    }

    public void setCarouselMediaCount(Long carouselMediaCount) {
        this.carouselMediaCount = carouselMediaCount;
    }

    public List<CarouselMedium> getCarouselMedia() {
        return carouselMedia;
    }

    public void setCarouselMedia(List<CarouselMedium> carouselMedia) {
        this.carouselMedia = carouselMedia;
    }

    @Override
    public String toString() {
        return "Item{" +
                "takenAt=" + takenAt +
                ", pk=" + pk +
                ", id='" + id + '\'' +
                ", deviceTimestamp=" + deviceTimestamp +
                ", mediaType=" + mediaType +
                ", code='" + code + '\'' +
                ", clientCacheKey='" + clientCacheKey + '\'' +
                ", filterType=" + filterType +
                ", isUnifiedVideo=" + isUnifiedVideo +
                ", user=" + user +
                ", canViewerReshare=" + canViewerReshare +
                ", captionIsEdited=" + captionIsEdited +
                ", likeAndViewCountsDisabled=" + likeAndViewCountsDisabled +
                ", featuredProductsCta=" + featuredProductsCta +
                ", commercialityStatus='" + commercialityStatus + '\'' +
                ", isPaidPartnership=" + isPaidPartnership +
                ", isVisualReplyCommenterNoticeEnabled=" + isVisualReplyCommenterNoticeEnabled +
                ", originalMediaHasVisualReplyMedia=" + originalMediaHasVisualReplyMedia +
                ", commentLikesEnabled=" + commentLikesEnabled +
                ", commentThreadingEnabled=" + commentThreadingEnabled +
                ", hasMoreComments=" + hasMoreComments +
                ", maxNumVisiblePreviewComments=" + maxNumVisiblePreviewComments +
                ", previewComments=" + previewComments +
                ", comments=" + comments +
                ", canViewMorePreviewComments=" + canViewMorePreviewComments +
                ", commentCount=" + commentCount +
                ", hideViewAllCommentEntrypoint=" + hideViewAllCommentEntrypoint +
                ", inlineComposerDisplayCondition='" + inlineComposerDisplayCondition + '\'' +
                ", imageVersions2=" + imageVersions2 +
                ", carouselMediaCount=" + carouselMediaCount +
                ", carouselMedia=" + carouselMedia +
                ", originalWidth=" + originalWidth +
                ", originalHeight=" + originalHeight +
                ", likeCount=" + likeCount +
                ", hasLiked=" + hasLiked +
                ", topLikers=" + topLikers +
                ", facepileTopLikers=" + facepileTopLikers +
                ", photoOfYou=" + photoOfYou +
                ", canSeeInsightsAsBrand=" + canSeeInsightsAsBrand +
                ", caption=" + caption +
                ", canViewerSave=" + canViewerSave +
                ", organicTrackingToken='" + organicTrackingToken + '\'' +
                ", sharingFrictionInfo=" + sharingFrictionInfo +
                ", commentInformTreatment=" + commentInformTreatment +
                ", productType='" + productType + '\'' +
                ", isInProfileGrid=" + isInProfileGrid +
                ", profileGridControlEnabled=" + profileGridControlEnabled +
                ", deletedReason=" + deletedReason +
                ", integrityReviewDecision='" + integrityReviewDecision + '\'' +
                ", musicMetadata=" + musicMetadata +
                '}';
    }
}
