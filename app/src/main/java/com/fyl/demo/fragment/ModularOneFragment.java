package com.fyl.demo.fragment;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.fyl.demo.R;

import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

import fyl.base.BaseFragment;

/**
 * Created by DN on 2017/9/6.
 */

public class ModularOneFragment extends BaseFragment {

    @ViewInject(value = R.id.oneListview)
    private ListView oneListview;
    @Override
    public View bindView() {
        return null;
    }
    @Override
    public int bindLayout() {
        return R.layout.modularone_layout;
    }
    @Override
    protected void initView() {
        x.view().inject(this,mContextView);

    }
    @Override
    public void widgetClick(View v) {
    }
    @Override
    protected void initData() {

    }


}
