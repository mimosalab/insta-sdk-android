
package me.aravi.instapi.bean.post;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CarouselMedium {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("media_type")
    @Expose
    private Long mediaType;
    @SerializedName("image_versions2")
    @Expose
    private ImageVersions2 imageVersions2;
    @SerializedName("original_width")
    @Expose
    private Long originalWidth;
    @SerializedName("original_height")
    @Expose
    private Long originalHeight;
    @SerializedName("pk")
    @Expose
    private Long pk;
    @SerializedName("carousel_parent_id")
    @Expose
    private String carouselParentId;
    @SerializedName("can_see_insights_as_brand")
    @Expose
    private Boolean canSeeInsightsAsBrand;
    @SerializedName("commerciality_status")
    @Expose
    private String commercialityStatus;
    @SerializedName("sharing_friction_info")
    @Expose
    private SharingFrictionInfo sharingFrictionInfo;
    @SerializedName("comment_inform_treatment")
    @Expose
    private CommentInformTreatment commentInformTreatment;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getMediaType() {
        return mediaType;
    }

    public void setMediaType(Long mediaType) {
        this.mediaType = mediaType;
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

    public Long getPk() {
        return pk;
    }

    public void setPk(Long pk) {
        this.pk = pk;
    }

    public String getCarouselParentId() {
        return carouselParentId;
    }

    public void setCarouselParentId(String carouselParentId) {
        this.carouselParentId = carouselParentId;
    }

    public Boolean getCanSeeInsightsAsBrand() {
        return canSeeInsightsAsBrand;
    }

    public void setCanSeeInsightsAsBrand(Boolean canSeeInsightsAsBrand) {
        this.canSeeInsightsAsBrand = canSeeInsightsAsBrand;
    }

    public String getCommercialityStatus() {
        return commercialityStatus;
    }

    public void setCommercialityStatus(String commercialityStatus) {
        this.commercialityStatus = commercialityStatus;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CarouselMedium.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("mediaType");
        sb.append('=');
        sb.append(((this.mediaType == null)?"<null>":this.mediaType));
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
        sb.append("pk");
        sb.append('=');
        sb.append(((this.pk == null)?"<null>":this.pk));
        sb.append(',');
        sb.append("carouselParentId");
        sb.append('=');
        sb.append(((this.carouselParentId == null)?"<null>":this.carouselParentId));
        sb.append(',');
        sb.append("canSeeInsightsAsBrand");
        sb.append('=');
        sb.append(((this.canSeeInsightsAsBrand == null)?"<null>":this.canSeeInsightsAsBrand));
        sb.append(',');
        sb.append("commercialityStatus");
        sb.append('=');
        sb.append(((this.commercialityStatus == null)?"<null>":this.commercialityStatus));
        sb.append(',');
        sb.append("sharingFrictionInfo");
        sb.append('=');
        sb.append(((this.sharingFrictionInfo == null)?"<null>":this.sharingFrictionInfo));
        sb.append(',');
        sb.append("commentInformTreatment");
        sb.append('=');
        sb.append(((this.commentInformTreatment == null)?"<null>":this.commentInformTreatment));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
