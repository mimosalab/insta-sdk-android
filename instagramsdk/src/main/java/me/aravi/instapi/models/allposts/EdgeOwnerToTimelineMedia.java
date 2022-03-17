
package me.aravi.instapi.models.allposts;

import androidx.annotation.Keep;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

@Keep
public class EdgeOwnerToTimelineMedia {

    @SerializedName("count")
    @Expose
    private Integer count;
    @SerializedName("edges")
    @Expose
    private List<Edge> edges = null;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public List<Edge> getEdges() {
        return edges;
    }

    public void setEdges(List<Edge> edges) {
        this.edges = edges;
    }

}
