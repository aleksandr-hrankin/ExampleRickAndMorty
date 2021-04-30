package ua.antibyte.exmaplerickandmorty.presentaion.fragment

import android.util.Log
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import ua.antibyte.exmaplerickandmorty.R
import ua.antibyte.exmaplerickandmorty.common.utils.Status
import ua.antibyte.exmaplerickandmorty.data.api.ApiFactory
import ua.antibyte.exmaplerickandmorty.data.api.helper.ApiHelperImpl
import ua.antibyte.exmaplerickandmorty.presentaion.viewmodel.PersonsViewModel
import ua.antibyte.exmaplerickandmorty.presentaion.viewmodel.factory.ViewModelFactory

class PersonFragment : Fragment(R.layout.fragment_person) {
    private lateinit var viewModel: PersonsViewModel

    override fun onStart() {
        super.onStart()
        intViewModel()
        setupObservers()
    }

    private fun intViewModel() {
        viewModel = ViewModelProviders.of(
            this,
            ViewModelFactory(ApiHelperImpl(ApiFactory.createApiService()))
        ).get(PersonsViewModel::class.java)
    }

    private fun setupObservers() {
        viewModel.getAllPersons().observe(this, Observer {
            it?.let { resource ->
                when (resource.status) {
                    Status.SUCCESS -> {
                        Log.e("work", "")
                    }
                    Status.ERROR -> {
                        Log.e("work", it.message.toString())
                    }
                    Status.LOADING -> {
                        Log.e("work", "")
                    }
                }
            }
        })
    }
}