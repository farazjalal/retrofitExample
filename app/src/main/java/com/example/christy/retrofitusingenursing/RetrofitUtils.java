package com.example.christy.retrofitusingenursing;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by admin on 7/12/2018.
 */

public class RetrofitUtils{


    public static Retrofit getRetrofitAdapter()
    {
        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        httpClient.addInterceptor(loggingInterceptor);

        Retrofit restAdapter = new Retrofit.Builder().baseUrl(WebService.baseUrl).client(httpClient.build())
                .addConverterFactory(GsonConverterFactory.create()).build();

        return restAdapter;
    }
//    public static Retrofit getRetrofitAdapter1()
//    {
//        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
//        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
//        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
//        httpClient.addInterceptor(loggingInterceptor);
//
//        Retrofit restAdapter1 = new Retrofit.Builder().baseUrl(WebService.baseUrl).client(httpClient.build())
//                .addConverterFactory(GsonConverterFactory.create()).build();
//
//        return restAdapter1;
//    }


    //Aqdar 3 Retrofit Adapter

  /*  public static Retrofit getRetrofitAdapterNew()
    {
        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        httpClient.addInterceptor(loggingInterceptor);

        Retrofit restAdapter = new Retrofit.Builder().baseUrl(WebService.newBaseUrl).client(httpClient.build())
                .addConverterFactory(GsonConverterFactory.create()).build();

        return restAdapter;
    }



    public static Retrofit getRetrofitAdapterNewLocalHost()
    {
        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        httpClient.addInterceptor(loggingInterceptor);

        Retrofit restAdapter = new Retrofit.Builder().baseUrl(WebService.localhost).client(httpClient.build())
                .addConverterFactory(GsonConverterFactory.create()).build();

        return restAdapter;
    }

    //Aqdar 3 Retrofit Adapter with Header Data without logging intercepter

    /*public static Retrofit getRetrofitAdapterNew(Context context)
    {
        LoginSessionManager sm=new LoginSessionManager(context);
        final String auth_token=sm.getPrefAuthenticationToken();
        Log.d("AuthenticationToken","Retrofit Util"+auth_token);

        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        httpClient.addInterceptor(new Interceptor() {
            @Override
            public Response intercept(Chain chain) throws IOException
            {
                Request newRequest  = chain.request().newBuilder()
                        .addHeader("Authorization", "Bearer " +auth_token)
                        .build();

                return chain.proceed(newRequest);
            }
        });

        OkHttpClient client = httpClient.build();

        Retrofit restAdapter = new Retrofit.Builder().baseUrl(WebService.newBaseUrl).client(client)
                .addConverterFactory(GsonConverterFactory.create()).build();

        return restAdapter;
    }*/




//Aqdar 3 Retrofit Adapter with Header Data with logging interceptor

 /*   public static Retrofit getRetrofitAdapterNew(Context context)
    {
        LoginSessionManager sm=new LoginSessionManager(context);
        final String auth_token=sm.getPrefAuthenticationToken();
        Log.d("AuthenticationToken","Retrofit Util"+auth_token);

        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        httpClient.addInterceptor(new Interceptor() {
            @Override
            public Response intercept(Chain chain) throws IOException
            {
                Request newRequest  = chain.request().newBuilder()
                        .addHeader("Authorization", "Bearer " +auth_token)
                        .build();

                return chain.proceed(newRequest);
            }
        }).addNetworkInterceptor(loggingInterceptor);

        OkHttpClient client = httpClient.build();

        Retrofit restAdapter = new Retrofit.Builder().baseUrl(WebService.newBaseUrl).client(client)
                .addConverterFactory(GsonConverterFactory.create()).build();

        return restAdapter;
    }


*/

    //Cache Web Response

    /*public static Retrofit getRetrofitAdapter(Context context)
    {

        int cacheSize = 10 * 1024 * 1024;
        Cache cache = new Cache(new File(context.getCacheDir(),"http-cache"), cacheSize);
        //Cache cache=new Cache(context.getCacheDir(),cacheSize);

        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient httpClient = new OkHttpClient.Builder().addNetworkInterceptor(provideCacheInterceptor()).cache(cache).build();
        //OkHttpClient httpClient = new OkHttpClient.Builder().cache(cache).build();

        Retrofit restAdapter = new Retrofit.Builder().baseUrl(WebService.baseurl).client(httpClient)
                .addConverterFactory(GsonConverterFactory.create()).build();

        return restAdapter;
    }*/


    /*public static Interceptor provideCacheInterceptor ()
    {
        return new Interceptor() {
            @Override
            public Response intercept (Chain chain) throws IOException
            {
                Response response = chain.proceed( chain.request() );
                CacheControl cacheControl = new CacheControl.Builder()
                        .maxAge(30, TimeUnit.DAYS )
                        .build();

                return response.newBuilder().removeHeader("Pragma")
                        .header("Cache-Control", cacheControl.toString() )
                        .build();
            }
        };
    }*/



}
