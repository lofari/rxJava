package com.example.lorenzoricci.moviversion4.root;

import com.example.lorenzoricci.moviversion4.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {ApplicationModule.class})
public interface ApplicationComponent {

    void inject(MainActivity target);

}
