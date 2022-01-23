
package me.aravi.instapi.bean.post;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PostNormalBean {

    @SerializedName("items")
    @Expose
    private List<Item> items = null;
    @SerializedName("num_results")
    @Expose
    private Integer numResults;
    @SerializedName("more_available")
    @Expose
    private Boolean moreAvailable;
    @SerializedName("auto_load_more_enabled")
    @Expose
    private Boolean autoLoadMoreEnabled;

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public Integer getNumResults() {
        return numResults;
    }

    public void setNumResults(Integer numResults) {
        this.numResults = numResults;
    }

    public Boolean getMoreAvailable() {
        return moreAvailable;
    }

    public void setMoreAvailable(Boolean moreAvailable) {
        this.moreAvailable = moreAvailable;
    }

    public Boolean getAutoLoadMoreEnabled() {
        return autoLoadMoreEnabled;
    }

    public void setAutoLoadMoreEnabled(Boolean autoLoadMoreEnabled) {
        this.autoLoadMoreEnabled = autoLoadMoreEnabled;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PostNormalBean.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("items");
        sb.append('=');
        sb.append(((this.items == null)?"<null>":this.items));
        sb.append(',');
        sb.append("numResults");
        sb.append('=');
        sb.append(((this.numResults == null)?"<null>":this.numResults));
        sb.append(',');
        sb.append("moreAvailable");
        sb.append('=');
        sb.append(((this.moreAvailable == null)?"<null>":this.moreAvailable));
        sb.append(',');
        sb.append("autoLoadMoreEnabled");
        sb.append('=');
        sb.append(((this.autoLoadMoreEnabled == null)?"<null>":this.autoLoadMoreEnabled));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
