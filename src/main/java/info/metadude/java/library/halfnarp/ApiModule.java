package info.metadude.java.library.halfnarp;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.squareup.okhttp.OkHttpClient;

import retrofit.JacksonConverterFactory;
import retrofit.Retrofit;

public final class ApiModule {

    public static TalkPreferencesService getTalkPreferencesService() {
        return createRetrofit(TalkPreferencesService.BASE_URL)
                .create(TalkPreferencesService.class);
    }

    private static Retrofit createRetrofit(final String baseUrl) {
        OkHttpClient httpClient = new OkHttpClient();

        return new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(JacksonConverterFactory.create(provideObjectMapper()))
                .client(httpClient)
                .build();
    }

    private static ObjectMapper provideObjectMapper() {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.setPropertyNamingStrategy(
                PropertyNamingStrategy.CAMEL_CASE_TO_LOWER_CASE_WITH_UNDERSCORES);
        return objectMapper;
    }

}
