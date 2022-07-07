package com.example.healthy_app;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.EditText;
/**
 * This class provides some (basic) database functionality.
 */
public class databaseHelper extends SQLiteOpenHelper {
    private static String databaseName="DBase";
    SQLiteDatabase usersDB;

    Register Reg=new Register();

    public databaseHelper(Context context){
        super(context, databaseName,null,1);
    }

    @Override
    public void onCreate(SQLiteDatabase db){
        db.execSQL("create table users (id integer primary key,"+
                "email text not null , password text)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db,int oldversion,int newVersion){
        db.execSQL("drop table if exists users");
        onCreate(db);
    }

    public void createNewUser (String email, String Pass)
    {
        ContentValues row= new ContentValues();
        row.put("email",email);
        row.put("password",Pass);
        usersDB=getWritableDatabase();
        usersDB.insert("users",null,row);
        usersDB.close();
    }

    public boolean isEmpty(EditText etText)
    {
        if (etText.getText().toString().trim().length()>0)
            return false;

        return true;
    }

    public boolean VerifyUser(String eemail,String userP)
    {
        usersDB=getReadableDatabase();
        String Query="select email, password from users where email='"+eemail+"' and password='"+userP+"'";
        Cursor cursor=null;
        try
        {
            cursor = usersDB.rawQuery(Query, null);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        if (cursor!=null&&cursor.getCount()>0)
        {
            cursor.close();
            return true;
        }
        else
        {
            cursor.close();
            return false;
        }

    }

}