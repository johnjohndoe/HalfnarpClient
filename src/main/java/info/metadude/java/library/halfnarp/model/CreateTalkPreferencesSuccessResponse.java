package info.metadude.java.library.halfnarp.model;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("unused")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateTalkPreferencesSuccessResponse extends CreateResponse {

    @JsonProperty("hashed_uid")
    private String hashedUid;
    @JsonProperty("public_url")
    private String publicUrl;
    @JsonProperty("update_url")
    private String updateUrl;
    @JsonProperty("uid")
    private String uid;
    @JsonIgnore
    private final Map<String, Object> additionalProperties = new HashMap<>();

    /**
     * @return The hashedUid
     */
    @JsonProperty("hashed_uid")
    public String getHashedUid() {
        return hashedUid;
    }

    /**
     * @param hashedUid The hashed_uid
     */
    @JsonProperty("hashed_uid")
    public void setHashedUid(String hashedUid) {
        this.hashedUid = hashedUid;
    }

    /**
     * @return The publicUrl
     */
    @JsonProperty("public_url")
    public String getPublicUrl() {
        return publicUrl;
    }

    /**
     * @param publicUrl The public_url
     */
    @JsonProperty("public_url")
    public void setPublicUrl(String publicUrl) {
        this.publicUrl = publicUrl;
    }

    /**
     * @return The updateUrl
     */
    @JsonProperty("update_url")
    public String getUpdateUrl() {
        return updateUrl;
    }

    /**
     * @param updateUrl The update_url
     */
    @JsonProperty("update_url")
    public void setUpdateUrl(String updateUrl) {
        this.updateUrl = updateUrl;
    }

    /**
     * @return The uid
     */
    @JsonProperty("uid")
    public String getUid() {
        return uid;
    }

    /**
     * @param uid The uid
     */
    @JsonProperty("uid")
    public void setUid(String uid) {
        this.uid = uid;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return "hashedUid = " + hashedUid + ", " +
                "publicUrl = " + publicUrl + ", " +
                "updateUrl = " + updateUrl + ", " +
                "uid = " + uid;
    }

}
