package com.example.lorenzoricci.moviversion4.movies;

import io.reactivex.Observable;

public interface MoviesRepository {

    Observable<Result> getResultData();

    Observable<String> getCountryData();

}
