
package me.aravi.instapi.models.post;

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

    /**
     * No args constructor for use in serialization
     * 
     */
    public PageInfo() {
    }

    /**
     * 
     * @param hasNextPage
     * @param endCursor
     */
    public PageInfo(Boolean hasNextPage, String endCursor) {
        super();
        this.hasNextPage = hasNextPage;
        this.endCursor = endCursor;
    }

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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PageInfo.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("hasNextPage");
        sb.append('=');
        sb.append(((this.hasNextPage == null)?"<null>":this.hasNextPage));
        sb.append(',');
        sb.append("endCursor");
        sb.append('=');
        sb.append(((this.endCursor == null)?"<null>":this.endCursor));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
