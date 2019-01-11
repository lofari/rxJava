package com.example.lorenzoricci.moviversion4.http;

import com.example.lorenzoricci.moviversion4.http.apimodel.TopMoviesRated;


import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface MoviesApiService {

    @GET("top_rated")
    Observable<TopMoviesRated> getTopMoviesRated(@Query("page") Integer page);



}
