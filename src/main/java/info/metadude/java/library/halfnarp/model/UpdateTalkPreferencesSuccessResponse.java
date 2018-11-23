package info.metadude.java.library.halfnarp.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;

/**
 * Model for successful update talk response.
 *
 * JSON example:
 *
 * {
 *     "hashed_uid": "123456abcdef",
 *     "uid": "123456abcdef"
 * }
 *
 */
@SuppressWarnings("unused")
public class UpdateTalkPreferencesSuccessResponse extends UpdateResponse {

    @JsonProperty("uid")
    private String uid;
    @JsonIgnore
    private final Map<String, Object> additionalProperties = new HashMap<>();

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
        return "uid = " + uid;
    }

}
