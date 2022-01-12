
package me.aravi.instapi.models.post;

import java.util.List;
import androidx.annotation.Keep;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Keep
public class EdgeThreadedComments {

    @SerializedName("count")
    @Expose
    private Long count;
    @SerializedName("page_info")
    @Expose
    private PageInfo__1 pageInfo;
    @SerializedName("edges")
    @Expose
    private List<Object> edges = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public EdgeThreadedComments() {
    }

    /**
     * 
     * @param count
     * @param pageInfo
     * @param edges
     */
    public EdgeThreadedComments(Long count, PageInfo__1 pageInfo, List<Object> edges) {
        super();
        this.count = count;
        this.pageInfo = pageInfo;
        this.edges = edges;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public PageInfo__1 getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfo__1 pageInfo) {
        this.pageInfo = pageInfo;
    }

    public List<Object> getEdges() {
        return edges;
    }

    public void setEdges(List<Object> edges) {
        this.edges = edges;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EdgeThreadedComments.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("count");
        sb.append('=');
        sb.append(((this.count == null)?"<null>":this.count));
        sb.append(',');
        sb.append("pageInfo");
        sb.append('=');
        sb.append(((this.pageInfo == null)?"<null>":this.pageInfo));
        sb.append(',');
        sb.append("edges");
        sb.append('=');
        sb.append(((this.edges == null)?"<null>":this.edges));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
