
package me.aravi.instapi.models.post;

import androidx.annotation.Keep;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Keep
public class Node__1 {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("text")
    @Expose
    private String text;
    @SerializedName("created_at")
    @Expose
    private Long createdAt;
    @SerializedName("did_report_as_spam")
    @Expose
    private Boolean didReportAsSpam;
    @SerializedName("owner")
    @Expose
    private Owner owner;
    @SerializedName("viewer_has_liked")
    @Expose
    private Boolean viewerHasLiked;
    @SerializedName("edge_liked_by")
    @Expose
    private EdgeLikedBy edgeLikedBy;
    @SerializedName("is_restricted_pending")
    @Expose
    private Boolean isRestrictedPending;
    @SerializedName("edge_threaded_comments")
    @Expose
    private EdgeThreadedComments edgeThreadedComments;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Node__1() {
    }

    /**
     * 
     * @param owner
     * @param createdAt
     * @param didReportAsSpam
     * @param edgeLikedBy
     * @param viewerHasLiked
     * @param edgeThreadedComments
     * @param id
     * @param text
     * @param isRestrictedPending
     */
    public Node__1(String id, String text, Long createdAt, Boolean didReportAsSpam, Owner owner, Boolean viewerHasLiked, EdgeLikedBy edgeLikedBy, Boolean isRestrictedPending, EdgeThreadedComments edgeThreadedComments) {
        super();
        this.id = id;
        this.text = text;
        this.createdAt = createdAt;
        this.didReportAsSpam = didReportAsSpam;
        this.owner = owner;
        this.viewerHasLiked = viewerHasLiked;
        this.edgeLikedBy = edgeLikedBy;
        this.isRestrictedPending = isRestrictedPending;
        this.edgeThreadedComments = edgeThreadedComments;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }

    public Boolean getDidReportAsSpam() {
        return didReportAsSpam;
    }

    public void setDidReportAsSpam(Boolean didReportAsSpam) {
        this.didReportAsSpam = didReportAsSpam;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Boolean getViewerHasLiked() {
        return viewerHasLiked;
    }

    public void setViewerHasLiked(Boolean viewerHasLiked) {
        this.viewerHasLiked = viewerHasLiked;
    }

    public EdgeLikedBy getEdgeLikedBy() {
        return edgeLikedBy;
    }

    public void setEdgeLikedBy(EdgeLikedBy edgeLikedBy) {
        this.edgeLikedBy = edgeLikedBy;
    }

    public Boolean getIsRestrictedPending() {
        return isRestrictedPending;
    }

    public void setIsRestrictedPending(Boolean isRestrictedPending) {
        this.isRestrictedPending = isRestrictedPending;
    }

    public EdgeThreadedComments getEdgeThreadedComments() {
        return edgeThreadedComments;
    }

    public void setEdgeThreadedComments(EdgeThreadedComments edgeThreadedComments) {
        this.edgeThreadedComments = edgeThreadedComments;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Node__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("text");
        sb.append('=');
        sb.append(((this.text == null)?"<null>":this.text));
        sb.append(',');
        sb.append("createdAt");
        sb.append('=');
        sb.append(((this.createdAt == null)?"<null>":this.createdAt));
        sb.append(',');
        sb.append("didReportAsSpam");
        sb.append('=');
        sb.append(((this.didReportAsSpam == null)?"<null>":this.didReportAsSpam));
        sb.append(',');
        sb.append("owner");
        sb.append('=');
        sb.append(((this.owner == null)?"<null>":this.owner));
        sb.append(',');
        sb.append("viewerHasLiked");
        sb.append('=');
        sb.append(((this.viewerHasLiked == null)?"<null>":this.viewerHasLiked));
        sb.append(',');
        sb.append("edgeLikedBy");
        sb.append('=');
        sb.append(((this.edgeLikedBy == null)?"<null>":this.edgeLikedBy));
        sb.append(',');
        sb.append("isRestrictedPending");
        sb.append('=');
        sb.append(((this.isRestrictedPending == null)?"<null>":this.isRestrictedPending));
        sb.append(',');
        sb.append("edgeThreadedComments");
        sb.append('=');
        sb.append(((this.edgeThreadedComments == null)?"<null>":this.edgeThreadedComments));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
