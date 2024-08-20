package com.ngen.ecom.network.viewModel

import androidx.lifecycle.ViewModel
import com.ngen.ecom.network.repository.EcomRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class EcomViewModel @Inject constructor(private val repository: EcomRepository) : ViewModel() {
    suspend fun getProductList() = repository.getProductList()
}