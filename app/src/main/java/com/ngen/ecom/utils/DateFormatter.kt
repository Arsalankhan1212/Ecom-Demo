package com.ngen.ecom.utils

import java.text.SimpleDateFormat
import java.util.Locale

object DateFormatter {

    fun formatDate(inputDate : String) : String{
        val inputFormat = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.getDefault())
        val outputFormat = SimpleDateFormat("MMM dd, yyyy", Locale.getDefault())

        try {
            val date = inputFormat.parse(inputDate) ?: ""
           return outputFormat.format(date)
        } catch (e: Exception) {
           return ""
        }
    }
}