package com.busradeniz.nt.di;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;


@Module
public class AppModule {

    @Provides
    @Named ("name")
    String provideName() {
        return "Hello Dagger";
    }
}
