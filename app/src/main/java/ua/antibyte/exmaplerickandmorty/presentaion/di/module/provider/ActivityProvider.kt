package ua.antibyte.exmaplerickandmorty.presentaion.di.module.provider

import dagger.Module
import dagger.android.ContributesAndroidInjector
import ua.antibyte.exmaplerickandmorty.presentaion.activity.MainActivity

@Module
abstract class ActivityProvider {
    @ContributesAndroidInjector
    abstract fun provideMainActivity(): MainActivity
}