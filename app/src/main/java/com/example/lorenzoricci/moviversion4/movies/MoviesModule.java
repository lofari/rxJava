package com.example.lorenzoricci.moviversion4.movies;

import com.example.lorenzoricci.moviversion4.http.MoviesApiService;
import com.example.lorenzoricci.moviversion4.http.MoviesExtraInfoApisService;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class    MoviesModule {

    @Provides
    public MoviesMVP.Presenter provideMoviesPresenter(MoviesMVP.Model moviesModel){
        return new MoviesPresenter(moviesModel);
    }


    @Provides
    public MoviesMVP.Model provideMoviesModel(Repository repository) {
        return new MoviesModel(repository);
    }

    @Singleton
    @Provides
    public Repository provideMoviesRepository(MoviesApiService moviesApiService, MoviesExtraInfoApisService extraInfoApiService){

        return new MoviesRepository(moviesApiService, extraInfoApiService);
    }

}
