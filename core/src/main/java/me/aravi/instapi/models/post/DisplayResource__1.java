
package me.aravi.instapi.models.post;

import androidx.annotation.Keep;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Keep
public class DisplayResource__1 {

    @SerializedName("src")
    @Expose
    private String src;
    @SerializedName("config_width")
    @Expose
    private Long configWidth;
    @SerializedName("config_height")
    @Expose
    private Long configHeight;

    /**
     * No args constructor for use in serialization
     * 
     */
    public DisplayResource__1() {
    }

    /**
     * 
     * @param configWidth
     * @param configHeight
     * @param src
     */
    public DisplayResource__1(String src, Long configWidth, Long configHeight) {
        super();
        this.src = src;
        this.configWidth = configWidth;
        this.configHeight = configHeight;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public Long getConfigWidth() {
        return configWidth;
    }

    public void setConfigWidth(Long configWidth) {
        this.configWidth = configWidth;
    }

    public Long getConfigHeight() {
        return configHeight;
    }

    public void setConfigHeight(Long configHeight) {
        this.configHeight = configHeight;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DisplayResource__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("src");
        sb.append('=');
        sb.append(((this.src == null)?"<null>":this.src));
        sb.append(',');
        sb.append("configWidth");
        sb.append('=');
        sb.append(((this.configWidth == null)?"<null>":this.configWidth));
        sb.append(',');
        sb.append("configHeight");
        sb.append('=');
        sb.append(((this.configHeight == null)?"<null>":this.configHeight));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
