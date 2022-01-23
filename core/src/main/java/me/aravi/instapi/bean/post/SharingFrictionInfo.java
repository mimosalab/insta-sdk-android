
package me.aravi.instapi.bean.post;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SharingFrictionInfo {

    @SerializedName("should_have_sharing_friction")
    @Expose
    private Boolean shouldHaveSharingFriction;
    @SerializedName("bloks_app_url")
    @Expose
    private Object bloksAppUrl;

    public Boolean getShouldHaveSharingFriction() {
        return shouldHaveSharingFriction;
    }

    public void setShouldHaveSharingFriction(Boolean shouldHaveSharingFriction) {
        this.shouldHaveSharingFriction = shouldHaveSharingFriction;
    }

    public Object getBloksAppUrl() {
        return bloksAppUrl;
    }

    public void setBloksAppUrl(Object bloksAppUrl) {
        this.bloksAppUrl = bloksAppUrl;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SharingFrictionInfo.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("shouldHaveSharingFriction");
        sb.append('=');
        sb.append(((this.shouldHaveSharingFriction == null) ? "<null>" : this.shouldHaveSharingFriction));
        sb.append(',');
        sb.append("bloksAppUrl");
        sb.append('=');
        sb.append(((this.bloksAppUrl == null) ? "<null>" : this.bloksAppUrl));
        sb.append(',');
        if (sb.charAt((sb.length() - 1)) == ',') {
            sb.setCharAt((sb.length() - 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
