// Generated by view binder compiler. Do not edit!
package com.example.cooklet.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.cooklet.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainIntroductionBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button button;

  @NonNull
  public final TextView descributionMain;

  @NonNull
  public final TextView descributionTopic;

  @NonNull
  public final RelativeLayout descripationView;

  @NonNull
  public final RelativeLayout introductionView;

  private ActivityMainIntroductionBinding(@NonNull ConstraintLayout rootView,
      @NonNull Button button, @NonNull TextView descributionMain,
      @NonNull TextView descributionTopic, @NonNull RelativeLayout descripationView,
      @NonNull RelativeLayout introductionView) {
    this.rootView = rootView;
    this.button = button;
    this.descributionMain = descributionMain;
    this.descributionTopic = descributionTopic;
    this.descripationView = descripationView;
    this.introductionView = introductionView;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainIntroductionBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainIntroductionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main_introduction, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainIntroductionBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.button;
      Button button = ViewBindings.findChildViewById(rootView, id);
      if (button == null) {
        break missingId;
      }

      id = R.id.describution_main;
      TextView descributionMain = ViewBindings.findChildViewById(rootView, id);
      if (descributionMain == null) {
        break missingId;
      }

      id = R.id.describution_topic;
      TextView descributionTopic = ViewBindings.findChildViewById(rootView, id);
      if (descributionTopic == null) {
        break missingId;
      }

      id = R.id.descripation_view;
      RelativeLayout descripationView = ViewBindings.findChildViewById(rootView, id);
      if (descripationView == null) {
        break missingId;
      }

      id = R.id.introduction_view;
      RelativeLayout introductionView = ViewBindings.findChildViewById(rootView, id);
      if (introductionView == null) {
        break missingId;
      }

      return new ActivityMainIntroductionBinding((ConstraintLayout) rootView, button,
          descributionMain, descributionTopic, descripationView, introductionView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
