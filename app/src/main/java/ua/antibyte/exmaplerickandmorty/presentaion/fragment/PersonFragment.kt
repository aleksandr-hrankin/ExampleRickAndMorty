package ua.antibyte.exmaplerickandmorty.presentaion.fragment

import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import ua.antibyte.exmaplerickandmorty.R
import ua.antibyte.exmaplerickandmorty.common.utils.Status
import ua.antibyte.exmaplerickandmorty.presentaion.viewmodel.PersonViewModel

class PersonFragment : BaseFragment(R.layout.fragment_person) {
    private lateinit var viewModel: PersonViewModel

    override fun onStart() {
        super.onStart()
        initViewModel()
        setupObservers()
    }

    private fun initViewModel() {
        viewModel = ViewModelProvider(this, viewModelFactory).get(PersonViewModel::class.java)
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