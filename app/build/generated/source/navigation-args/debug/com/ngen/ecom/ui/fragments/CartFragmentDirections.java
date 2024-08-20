package com.ngen.ecom.ui.fragments;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.ngen.ecom.R;

public class CartFragmentDirections {
  private CartFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionCartFragmentToCheckOutFragment() {
    return new ActionOnlyNavDirections(R.id.action_cartFragment_to_checkOutFragment);
  }
}
