package com.zeph.dokehu.homepage;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.zeph.dokehu.homepage.DoubanContract.Presenter;

public class DoubanFragment extends Fragment implements DoubanContract.View {

  public DoubanFragment() {
  }

  public static DoubanFragment newInStance(){
    return new DoubanFragment();
  }

  @Override
  public void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
  }

  @Nullable
  @Override
  public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
      @Nullable Bundle savedInstanceState) {
    return super.onCreateView(inflater, container, savedInstanceState);
  }

  @Override
  public void setPresenter(Presenter presenter) {

  }

  @Override
  public void initView(View view) {

  }

  @Override
  public void showError() {

  }

  @Override
  public void showLoading() {

  }

  @Override
  public void stopLoading() {

  }

  @Override
  public void showResults() {

  }

  @Override
  public void showPickDialog() {

  }
}
