package com.example.ouk_overugiltkaninavl.REST;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiUtils {
    private static ApiUtils apiUtils = null;
    private RESTService restService = null;

    private ApiUtils(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        restService = retrofit.create(RESTService.class);
    }

    public static ApiUtils getInstance(){
        if(apiUtils == null) apiUtils = new ApiUtils();
        return apiUtils;
    }

    public RESTService getRESTService(){
        return restService;
    }

}
