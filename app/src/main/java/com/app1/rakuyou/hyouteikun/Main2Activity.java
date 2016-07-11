package com.app1.rakuyou.hyouteikun;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.button4://"タイトルへ戻る"ボタンを押した場合
                //Main5Activityに移動
                Intent intent3 = new Intent(Main2Activity.this, MainActivity.class);
                //↓移動開始
                startActivity(intent3);
                break;

        }
    }
}

