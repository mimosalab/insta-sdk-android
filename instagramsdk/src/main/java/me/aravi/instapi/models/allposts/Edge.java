
package me.aravi.instapi.models.allposts;

import androidx.annotation.Keep;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


@Keep
public class Edge {

    @SerializedName("node")
    @Expose
    private Node node;

    public Node getNode() {
        return node;
    }

    public void setNode(Node node) {
        this.node = node;
    }

}
