package appewtc.masterung.newssrodegat;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by masterUNG on 8/27/15 AD.
 */
public class NewsTABLE {

    //Explicit
    private MyOpenHelper objMyOpenHelper;
    private SQLiteDatabase writeSqLiteDatabase, readSqLiteDatabase;

    public static final String NEWS_TABLE = "newsTABLE";
    public static final String COLUMN_ID_NEWS = "_id";
    public static final String COLUMN_DATE = "Date";
    public static final String COLUMN_HEAD = "Head";
    public static final String COLUMN_DETAIL = "Detail";
    public static final String COLUMN_IMAGE = "Image";
    public static final String COLUMN_OWNER = "Owner";

    public NewsTABLE(Context context) {

        objMyOpenHelper = new MyOpenHelper(context);
        writeSqLiteDatabase = objMyOpenHelper.getWritableDatabase();
        readSqLiteDatabase = objMyOpenHelper.getReadableDatabase();

    }   // Constructor

    public String[] readAllDate() {

        String strDate[] = null;
        Cursor objCursor = readSqLiteDatabase.query(NEWS_TABLE,
                new String[]{COLUMN_ID_NEWS, COLUMN_DATE},
                null, null, null, null, null);

        if (objCursor != null) {

            objCursor.moveToFirst();
            strDate = new String[objCursor.getCount()];
            for (int i = 0; i < objCursor.getCount(); i++) {

                strDate[i] = objCursor.getString(objCursor.getColumnIndex(COLUMN_DATE));
                objCursor.moveToNext();

            }   //for

        }   // if
        objCursor.close();

        return strDate;
    }   // readAllDate

    public String[] readAllHead() {

        String strDate[] = null;
        Cursor objCursor = readSqLiteDatabase.query(NEWS_TABLE,
                new String[]{COLUMN_ID_NEWS, COLUMN_HEAD},
                null, null, null, null, null);

        if (objCursor != null) {

            objCursor.moveToFirst();
            strDate = new String[objCursor.getCount()];
            for (int i = 0; i < objCursor.getCount(); i++) {

                strDate[i] = objCursor.getString(objCursor.getColumnIndex(COLUMN_HEAD));
                objCursor.moveToNext();

            }   //for

        }   // if
        objCursor.close();

        return strDate;
    }   // readAllHead

    public String[] readAllDetail() {

        String strDate[] = null;
        Cursor objCursor = readSqLiteDatabase.query(NEWS_TABLE,
                new String[]{COLUMN_ID_NEWS, COLUMN_DETAIL},
                null, null, null, null, null);

        if (objCursor != null) {

            objCursor.moveToFirst();
            strDate = new String[objCursor.getCount()];
            for (int i = 0; i < objCursor.getCount(); i++) {

                strDate[i] = objCursor.getString(objCursor.getColumnIndex(COLUMN_DETAIL));
                objCursor.moveToNext();

            }   //for

        }   // if
        objCursor.close();

        return strDate;
    }   // readAllDetail

    public String[] readAllImage() {

        String strDate[] = null;
        Cursor objCursor = readSqLiteDatabase.query(NEWS_TABLE,
                new String[]{COLUMN_ID_NEWS, COLUMN_IMAGE},
                null, null, null, null, null);

        if (objCursor != null) {

            objCursor.moveToFirst();
            strDate = new String[objCursor.getCount()];
            for (int i = 0; i < objCursor.getCount(); i++) {

                strDate[i] = objCursor.getString(objCursor.getColumnIndex(COLUMN_IMAGE));
                objCursor.moveToNext();

            }   //for

        }   // if
        objCursor.close();

        return strDate;
    }   // readAllImage

    public String[] readAllOwner() {

        String strDate[] = null;
        Cursor objCursor = readSqLiteDatabase.query(NEWS_TABLE,
                new String[]{COLUMN_ID_NEWS, COLUMN_OWNER},
                null, null, null, null, null);

        if (objCursor != null) {

            objCursor.moveToFirst();
            strDate = new String[objCursor.getCount()];
            for (int i = 0; i < objCursor.getCount(); i++) {

                strDate[i] = objCursor.getString(objCursor.getColumnIndex(COLUMN_OWNER));
                objCursor.moveToNext();

            }   //for

        }   // if
        objCursor.close();

        return strDate;
    }   // readAllOwner






    public long addNews(String strDate, String strHead, String strDetail,
                        String strImage, String strOwner) {

        ContentValues objContentValues = new ContentValues();
        objContentValues.put(COLUMN_DATE, strDate);
        objContentValues.put(COLUMN_HEAD, strHead);
        objContentValues.put(COLUMN_DETAIL, strDetail);
        objContentValues.put(COLUMN_IMAGE, strImage);
        objContentValues.put(COLUMN_OWNER, strOwner);
        return writeSqLiteDatabase.insert(NEWS_TABLE, null, objContentValues);
    }   // addNews


}   // Main Class
