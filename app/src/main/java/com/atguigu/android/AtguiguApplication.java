package com.atguigu.android;

import android.app.Application;

import org.xutils.x;

/**
 * 作者：尚硅谷-杨光福 on 2016/9/17 22:06
 * 微信：yangguangfu520
 * QQ号：541433511
 * 作用：代表整个软件
 */
public class AtguiguApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        //xUtils3初始化
        x.Ext.init(this);
        // 是否输出debug日志, 开启debug会影响性能.
        x.Ext.setDebug(true);
    }
}
