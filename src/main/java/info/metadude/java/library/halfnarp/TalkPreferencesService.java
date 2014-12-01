package info.metadude.java.library.halfnarp;

import java.util.List;

import info.metadude.java.library.halfnarp.model.CreateTalkPreferencesSuccessResponse;
import info.metadude.java.library.halfnarp.model.GetTalkPreferencesSuccessResponse;
import info.metadude.java.library.halfnarp.model.GetTalksResponse;
import info.metadude.java.library.halfnarp.model.TalkIds;
import info.metadude.java.library.halfnarp.model.UpdateTalkPreferencesSuccessResponse;
import retrofit.Callback;
import retrofit.http.Body;
import retrofit.http.GET;
import retrofit.http.POST;
import retrofit.http.PUT;
import retrofit.http.Path;

public interface TalkPreferencesService {

    @GET("/-/talkpreferences")
    public void getTalks(
            Callback<List<GetTalksResponse>> getTalksResponseCallback);

    // TODO: Handle post error response

    @POST("/-/talkpreferences")
    public void createTalkPreferences(
            @Body TalkIds talkIds,
            Callback<CreateTalkPreferencesSuccessResponse> createTalkPreferencesResponseCallback);

    // TODO: Handle update error response

    @PUT("/-/talkpreferences/{uniqueId}")
    public void updateTalkPreferences(
            @Path("uniqueId") String uniqueId,
            @Body TalkIds talkIds,
            Callback<UpdateTalkPreferencesSuccessResponse> updateTalkPreferencesResponseCallback);

    // TODO: Handle getTalkPreferences error response

    @GET("/-/talkpreferences/{uniqueId}")
    public void getTalkPreferences(
            @Path("uniqueId") String uniqueId,
            Callback<GetTalkPreferencesSuccessResponse> getTalkPreferencesResponseCallback);

}
