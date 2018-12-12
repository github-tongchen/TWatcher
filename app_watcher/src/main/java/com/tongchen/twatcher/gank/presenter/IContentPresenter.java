package com.tongchen.twatcher.gank.presenter;

import com.tongchen.twatcher.base.presenter.IMVPPresenter;
import com.tongchen.twatcher.gank.view.IContentView;

/**
 * Created by TongChen at 22:40 on 2018/11/1.
 * <p>
 * Description:该文件实现的功能
 */
public interface IContentPresenter extends IMVPPresenter<IContentView> {

    //  mode 请求的方式：0 refresh; 1 loadMore
    void getGankDataByPage(String category, int size, int page, int mode);
}
