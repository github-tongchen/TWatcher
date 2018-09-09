package com.tongchen.twatcher.mvp.presenter;

import com.tongchen.twatcher.base.presenter.IMVPPresenter;
import com.tongchen.twatcher.mvp.view.ISampleView;

/**
 * Created by TongChen at 12:03 on 2018/7/8.
 * <p>
 * Description:该文件实现的功能
 */
public interface ISamplePresenter extends IMVPPresenter<ISampleView> {

    void getAndroidDataByPage(String category,  String size,String page);
}
