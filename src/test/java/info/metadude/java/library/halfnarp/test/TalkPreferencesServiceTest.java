package info.metadude.java.library.halfnarp.test;

import info.metadude.java.library.halfnarp.ApiModule;
import info.metadude.java.library.halfnarp.TalkPreferencesService;
import info.metadude.java.library.halfnarp.model.GetTalksResponse;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import retrofit2.Call;
import retrofit2.Response;

import java.io.IOException;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.fail;

public class TalkPreferencesServiceTest {

    private TalkPreferencesService talkPreferencesService;

    @Before
    public void initTalkPreferencesService() {
        talkPreferencesService = ApiModule.getTalkPreferencesService();
    }

    @Test
    public void testThatRealServerIsReachable() {
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
                    // Event ID
                    assertThat(getTalksResponse.getEventId()).isGreaterThan(0);
                    // Track name
                    assertThat(getTalksResponse.getTrackName())
                            .isNotNull()
                            .isNotEmpty();
                }
            } else {
                fail("GetTalks response is not successful.");
            }
        } catch (IOException e) {
            fail("Should not throw " + e);
        }
    }

}
