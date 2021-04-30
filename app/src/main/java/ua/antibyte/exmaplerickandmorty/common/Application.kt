package ua.antibyte.exmaplerickandmorty.common

import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import dagger.android.HasAndroidInjector
import ua.antibyte.exmaplerickandmorty.common.di.DaggerApplicationComponent

class Application : DaggerApplication(), HasAndroidInjector {
    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        val applicationComponent = DaggerApplicationComponent.builder()
            .application(this)
            .build()
        applicationComponent.inject(this)
        return applicationComponent
    }
}