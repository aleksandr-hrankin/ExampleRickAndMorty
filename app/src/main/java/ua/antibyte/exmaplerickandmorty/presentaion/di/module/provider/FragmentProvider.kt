package ua.antibyte.exmaplerickandmorty.presentaion.di.module.provider

import dagger.Module
import dagger.android.ContributesAndroidInjector
import ua.antibyte.exmaplerickandmorty.presentaion.fragment.LocationFragment
import ua.antibyte.exmaplerickandmorty.presentaion.fragment.PersonFragment

@Module
abstract class FragmentProvider {
    @ContributesAndroidInjector
    abstract fun providePersonsFragment(): PersonFragment

    @ContributesAndroidInjector
    abstract fun provideLocationFragment(): LocationFragment
}