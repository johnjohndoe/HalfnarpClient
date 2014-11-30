package info.metadude.java.library.halfnarp.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
        "abstract",
        "event_id",
        "speakers",
        "title",
        "track_id",
        "track_name"
})
public class TalkPreferencesResponse {

    @JsonProperty("abstract")
    private String _abstract;

    @JsonProperty("event_id")
    private int eventId;

    @JsonProperty("speakers")
    private String speakers;

    @JsonProperty("title")
    private String title;

    @JsonProperty("track_id")
    private int trackId;

    @JsonProperty("track_name")
    private String trackName;

    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * @return The _abstract
     */
    @JsonProperty("abstract")
    public String getAbstract() {
        return _abstract;
    }

    /**
     * @param _abstract The abstract
     */
    @JsonProperty("abstract")
    public void setAbstract(String _abstract) {
        this._abstract = _abstract;
    }

    /**
     * @return The eventId
     */
    @JsonProperty("event_id")
    public int getEventId() {
        return eventId;
    }

    /**
     * @param eventId The event_id
     */
    @JsonProperty("event_id")
    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    /**
     * @return The speakers
     */
    @JsonProperty("speakers")
    public String getSpeakers() {
        return speakers;
    }

    /**
     * @param speakers The speakers
     */
    @JsonProperty("speakers")
    public void setSpeakers(String speakers) {
        this.speakers = speakers;
    }

    /**
     * @return The title
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * @param title The title
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return The trackId
     */
    @JsonProperty("track_id")
    public int getTrackId() {
        return trackId;
    }

    /**
     * @param trackId The track_id
     */
    @JsonProperty("track_id")
    public void setTrackId(int trackId) {
        this.trackId = trackId;
    }

    /**
     * @return The trackName
     */
    @JsonProperty("track_name")
    public String getTrackName() {
        return trackName;
    }

    /**
     * @param trackName The track_name
     */
    @JsonProperty("track_name")
    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
