package com.app1.rakuyou.hyouteikun;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //タイトルバー非表示
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        // レイアウトセット
        setContentView(R.layout.activity_main);

    }
}
