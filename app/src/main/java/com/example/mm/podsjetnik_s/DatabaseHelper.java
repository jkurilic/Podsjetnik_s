package com.example.mm.podsjetnik_s;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;


    public class DatabaseHelper extends SQLiteOpenHelper {
        private static final String TAG = "DatabaseHelper";
        private static  final String DATABASE_NAME = "lijekovi.db";
        private static final String TABLE_NAME = "lijekovi";
        private static final String COL1 = "Sifra_lijeka";
        private static final String COL2 = "Naziv_lijeka";
        private static final String COL3 = "Cijena_lijeka";
        private static final String COL4 = "Lista_lijeka";
        private static final String COL5 = "Ponavljanje_lijeka";
        private static final String COL6 = "Oblik_lijeka";
        private static final String COL7 = "Jedinice_lijeka";

        public DatabaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
            super(context,DATABASE_NAME , null, 1);
        }
        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            db.execSQL("DROP TABLE IF EXISTS "+ TABLE_NAME);
            onCreate(db);
        }
        @Override
        public void onCreate(SQLiteDatabase db) {
            db.execSQL("create table " + TABLE_NAME+" (Sifra_lijeka INTEGER PRIMARY KEY AUTOINCREMENT," +
                    "Naziv_lijeka TEXT, Cijena_lijeka TEXT, Lista_lijeka TEXT, Ponavljanje_lijeka TEXT, " +
                    "Oblik_lijeka TEXT, Jedinice_lijeka TEXT)");

        }
        public boolean addData(String item){
            SQLiteDatabase db= this.getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put(COL2, Naziv_lijeka);
            contentValues.put(COL3, Cijena_lijeka);
            contentValues.put(COL4, Lista_lijeka);
            contentValues.put(COL5, Ponavljanje_lijeka);
            contentValues.put(COL6, Oblik_lijeka);
            contentValues.put(COL7, Jedinice_lijeka);
            Log.d(TAG, "addData: Dodavanje " + item + " u" + TABLE_NAME);

            long rezultat= db.insert(TABLE_NAME, null, contentValues);

            if(rezultat == -1){
                return false;
            } else {
                return true;
            }
        }

        public Cursor getAllData(){
            SQLiteDatabase db= this.getWritableDatabase();
            Cursor res= db.rawQuery("select * from "+TABLE_NAME,null);
            return res;
        }

    }
