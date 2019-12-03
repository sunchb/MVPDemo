package com.example.mvpdemo.testall;

import com.example.mvpdemo.mvp.BasePresenter;
import com.example.mvpdemo.testa.TestContractA;
import com.example.mvpdemo.testa.TestPresenterAImpl;
import com.example.mvpdemo.testb.TestContractB;
import com.example.mvpdemo.testb.TestPresenterBImpl;

public class PresenterAllImpl extends BasePresenter<TestContractAll.IViewAll> implements TestContractAll.IPresenterAll {
    TestContractB.ITestPresenterB p1 = new TestPresenterBImpl();
    TestContractA.ITestPresenterA p2 = new TestPresenterAImpl();

    @Override
    public void pfuncTestA() {
        p2.pfuncTestA();
    }

    @Override
    public void pfuncTestB() {
        p1.pfuncTestB();
    }

    public void attachView(TestContractAll.IViewAll view) {
        super.attachView(view);
        p1.attachView(view);
        p2.attachView(view);
    }

    public void detachView() {
        super.detachView();
        p1.detachView();
        p2.detachView();
    }
}
