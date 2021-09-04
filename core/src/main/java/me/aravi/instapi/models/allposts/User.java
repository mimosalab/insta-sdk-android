
package me.aravi.instapi.models.allposts;

import androidx.annotation.Keep;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Keep
public class User {

    @SerializedName("edge_owner_to_timeline_media")
    @Expose
    private EdgeOwnerToTimelineMedia edgeOwnerToTimelineMedia;

    public EdgeOwnerToTimelineMedia getEdgeOwnerToTimelineMedia() {
        return edgeOwnerToTimelineMedia;
    }

    public void setEdgeOwnerToTimelineMedia(EdgeOwnerToTimelineMedia edgeOwnerToTimelineMedia) {
        this.edgeOwnerToTimelineMedia = edgeOwnerToTimelineMedia;
    }

}
