package com.example.administrator.marimo.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by jeongyeoeun on 24/02/2018.
 * description : database for all habit
 */

public class AllHabitDBHelper extends SQLiteOpenHelper {
    public AllHabitDBHelper(Context context) {
        super(context, "all_hablit.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table all_habit(" +
                "  all_no Integer primary key," +
                "  title TEXT not null," +
                "  content TEXT not null," +
                "  category TEXT not null"+
                ");");

        // sample data
        db.execSQL("insert into all_habit values (null, '거북목','11111','생활습관');");
        db.execSQL("insert into all_habit values (null, '거북목2','1222','운동');");
        db.execSQL("insert into all_habit values (null, '거북목3','1133','건강');");
        db.execSQL("insert into all_habit values (null, '거북목4','14441','습관1');");
        db.execSQL("insert into all_habit values (null, '거북목5','11551','습관2');");
        db.execSQL("insert into all_habit values (null, '거북목6','11661','습관3');");

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
