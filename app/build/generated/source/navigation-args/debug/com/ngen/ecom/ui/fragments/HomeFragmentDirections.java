package com.ngen.ecom.ui.fragments;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.ngen.ecom.R;

public class HomeFragmentDirections {
  private HomeFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionHomeFragmentToProductDetailFragment() {
    return new ActionOnlyNavDirections(R.id.action_homeFragment_to_productDetailFragment);
  }
}
