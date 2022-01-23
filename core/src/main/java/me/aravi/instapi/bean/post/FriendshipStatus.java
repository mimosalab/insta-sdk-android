
package me.aravi.instapi.bean.post;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FriendshipStatus {

    @SerializedName("following")
    @Expose
    private Boolean following;
    @SerializedName("outgoing_request")
    @Expose
    private Boolean outgoingRequest;
    @SerializedName("is_bestie")
    @Expose
    private Boolean isBestie;
    @SerializedName("is_restricted")
    @Expose
    private Boolean isRestricted;
    @SerializedName("is_feed_favorite")
    @Expose
    private Boolean isFeedFavorite;

    public Boolean getFollowing() {
        return following;
    }

    public void setFollowing(Boolean following) {
        this.following = following;
    }

    public Boolean getOutgoingRequest() {
        return outgoingRequest;
    }

    public void setOutgoingRequest(Boolean outgoingRequest) {
        this.outgoingRequest = outgoingRequest;
    }

    public Boolean getIsBestie() {
        return isBestie;
    }

    public void setIsBestie(Boolean isBestie) {
        this.isBestie = isBestie;
    }

    public Boolean getIsRestricted() {
        return isRestricted;
    }

    public void setIsRestricted(Boolean isRestricted) {
        this.isRestricted = isRestricted;
    }

    public Boolean getIsFeedFavorite() {
        return isFeedFavorite;
    }

    public void setIsFeedFavorite(Boolean isFeedFavorite) {
        this.isFeedFavorite = isFeedFavorite;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FriendshipStatus.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("following");
        sb.append('=');
        sb.append(((this.following == null)?"<null>":this.following));
        sb.append(',');
        sb.append("outgoingRequest");
        sb.append('=');
        sb.append(((this.outgoingRequest == null)?"<null>":this.outgoingRequest));
        sb.append(',');
        sb.append("isBestie");
        sb.append('=');
        sb.append(((this.isBestie == null)?"<null>":this.isBestie));
        sb.append(',');
        sb.append("isRestricted");
        sb.append('=');
        sb.append(((this.isRestricted == null)?"<null>":this.isRestricted));
        sb.append(',');
        sb.append("isFeedFavorite");
        sb.append('=');
        sb.append(((this.isFeedFavorite == null)?"<null>":this.isFeedFavorite));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
