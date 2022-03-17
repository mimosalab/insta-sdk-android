
package me.aravi.instapi.bean.post;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MusicMetadata {

    @SerializedName("music_canonical_id")
    @Expose
    private String musicCanonicalId;
    @SerializedName("audio_type")
    @Expose
    private Object audioType;
    @SerializedName("music_info")
    @Expose
    private Object musicInfo;
    @SerializedName("original_sound_info")
    @Expose
    private Object originalSoundInfo;

    public String getMusicCanonicalId() {
        return musicCanonicalId;
    }

    public void setMusicCanonicalId(String musicCanonicalId) {
        this.musicCanonicalId = musicCanonicalId;
    }

    public Object getAudioType() {
        return audioType;
    }

    public void setAudioType(Object audioType) {
        this.audioType = audioType;
    }

    public Object getMusicInfo() {
        return musicInfo;
    }

    public void setMusicInfo(Object musicInfo) {
        this.musicInfo = musicInfo;
    }

    public Object getOriginalSoundInfo() {
        return originalSoundInfo;
    }

    public void setOriginalSoundInfo(Object originalSoundInfo) {
        this.originalSoundInfo = originalSoundInfo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(MusicMetadata.class.getName()).append('@').append(Long.toHexString(System.identityHashCode(this))).append('[');
        sb.append("musicCanonicalId");
        sb.append('=');
        sb.append(((this.musicCanonicalId == null)?"<null>":this.musicCanonicalId));
        sb.append(',');
        sb.append("audioType");
        sb.append('=');
        sb.append(((this.audioType == null)?"<null>":this.audioType));
        sb.append(',');
        sb.append("musicInfo");
        sb.append('=');
        sb.append(((this.musicInfo == null)?"<null>":this.musicInfo));
        sb.append(',');
        sb.append("originalSoundInfo");
        sb.append('=');
        sb.append(((this.originalSoundInfo == null)?"<null>":this.originalSoundInfo));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
