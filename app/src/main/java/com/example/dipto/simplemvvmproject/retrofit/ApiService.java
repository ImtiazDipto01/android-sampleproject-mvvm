package com.example.dipto.simplemvvmproject.retrofit;

import com.example.dipto.simplemvvmproject.model.ResponseRoot;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.POST;

public interface ApiService {

    @POST("login")
    Call<ResponseRoot> getUserLoginInfo(@Field("authentication") String authentication,
                                        @Field("phone") String phone,
                                        @Field("password") String password);
}
