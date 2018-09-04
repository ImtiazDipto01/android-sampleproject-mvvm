package com.example.dipto.simplemvvmproject;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.dipto.simplemvvmproject.model.ResponseRoot;
import com.example.dipto.simplemvvmproject.viewmodel.LoginViewModel;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements Observer<ResponseRoot> {

    @BindView(R.id.et_username)
    EditText etUsername;
    @BindView(R.id.et_password)
    EditText etPassword;
    @BindView(R.id.btn_login)
    Button btnLogin;
    @BindView(R.id.pb_loader)
    ProgressBar pbLoader;
    @BindView(R.id.tv_username)
    TextView tvUsername;
    @BindView(R.id.tv_phone)
    TextView tvPhone;

    LoginViewModel loginViewModel ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        loginViewModel = ViewModelProviders.of(this).get(LoginViewModel.class);
        Observer<ResponseRoot> observer = this ;
        loginViewModel.getLiveUserLogInfo("imtiaz", "123456").observe(this, observer);
    }

    @Override
    public void onChanged(@Nullable ResponseRoot responseRoot) {

    }
}
