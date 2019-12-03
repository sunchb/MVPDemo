package com.example.mvpdemo.mvp;

import android.os.Bundle;

/*
 *   Common implementation of Activity with only one Presenter, that make it easy to use presenter in activity.
 *   Usually a view corresponds to only one presenter. If more than one presenter is needed, the design must be reviewed.
 * */
public abstract class LazyActivity<P extends IPresenter> extends BaseActivity {
    protected P mPresenter;
    protected abstract P createPresenter();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPresenter = createPresenter();
        if (mPresenter == null) {
            throw new NullPointerException("Presenter is null! Do you return null in createPresenter()?");
        }
        mPresenter.attachView(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mPresenter != null) {
            mPresenter.detachView();
        }
    }

    protected P getPresenter(){
        return mPresenter;
    }
}
