package info.metadude.java.library.halfnarp;

import java.util.List;

import info.metadude.java.library.halfnarp.model.TalkPreferencesResponse;
import retrofit.Callback;
import retrofit.http.GET;

public interface TalkPreferencesService {

    @GET("/-/talkpreferences")
    public void getTalkPreferencesResponse(
            Callback<List<TalkPreferencesResponse>> sessionsResponseCallback);

}
