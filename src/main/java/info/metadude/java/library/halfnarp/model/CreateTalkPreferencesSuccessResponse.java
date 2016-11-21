package info.metadude.java.library.halfnarp.model;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("unused")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateTalkPreferencesSuccessResponse extends CreateResponse {

    @JsonProperty("update_url")
    private String updateUrl;
    @JsonProperty("uid")
    private String uid;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<>();

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
        return "updateUrl = " + updateUrl + ", " +
                "uid = " + uid;
    }

}
