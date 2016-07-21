package com.app1.rakuyou.hyouteikun.Datebase;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

class SikakuOpenHelper extends SQLiteOpenHelper {
    /** アクセスするデータベース名 */
    private static final String DB_NAME = "sikaku.db";
    /** DBのバージョン */
    private static final int DB_VERSION = 1;
    /** create table文 */
    private static final String createTableString = "create table personal_data(_id integer primary key autoincrement, name text,age integer, delete_flg integer)";

    public SikakuOpenHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(createTableString);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // TODO 自動生成されたメソッド・スタブ

    }

}

