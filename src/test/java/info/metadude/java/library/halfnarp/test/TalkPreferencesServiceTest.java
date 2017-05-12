package info.metadude.java.library.halfnarp.test;

import info.metadude.java.library.halfnarp.ApiModule;
import info.metadude.java.library.halfnarp.TalkPreferencesService;
import info.metadude.java.library.halfnarp.model.CreateTalkPreferencesSuccessResponse;
import info.metadude.java.library.halfnarp.model.GetTalksResponse;
import java.io.IOException;
import java.util.List;

import info.metadude.java.library.halfnarp.model.TalkIds;
import org.junit.Before;
import org.junit.Test;
import retrofit2.Call;
import retrofit2.Response;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.fail;

public class TalkPreferencesServiceTest {

    private static final String BASE_URL = "https://halfnarp.events.ccc.de";

    private TalkPreferencesService talkPreferencesService;

    @Before
    public void initTalkPreferencesService() {
        talkPreferencesService = ApiModule.getTalkPreferencesService(BASE_URL);
    }

    @Test
    public void testWeCanParseRealResponseOfGetTalks() {
        Call<List<GetTalksResponse>> getTalksCall = talkPreferencesService.getTalks();
        try {
            Response<List<GetTalksResponse>> response = getTalksCall.execute();
            if (response.isSuccessful()) {
                List<GetTalksResponse> getTalksResponses = response.body();
                // Expect at least some data
                assertThat(getTalksResponses)
                        .isNotNull()
                        .isNotEmpty();
                for (GetTalksResponse getTalksResponse : getTalksResponses) {
                    assertThat(getTalksResponse).isNotNull();
                    assertGetTalksResponse(getTalksResponse);
                }
            } else {
                fail("GetTalks response is not successful.");
            }
        } catch (IOException e) {
            fail("Should not throw " + e);
        }
    }

    @Test
    public void testWeCanParseRealResponseOfCreateTalkPreferences() {
        TalkIds talkIds = new TalkIds();
        Call<CreateTalkPreferencesSuccessResponse> call = talkPreferencesService.createTalkPreferences(talkIds);
        try {
            Response<CreateTalkPreferencesSuccessResponse> response = call.execute();
            if (response.isSuccessful()) {
                CreateTalkPreferencesSuccessResponse createResponse = response.body();
                assertThat(createResponse).isNotNull();
                assertCreateTalkPreferencesSuccessResponse(createResponse);
            }
        } catch (IOException e) {
            fail("Should not throw " + e);
        }
    }

    private void assertGetTalksResponse(GetTalksResponse getTalksResponse) {
        // Language
        assertThat(getTalksResponse.getLanguage())
                .isNotNull();
        // Event ID
        assertThat(getTalksResponse.getEventId()).isGreaterThan(0);
        // Track id
        assertThat(getTalksResponse.getTrackId())
                .isNotNull();
        // Speaker Names
        assertThat(getTalksResponse.getSpeakers())
                .isNotNull()
                .isNotEmpty();
        // Title
        assertThat(getTalksResponse.getTitle())
                .isNotNull()
                .isNotEmpty();
        // Abstract
        assertThat(getTalksResponse.getAbstract())
                .isNotNull();
    }

    private void assertCreateTalkPreferencesSuccessResponse(CreateTalkPreferencesSuccessResponse response) {
        assertThat(response.getPublicUrl()).isNotNull()
                .isNotEmpty();
        assertThat(response.getHashedUid()).isNotNull()
                .isNotEmpty();
        assertThat(response.getUpdateUrl()).isNotNull()
                .isNotEmpty();
        assertThat(response.getUid()).isNotNull()
                .isNotEmpty();
    }

}
