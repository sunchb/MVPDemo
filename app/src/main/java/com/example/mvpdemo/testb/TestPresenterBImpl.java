package com.example.mvpdemo.testb;

import com.example.mvpdemo.mvp.BasePresenter;
import com.example.mvpdemo.testall.TestContractAll;

public class TestPresenterBImpl extends BasePresenter<TestContractAll.IViewAll> implements TestContractB.ITestPresenterB {
    @Override
    public void pfuncTestB() {
        getView().vfuncTestB("Called by TestPresenterBImpl.");
    }
}
