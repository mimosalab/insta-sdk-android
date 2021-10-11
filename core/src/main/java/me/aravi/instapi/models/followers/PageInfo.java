
package me.aravi.instapi.models.followers;

import androidx.annotation.Keep;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Keep
public class PageInfo {

    @SerializedName("has_next_page")
    @Expose
    private Boolean hasNextPage;
    @SerializedName("end_cursor")
    @Expose
    private String endCursor;

    public Boolean getHasNextPage() {
        return hasNextPage;
    }

    public void setHasNextPage(Boolean hasNextPage) {
        this.hasNextPage = hasNextPage;
    }

    public String getEndCursor() {
        return endCursor;
    }

    public void setEndCursor(String endCursor) {
        this.endCursor = endCursor;
    }

}
