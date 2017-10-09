package com.busradeniz.nt.di;


import android.app.Application;

import com.busradeniz.nt.NewsTrackingApp;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;

@Singleton
@Component(modules = {
        AndroidInjectionModule.class,
        ActivityBuildersModule.class,
        AppModule.class
})
public interface AppComponent {

    void inject(NewsTrackingApp newsTrackingApp);

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder application(Application application);

        AppComponent build();
    }

}
