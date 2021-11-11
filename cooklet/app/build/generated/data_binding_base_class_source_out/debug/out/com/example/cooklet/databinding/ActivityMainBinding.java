// Generated by view binder compiler. Do not edit!
package com.example.cooklet.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.cooklet.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView ImageView1;

  @NonNull
  public final ImageView ImageView2;

  @NonNull
  public final ImageView ImageView3;

  @NonNull
  public final ImageView ImageView4;

  @NonNull
  public final ImageView ImageView5;

  @NonNull
  public final ImageView ImageView6;

  @NonNull
  public final ImageView ImageView7;

  @NonNull
  public final ImageView ImageView8;

  @NonNull
  public final ImageView ImageViewButton1;

  @NonNull
  public final ImageView ImageViewButton2;

  @NonNull
  public final ImageView ImageViewButton3;

  @NonNull
  public final ScrollView TypeScroll;

  @NonNull
  public final BottomNavigationView bottomNavigationView;

  @NonNull
  public final ConstraintLayout container;

  @NonNull
  public final LinearLayout linearLayout1;

  private ActivityMainBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView ImageView1,
      @NonNull ImageView ImageView2, @NonNull ImageView ImageView3, @NonNull ImageView ImageView4,
      @NonNull ImageView ImageView5, @NonNull ImageView ImageView6, @NonNull ImageView ImageView7,
      @NonNull ImageView ImageView8, @NonNull ImageView ImageViewButton1,
      @NonNull ImageView ImageViewButton2, @NonNull ImageView ImageViewButton3,
      @NonNull ScrollView TypeScroll, @NonNull BottomNavigationView bottomNavigationView,
      @NonNull ConstraintLayout container, @NonNull LinearLayout linearLayout1) {
    this.rootView = rootView;
    this.ImageView1 = ImageView1;
    this.ImageView2 = ImageView2;
    this.ImageView3 = ImageView3;
    this.ImageView4 = ImageView4;
    this.ImageView5 = ImageView5;
    this.ImageView6 = ImageView6;
    this.ImageView7 = ImageView7;
    this.ImageView8 = ImageView8;
    this.ImageViewButton1 = ImageViewButton1;
    this.ImageViewButton2 = ImageViewButton2;
    this.ImageViewButton3 = ImageViewButton3;
    this.TypeScroll = TypeScroll;
    this.bottomNavigationView = bottomNavigationView;
    this.container = container;
    this.linearLayout1 = linearLayout1;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.ImageView1;
      ImageView ImageView1 = ViewBindings.findChildViewById(rootView, id);
      if (ImageView1 == null) {
        break missingId;
      }

      id = R.id.ImageView2;
      ImageView ImageView2 = ViewBindings.findChildViewById(rootView, id);
      if (ImageView2 == null) {
        break missingId;
      }

      id = R.id.ImageView3;
      ImageView ImageView3 = ViewBindings.findChildViewById(rootView, id);
      if (ImageView3 == null) {
        break missingId;
      }

      id = R.id.ImageView4;
      ImageView ImageView4 = ViewBindings.findChildViewById(rootView, id);
      if (ImageView4 == null) {
        break missingId;
      }

      id = R.id.ImageView5;
      ImageView ImageView5 = ViewBindings.findChildViewById(rootView, id);
      if (ImageView5 == null) {
        break missingId;
      }

      id = R.id.ImageView6;
      ImageView ImageView6 = ViewBindings.findChildViewById(rootView, id);
      if (ImageView6 == null) {
        break missingId;
      }

      id = R.id.ImageView7;
      ImageView ImageView7 = ViewBindings.findChildViewById(rootView, id);
      if (ImageView7 == null) {
        break missingId;
      }

      id = R.id.ImageView8;
      ImageView ImageView8 = ViewBindings.findChildViewById(rootView, id);
      if (ImageView8 == null) {
        break missingId;
      }

      id = R.id.ImageView_button1;
      ImageView ImageViewButton1 = ViewBindings.findChildViewById(rootView, id);
      if (ImageViewButton1 == null) {
        break missingId;
      }

      id = R.id.ImageView_button2;
      ImageView ImageViewButton2 = ViewBindings.findChildViewById(rootView, id);
      if (ImageViewButton2 == null) {
        break missingId;
      }

      id = R.id.ImageView_button3;
      ImageView ImageViewButton3 = ViewBindings.findChildViewById(rootView, id);
      if (ImageViewButton3 == null) {
        break missingId;
      }

      id = R.id.Type_scroll;
      ScrollView TypeScroll = ViewBindings.findChildViewById(rootView, id);
      if (TypeScroll == null) {
        break missingId;
      }

      id = R.id.bottomNavigationView;
      BottomNavigationView bottomNavigationView = ViewBindings.findChildViewById(rootView, id);
      if (bottomNavigationView == null) {
        break missingId;
      }

      ConstraintLayout container = (ConstraintLayout) rootView;

      id = R.id.linearLayout1;
      LinearLayout linearLayout1 = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout1 == null) {
        break missingId;
      }

      return new ActivityMainBinding((ConstraintLayout) rootView, ImageView1, ImageView2,
          ImageView3, ImageView4, ImageView5, ImageView6, ImageView7, ImageView8, ImageViewButton1,
          ImageViewButton2, ImageViewButton3, TypeScroll, bottomNavigationView, container,
          linearLayout1);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}