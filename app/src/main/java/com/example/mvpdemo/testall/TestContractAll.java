package com.example.mvpdemo.testall;

import com.example.mvpdemo.testa.TestContractA;
import com.example.mvpdemo.testb.TestContractB;

public class TestContractAll {
    public interface IViewAll extends TestContractA.ITestViewA, TestContractB.ITestViewB {
    }

    public interface IPresenterAll extends TestContractA.ITestPresenterA, TestContractB.ITestPresenterB {

    }
}
