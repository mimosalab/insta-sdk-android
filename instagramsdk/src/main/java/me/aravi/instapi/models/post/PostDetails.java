
package me.aravi.instapi.models.post;

import androidx.annotation.Keep;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Keep
public class PostDetails {

    @SerializedName("graphql")
    @Expose
    private Graphql graphql;

    /**
     * No args constructor for use in serialization
     */
    public PostDetails() {
    }

    /**
     * @param graphql
     */
    public PostDetails(Graphql graphql) {
        super();
        this.graphql = graphql;
    }

    public Graphql getGraphql() {
        return graphql;
    }

    public void setGraphql(Graphql graphql) {
        this.graphql = graphql;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PostDetails.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("graphql");
        sb.append('=');
        sb.append(((this.graphql == null) ? "<null>" : this.graphql));
        sb.append(',');
        if (sb.charAt((sb.length() - 1)) == ',') {
            sb.setCharAt((sb.length() - 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
