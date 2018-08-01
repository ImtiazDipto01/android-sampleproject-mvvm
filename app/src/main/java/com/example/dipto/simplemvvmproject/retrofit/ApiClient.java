package com.example.dipto.simplemvvmproject.retrofit;

import com.example.dipto.simplemvvmproject.model.ResponseRoot;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {

    public static final String BASE_URL = "http://13.229.26.199/StoreMate_Dev/public/api/v1/" ;

    public static Retrofit retrofit = null ;
    ResponseRoot responseRoot ;

    public static Retrofit getApiClient(){

        if(retrofit == null){

            Gson gson = new GsonBuilder()
                    .setLenient()
                    .create();
            OkHttpClient client = new OkHttpClient();

            retrofit = new Retrofit.Builder().baseUrl(BASE_URL).client(client).
                    addConverterFactory(GsonConverterFactory.create(gson)).build() ;
        }
        return retrofit ;
    }

    public static ApiService getApiService(){
        return getApiClient().create(ApiService.class);
    }

}
