package info.metadude.java.library.halfnarp;

import retrofit.RestAdapter;

public class ApiModule {

    public static TalkPreferencesService getTalkPreferencesService() {
        RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint("http://halfnarp.events.ccc.de")
                .setLogLevel(RestAdapter.LogLevel.HEADERS)
                .build();
        return restAdapter.create(TalkPreferencesService.class);
    }

}
