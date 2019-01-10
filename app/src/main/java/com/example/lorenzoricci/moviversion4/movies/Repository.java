package com.example.lorenzoricci.moviversion4.movies;

import com.example.lorenzoricci.moviversion4.http.apimodel.Result;

import io.reactivex.Observable;

public interface Repository {

    Observable<Result> getResultData();
    Observable<Result> getResultFromNetwork();
    Observable<Result> getResultFromCache();

    Observable<String> getCountryData();
    Observable<String> getCountryFromNetwork();
    Observable<String> getCountryFromCache();
}
