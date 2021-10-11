
package me.aravi.instapi.models.followers;

import androidx.annotation.Keep;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Keep
public class User {

    @SerializedName("edge_follow")
    @Expose
    private EdgeFollow edgeFollow;

    public EdgeFollow getEdgeFollow() {
        return edgeFollow;
    }

    public void setEdgeFollow(EdgeFollow edgeFollow) {
        this.edgeFollow = edgeFollow;
    }

}
