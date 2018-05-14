package com.fyl.demo.ui;

import android.app.Application;

import fyl.base.db.DBManageHelper;


/**
 * Created by DN on 2017/11/8.
 */

public class MyAppLication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        //初始化数据库
        DBManageHelper.initDB(null,null,null);
    }





}
