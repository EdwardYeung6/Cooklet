// Generated by view binder compiler. Do not edit!
package com.example.cooklet.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.cooklet.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityStep1Binding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final FrameLayout frameStep1;

  @NonNull
  public final ImageView imageStep1;

  @NonNull
  public final TextView instruction;

  @NonNull
  public final TextView instructionName;

  @NonNull
  public final TextView numberText;

  @NonNull
  public final CardView timetableCard;

  private ActivityStep1Binding(@NonNull ConstraintLayout rootView, @NonNull FrameLayout frameStep1,
      @NonNull ImageView imageStep1, @NonNull TextView instruction,
      @NonNull TextView instructionName, @NonNull TextView numberText,
      @NonNull CardView timetableCard) {
    this.rootView = rootView;
    this.frameStep1 = frameStep1;
    this.imageStep1 = imageStep1;
    this.instruction = instruction;
    this.instructionName = instructionName;
    this.numberText = numberText;
    this.timetableCard = timetableCard;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityStep1Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityStep1Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_step1, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityStep1Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.frame_step1;
      FrameLayout frameStep1 = ViewBindings.findChildViewById(rootView, id);
      if (frameStep1 == null) {
        break missingId;
      }

      id = R.id.image_step1;
      ImageView imageStep1 = ViewBindings.findChildViewById(rootView, id);
      if (imageStep1 == null) {
        break missingId;
      }

      id = R.id.instruction;
      TextView instruction = ViewBindings.findChildViewById(rootView, id);
      if (instruction == null) {
        break missingId;
      }

      id = R.id.instruction_name;
      TextView instructionName = ViewBindings.findChildViewById(rootView, id);
      if (instructionName == null) {
        break missingId;
      }

      id = R.id.numberText;
      TextView numberText = ViewBindings.findChildViewById(rootView, id);
      if (numberText == null) {
        break missingId;
      }

      id = R.id.timetable_card;
      CardView timetableCard = ViewBindings.findChildViewById(rootView, id);
      if (timetableCard == null) {
        break missingId;
      }

      return new ActivityStep1Binding((ConstraintLayout) rootView, frameStep1, imageStep1,
          instruction, instructionName, numberText, timetableCard);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
