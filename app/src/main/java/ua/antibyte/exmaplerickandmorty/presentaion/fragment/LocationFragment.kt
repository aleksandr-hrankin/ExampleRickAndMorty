package ua.antibyte.exmaplerickandmorty.presentaion.fragment

import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import ua.antibyte.exmaplerickandmorty.R
import ua.antibyte.exmaplerickandmorty.common.utils.Status
import ua.antibyte.exmaplerickandmorty.presentaion.viewmodel.LocationPlaceViewModel

class LocationFragment : BaseFragment(R.layout.fragment_location) {
    private lateinit var viewModelPlace: LocationPlaceViewModel

    override fun onStart() {
        super.onStart()
        initViewModel()
        setupObservers()
    }

    private fun initViewModel() {
        viewModelPlace = ViewModelProvider(this, viewModelFactory).get(LocationPlaceViewModel::class.java)
    }

    private fun setupObservers() {
        viewModelPlace.getAllLocations().observe(this, Observer {
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