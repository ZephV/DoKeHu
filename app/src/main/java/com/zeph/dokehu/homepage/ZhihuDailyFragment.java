package com.zeph.dokehu.homepage;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.zeph.dokehu.homepage.ZhihuDailyContract.Presenter;

public  class ZhihuDailyFragment extends Fragment implements ZhihuDailyContract.View {

  public ZhihuDailyFragment() {}

  public static ZhihuDailyFragment newInstance(){
    return new ZhihuDailyFragment();
  }

  @Override
  public void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
  }

  @Nullable
  @Override
  public android.view.View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
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
