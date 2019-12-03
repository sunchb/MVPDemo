package com.example.mvpdemo.mvp;

/*
 *   Common implementation of IPresenter
 * */
public class BasePresenter<V extends BaseView> implements IPresenter<V>{
    /**
     * 绑定的view
     */
    protected V mView;

    /**
     * 绑定view，一般在初始化中调用该方法
     */
    //@Override
    public void attachView(V mView) {
        this.mView = mView;
    }

    /**
     * 断开view，一般在onDestroy中调用
     */
    //@Override
    public void detachView() {
        this.mView = null;
    }

    /**
     * 是否与View建立连接
     * 每次调用业务请求的时候都要出先调用方法检查是否与View建立连接
     */
    public boolean isViewAttached() {
        return mView != null;
    }

    /**
     * 获取连接的view
     */
    protected V getView() {
        return mView;
    }
}