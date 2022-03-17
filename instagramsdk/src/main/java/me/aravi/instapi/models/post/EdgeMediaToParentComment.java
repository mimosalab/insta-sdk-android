
package me.aravi.instapi.models.post;

import java.util.List;
import androidx.annotation.Keep;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Keep
public class EdgeMediaToParentComment {

    @SerializedName("count")
    @Expose
    private Long count;
    @SerializedName("page_info")
    @Expose
    private PageInfo pageInfo;
    @SerializedName("edges")
    @Expose
    private List<Edge__1> edges = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public EdgeMediaToParentComment() {
    }

    /**
     * 
     * @param count
     * @param pageInfo
     * @param edges
     */
    public EdgeMediaToParentComment(Long count, PageInfo pageInfo, List<Edge__1> edges) {
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

    public PageInfo getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    public List<Edge__1> getEdges() {
        return edges;
    }

    public void setEdges(List<Edge__1> edges) {
        this.edges = edges;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EdgeMediaToParentComment.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
