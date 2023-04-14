// Generated by data binding compiler. Do not edit!
package com.samsung.android.trackingsampleapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.samsung.android.trackingsampleapp.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityPpgIrBinding extends ViewDataBinding {
  @NonNull
  public final TextView irRaw;

  @NonNull
  public final TextView irRawValue;

  @NonNull
  public final Button ppgIrStartButton;

  @NonNull
  public final Button ppgIrStopButton;

  @NonNull
  public final ProgressBar progressBar;

  protected ActivityPpgIrBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView irRaw, TextView irRawValue, Button ppgIrStartButton, Button ppgIrStopButton,
      ProgressBar progressBar) {
    super(_bindingComponent, _root, _localFieldCount);
    this.irRaw = irRaw;
    this.irRawValue = irRawValue;
    this.ppgIrStartButton = ppgIrStartButton;
    this.ppgIrStopButton = ppgIrStopButton;
    this.progressBar = progressBar;
  }

  @NonNull
  public static ActivityPpgIrBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_ppg_ir, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityPpgIrBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityPpgIrBinding>inflateInternal(inflater, R.layout.activity_ppg_ir, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityPpgIrBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_ppg_ir, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityPpgIrBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityPpgIrBinding>inflateInternal(inflater, R.layout.activity_ppg_ir, null, false, component);
  }

  public static ActivityPpgIrBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ActivityPpgIrBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityPpgIrBinding)bind(component, view, R.layout.activity_ppg_ir);
  }
}
