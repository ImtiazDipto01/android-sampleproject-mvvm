package com.example.dipto.simplemvvmproject;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

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
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callLogin();
            }
        });
    }

    @Override
    public void onChanged(@Nullable ResponseRoot responseRoot) {
        if(responseRoot != null){
            if(responseRoot.getError() == 0){
                tvUsername.setText(responseRoot.getData().getUsers().getName());
                tvPhone.setText(responseRoot.getData().getUsers().getPhone());
                tvUsername.setVisibility(View.VISIBLE);
                tvPhone.setVisibility(View.VISIBLE);
            }
            pbLoader.setVisibility(View.GONE);

        }
        else if(responseRoot == null){
            tvUsername.setVisibility(View.GONE);
            tvPhone.setVisibility(View.GONE);
            pbLoader.setVisibility(View.GONE);
            Toast.makeText(MainActivity.this, "Request is not successfull", Toast.LENGTH_SHORT).show();
        }
    }

    private void callLogin(){
        tvUsername.setVisibility(View.GONE);
        tvPhone.setVisibility(View.GONE);
        pbLoader.setVisibility(View.VISIBLE);
        Observer<ResponseRoot> observer = this ;
        loginViewModel.getLiveUserLogInfo(etUsername.getText().toString(), etPassword.getText().toString()).observe(this, observer);
    }
}
