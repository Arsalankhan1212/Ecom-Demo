package com.ngen.ecom.utils

import android.location.Location

object DistanceFinder {

    fun isWithIn5KM(startLocation: Location, endLocation: Location): String {
        val startLocation = Location("startLocation")
        startLocation.latitude = 34.0151
        startLocation.longitude = 71.5249

        val endLocation = Location("endLocation")
        endLocation.latitude = 34.1986
        endLocation.longitude = 72.0404

        val distanceInMeter = startLocation.distanceTo(endLocation)

        val distanceInKm = distanceInMeter.div(1000)

        return if (distanceInKm in 0.0..5.0)
            "YES"
        else
            "NO"
    }
}