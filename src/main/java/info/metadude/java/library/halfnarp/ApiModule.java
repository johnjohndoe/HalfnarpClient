package info.metadude.java.library.halfnarp;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

public final class ApiModule {

    public static TalkPreferencesService getTalkPreferencesService(final String baseUrl) {
        return getTalkPreferencesService(baseUrl, null);
    }

    @SuppressWarnings({"WeakerAccess", "SameParameterValue"})
    public static TalkPreferencesService getTalkPreferencesService(final String baseUrl, final OkHttpClient okHttpClient) {
        return createRetrofit(baseUrl, okHttpClient)
                .create(TalkPreferencesService.class);
    }

    private static Retrofit createRetrofit(final String baseUrl, final OkHttpClient okHttpClient) {
        OkHttpClient httpClient = okHttpClient;
        if (httpClient == null) {
            httpClient = new OkHttpClient();
        }

        return new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(JacksonConverterFactory.create(provideObjectMapper()))
                .client(httpClient)
                .build();
    }

    private static ObjectMapper provideObjectMapper() {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.setPropertyNamingStrategy(
                PropertyNamingStrategies.SNAKE_CASE);
        return objectMapper;
    }

}
