
package me.aravi.instapi.models.post;

import androidx.annotation.Keep;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Keep
public class Edge__2 {

    @SerializedName("node")
    @Expose
    private Node__2 node;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Edge__2() {
    }

    /**
     * 
     * @param node
     */
    public Edge__2(Node__2 node) {
        super();
        this.node = node;
    }

    public Node__2 getNode() {
        return node;
    }

    public void setNode(Node__2 node) {
        this.node = node;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Edge__2 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
