
package me.aravi.instapi.bean.post;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Caption {

    @SerializedName("pk")
    @Expose
    private Long pk;
    @SerializedName("user_id")
    @Expose
    private Long userId;
    @SerializedName("text")
    @Expose
    private String text;
    @SerializedName("type")
    @Expose
    private Long type;
    @SerializedName("created_at")
    @Expose
    private Long createdAt;
    @SerializedName("created_at_utc")
    @Expose
    private Long createdAtUtc;
    @SerializedName("content_type")
    @Expose
    private String contentType;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("bit_flags")
    @Expose
    private Long bitFlags;
    @SerializedName("did_report_as_spam")
    @Expose
    private Boolean didReportAsSpam;
    @SerializedName("share_enabled")
    @Expose
    private Boolean shareEnabled;
    @SerializedName("user")
    @Expose
    private User__1 user;
    @SerializedName("is_covered")
    @Expose
    private Boolean isCovered;
    @SerializedName("media_id")
    @Expose
    private Long mediaId;
    @SerializedName("private_reply_status")
    @Expose
    private Long privateReplyStatus;

    public Long getPk() {
        return pk;
    }

    public void setPk(Long pk) {
        this.pk = pk;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Long getType() {
        return type;
    }

    public void setType(Long type) {
        this.type = type;
    }

    public Long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }

    public Long getCreatedAtUtc() {
        return createdAtUtc;
    }

    public void setCreatedAtUtc(Long createdAtUtc) {
        this.createdAtUtc = createdAtUtc;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getBitFlags() {
        return bitFlags;
    }

    public void setBitFlags(Long bitFlags) {
        this.bitFlags = bitFlags;
    }

    public Boolean getDidReportAsSpam() {
        return didReportAsSpam;
    }

    public void setDidReportAsSpam(Boolean didReportAsSpam) {
        this.didReportAsSpam = didReportAsSpam;
    }

    public Boolean getShareEnabled() {
        return shareEnabled;
    }

    public void setShareEnabled(Boolean shareEnabled) {
        this.shareEnabled = shareEnabled;
    }

    public User__1 getUser() {
        return user;
    }

    public void setUser(User__1 user) {
        this.user = user;
    }

    public Boolean getIsCovered() {
        return isCovered;
    }

    public void setIsCovered(Boolean isCovered) {
        this.isCovered = isCovered;
    }

    public Long getMediaId() {
        return mediaId;
    }

    public void setMediaId(Long mediaId) {
        this.mediaId = mediaId;
    }

    public Long getPrivateReplyStatus() {
        return privateReplyStatus;
    }

    public void setPrivateReplyStatus(Long privateReplyStatus) {
        this.privateReplyStatus = privateReplyStatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Caption.class.getName()).append('@').append(Long.toHexString(System.identityHashCode(this))).append('[');
        sb.append("pk");
        sb.append('=');
        sb.append(((this.pk == null)?"<null>":this.pk));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("text");
        sb.append('=');
        sb.append(((this.text == null)?"<null>":this.text));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("createdAt");
        sb.append('=');
        sb.append(((this.createdAt == null)?"<null>":this.createdAt));
        sb.append(',');
        sb.append("createdAtUtc");
        sb.append('=');
        sb.append(((this.createdAtUtc == null)?"<null>":this.createdAtUtc));
        sb.append(',');
        sb.append("contentType");
        sb.append('=');
        sb.append(((this.contentType == null)?"<null>":this.contentType));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("bitFlags");
        sb.append('=');
        sb.append(((this.bitFlags == null)?"<null>":this.bitFlags));
        sb.append(',');
        sb.append("didReportAsSpam");
        sb.append('=');
        sb.append(((this.didReportAsSpam == null)?"<null>":this.didReportAsSpam));
        sb.append(',');
        sb.append("shareEnabled");
        sb.append('=');
        sb.append(((this.shareEnabled == null)?"<null>":this.shareEnabled));
        sb.append(',');
        sb.append("user");
        sb.append('=');
        sb.append(((this.user == null)?"<null>":this.user));
        sb.append(',');
        sb.append("isCovered");
        sb.append('=');
        sb.append(((this.isCovered == null)?"<null>":this.isCovered));
        sb.append(',');
        sb.append("mediaId");
        sb.append('=');
        sb.append(((this.mediaId == null)?"<null>":this.mediaId));
        sb.append(',');
        sb.append("privateReplyStatus");
        sb.append('=');
        sb.append(((this.privateReplyStatus == null)?"<null>":this.privateReplyStatus));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
