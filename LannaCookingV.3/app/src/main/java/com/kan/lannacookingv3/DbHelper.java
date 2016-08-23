package com.kan.lannacookingv3;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Kanty on 20/8/2559.
 */
public class DbHelper extends SQLiteOpenHelper {
    private static final String databaseName = "LannaCooking.sqlte";
    private static final int databaseVersion = 2;
    private Context myContext;



    public DbHelper(Context context) {
        super(context, databaseName, null, databaseVersion);

        this.myContext = context;
        int kkd = myContext.getResources().getIdentifier("kkd","drawable",context.getPackageName());

    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        //ทำตาราง cooking
        String SQLText = "CREATE TABLE cooking ("+
                "id TEXT PRIMARY KEY," +
                "name TEXT," +
                "item TEXT," +
                "step TEXT," +
                "trick TEXT," +
                "img TEXT);";
        db.execSQL(SQLText);

        SQLText = "INSERT INTO cooking (id, name, item, step,trick, img)" +
                "VALUES ('001', 'แกงกระด้าง', " +
                "'1.ขาหมู\t300\tกรัม\n" +
                "2.กระเทียม\t20\tกลีบ\n" +
                "3.พริกไทย\t1/2\tช้อนโต๊ะ\n" +
                "4.รากผักชี\t3\tราก\n" +
                "5.ผักชี\t1\tช้อนโต๊ะ\n" +
                "6.ต้นหอม\t1\tช้อนโต๊ะ\n" +
                "7.เกลือ\t1/2\tช้อนชา\n'," +
                "'1. ล้างขาหมูให้สะอาด เลาะเอากระดูกออก หั่นเป็นชิ้นเล็กๆ\n\n" +
                "2. นำขาหมูที่หั่นแล้วไปต้ม เคี่ยวด้วยไฟอ่อนๆ ประมาณ 1 ชั่วโมง\n\n" +
                "3. โขลกกระเทียม พริกไทย และรากผักชี รวมกันให้ละเอียด\n\n" +
                "4. ใส่ส่วนผสมที่โขลกลงในหม้อต้มขาหมู ตามด้วยเกลือ ต้มต่อสักครู่\n\n" +
                "5. เทใส่ถาด นำใส่ตู้เย็น จนแข็งตัว หรือในหน้าหนาว ทิ้งไว้ค้างคืน แกงจะแข็งตัวเอง โรยหน้าด้วยผักชีซอยและต้นหอมซอย\n', 'ขาหมูควรเผาไฟก่อน เพื่อให้ขนหลุดออกง่าย\nขาหมู ควรสดและใหม่ เลือกที่หนังไม่หนาเกินไป','kkd');";
        db.execSQL(SQLText);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
