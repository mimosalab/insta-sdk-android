
package me.aravi.instapi.models.post;

import androidx.annotation.Keep;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

@Keep
public class EdgeMediaPreviewLike {

    @SerializedName("count")
    @Expose
    private Integer count;
    @SerializedName("edges")
    @Expose
    private List<Object> edges = null;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public List<Object> getEdges() {
        return edges;
    }

    public void setEdges(List<Object> edges) {
        this.edges = edges;
    }

}
