
package me.aravi.instapi.models.post;

import androidx.annotation.Keep;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Keep
public class Edge__3 {

    @SerializedName("node")
    @Expose
    private Node__3 node;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Edge__3() {
    }

    /**
     * 
     * @param node
     */
    public Edge__3(Node__3 node) {
        super();
        this.node = node;
    }

    public Node__3 getNode() {
        return node;
    }

    public void setNode(Node__3 node) {
        this.node = node;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Edge__3 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("node");
        sb.append('=');
        sb.append(((this.node == null)?"<null>":this.node));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
