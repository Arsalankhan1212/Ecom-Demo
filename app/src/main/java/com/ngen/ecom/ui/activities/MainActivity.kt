package com.ngen.ecom.ui.activities

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.location.Location
import android.location.LocationManager
import android.os.Bundle
import android.provider.CallLog.Locations
import android.provider.Settings
import android.util.Log
import android.view.View
import android.view.ViewTreeObserver
import android.widget.Toast
import androidx.activity.OnBackPressedCallback
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.core.os.LocaleListCompat
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.ngen.ecom.R
import com.ngen.ecom.databinding.ActivityMainBinding
import com.ngen.ecom.utils.StatusBarManager
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private var _binding: ActivityMainBinding? = null

    private lateinit var navController: NavController
    private lateinit var navHostFragment: NavHostFragment
    private var isBackPressed = false

    private lateinit var locationManager: LocationManager

    companion object {
        var ISRTLLayout = false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(_binding?.root)

        StatusBarManager.changeStatusBarColor(this, window, R.color.white)

        navHostFragment =
            supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
        navController = navHostFragment.navController

        _binding?.apply {
         //   bottomNavigation.selectedItemId = R.id.homeFragment // default selected item is HOME
            //setting bottom navigation bar with nav controller
            bottomNavigation.setupWithNavController(navController)

        //    bottomNavigation.itemIconTintList = null

            bottomNavigation.setOnItemSelectedListener {
                isBackPressed = false
                when (it.itemId) {
                    R.id.homeFragment -> navController.navigate(R.id.homeFragment)
                    R.id.cartFragment -> navController.navigate(R.id.cartFragment)
                }

                true
            }
        }


    }

    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp() || super.onSupportNavigateUp()
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}