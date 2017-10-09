package com.busradeniz.nt.di;

import com.busradeniz.nt.ui.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;


@Module
public abstract class ActivityBuildersModule {
    @ContributesAndroidInjector
    abstract MainActivity contributeMainActivity();

}
