package info.metadude.java.library.halfnarp.test;

import info.metadude.java.library.halfnarp.ApiModule;
import info.metadude.java.library.halfnarp.TalkPreferencesService;
import info.metadude.java.library.halfnarp.model.GetTalksResponse;
import org.junit.Before;
import org.junit.Test;
import retrofit.Call;
import retrofit.Response;

import java.io.IOException;
import java.util.List;

import static org.junit.Assert.*;

public class TalkPreferencesServiceTest {

    protected TalkPreferencesService talkPreferencesService;

    @Before
    public void initTalkPreferencesService() {
        talkPreferencesService = ApiModule.getTalkPreferencesService();
    }

    @Test
    public void testThatRealServerIsReachable() {
        Call<List<GetTalksResponse>> getTalksCall = talkPreferencesService.getTalks();
        try {
            Response<List<GetTalksResponse>> response = getTalksCall.execute();
            if (response.isSuccess()) {
                List<GetTalksResponse> getTalksResponses = response.body();
                // Expect at least some data
                assertNotNull(getTalksResponses);
                assertTrue(getTalksResponses.size() > 0);
                for (GetTalksResponse getTalksResponse : getTalksResponses) {
                    assertNotNull(getTalksResponse);
                    // Event ID
                    assertTrue(getTalksResponse.getEventId() > 0);
                    // Track name
                    assertNotNull(getTalksResponse.getTrackName());
                    assertTrue(getTalksResponse.getTrackName().length() > 0);
                }
            } else {
                fail("GetTalks response is not successful.");
            }
        } catch (IOException e) {
            fail("Should not throw " + e);
        }
    }

}
