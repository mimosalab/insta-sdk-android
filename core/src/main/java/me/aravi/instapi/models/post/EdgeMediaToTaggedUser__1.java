
package me.aravi.instapi.models.post;

import java.util.List;
import androidx.annotation.Keep;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Keep
public class EdgeMediaToTaggedUser__1 {

    @SerializedName("edges")
    @Expose
    private List<Object> edges = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public EdgeMediaToTaggedUser__1() {
    }

    /**
     * 
     * @param edges
     */
    public EdgeMediaToTaggedUser__1(List<Object> edges) {
        super();
        this.edges = edges;
    }

    public List<Object> getEdges() {
        return edges;
    }

    public void setEdges(List<Object> edges) {
        this.edges = edges;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EdgeMediaToTaggedUser__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
