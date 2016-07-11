package com.app1.rakuyou.hyouteikun;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase.CursorFactory;

public class MyDBHelper extends SQLiteOpenHelper {

    //「dbtest」テーブルの作成用SQL
    private static final String CREATE_TABLE_SQL = "" +
            "create table hyoutei (" +
            "rowid integer primary key autoincrement, " +
            "data text not null " +
            ")";

    //「dbtest」テーブルの削除用SQL
    private static final String DROP_TABLE_SQL = "drop table if exists hyoutei";

    /**
     * コンストラクタ
     * @param context
     * @param name
     * @param factory
     * @param version
     */
    public MyDBHelper(
            Context context,
            String name,
            CursorFactory factory,
            int version) {

        super(context, name, factory, version);
    }


     // テーブルの生成
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE_SQL);
    }


     // テーブルの再作成
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(DROP_TABLE_SQL);
    }

}