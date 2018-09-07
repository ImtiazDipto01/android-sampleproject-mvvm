package com.example.dipto.simplemvvmproject.viewmodel;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.util.Log;

import com.example.dipto.simplemvvmproject.model.ResponseRoot;
import com.example.dipto.simplemvvmproject.retrofit.ApiClient;
import com.example.dipto.simplemvvmproject.retrofit.ApiService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginViewModel extends ViewModel{

    private ResponseRoot responseRoot = new ResponseRoot() ;
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
                responseRoot = null ;
            }
        });
        return responseRoot ;
    }

    public LiveData<ResponseRoot> getLiveUserLogInfo(String phone, String password){

        final MutableLiveData<ResponseRoot> mutableLiveData = new MutableLiveData<>() ;
        //ResponseRoot responseRoot = new ResponseRoot() ;
        ApiService apiService = ApiClient.getApiService() ;
        Call<ResponseRoot> call = apiService.getUserLoginInfo(authentication, phone, password);


        call.enqueue(new Callback<ResponseRoot>() {
            @Override
            public void onResponse(Call<ResponseRoot> call, Response<ResponseRoot> response) {
                if(response.isSuccessful()){
                    Log.d("ResponseRoot", String.valueOf(response.body()));
                    responseRoot = response.body() ;
                    mutableLiveData.setValue(responseRoot);
                }
                else{
                    Log.d("ResponseRoot", "response not sucessfull");
                    responseRoot = null ;
                    mutableLiveData.setValue(responseRoot);
                }

            }

            @Override
            public void onFailure(Call<ResponseRoot> call, Throwable t) {
                responseRoot = null ;
                mutableLiveData.setValue(responseRoot);
                Log.d("ResponseRoot", String.valueOf(t));
            }
        });

        return mutableLiveData ;
    }
}
