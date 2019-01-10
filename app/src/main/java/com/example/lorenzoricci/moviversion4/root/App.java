package com.example.lorenzoricci.moviversion4.root;

import android.app.Application;

import com.example.lorenzoricci.moviversion4.http.MovieExtraInfoApiModule;
import com.example.lorenzoricci.moviversion4.http.MovieTitleApiModule;
import com.example.lorenzoricci.moviversion4.movies.MoviesModule;

public class App extends Application {

    private ApplicationComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .moviesModule(new MoviesModule())
                .movieTitleApiModule(new MovieTitleApiModule())
                .movieExtraInfoApiModule(new MovieExtraInfoApiModule())
                .build();
    }

    public ApplicationComponent getComponent(){
        return component;
    }
}
