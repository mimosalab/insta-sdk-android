
package me.aravi.instapi.models.post;

import androidx.annotation.Keep;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Keep
public class Graphql {

    @SerializedName("shortcode_media")
    @Expose
    private ShortcodeMedia shortcodeMedia;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Graphql() {
    }

    /**
     * 
     * @param shortcodeMedia
     */
    public Graphql(ShortcodeMedia shortcodeMedia) {
        super();
        this.shortcodeMedia = shortcodeMedia;
    }

    public ShortcodeMedia getShortcodeMedia() {
        return shortcodeMedia;
    }

    public void setShortcodeMedia(ShortcodeMedia shortcodeMedia) {
        this.shortcodeMedia = shortcodeMedia;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Graphql.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("shortcodeMedia");
        sb.append('=');
        sb.append(((this.shortcodeMedia == null)?"<null>":this.shortcodeMedia));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
