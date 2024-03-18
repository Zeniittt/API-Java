package com.example.apijava;

import com.example.apijava.MyData;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

public interface ApiInterface {
    @Headers({
            "X-RapidAPI-Key: ea4ebf4916msh98aa893d9a86619p1ca1a8jsn65e9376b3be7",
            "X-RapidAPI-Host: deezerdevs-deezer.p.rapidapi.com"
    })
    @GET("search")
    Call<MyData> getData(@Query("q") String query);
}