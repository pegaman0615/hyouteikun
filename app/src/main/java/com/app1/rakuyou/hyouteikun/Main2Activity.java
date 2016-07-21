package com.app1.rakuyou.hyouteikun;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.button6://"1年"ボタンを押した場合
                //Main6Activityに移動
                Intent intent3 = new Intent(Main2Activity.this, Main6Activity.class);
                //↓移動開始
                startActivity(intent3);
                break;
            case R.id.button4://"2年"ボタンを押した場合
                //Main7Activityに移動
                Intent intent4 = new Intent(Main2Activity.this, Main7Activity.class);
                //↓移動開始
                startActivity(intent4);
                break;
            case R.id.button7://"3年"ボタンを押した場合
                //Main8Activityに移動
                Intent intent5 = new Intent(Main2Activity.this, Main8Activity.class);
                //↓移動開始
                startActivity(intent5);
                break;
        }
    }
}

