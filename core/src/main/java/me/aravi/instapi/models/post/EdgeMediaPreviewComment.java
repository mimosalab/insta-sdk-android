
package me.aravi.instapi.models.post;

import java.util.List;
import androidx.annotation.Keep;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Keep
public class EdgeMediaPreviewComment {

    @SerializedName("count")
    @Expose
    private Long count;
    @SerializedName("edges")
    @Expose
    private List<Edge__2> edges = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public EdgeMediaPreviewComment() {
    }

    /**
     * 
     * @param count
     * @param edges
     */
    public EdgeMediaPreviewComment(Long count, List<Edge__2> edges) {
        super();
        this.count = count;
        this.edges = edges;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public List<Edge__2> getEdges() {
        return edges;
    }

    public void setEdges(List<Edge__2> edges) {
        this.edges = edges;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EdgeMediaPreviewComment.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("count");
        sb.append('=');
        sb.append(((this.count == null)?"<null>":this.count));
        sb.append(',');
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
