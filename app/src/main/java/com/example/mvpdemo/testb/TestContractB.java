package com.example.mvpdemo.testb;

import com.example.mvpdemo.mvp.BaseView;
import com.example.mvpdemo.mvp.IPresenter;
import com.example.mvpdemo.testall.TestContractAll;

public interface TestContractB {
    public interface ITestViewB extends BaseView {
        void vfuncTestB(String msg);
    }
    public interface ITestPresenterB extends IPresenter<TestContractAll.IViewAll> {
        void pfuncTestB();
    }
}
