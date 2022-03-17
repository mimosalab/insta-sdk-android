
package me.aravi.instapi.models.allposts;

import androidx.annotation.Keep;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

@Keep
public class EdgeMediaToSponsorUser {

    @SerializedName("edges")
    @Expose
    private List<Object> edges = null;

    public List<Object> getEdges() {
        return edges;
    }

    public void setEdges(List<Object> edges) {
        this.edges = edges;
    }

}
