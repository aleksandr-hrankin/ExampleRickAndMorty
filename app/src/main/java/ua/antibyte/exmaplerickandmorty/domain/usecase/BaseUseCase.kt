package ua.antibyte.exmaplerickandmorty.domain.usecase

import androidx.lifecycle.LiveData
import androidx.lifecycle.liveData
import kotlinx.coroutines.Dispatchers
import ua.antibyte.exmaplerickandmorty.common.utils.Resource
import java.lang.Exception

abstract class BaseUseCase<T> {
    open fun execute(): LiveData<Resource<T>> {
        return liveData(Dispatchers.IO) {
            emit(Resource.loading(data = null))

            try {
                emit(Resource.success(data = getSuspend()))
            } catch (exception: Exception) {
                emit(Resource.error(data = null, message = exception.message ?: "Error Occurred!"))
            }
        }
    }

    abstract suspend fun getSuspend(): T
}