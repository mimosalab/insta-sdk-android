
package me.aravi.instapi.models.allposts;

import androidx.annotation.Keep;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


@Keep
public class Edge__1 {

    @SerializedName("node")
    @Expose
    private Node__1 node;

    public Node__1 getNode() {
        return node;
    }

    public void setNode(Node__1 node) {
        this.node = node;
    }

}
