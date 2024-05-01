// Generated by view binder compiler. Do not edit!
package com.example.CamelGames.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.CamelGames.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityCamelBrushBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final Button btnShake;

  @NonNull
  public final Chronometer chronometer;

  @NonNull
  public final TextView countdownTextView;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final TextView title;

  private ActivityCamelBrushBinding(@NonNull RelativeLayout rootView, @NonNull Button btnShake,
      @NonNull Chronometer chronometer, @NonNull TextView countdownTextView,
      @NonNull ProgressBar progressBar, @NonNull TextView title) {
    this.rootView = rootView;
    this.btnShake = btnShake;
    this.chronometer = chronometer;
    this.countdownTextView = countdownTextView;
    this.progressBar = progressBar;
    this.title = title;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityCamelBrushBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityCamelBrushBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_camel_brush, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityCamelBrushBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnShake;
      Button btnShake = ViewBindings.findChildViewById(rootView, id);
      if (btnShake == null) {
        break missingId;
      }

      id = R.id.chronometer;
      Chronometer chronometer = ViewBindings.findChildViewById(rootView, id);
      if (chronometer == null) {
        break missingId;
      }

      id = R.id.countdownTextView;
      TextView countdownTextView = ViewBindings.findChildViewById(rootView, id);
      if (countdownTextView == null) {
        break missingId;
      }

      id = R.id.progressBar;
      ProgressBar progressBar = ViewBindings.findChildViewById(rootView, id);
      if (progressBar == null) {
        break missingId;
      }

      id = R.id.title;
      TextView title = ViewBindings.findChildViewById(rootView, id);
      if (title == null) {
        break missingId;
      }

      return new ActivityCamelBrushBinding((RelativeLayout) rootView, btnShake, chronometer,
          countdownTextView, progressBar, title);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
