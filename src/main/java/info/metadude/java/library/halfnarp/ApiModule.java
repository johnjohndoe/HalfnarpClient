package info.metadude.java.library.halfnarp;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import retrofit.RestAdapter;
import retrofit.converter.JacksonConverter;

public final class ApiModule {

    private static ObjectMapper provideObjectMapper() {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.setPropertyNamingStrategy(
                PropertyNamingStrategy.CAMEL_CASE_TO_LOWER_CASE_WITH_UNDERSCORES);
        return objectMapper;
    }

    public static TalkPreferencesService getTalkPreferencesService() {
        RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint(TalkPreferencesService.SERVICE_END_POINT)
                .setConverter(new JacksonConverter(provideObjectMapper()))
                .setLogLevel(RestAdapter.LogLevel.HEADERS)
                .build();
        return restAdapter.create(TalkPreferencesService.class);
    }

}
