package com.example.ouk_overugiltkaninavl;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import com.example.ouk_overugiltkaninavl.REST.ApiUtils;
import com.example.ouk_overugiltkaninavl.REST.RESTService;
import com.example.ouk_overugiltkaninavl.REST.Rabbit;

import android.util.Log;

import java.util.List;

public class RabbitProfile extends AppCompatActivity {

    RESTService restServiceInterface = ApiUtils.getInstance().getRESTService();
    private static final String TAG = "Epic Fail";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart(){
        getAndShowRabbitInfo();
        super.onStart();
    }

    private void getAndShowRabbitInfo()
    {
        Call<List<Rabbit>> getAllRabbitInfo = restServiceInterface.getAllRabbits();
        getAllRabbitInfo.enqueue(new Callback<List<Rabbit>>() {
            @Override
            public void onResponse(Call<List<Rabbit>> call, Response<List<Rabbit>> response) {
                if(response.isSuccessful()){
                    List<Rabbit> allRabbitList = response.body();
                }
            }

            @Override
            public void onFailure(Call<List<Rabbit>> call, Throwable t) {
                Log.d(TAG, t.getMessage());
            }
        });
    }
}