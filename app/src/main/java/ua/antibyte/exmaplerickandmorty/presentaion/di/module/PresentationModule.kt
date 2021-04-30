package ua.antibyte.exmaplerickandmorty.presentaion.di.module

import dagger.Module
import ua.antibyte.exmaplerickandmorty.presentaion.di.module.provider.ActivityProvider
import ua.antibyte.exmaplerickandmorty.presentaion.di.module.provider.FragmentProvider
import ua.antibyte.exmaplerickandmorty.presentaion.di.module.viewmodel.ViewModelFactoryModule
import ua.antibyte.exmaplerickandmorty.presentaion.di.module.viewmodel.ViewModelModule

@Module(includes = [
    ActivityProvider::class,
    FragmentProvider::class,
    ViewModelFactoryModule::class,
    ViewModelModule::class
])
class PresentationModule