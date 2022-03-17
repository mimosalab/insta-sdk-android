
package me.aravi.instapi.models.post;

import androidx.annotation.Keep;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Keep
public class Edge__1 {

    @SerializedName("node")
    @Expose
    private Node__1 node;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Edge__1() {
    }

    /**
     * 
     * @param node
     */
    public Edge__1(Node__1 node) {
        super();
        this.node = node;
    }

    public Node__1 getNode() {
        return node;
    }

    public void setNode(Node__1 node) {
        this.node = node;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Edge__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
