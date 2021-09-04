
package me.aravi.instapi.models.profile;

import androidx.annotation.Keep;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Keep
public class ProfileDetails {

    @SerializedName("logging_page_id")
    @Expose
    private String loggingPageId;
    @SerializedName("graphql")
    @Expose
    private Graphql graphql;

    public String getLoggingPageId() {
        return loggingPageId;
    }

    public void setLoggingPageId(String loggingPageId) {
        this.loggingPageId = loggingPageId;
    }

    public Graphql getGraphql() {
        return graphql;
    }

    public void setGraphql(Graphql graphql) {
        this.graphql = graphql;
    }

}
