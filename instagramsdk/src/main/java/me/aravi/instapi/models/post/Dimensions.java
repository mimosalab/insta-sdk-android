
package me.aravi.instapi.models.post;

import androidx.annotation.Keep;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Keep
public class Dimensions {

    @SerializedName("height")
    @Expose
    private Long height;
    @SerializedName("width")
    @Expose
    private Long width;

    /**
     * No args constructor for use in serialization
     */
    public Dimensions() {
    }

    /**
     * @param width
     * @param height
     */
    public Dimensions(Long height, Long width) {
        super();
        this.height = height;
        this.width = width;
    }

    public Long getHeight() {
        return height;
    }

    public void setHeight(Long height) {
        this.height = height;
    }

    public Long getWidth() {
        return width;
    }

    public void setWidth(Long width) {
        this.width = width;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Dimensions.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("height");
        sb.append('=');
        sb.append(((this.height == null) ? "<null>" : this.height));
        sb.append(',');
        sb.append("width");
        sb.append('=');
        sb.append(((this.width == null) ? "<null>" : this.width));
        sb.append(',');
        if (sb.charAt((sb.length() - 1)) == ',') {
            sb.setCharAt((sb.length() - 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
