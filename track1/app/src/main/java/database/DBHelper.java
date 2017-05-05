package database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by lacorp on 5/12/2016.
 */
public class DBHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "db_track";
    public static final String USER_TABLE_NAME = "tb_user";
    public static final String USER_COLUMN_ID = "id_user";
    public static final String USER_COLUMN_USERNAME = "username";
    public static final String USER_COLUMN_PASSWORD = "password";
    public static final String USER_COLUMN_STATUS = "status";

    public DBHelper(Context context){
        super(context, DATABASE_NAME , null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table tb_user "+
                "(id_user int(11) primary key, username varchar(50), password varchar(100), stastus enum('active','inactive', id_driver int(5))"
        );
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS tb_user");
        onCreate(db);
    }
}
