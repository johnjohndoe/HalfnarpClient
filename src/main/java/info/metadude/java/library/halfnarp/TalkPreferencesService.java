package info.metadude.java.library.halfnarp;

import java.util.List;

import info.metadude.java.library.halfnarp.model.CreateTalkPreferencesSuccessResponse;
import info.metadude.java.library.halfnarp.model.GetTalkPreferencesSuccessResponse;
import info.metadude.java.library.halfnarp.model.GetTalksResponse;
import info.metadude.java.library.halfnarp.model.TalkIds;
import info.metadude.java.library.halfnarp.model.UpdateTalkPreferencesSuccessResponse;
import retrofit.Call;
import retrofit.http.Body;
import retrofit.http.GET;
import retrofit.http.POST;
import retrofit.http.PUT;
import retrofit.http.Path;

public interface TalkPreferencesService {

    String BASE_URL = "http://halfnarp.events.ccc.de";

    @GET("/-/talkpreferences")
    Call<List<GetTalksResponse>> getTalks();

    // TODO: Handle post error response

    @POST("/-/talkpreferences")
    Call<CreateTalkPreferencesSuccessResponse> createTalkPreferences(
            @Body TalkIds talkIds);

    // TODO: Handle update error response

    @PUT("/-/talkpreferences/{uniqueId}")
    Call<UpdateTalkPreferencesSuccessResponse> updateTalkPreferences(
            @Path("uniqueId") String uniqueId,
            @Body TalkIds talkIds);

    // TODO: Handle getTalkPreferences error response

    @GET("/-/talkpreferences/{uniqueId}")
    Call<GetTalkPreferencesSuccessResponse> getTalkPreferences(
            @Path("uniqueId") String uniqueId);

}
