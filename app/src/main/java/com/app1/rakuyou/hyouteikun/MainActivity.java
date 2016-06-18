package com.app1.rakuyou.hyouteikun;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //タイトルバー非表示
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        // レイアウトをセット
        setContentView(R.layout.activity_main);
    }
    public void onClick(View V) {
        switch (V.getId()) {

            case R.id.button://"始める"ボタンを押した場合
                //Main2Activityに移動
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                //↓移動開始
                startActivity(intent);
                break;
            case R.id.button2://"使い方"ボタンを押した場合
                //Main3Activityに移動
                Intent intent1 = new Intent(MainActivity.this, Main3Activity.class);
                //↓移動開始
                startActivity(intent1);
                break;
            case R.id.button3://"設定"ボタンを押した場合
                //Main4Activityに移動
                Intent intent2 = new Intent(MainActivity.this, Main4Activity.class);
                //↓移動開始
                startActivity(intent2);
                break;
        }
    }
}
