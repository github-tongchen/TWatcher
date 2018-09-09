package com.tongchen.twatcher.di.module;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by TongChen at 10:32 on 2018/6/22.
 * <p>
 * Description:该文件实现的功能
 */

@Module
public class AppModule {

    private Context mContext;

    public AppModule(Context context) {
        this.mContext = context;
    }

    @Singleton
    @Provides
    public Context provideContext() {
        return mContext;
    }
}
