package info.metadude.java.library.halfnarp;

import info.metadude.java.library.halfnarp.model.PostSuccessResponse;
import info.metadude.java.library.halfnarp.model.TalkIds;
import info.metadude.java.library.halfnarp.model.TalkPreferencesResponse;
import retrofit.Callback;
import retrofit.http.Body;
import retrofit.http.GET;
import retrofit.http.POST;

import java.util.List;

public interface TalkPreferencesService {

    @GET("/-/talkpreferences")
    public void getTalkPreferencesResponse(
            Callback<List<TalkPreferencesResponse>> talkPreferencesResponseCallback);

    // TODO: Handle post error response

    @POST("/-/talkpreferences")
    public void postTalkPreferences(
            @Body TalkIds talkIds,
            Callback<PostSuccessResponse> postResponseCallback);

    // TODO: Add PUT to update talk preferences

}
