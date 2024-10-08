// Generated by view binder compiler. Do not edit!
package com.ngen.ecom.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.button.MaterialButton;
import com.ngen.ecom.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentCartBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final MaterialButton btnCheckOut;

  @NonNull
  public final AppCompatImageView imgClearCart;

  @NonNull
  public final ImageView imgError;

  @NonNull
  public final LinearLayoutCompat layoutEmptyCart;

  @NonNull
  public final RecyclerView rvCart;

  @NonNull
  public final AppCompatTextView tvAmount;

  @NonNull
  public final AppCompatTextView tvAmountLabel;

  @NonNull
  public final TextView tvErrorMsg;

  @NonNull
  public final TextView tvTitle;

  private FragmentCartBinding(@NonNull ConstraintLayout rootView,
      @NonNull MaterialButton btnCheckOut, @NonNull AppCompatImageView imgClearCart,
      @NonNull ImageView imgError, @NonNull LinearLayoutCompat layoutEmptyCart,
      @NonNull RecyclerView rvCart, @NonNull AppCompatTextView tvAmount,
      @NonNull AppCompatTextView tvAmountLabel, @NonNull TextView tvErrorMsg,
      @NonNull TextView tvTitle) {
    this.rootView = rootView;
    this.btnCheckOut = btnCheckOut;
    this.imgClearCart = imgClearCart;
    this.imgError = imgError;
    this.layoutEmptyCart = layoutEmptyCart;
    this.rvCart = rvCart;
    this.tvAmount = tvAmount;
    this.tvAmountLabel = tvAmountLabel;
    this.tvErrorMsg = tvErrorMsg;
    this.tvTitle = tvTitle;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentCartBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentCartBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_cart, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentCartBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnCheckOut;
      MaterialButton btnCheckOut = ViewBindings.findChildViewById(rootView, id);
      if (btnCheckOut == null) {
        break missingId;
      }

      id = R.id.imgClearCart;
      AppCompatImageView imgClearCart = ViewBindings.findChildViewById(rootView, id);
      if (imgClearCart == null) {
        break missingId;
      }

      id = R.id.imgError;
      ImageView imgError = ViewBindings.findChildViewById(rootView, id);
      if (imgError == null) {
        break missingId;
      }

      id = R.id.layoutEmptyCart;
      LinearLayoutCompat layoutEmptyCart = ViewBindings.findChildViewById(rootView, id);
      if (layoutEmptyCart == null) {
        break missingId;
      }

      id = R.id.rvCart;
      RecyclerView rvCart = ViewBindings.findChildViewById(rootView, id);
      if (rvCart == null) {
        break missingId;
      }

      id = R.id.tvAmount;
      AppCompatTextView tvAmount = ViewBindings.findChildViewById(rootView, id);
      if (tvAmount == null) {
        break missingId;
      }

      id = R.id.tvAmountLabel;
      AppCompatTextView tvAmountLabel = ViewBindings.findChildViewById(rootView, id);
      if (tvAmountLabel == null) {
        break missingId;
      }

      id = R.id.tvErrorMsg;
      TextView tvErrorMsg = ViewBindings.findChildViewById(rootView, id);
      if (tvErrorMsg == null) {
        break missingId;
      }

      id = R.id.tvTitle;
      TextView tvTitle = ViewBindings.findChildViewById(rootView, id);
      if (tvTitle == null) {
        break missingId;
      }

      return new FragmentCartBinding((ConstraintLayout) rootView, btnCheckOut, imgClearCart,
          imgError, layoutEmptyCart, rvCart, tvAmount, tvAmountLabel, tvErrorMsg, tvTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
