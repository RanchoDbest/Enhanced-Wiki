package com.rancho.enhancedwiki.SQLHelper;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.rancho.enhancedwiki.Entities.EventEntity;

import java.util.ArrayList;

/**
 * Created by Rancho on 20-04-2016.
 */
public class DBHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "enwiki";
    private static final int DATABASE_VERSION = 1;

    private static final String TABLE_events = "events";

    public DBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);

    }
    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
    public ArrayList<EventEntity> GetAllEvent(){
        ArrayList<EventEntity> eventList = new ArrayList<EventEntity>();

       String selectQuery="SELECT * FROM"+TABLE_events;

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        if (cursor.moveToFirst()) {
            do {

                EventEntity event = new EventEntity();
                event.setEventId(cursor.getInt(0));
                event.setEventDate(cursor.getString(1));
                event.setEventDescription(cursor.getString(2));

                eventList.add(event);
            }
                while (cursor.moveToNext()) ;
            }

            return eventList;

    }

//    public ArrayList<EventEntity> GetAllEvent() {
//    }
}
