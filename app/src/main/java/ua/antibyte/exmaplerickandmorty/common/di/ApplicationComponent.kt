package ua.antibyte.exmaplerickandmorty.common.di

import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import dagger.android.support.AndroidSupportInjectionModule
import ua.antibyte.exmaplerickandmorty.common.Application
import ua.antibyte.exmaplerickandmorty.data.di.module.DataModule
import ua.antibyte.exmaplerickandmorty.domain.di.module.DomainModule
import ua.antibyte.exmaplerickandmorty.presentaion.di.module.PresentationModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidSupportInjectionModule::class,
        DataModule::class,
        DomainModule::class,
        PresentationModule::class
    ]
)
interface ApplicationComponent : AndroidInjector<DaggerApplication> {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): ApplicationComponent
    }
}