package com.zeph.dokehu.homepage;


import com.zeph.dokehu.BasePresenter;
import com.zeph.dokehu.BaseView;

public interface ZhihuDailyContract {

  interface View extends BaseView<Presenter> {

    void showError(); // 显示加载或其他类型的错误

    void showLoading(); // 显示正在加载

    void stopLoading(); // 停止显示正在加载

    void showResults(); // 成功获取到数据后，在界面中显示

    void showPickDialog(); // 显示用于加载指定日期的date picker dialog
  }

  interface Presenter extends BasePresenter {

    void loadPosts(long data, boolean clearing); // 请求数据

    void refresh(); // 刷新数据

    void loadMore(long date); // 加载更多文章

    void startReading(int position); // 显示详情

    void feelLucky(); // 随便看看

  }
}
