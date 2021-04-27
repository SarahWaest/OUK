package com.example.ouk_overugiltkaninavl.REST;

import com.example.ouk_overugiltkaninavl.REST.Rabbit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface RESTService {
    //RABBIT
    @GET("RABBIT/id/{rabbitid}")
    Call<Rabbit> getOneRabbit(@Path("rabbitId") int rabbitId);

    @GET("RABBIT/")
    Call<List<Rabbit>> getAllRabbits();
}
