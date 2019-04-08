package com.zyf.simplemvp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.zyf.common.common.app.PresenterFragment;
import com.zyf.factory.presenter.function1.Func1Presenter;
import com.zyf.factory.presenter.function1.Function1Contract;


/**
 * A simple {@link Fragment} subclass.
 */
public class Func1Fragment extends PresenterFragment<Function1Contract.Presenter>
        implements Function1Contract.View {


    public Func1Fragment() {

    }


    @Override
    protected int getContentLayoutId() {
        return R.layout.fragment_test;
    }


    /**
     * mPresenter在此被赋值
     */
    @Override
    protected Function1Contract.Presenter initPresenter() {
        return new Func1Presenter(this);
    }

    @Override
    public void fun1Callback() {

    }
}
