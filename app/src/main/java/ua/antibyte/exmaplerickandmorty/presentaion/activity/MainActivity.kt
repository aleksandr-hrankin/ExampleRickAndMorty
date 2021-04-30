package ua.antibyte.exmaplerickandmorty.presentaion.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ua.antibyte.exmaplerickandmorty.R
import ua.antibyte.exmaplerickandmorty.presentaion.fragment.PersonsFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container,
                PersonsFragment()
            )
            .commit()
    }
}