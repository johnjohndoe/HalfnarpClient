package info.metadude.java.library.halfnarp.model;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("unused")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetTalksResponse {

    @JsonProperty("language")
    private String language;
    @JsonProperty("event_id")
    private int eventId;
    @JsonProperty("track_id")
    private int trackId;
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
    @JsonProperty("speaker_names")
    private String speakers;
    @JsonProperty("event_classifiers")
    private EventClassifiers eventClassifiers;
    @JsonIgnore
    private final Map<String, Object> additionalProperties = new HashMap<>();

    /**
     * @return The language
     */
    @JsonProperty("language")
    public String getLanguage() {
        return language;
    }

    /**
     * @param language The language
     */
    @JsonProperty("language")
    public void setLanguage(String language) {
        this.language = language;
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
    @JsonProperty("speaker_names")
    public String getSpeakers() {
        return speakers;
    }

    /**
     * @param speakers The speakers
     */
    @JsonProperty("speaker_names")
    public void setSpeakers(String speakers) {
        this.speakers = speakers;
    }

    /**
     * @return The event classifiers
     */
    @JsonProperty("event_classifiers")
    public EventClassifiers getEventClassifiers() {
        return eventClassifiers;
    }

    /**
     * @param eventClassifiers The event classifiers
     */
    @JsonProperty("event_classifiers")
    public void setEventClassifiers(EventClassifiers eventClassifiers) {
        this.eventClassifiers = eventClassifiers;
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
        return "language = " + language + ", " +
                "eventId = " + eventId + ", " +
                "trackId = " + trackId + ", " +
                "roomId = " + roomId + ", " +
                "roomName = " + roomName + ", " +
                "startTime = " + startTime + ", " +
                "duration = " + duration + ", " +
                "title = " + title + ", " +
                "_abstract = " + _abstract + ", " +
                "speakers = " + speakers + ", " +
                "eventClassifiers = " + eventClassifiers;
    }
}
