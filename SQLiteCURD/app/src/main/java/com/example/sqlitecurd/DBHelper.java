package com.example.sqlitecurd;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {

    public DBHelper(Context context) {
        super(context, "DataDB.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create Table DataDB(Name TEXT Primary Key, Degree TEXT, Age TEXT)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("drop Table if exists DataDB ");

    }

    public Boolean InsertData(String name,String deg,String age){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues cv=new ContentValues();
        cv.put("Name",name);
        cv.put("Degree",deg);
        cv.put("Age",age);
        long result=db.insert("DataDB",null,cv);
        if(result==-1){
            return false;
        }
        else
            return true;

    }

    public Boolean DeleteData(String name){
        SQLiteDatabase db=this.getWritableDatabase();

        Cursor cur= db.rawQuery("Select * from DataDB where name=?",new String[] {name});
        if(cur.getCount()>0)
        {
            long result=db.delete("DataDB","name=?",new String[]{name});
            if(result==-1){
                return false;
            }
            else
                return true;
        }
        else
            return false;

    }

    public Boolean UpdateData(String name,String deg,String age){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues cv=new ContentValues();

        cv.put("Degree",deg);
        cv.put("Age",age);

        Cursor cur= db.rawQuery("Select * from DataDB where name=?",new String[] {name});
        if(cur.getCount()>0)
        {
            long result=db.update("DataDB",cv,"name=?",new String[]{name});
            if(result==-1){
                return false;
            }
            else
                return true;
        }
        else
            return false;

    }

    public Cursor getData(){
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor cur=db.rawQuery("Select * from DataDB",null);
        return cur;
    }

}