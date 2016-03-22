package info.metadude.java.library.halfnarp;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.squareup.okhttp.Interceptor;
import com.squareup.okhttp.OkHttpClient;
import retrofit.JacksonConverterFactory;
import retrofit.Retrofit;

import java.util.List;

public final class ApiModule {

    public static TalkPreferencesService getTalkPreferencesService() {
        return getTalkPreferencesService(null);
    }

    public static TalkPreferencesService getTalkPreferencesService(final List<Interceptor> httpClientInterceptors) {
        return createRetrofit(TalkPreferencesService.BASE_URL, httpClientInterceptors)
                .create(TalkPreferencesService.class);
    }

    private static Retrofit createRetrofit(final String baseUrl, final List<Interceptor> httpClientInterceptors) {
        OkHttpClient httpClient = new OkHttpClient();
        if (httpClientInterceptors != null) {
            httpClient.interceptors().addAll(httpClientInterceptors);
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
                PropertyNamingStrategy.SNAKE_CASE);
        return objectMapper;
    }

}
