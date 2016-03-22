package info.metadude.java.library.halfnarp;

import info.metadude.java.library.halfnarp.model.*;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

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
