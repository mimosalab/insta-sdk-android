
package me.aravi.instapi.bean.post;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CommentInformTreatment {

    @SerializedName("should_have_inform_treatment")
    @Expose
    private Boolean shouldHaveInformTreatment;
    @SerializedName("text")
    @Expose
    private String text;

    public Boolean getShouldHaveInformTreatment() {
        return shouldHaveInformTreatment;
    }

    public void setShouldHaveInformTreatment(Boolean shouldHaveInformTreatment) {
        this.shouldHaveInformTreatment = shouldHaveInformTreatment;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CommentInformTreatment.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("shouldHaveInformTreatment");
        sb.append('=');
        sb.append(((this.shouldHaveInformTreatment == null)?"<null>":this.shouldHaveInformTreatment));
        sb.append(',');
        sb.append("text");
        sb.append('=');
        sb.append(((this.text == null)?"<null>":this.text));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
