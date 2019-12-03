package com.example.mvpdemo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.mvpdemo.mvp.LazyActivity;
import com.example.mvpdemo.testall.PresenterAllImpl;
import com.example.mvpdemo.testall.TestContractAll;

public class MainActivity extends LazyActivity<TestContractAll.IPresenterAll> implements TestContractAll.IViewAll {

    @Override
    protected TestContractAll.IPresenterAll createPresenter() {
        return new PresenterAllImpl();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_testa = findViewById(R.id.btn_testa);
        Button btn_testb = findViewById(R.id.btn_testb);

        btn_testa.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        getPresenter().pfuncTestA();
                    }
                }
        );


        btn_testb.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        getPresenter().pfuncTestB();
                    }
                }
        );
    }

    @Override
    public void vfuncTestA(String msg) {
        Toast.makeText(this, "vfuncTestA:" + msg, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void vfuncTestB(String msg) {
        Toast.makeText(this, "vfuncTestB:" + msg, Toast.LENGTH_SHORT).show();
    }
}
