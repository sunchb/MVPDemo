package com.example.mvpdemo.testa;

import android.util.Log;

import com.example.mvpdemo.mvp.BasePresenter;
import com.example.mvpdemo.testall.TestContractAll;

public class TestPresenterAImpl extends BasePresenter<TestContractAll.IViewAll> implements TestContractA.ITestPresenterA {
    @Override
    public void pfuncTestA() {
        getView().vfuncTestA("Called by TestPresenterAImpl.");
    }
}
