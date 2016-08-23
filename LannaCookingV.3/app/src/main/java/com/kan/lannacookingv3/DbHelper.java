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
                "VALUES ('001', 'ข้าวซอยไก่', " +
                "'1.\tน่องไก่\t   1\tกิโลกรัม\n" + "2.\tเส้นข้าวซอย\t1/2\tกิโลกรัม\n" + "3.\tน้ำมันพืช\t   1\tถ้วย\n" + "4.\tกะทิ\t     3\tถ้วย\n" + "5.\tพริกแห้ง\t   10\tเม็ด\n" + "6.\tกระเทียม\t   10\tกลีบ\n" + "7.\tหอมแดง\t   10\tหัว\n" + "8.\tผิวมะกรูด\t  1\tลูก\n" + "9.\tกระชาย\t   5\tหัว\n" + "10.\tขมิ้น\t     2\tชิ้น\n" + "11.\tตะไคร้ซอย\t2\tช้อนโต๊ะ\n" + "12.\tน้ำตาลปี๊บ\t 2\tช้อนโต๊ะ\n" + "13.\tกะปิ\t     3\tช้อนโต๊ะ\n" + "14.\tผงกะหรี่\t   1\tช้อนโต๊ะ'," +
                "'1.โขลกเครื่องแกงรวมกันให้ละเอียด\n" +
                "2.ตั้งน้ำกะทิประมาณ 1 ถ้วย พอเดือด\n" +
                "3.ใส่เครื่องแกงผัดจนหอม \n" +
                "4.ใส่ผงกะหรี่ละลายน้ำเล็กน้อย\n" +
                "5.ใส่ไก่ผัดให้เข้ากันเติมน้ำเล็กน้อยใส่น้ำตาลปี๊บแล้วเติมกะทิเคี่ยวต่อจนไก่นุ่ม\n" +
                "6.ตั้งกระทะใส่น้ำมันพืชพอร้อนใส่เส้นข้าวซอยที่คลี่ออกจากกันแล้วทอดพอเหลืองกรอบเพื่อทำเส้นกรอบสำหรับโรยหน้า \n" +
                "7.ลวกเส้นข้าวซอยกับน้ำเดือดประมาณ 1 นาที แล้วนำมาลวกในน้ำเย็น',"+
                "'ข้าวซอยปรุงได้ทั้งเนื้อไก่ เนื้อวัว สำหรับการทำข้าวซอยเนื้อ สำหรับการทำข้าวซอยเนื้อควรหั่นเป็นชิ้นพอคำ ต้มให้เปื่อยก่อน แล้วนำไปเคี่ยวกับเครื่องแกง\n" +
                "\n" +
                "เคล็ดลับในการเลือกส่วนผสม\n" +
                "การเลือกเนื้อไก่ ควรเลือกน่องและสะโพก สำหรับข้าวซอยเนื้อ ควรใช้เนื้อสันคอ','kkd');";
        db.execSQL(SQLText);





















    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
