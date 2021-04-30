package ua.antibyte.exmaplerickandmorty.presentaion.navigation

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import ua.antibyte.exmaplerickandmorty.R
import ua.antibyte.exmaplerickandmorty.presentaion.fragment.LocationFragment
import ua.antibyte.exmaplerickandmorty.presentaion.fragment.PersonFragment

class Navigation {
    companion object {
        private const val TAG_PERSON = "FRAGMENT_PERSON"

        fun navigateToPersonFragment(fragmentManager: FragmentManager) {
            navigateTo(fragmentManager, PersonFragment())
        }

        fun navigateToLocationFragment(fragmentManager: FragmentManager) {
            navigateTo(fragmentManager, LocationFragment())
        }

        private fun navigateTo(fragmentManager: FragmentManager, fragment: Fragment) {
            fragmentManager.beginTransaction()
                .addToBackStack(TAG_PERSON)
                .replace(R.id.fragment_container, fragment)
                .commit()
        }
    }
}