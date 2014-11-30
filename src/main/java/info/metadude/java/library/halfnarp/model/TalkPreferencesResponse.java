package info.metadude.java.library.halfnarp.model;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TalkPreferencesResponse {

    @JsonProperty("event_id")
    private int eventId;
    @JsonProperty("track_id")
    private int trackId;
    @JsonProperty("track_name")
    private String trackName;
    @JsonProperty("room_id")
    private int roomId;
    @JsonProperty("room_name")
    private String roomName;
    @JsonProperty("start_time")
    private String startTime;
    @JsonProperty("duration")
    private int duration;
    @JsonProperty("title")
    private String title;
    @JsonProperty("abstract")
    private String _abstract;
    @JsonProperty("speakers")
    private String speakers;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    /**
     * @return The roomId
     */
    @JsonProperty("room_id")
    public int getRoomId() {
        return roomId;
    }

    /**
     * @param roomId The room_id
     */
    @JsonProperty("room_id")
    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    /**
     * @return The roomName
     */
    @JsonProperty("room_name")
    public String getRoomName() {
        return roomName;
    }

    /**
     * @param roomName The room_name
     */
    @JsonProperty("room_name")
    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    /**
     * @return The startTime
     */
    @JsonProperty("start_time")
    public String getStartTime() {
        return startTime;
    }

    /**
     * @param startTime The start_time
     */
    @JsonProperty("start_time")
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * @return The duration
     */
    @JsonProperty("duration")
    public int getDuration() {
        return duration;
    }

    /**
     * @param duration The duration
     */
    @JsonProperty("duration")
    public void setDuration(int duration) {
        this.duration = duration;
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
        return "eventId = " + eventId + ", " +
                "trackId = " + trackId + ", " +
                "trackName = " + trackName + ", " +
                "roomId = " + roomId + ", " +
                "roomName = " + roomName + ", " +
                "startTime = " + startTime + ", " +
                "duration = " + duration + ", " +
                "title = " + title + ", " +
                "_abstract = " + _abstract + ", " +
                "speakers = " + speakers;
    }
}
