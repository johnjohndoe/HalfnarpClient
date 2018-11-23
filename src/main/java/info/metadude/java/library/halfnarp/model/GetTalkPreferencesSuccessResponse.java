package info.metadude.java.library.halfnarp.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Model for successful get talk preferences response.
 *
 * JSON example:
 *
 * {
 *     "hashed_uid": "123456abcdef",
 *     "public_url": "http://halfnarp.events.ccc.de/-/talkpreferences/public/123456abcdef",
 *     "talk_ids": [
 *         5931,
 *         5930
 *     ],
 *     "uid": "123456abcdef"
 * }
 *
 */
@SuppressWarnings("unused")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetTalkPreferencesSuccessResponse extends GetTalkPreferencesResponse {

    @JsonProperty("talk_ids")
    private List<Integer> talkIds = new ArrayList<>();
    @JsonProperty("uid")
    private String uid;
    @JsonIgnore
    private final Map<String, Object> additionalProperties = new HashMap<>();

    /**
     * @return The talkIds
     */
    @JsonProperty("talk_ids")
    public List<Integer> getTalkIds() {
        return talkIds;
    }

    /**
     * @param talkIds The talk_ids
     */
    @JsonProperty("talk_ids")
    public void setTalkIds(List<Integer> talkIds) {
        this.talkIds = talkIds;
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
        return "talk_ids = " + talkIds + ", uid = " + uid;
    }

}
