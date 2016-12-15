package com.ahmedtikiwa.bootswatch.api;

import com.ahmedtikiwa.bootswatch.App;
import com.ahmedtikiwa.bootswatch.models.BootswatchThemeListResponse;

import java.io.File;
import java.io.IOException;

import okhttp3.Cache;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

/**
 * Created by ahmed on 2016/12/15.
 */

public class BootswatchApi {

    public static final String BASE_URL = "https://bootswatch.com/api/3.json";
    private static BootswatchApiInterface mBootswatchApiInterface;

    public static BootswatchApiInterface getBootswatchApiClient() {
        if (mBootswatchApiInterface == null) {
            HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
            loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

            Interceptor interceptor = new Interceptor() {
                @Override
                public Response intercept(Chain chain) throws IOException {
                    int maxStale = 60 * 60;
                    Request request = chain.request();
                    request = request.newBuilder().header("Cache-Control", "public, max-age=" + maxStale).build();

                    return chain.proceed(request);
                }
            };

            OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
            File httpCacheDirectory = new File(App.getContext().getCacheDir(), "responses");
            httpClient.cache(new Cache(httpCacheDirectory, 10 * 1024 * 1024));

            httpClient.addInterceptor(loggingInterceptor);
            httpClient.addInterceptor(interceptor);

            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .client(httpClient.build())
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

            mBootswatchApiInterface = retrofit.create(BootswatchApiInterface.class);
        }


        return mBootswatchApiInterface;
    }

    public interface BootswatchApiInterface {
        @GET("3.json")
        Call<BootswatchThemeListResponse> getThemes();
    }
}
