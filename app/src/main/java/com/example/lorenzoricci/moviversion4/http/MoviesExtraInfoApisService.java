package com.example.lorenzoricci.moviversion4.http;

import com.example.lorenzoricci.moviversion4.http.apimodel.OmdbApi;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface MoviesExtraInfoApisService {

    //TODO * O / no estoy seguro
    @GET("/")
    Observable<OmdbApi> getExtraInfoMovie(@Query("t") String title);


}
