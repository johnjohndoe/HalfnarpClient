package info.metadude.java.library.halfnarp.model;

import com.google.gson.annotations.SerializedName;

public class TalkPreferencesResponse {

    @SerializedName("abstract")
    private String _abstract;

    private int event_id;

    private String speakers;

    private String title;

    private int track_id;

    private String track_name;

    /**
     * @return The abstract
     */
    public String getAbstract() {
        return _abstract;
    }


    /**
     * @return The eventId
     */
    public int getEventId() {
        return event_id;
    }

    /**
     * @return The speakers
     */
    public String getSpeakers() {
        return speakers;
    }


    /**
     * @return The title
     */
    public String getTitle() {
        return title;
    }


    /**
     * @return The trackId
     */
    public int getTrackId() {
        return track_id;
    }


    /**
     * @return The trackName
     */
    public String getTrackName() {
        return track_name;
    }

}
