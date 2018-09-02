package com.example.dipto.simplemvvmproject.viewmodel;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import com.example.dipto.simplemvvmproject.model.ResponseRoot;
import com.example.dipto.simplemvvmproject.retrofit.ApiClient;
import com.example.dipto.simplemvvmproject.retrofit.ApiService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginViewModel extends ViewModel{

    private ResponseRoot responseRoot = null ;
    private String authentication = "SM.online.app.dev" ;

    public ResponseRoot getUserLoginInfo(String phone, String password){

        ApiService apiService = ApiClient.getApiService() ;
        Call<ResponseRoot> call = apiService.getUserLoginInfo(authentication, phone, password) ;

        call.enqueue(new Callback<ResponseRoot>() {
            @Override
            public void onResponse(Call<ResponseRoot> call, Response<ResponseRoot> response) {
                if(response.isSuccessful()){
                    responseRoot = response.body() ;
                }
            }

            @Override
            public void onFailure(Call<ResponseRoot> call, Throwable t) {

            }
        });
        return responseRoot ;
    }

    public LiveData<ResponseRoot> getLiveUserLogInfo(String phone, String password){

        final MutableLiveData<ResponseRoot> mutableLiveData = new MutableLiveData<>() ;
        ApiService apiService = ApiClient.getApiService() ;
        Call<ResponseRoot> call = apiService.getUserLoginInfo(authentication, phone, password);

        call.enqueue(new Callback<ResponseRoot>() {
            @Override
            public void onResponse(Call<ResponseRoot> call, Response<ResponseRoot> response) {
                ResponseRoot responseRoot = response.body() ;
                mutableLiveData.setValue(responseRoot);
            }

            @Override
            public void onFailure(Call<ResponseRoot> call, Throwable t) {

            }
        });

        return mutableLiveData ;
    }
}
