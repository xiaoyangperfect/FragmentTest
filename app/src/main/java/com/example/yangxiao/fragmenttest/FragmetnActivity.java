package com.example.yangxiao.fragmenttest;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;

/**
 * @Author yangxiao on 12/19/2016.
 */

public class FragmetnActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity_main);

        //判断view是否存在
        if (findViewById(R.id.main_frag_layout) != null) {
            //是否为Activity回复状态
            if (savedInstanceState != null)
                return;

            FragementA fragementA = new FragementA();
            //传值
            fragementA.setArguments(getIntent().getExtras());
            getSupportFragmentManager().beginTransaction().add(R.id.main_frag_layout, fragementA).commit();
        }
    }
}
