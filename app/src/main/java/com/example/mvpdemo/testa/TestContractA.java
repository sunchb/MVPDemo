package com.example.mvpdemo.testa;

import com.example.mvpdemo.mvp.BaseView;
import com.example.mvpdemo.mvp.IPresenter;
import com.example.mvpdemo.testall.TestContractAll;

public interface TestContractA {
    public interface ITestViewA extends BaseView {
        void vfuncTestA(String msg);
    }
    public interface ITestPresenterA extends IPresenter<TestContractAll.IViewAll> {
        void pfuncTestA();
    }
}
