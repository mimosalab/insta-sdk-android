
package me.aravi.instapi.models.allposts;

import androidx.annotation.Keep;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

@Keep
public class EdgeMediaToCaption {

    @SerializedName("edges")
    @Expose
    private List<Edge__1> edges = null;

    public List<Edge__1> getEdges() {
        return edges;
    }

    public void setEdges(List<Edge__1> edges) {
        this.edges = edges;
    }

}
