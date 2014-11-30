package info.metadude.java.library.halfnarp;

import info.metadude.java.library.halfnarp.model.TalkPreferencesResponse;
import retrofit.Callback;
import retrofit.http.GET;

import java.util.List;

public interface TalkPreferencesService {

    @GET("/-/talkpreferences")
    public void getTalkPreferencesResponse(
            Callback<List<TalkPreferencesResponse>> sessionsResponseCallback);

}
