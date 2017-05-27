package com.zeph.dokehu;


import android.view.View;

public interface BaseView<T> {

  void setPresenter(T presenter);

  void initView(View view);

}
