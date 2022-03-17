
package me.aravi.instapi.models.post;

import java.util.List;
import androidx.annotation.Keep;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Keep
public class Node__3 {

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
    private Dimensions__1 dimensions;
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
    private SharingFrictionInfo__1 sharingFrictionInfo;
    @SerializedName("media_overlay_info")
    @Expose
    private Object mediaOverlayInfo;
    @SerializedName("media_preview")
    @Expose
    private String mediaPreview;
    @SerializedName("display_url")
    @Expose
    private String displayUrl;
    @SerializedName("display_resources")
    @Expose
    private List<DisplayResource__1> displayResources = null;
    @SerializedName("accessibility_caption")
    @Expose
    private String accessibilityCaption;
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
    private EdgeMediaToTaggedUser__1 edgeMediaToTaggedUser;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Node__3() {
    }

    /**
     * 
     * @param trackingToken
     * @param gatingInfo
     * @param edgeMediaToTaggedUser
     * @param upcomingEvent
     * @param isVideo
     * @param shortcode
     * @param displayUrl
     * @param sharingFrictionInfo
     * @param factCheckOverallRating
     * @param accessibilityCaption
     * @param mediaPreview
     * @param mediaOverlayInfo
     * @param factCheckInformation
     * @param id
     * @param sensitivityFrictionInfo
     * @param typename
     * @param dimensions
     * @param displayResources
     */
    public Node__3(String typename, String id, String shortcode, Dimensions__1 dimensions, Object gatingInfo, Object factCheckOverallRating, Object factCheckInformation, Object sensitivityFrictionInfo, SharingFrictionInfo__1 sharingFrictionInfo, Object mediaOverlayInfo, String mediaPreview, String displayUrl, List<DisplayResource__1> displayResources, String accessibilityCaption, Boolean isVideo, String trackingToken, Object upcomingEvent, EdgeMediaToTaggedUser__1 edgeMediaToTaggedUser) {
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
        this.accessibilityCaption = accessibilityCaption;
        this.isVideo = isVideo;
        this.trackingToken = trackingToken;
        this.upcomingEvent = upcomingEvent;
        this.edgeMediaToTaggedUser = edgeMediaToTaggedUser;
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

    public Dimensions__1 getDimensions() {
        return dimensions;
    }

    public void setDimensions(Dimensions__1 dimensions) {
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

    public SharingFrictionInfo__1 getSharingFrictionInfo() {
        return sharingFrictionInfo;
    }

    public void setSharingFrictionInfo(SharingFrictionInfo__1 sharingFrictionInfo) {
        this.sharingFrictionInfo = sharingFrictionInfo;
    }

    public Object getMediaOverlayInfo() {
        return mediaOverlayInfo;
    }

    public void setMediaOverlayInfo(Object mediaOverlayInfo) {
        this.mediaOverlayInfo = mediaOverlayInfo;
    }

    public String getMediaPreview() {
        return mediaPreview;
    }

    public void setMediaPreview(String mediaPreview) {
        this.mediaPreview = mediaPreview;
    }

    public String getDisplayUrl() {
        return displayUrl;
    }

    public void setDisplayUrl(String displayUrl) {
        this.displayUrl = displayUrl;
    }

    public List<DisplayResource__1> getDisplayResources() {
        return displayResources;
    }

    public void setDisplayResources(List<DisplayResource__1> displayResources) {
        this.displayResources = displayResources;
    }

    public String getAccessibilityCaption() {
        return accessibilityCaption;
    }

    public void setAccessibilityCaption(String accessibilityCaption) {
        this.accessibilityCaption = accessibilityCaption;
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

    public EdgeMediaToTaggedUser__1 getEdgeMediaToTaggedUser() {
        return edgeMediaToTaggedUser;
    }

    public void setEdgeMediaToTaggedUser(EdgeMediaToTaggedUser__1 edgeMediaToTaggedUser) {
        this.edgeMediaToTaggedUser = edgeMediaToTaggedUser;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Node__3 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("accessibilityCaption");
        sb.append('=');
        sb.append(((this.accessibilityCaption == null)?"<null>":this.accessibilityCaption));
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
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
