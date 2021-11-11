// Generated by view binder compiler. Do not edit!
package com.example.cooklet.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
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

public final class ActivityStep2Binding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final FrameLayout frameStep2;

  @NonNull
  public final ImageView imageStep2;

  @NonNull
  public final TextView instruction;

  @NonNull
  public final TextView instructionName;

  @NonNull
  public final TextView numberText;

  @NonNull
  public final Button timer;

  @NonNull
  public final CardView timetableCard;

  private ActivityStep2Binding(@NonNull ConstraintLayout rootView, @NonNull FrameLayout frameStep2,
      @NonNull ImageView imageStep2, @NonNull TextView instruction,
      @NonNull TextView instructionName, @NonNull TextView numberText, @NonNull Button timer,
      @NonNull CardView timetableCard) {
    this.rootView = rootView;
    this.frameStep2 = frameStep2;
    this.imageStep2 = imageStep2;
    this.instruction = instruction;
    this.instructionName = instructionName;
    this.numberText = numberText;
    this.timer = timer;
    this.timetableCard = timetableCard;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityStep2Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityStep2Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_step2, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityStep2Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.frame_step2;
      FrameLayout frameStep2 = ViewBindings.findChildViewById(rootView, id);
      if (frameStep2 == null) {
        break missingId;
      }

      id = R.id.image_step2;
      ImageView imageStep2 = ViewBindings.findChildViewById(rootView, id);
      if (imageStep2 == null) {
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

      id = R.id.timer;
      Button timer = ViewBindings.findChildViewById(rootView, id);
      if (timer == null) {
        break missingId;
      }

      id = R.id.timetable_card;
      CardView timetableCard = ViewBindings.findChildViewById(rootView, id);
      if (timetableCard == null) {
        break missingId;
      }

      return new ActivityStep2Binding((ConstraintLayout) rootView, frameStep2, imageStep2,
          instruction, instructionName, numberText, timer, timetableCard);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
