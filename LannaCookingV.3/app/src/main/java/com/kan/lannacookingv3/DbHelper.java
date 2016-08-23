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
                "'1.\tน่องไก่\t1\tกิโลกรัม\n " + "2.\tเส้นข้าวซอย\t1/2\tกิโลกรัม\n" +
                "3.\tน้ำมันพืช\t1\tถ้วย\n" + "4.\tกะทิ\t3\tถ้วย\n" +
                "5.\tพริกแห้ง\t10\tเม็ด\n" + "6.\tกระเทียม\t10\tกลีบ\n" +
                "7.\tหอมแดง\t10\tหัว\n" + "8.\tผิวมะกรูด\t1\tลูก\n" +
                "9.\tกระชาย\t5\tหัว\n" + "10.\tขมิ้น\t2\tชิ้น\n" +
                "11.\tตะไคร้ซอย\t2\tช้อนโต๊ะ\n" + "12.\tน้ำตาลปี๊บ\t2\tช้อนโต๊ะ\n" +
                "13.\tกะปิ\t3\tช้อนโต๊ะ\n" + "14.\tผงกะหรี่\t1\tช้อนโต๊ะ'," +

                "'1.โขลกเครื่องแกงรวมกันให้ละเอียด\n" + "2.ตั้งน้ำกะทิประมาณ 1 ถ้วยพอเดือด\n" +
                "3.ใส่เครื่องแกงผัดจนหอม \n" + "4.ใส่ผงกะหรี่ละลายน้ำเล็กน้อย\n" +
                "5.ใส่ไก่ผัดให้เข้ากันเติมน้ำเล็กน้อยใส่น้ำตาลปี๊บแล้วเติมกะทิเคี่ยวต่อจนไก่นุ่ม\n" + "6.ตั้งกระทะใส่น้ำมันพืชพอร้อนใส่เส้นข้าวซอยที่คลี่ออกจากกันแล้วทอดพอเหลืองกรอบเพื่อทำเส้นกรอบสำหรับโรยหน้า \n" +
                "7.ลวกเส้นข้าวซอยกับน้ำเดือดประมาณ 1 นาทีแล้วนำมาลวกในน้ำเย็น',"+

                "'ข้าวซอยปรุงได้ทั้งเนื้อไก่ เนื้อวัว สำหรับการทำข้าวซอยเนื้อ สำหรับการทำข้าวซอยเนื้อควรหั่นเป็นชิ้นพอคำ ต้มให้เปื่อยก่อน แล้วนำไปเคี่ยวกับเครื่องแกง\n" + "\n" +
                "เคล็ดลับในการเลือกส่วนผสม\n" + "การเลือกเนื้อไก่ ควรเลือกน่องและสะโพก สำหรับข้าวซอยเนื้อ ควรใช้เนื้อสันคอ','IMG');";
        db.execSQL(SQLText);

        SQLText = "INSERT INTO cooking (id, name, item, step,trick, img)" +
                "VALUES ('002', 'แกงผักแว่น', " +
                "'1.\tผักแว่น\t100\tกรัม\n" + "2.\tเห็ดฟาง\t200\tกรัม\n" +
                "3.\tพริกหนุ่มย่าง\t2\tเม็ด\n" + "4.\tพริกหนุ่ม\t3\tเม็ด\n" +
                "5.\tกระเทียม\t5\tกลีบ\n" + "6.\tกะปิ\t1\tช้อนโต๊ะ'," +

                "'1.โขลกพริกหนุ่มกระเทียมกะปิรวมกันให้ละเอียด\n" + "2.ต้มน้ำพอเดือดละลายเครื่องแกงในน้ำเดือด \n" +
                "3.ใส่เห็ดต้มจนเห็ดสุก\n" + "4.ใส่ผักแว่นพอเดือดปิดไฟ ',"+

                "'ควรย่างพริกหนุ่มกับถ่านไม้จะทำให้แกงหอม\nอร่อย\n" +
                "ปรุงรสด้วยซีอิ้วขาวนิดหน่อยไม่ควรใส่น้ำปลา\nเพราะจะทำให้มีกลิ่นคาว','IMG');";
        db.execSQL(SQLText);

        SQLText = "INSERT INTO cooking (id, name, item, step,trick, img)" +
                "VALUES ('003', 'แกงมะรุม', " +
                "'1.\tมะรุม\t2\tถ้วย\n" + "2.\tปลาแห้ง\t50\tกรัม\n" +
                "3.\tชะอมเด็ด\t1/2\tถ้วย\n" + "4.\tชะพลูหั่นหยาบ\t1/2\tถ้วย\n" +
                "5.\tพริกขี้หนูแห้ง\t10\tเม็ด\n" + "6.\tกระเทียม\t10\tกลีบ\n" +
                "7.\tหอมแดง\t3\tหัว\n" + "8.\tข่าหั่น\t1\tช้อนโต๊ะ\n" +
                "9.\tตะไคร้หั่น\t1\tช้อนโต๊ะ\n" + "10.\tกะปิ\t1/2\tช้อนโต๊ะ\n" +
                "11.\tปลาร้าต้มสุก\t1/2\tช้อนโต๊ะ\n" + "12.\tเกลือ\t1/2\tช้อนชา'," +

                "'1.ปอกเปลือกมะรุมหั่นเป็นท่อนพักไว้ \n" + "2.โขลกเครื่องแกงรวมกันให้ละเอียด\n" +
                "3.ผัดเครื่องแกงให้หอมเติมน้ำพอเดือด\nใส่ปลาแห้ง \n" + "4.ต้มพอให้ปลานุ่มใส่มะรุมต้มจนสุกนิ่ม\n" +
                "5.ใส่ชะอมใบชะพลูพอผักสุกปิดไฟ\n',"+

                "'','IMG');";
        db.execSQL(SQLText);

        SQLText = "INSERT INTO cooking (id, name, item, step,trick, img)" +
                "VALUES ('004', 'แกงขนุน', " +
                "'1.\tขนุนอ่อน\t300\tกรัม\n" + "2.\tซี่โครงหมูสับ\t100\tกรัม\n" +
                "3.\tมะเขือเทศลูกเล็ก\t5\tลูก\n" + "4.\tชะอมเด็ด\t1/2\tถ้วย\n" +
                "5.\tชะพลูหั่นหยาบ\t1/2\tถ้วย\n" + "6.\tพริกแห้ง\t5\tเม็ด\n" +
                "7.\tกระเทียม\t5\tกลีบ\n" + "8.\tหอมแดง\t5\tหัว\n" +
                "9.\tกะปิ\t1\tช้อนชา\n" + "10.\tเกลือ\t1\tช้อนชา'," +

                "'1.โขลกเครื่องแกงรวมกันให้ละเอียด\n" + "2.ต้มน้ำเปล่าพอเดือดละลายเครื่องแกง\nลงในน้ำเดือด \n" +
                "3.ใส่ซี่โครงหมูต้มจนหมูนุ่ม\n" + "4.ใส่ขนุนต้มให้ขนุนนิ่ม\n" +
                "5.ใส่มะเขือเทศชะอมและใบชะพลูคนให้เข้ากันพอผักสุกปิดไฟ\n',"+

                "'เมื่อแกงสุกแล้วไม่ควรปิดฝาหม้อทันที ทิ้งไว้สักครู่ให้แกงเย็นลงบ้าง เพื่อให้ใบชะพลูและใบชะอมไม่สุกจนเกินไป จะทำให้รสชาติแกงไม่กลมกล่อม\n" +
                "\n" + "เคล็ดลับในการเลือกส่วนผสม\n" +
                "ขนุนต้องใช้ขนุนอ่อนที่เม็ดยังไม่แก่ จึงจะทำให้ขนุนเปื่อยง่าย ควรเลือกขนุนอ่อนพันธุ์ทวายทั้งปี หรือพันธ์อื่นๆ ที่มีเนื้อแน่น รสชาติของน้ำแกงจะกลมกล่อมยิ่งขึ้น','IMG');";
        db.execSQL(SQLText);





















    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
