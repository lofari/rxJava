package com.example.lorenzoricci.moviversion4.root;

import com.example.lorenzoricci.moviversion4.MainActivity;
import com.example.lorenzoricci.moviversion4.http.MovieExtraInfoApiModule;
import com.example.lorenzoricci.moviversion4.http.MovieTitleApiModule;
import com.example.lorenzoricci.moviversion4.http.MoviesExtraInfoApisService;
import com.example.lorenzoricci.moviversion4.movies.MoviesModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton

@Component(modules = {
        ApplicationModule.class,
        MovieTitleApiModule.class,
        MoviesModule.class,
        MovieExtraInfoApiModule.class})

public interface ApplicationComponent {

    void inject(MainActivity target);

}
