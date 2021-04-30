package ua.antibyte.exmaplerickandmorty.presentaion.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import ua.antibyte.exmaplerickandmorty.R
import ua.antibyte.exmaplerickandmorty.presentaion.fragment.PersonFragment
import ua.antibyte.exmaplerickandmorty.presentaion.navigation.Navigation

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setOnClickListeners()
        Navigation.navigateToPersonFragment(supportFragmentManager)
    }

    private fun setOnClickListeners() {
        iv_bottom_panel_person.setOnClickListener { Navigation.navigateToPersonFragment(supportFragmentManager) }
        iv_bottom_panel_location.setOnClickListener { Navigation.navigateToLocationFragment(supportFragmentManager) }
    }
}