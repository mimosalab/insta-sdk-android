
package me.aravi.instapi.models.post;

import java.util.List;
import androidx.annotation.Keep;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Keep
public class EdgeSidecarToChildren {

    @SerializedName("edges")
    @Expose
    private List<Edge__3> edges = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public EdgeSidecarToChildren() {
    }

    /**
     * 
     * @param edges
     */
    public EdgeSidecarToChildren(List<Edge__3> edges) {
        super();
        this.edges = edges;
    }

    public List<Edge__3> getEdges() {
        return edges;
    }

    public void setEdges(List<Edge__3> edges) {
        this.edges = edges;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EdgeSidecarToChildren.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("edges");
        sb.append('=');
        sb.append(((this.edges == null)?"<null>":this.edges));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
