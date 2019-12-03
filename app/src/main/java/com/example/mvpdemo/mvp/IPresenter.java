package com.example.mvpdemo.mvp;

/*
*   Interface of presenter in mvp pattern.
* */
public interface IPresenter<V extends BaseView> {
    void attachView(V mView);
    void detachView();
    boolean isViewAttached();
}
