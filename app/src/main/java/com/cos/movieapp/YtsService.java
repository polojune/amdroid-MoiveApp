package com.cos.movieapp;


import com.google.gson.Gson;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface YtsService {

      @GET("list_movies.json")
     Call<YtsData> 영화목록가져오기(
         @Query("sort_by")String sort_by,
         @Query("limit")int limit,
         @Query("page") int page
      );

      public static final Retrofit retrofit = new Retrofit.Builder()
              .baseUrl("https://yts.mx/api/v2/")
              .addConverterFactory(GsonConverterFactory.create())
              .build();
}
