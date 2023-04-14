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

public abstract class ActivityEcgBinding extends ViewDataBinding {
  @NonNull
  public final TextView ecg1Data;

  @NonNull
  public final TextView ecg1DataValue;

  @NonNull
  public final TextView ecgGreenData;

  @NonNull
  public final TextView ecgGreenDataValue;

  @NonNull
  public final Button ecgStartButton;

  @NonNull
  public final Button ecgStopButton;

  @NonNull
  public final TextView leadOffData;

  @NonNull
  public final TextView leadOffDataValue;

  @NonNull
  public final TextView liveDataHeader;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final TextView sequence;

  @NonNull
  public final TextView sequenceValue;

  @NonNull
  public final TextView threshold1Data;

  @NonNull
  public final TextView threshold2Data;

  @NonNull
  public final TextView thresholdMaxDataValue;

  @NonNull
  public final TextView thresholdMinDataValue;

  protected ActivityEcgBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView ecg1Data, TextView ecg1DataValue, TextView ecgGreenData, TextView ecgGreenDataValue,
      Button ecgStartButton, Button ecgStopButton, TextView leadOffData, TextView leadOffDataValue,
      TextView liveDataHeader, ProgressBar progressBar, TextView sequence, TextView sequenceValue,
      TextView threshold1Data, TextView threshold2Data, TextView thresholdMaxDataValue,
      TextView thresholdMinDataValue) {
    super(_bindingComponent, _root, _localFieldCount);
    this.ecg1Data = ecg1Data;
    this.ecg1DataValue = ecg1DataValue;
    this.ecgGreenData = ecgGreenData;
    this.ecgGreenDataValue = ecgGreenDataValue;
    this.ecgStartButton = ecgStartButton;
    this.ecgStopButton = ecgStopButton;
    this.leadOffData = leadOffData;
    this.leadOffDataValue = leadOffDataValue;
    this.liveDataHeader = liveDataHeader;
    this.progressBar = progressBar;
    this.sequence = sequence;
    this.sequenceValue = sequenceValue;
    this.threshold1Data = threshold1Data;
    this.threshold2Data = threshold2Data;
    this.thresholdMaxDataValue = thresholdMaxDataValue;
    this.thresholdMinDataValue = thresholdMinDataValue;
  }

  @NonNull
  public static ActivityEcgBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_ecg, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityEcgBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityEcgBinding>inflateInternal(inflater, R.layout.activity_ecg, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityEcgBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_ecg, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityEcgBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityEcgBinding>inflateInternal(inflater, R.layout.activity_ecg, null, false, component);
  }

  public static ActivityEcgBinding bind(@NonNull View view) {
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
  public static ActivityEcgBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityEcgBinding)bind(component, view, R.layout.activity_ecg);
  }
}
