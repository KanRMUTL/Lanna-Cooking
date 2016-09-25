package com.kan.lannacookingv3;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DbHelper extends SQLiteOpenHelper {
    private static final String databaseName = "LannaCooking.sqlte";
    private static final int databaseVersion = 5;
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
                "information TEXT," +
                "item TEXT," +
                "step TEXT," +
                "trick TEXT," +
                "img TEXT);";
        db.execSQL(SQLText);

        SQLText = "INSERT INTO cooking (id, name, information, item, step,trick, img)" +
                "VALUES ('001', 'ข้าวซอยไก่', " +
                "'ข้าวซอยเป็นอาหารชนิดหนึ่งซึ่งมีที่มาจากอาหารของชาวมุสลิมโดยชาวจีนฮ่อมุสลิมซึ่งบางแห่งเรียกชื่อเต็มว่าข้าวซอยฮ่อหรือข้าวซอยอิสลามดังนั้นข้าวซอยจึงใช้เนื้อไก่และเนื้อวัวเป็นส่วนผสม', " +
                "'1.\tน่องไก่\t1\tกิโลกรัม\n" + "2.\tเส้นข้าวซอย\t1/2\tกิโลกรัม\n" +
                "3.\tน้ำมันพืช\t1\tถ้วย\n" + "4.\tกะทิ\t3\tถ้วย\n" +
                "5.\tพริกแห้ง\t10\tเม็ด\n" + "6.\tกระเทียม\t10\tกลีบ\n" +
                "7.\tหอมแดง\t10\tหัว\n" + "8.\tผิวมะกรูด\t1\tลูก\n" +
                "9.\tกระชาย\t5\tหัว\n" + "10.\tขมิ้น\t2\tชิ้น\n" +
                "11.\tตะไคร้ซอย\t2\tช้อนโต๊ะ\n" + "12.\tน้ำตาลปี๊บ\t2\tช้อนโต๊ะ\n" +
                "13.\tกะปิ\t3\tช้อนโต๊ะ\n" + "14.\tผงกะหรี่\t1\tช้อนโต๊ะ'," +

                "'1.โขลกเครื่องแกงรวมกันให้ละเอียด\n" +
                "2.ตั้งน้ำกะทิประมาณ 1 ถ้วยพอเดือด\n" +
                "3.ใส่เครื่องแกงผัดจนหอม \n" +
                "4.ใส่ผงกะหรี่ละลายน้ำเล็กน้อย\n" +
                "5.ใส่ไก่ผัดให้เข้ากันเติมน้ำเล็กน้อยใส่น้ำตาลปี๊บแล้วเติมกะทิเคี่ยวต่อจนไก่นุ่ม\n" +
                "6.ตั้งกระทะใส่น้ำมันพืชพอร้อนใส่เส้นข้าวซอยที่คลี่ออกจากกันแล้วทอดพอเหลืองกรอบเพื่อทำเส้นกรอบสำหรับโรยหน้า\n" +
                "7.ลวกเส้นข้าวซอยกับน้ำเดือดประมาณ 1 นาทีแล้วนำมาลวกในน้ำเย็น',"+

                "'ข้าวซอยปรุงได้ทั้งเนื้อไก่ เนื้อวัว สำหรับการทำข้าวซอยเนื้อ สำหรับการทำข้าวซอยเนื้อควรหั่นเป็นชิ้นพอคำต้มให้เปื่อยก่อนแล้วนำไปเคี่ยวกับเครื่องแกง"+
                "การเลือกเนื้อไก่ควรเลือกน่องและสะโพก สำหรับข้าวซอยเนื้อควรใช้เนื้อสันคอ','ksk.jpg');";
        db.execSQL(SQLText);

        SQLText = "INSERT INTO cooking (id, name, information, item, step,trick, img)" +
                "VALUES ('002', 'แกงผักแว่น', " +
                "'แกงผักแว่นนิยมแกงง่ายๆใส่เห็ดฟางไม่ใส่เนื้อปลาหรือเนื้อสัตว์ใดๆ กลิ่นหอมชวนรับประทานของแกงมาจากพริกหนุ่มย่างถ่านไม้บางสูตรใส่ปลาเช่นเดียวกับแกง" +
                "ผักกาด แกงผักปลัง บางสูตรใส่แต่พริกหนุ่มย่างไฟไม่ใช้พริกหนุ่มเป็นเครื่องแกง', " +
                "'1.\tผักแว่น\t100\tกรัม\n" + "2.\tเห็ดฟาง\t200\tกรัม\n" +
                "3.\tพริกหนุ่มย่าง\t2\tเม็ด\n" + "4.\tพริกหนุ่ม\t3\tเม็ด\n" +
                "5.\tกระเทียม\t5\tกลีบ\n" + "6.\tกะปิ\t1\tช้อนโต๊ะ'," +

                "'1.โขลกพริกหนุ่มกระเทียมกะปิรวมกันให้ละเอียด\n" +
                "2.ต้มน้ำพอเดือดละลายเครื่องแกงในน้ำเดือด \n" +
                "3.ใส่เห็ดต้มจนเห็ดสุก\n" +
                "4.ใส่ผักแว่นพอเดือดปิดไฟ ',"+

                "'ควรย่างพริกหนุ่มกับถ่านไม้จะทำให้แกงหอมอร่อย" +
                "ปรุงรสด้วยซีอิ้วขาวนิดหน่อยไม่ควรใส่น้ำปลาเพราะจะทำให้มีกลิ่นคาว','kpv.jpg');";
        db.execSQL(SQLText);

        SQLText = "INSERT INTO cooking (id, name, information, item, step,trick, img)" +
                "VALUES ('003', 'แกงมะรุม', " +
                "'แกงมะรุม หรือแกงบ่าค้อนก้อม ใช้ฝักมะรุม หรือบ่าค้อนก้อมเป็นผักแกง นิยมแกงกับปลาแห้งหรือกระดูกหมู มีวิธีการแกงเช่นเดียวกับแกงผักเสี้ยว แกงผักหวาน แกงผักเซียงดา สูตรนี้ใช้วิธีผัดเครื่องแกงกับน้ำเล็กน้อย พอให้เครื่องหอม จึงเติมน้ำลงไป ใส่ผักชะอมและใบชะพลูลงด้วย เพื่อให้แกงหอม รสชาติกลมกล่อมยิ่งขึ้น', " +
                "'1.\tมะรุม\t2 \tถ้วย\n" + "2.\tปลาแห้ง\t50\tกรัม\n" +
                "3.\tชะอมเด็ด\t1/2\tถ้วย\n" + "4.\tชะพลูหั่นหยาบ\t1/2\tถ้วย\n" +
                "5.\tพริกขี้หนูแห้ง\t10\tเม็ด\n" + "6.\tกระเทียม\t10\tกลีบ\n" +
                "7.\tหอมแดง\t3\tหัว\n" + "8.\tข่าหั่น\t1\tช้อนโต๊ะ\n" +
                "9.\tตะไคร้หั่น\t1\tช้อนโต๊ะ\n" + "10.\tกะปิ\t1/2\tช้อนโต๊ะ\n" +
                "11.\tปลาร้าต้มสุก\t1/2\tช้อนโต๊ะ\n" + "12.\tเกลือ\t1/2\tช้อนชา'," +

                "'1.ปอกเปลือกมะรุมหั่นเป็นท่อนพักไว้ \n" + "2.โขลกเครื่องแกงรวมกันให้ละเอียด\n" +
                "3.ผัดเครื่องแกงให้หอมเติมน้ำพอเดือด\nใส่ปลาแห้ง \n" + "4.ต้มพอให้ปลานุ่มใส่มะรุมต้มจนสุกนิ่ม\n" +
                "5.ใส่ชะอมใบชะพลูพอผักสุกปิดไฟ\n',"+

                "'','kmr.jpg');";
        db.execSQL(SQLText);


        SQLText = "INSERT INTO cooking (id, name, information, item, step,trick, img)" +
                "VALUES ('004', 'แกงขนุน', " +
                "'แกงขนุน หรือ แกงบ่าหนุน ถือว่าเป็นแกงที่มีชื่อเป็นมงคล บางท่านนิยมแกงกินในงานแต่งงาน เพื่อเป็นเคล็ดว่าให้คู่แต่งงานนั้นมีความเกื้อหนุนจุนเจือต่อกัน และในวันปากปี คือหลังวันเถลิงศก (วันพญาวัน) หนึ่งวัน บางแห่งนิยมใส่ข่า ตะไคร้ทุบ และอาจมีจักข่าน (สะค้าน) บ่าแขว่น (ผลกำจัด) โขลกใส่ลงไปในแกงด้วย', " +
                "'1.\tขนุนอ่อน\t300\tกรัม\n" + "2.\tซี่โครงหมูสับ\t100\tกรัม\n" +
                "3.\tมะเขือเทศลูกเล็ก\t5\tลูก\n" + "4.\tชะอมเด็ด\t1/2\tถ้วย\n" +
                "5.\tชะพลูหั่นหยาบ\t1/2\tถ้วย\n" + "6.\tพริกแห้ง\t5\tเม็ด\n" +
                "7.\tกระเทียม\t5\tกลีบ\n" + "8.\tหอมแดง\t5\tหัว\n" +
                "9.\tกะปิ\t1\tช้อนชา\n" + "10.\tเกลือ\t1\tช้อนชา'," +

                "'1.โขลกเครื่องแกงรวมกันให้ละเอียด\n" + "2.ต้มน้ำเปล่าพอเดือดละลายเครื่องแกงลงในน้ำเดือด \n" +
                "3.ใส่ซี่โครงหมูต้มจนหมูนุ่ม\n" + "4.ใส่ขนุนต้มให้ขนุนนิ่ม\n" +
                "5.ใส่มะเขือเทศชะอมและใบชะพลูคนให้เข้ากันพอผักสุกปิดไฟ\n',"+

                "'เมื่อแกงสุกแล้วไม่ควรปิดฝาหม้อทันที ทิ้งไว้สักครู่ให้แกงเย็นลงบ้าง เพื่อให้ใบชะพลูและใบชะอมไม่สุกจนเกินไป จะทำให้รสชาติแกงไม่กลมกล่อม\n" +
                "ขนุนต้องใช้ขนุนอ่อนที่เม็ดยังไม่แก่ จึงจะทำให้ขนุนเปื่อยง่าย ควรเลือกขนุนอ่อนพันธุ์ทวายทั้งปี หรือพันธ์อื่นๆ ที่มีเนื้อแน่น รสชาติของน้ำแกงจะกลมกล่อมยิ่งขึ้น','kkn.jpg');";
        db.execSQL(SQLText);

        SQLText = "INSERT INTO cooking (id, name, information, item, step,trick, img)" +
                "VALUES ('005', 'จอผักกาด', " +
                "'จอผักกาดเป็นตำรับอาหารที่ใช้ผักกาดกวางตุ้งที่กำลังออกดอกหรือเรียกว่าผัก" +
                "กาดจ้อนหรือผักกาดดอกซึ่งปรุงด้วยเกลือกะปิปลาร้าหรือกะปิปรุงรสด้วยน้ำมะขามเปียก" +
                "หรือมะขามสดใส่กระดูกหมูด้วยก็ได้ซึ่งบางแห่งนิยมใส่น้ำอ้อยลงไปด้วยบางสูตรใส่ถั่วเน่าแข็บ" +
                "หรือถั่วเน่าแผ่นย่างไฟนิยมรับประทานกับพริกแห้งทอดตัดเป็นท่อนโรยหน้าแกงหรือรับประทานต่างหากแล้วแต่ชอบ', " +
                "'1.\tผักกาดกวางตุ้ง\t1\tกิโลกรัม\n" + "2.\tซี่โครงหมู\t400\tกรัม\n" +
                "3.\tหอมแดง\t5\tหัว\n" + "4.\tกระเทียม\t10\tกลีบ\n" +
                "5.\tถั่วเน่าแข็บย่างไฟ\t2\tแผ่น\n" + "6.\tกะปิ\t2\tช้อนโต๊ะ\n" +
                "7.\tน้ำมะขามเปียก\t3\tช้อนโต๊ะ\n" + "8.\tเกลือป่น\t1\tช้อนชา\n" +
                "9.\tน้ำมันพืช\t2\tช้อนโต๊ะ'," +

                "'1. ต้มน้ำเปล่า พอเดือด ใส่ซี่โครงหมูสับ ต้มจนกระทั่งหมูนุ่ม\n" + "2. โขลกกระเทียม หอมแดง กะปิ เกลือ รวมกันให้ละเอียด ใส่ลงในหม้อต้มซี่โครงหมู \n" +
                "3. พอเดือด ใส่ผักกวางตุ้งเด็ดเป็นท่อน \n" + "4. พอผักนุ่ม ใส่ถั่วเน่าแผ่นโขลกละเอียด \n" +
                "5. ใส่น้ำมะขามเปียก คนให้ทั่ว พอเดือด ปิดไฟ\n" +
                "6. ตั้งกระทะใส่น้ำมัน พอร้อน ใส่พริกขี้หนูแห้งลงทอด พอกรอบ ตักขึ้น ใส่กระเทียมสับ เจียวให้เหลือง เททั้งกระเทียมเจียวและน้ำมัน ใส่หม้อจอผักกาด (จ่าว) คนให้เข้ากัน',"+

                "'บางสูตรใส่ปลาร้า หรือบางสูตรใส่น้ำอ้อยเพื่อให้มีรสหวาน" +
                "ถ้าใช้มะขามสด ให้ลวก หรือเผา แล้วแกะเอาเปลือกออก เลือกเอาแต่เนื้อและน้ำ เพื่อนำไปปรุงรส รสชาติของจอผักกาดจะกลมกล่อม เลือกผักกาดกวางตุ้งที่ใหม่และสด จะทำให้จอผักกาดมีรสชาติกลมกล่อม','jpk.jpg');";
        db.execSQL(SQLText);

        SQLText = "INSERT INTO cooking (id, name, information, item, step,trick, img)" +
                "VALUES ('006', 'คั่วจิ๊นส้ม', " +
                "'คั่วจิ๊นส้ม หรือคั่วแหนม หรือผัดแหนม นิยมผัดใส่ไข่ไก่ และวุ้นเส้น " +
                "ส่วนใหญ่ผู้สูงอายุ มักนิยมผัดใส่บ่าลิดไม้ หรือผัดแหนมใส่ฝักเพกาอ่อนย่างไฟ ซึ่งนำลอกเปลือกออก และหั่นย่อย', " +
                "'1.\tจิ๊นส้ม\t100\tกรัม\n" + "2.\tวุ้นเส้น\t1/2\tถ้วย\n" +
                "3.\tไข่ไก่\t2\tฟอง\n" + "4.\tหอมหัวใหญ่\t1\tหัว\n" +
                "5.\tต้นหอม\t2\tต้น\n" + "6.\tพริกชี้ฟ้าแดง\t1\tเม็ด\n" +
                "7.\tกระเทียมดอง\t2\tหัว\n" + "8.\tกระเทียมสับ\t1\tช้อนโต๊ะ\n" +
                "9.\tน้ำมันพืช\t2\tช้อนโต๊ะ'," +

                "'1.\tเจียวกระเทียมกับน้ำมัน จนมีกลิ่นหอม ใส่แหนม ลงผัด\n" + "2.\tใส่หอมหัวใหญ่ ผัดให้เข้ากัน\n" +
                "3.\tใส่วุ้นเส้น ผัดจนวุ้นเส้นสุก\n" + "4.\tใส่ไข่ไก่ ผัดให้เข้ากัน\n" +
                "5.\tใส่พริกชี้ฟ้า ต้นหอม มะเขือเทศ และกระเทียมดอง ผัดให้เข้ากัน พอสุก ปิดไฟ',"+

                "'','kjc.jpg');";
        db.execSQL(SQLText);

        SQLText = "INSERT INTO cooking (id, name, information, item, step,trick, img)" +
                "VALUES ('007', 'คั่วหน่อไม้', " +
                "'คั่วหน่อไม้ หรือผัดหน่อไม้ หรือคั่วหน่อ ถ้าชอบใบขิง หั่นใบขิงโรยหน้า หรือผัดลงไปตอนที่หน่อไม้ใกล้สุกแล้ว" +
                "หรือเติมใบแมงลักก็ได้ บางสูตร ย่างพริกสดแล้วปอกเปลือกแล้วผัดลงไปกับหน่อไม้ หรือใช้พริกสดแทนพริกขี้หนู', " +
                "'1.\tหน่อไม้\t2\tถ้วย\n" + "2.\tเนื้อหมูสามชั้น\t50\tกรัม\n" +
                "3.\tพริกชี้ฟ้า\t3\tเม็ด\n" + "4.\tกระเทียมสับ\t1\tช้อนโต๊ะ\n" +
                "5.\tน้ำมันพืช\t2\tช้อนโต๊ะ" + "6.\tพริกขี้หนู\t7\tเม็ด\n" +
                "7.\tกระเทียม\t10\tกลีบ\n" + "8.\tหอมแดง\t5\tหัว\n" +
                "9.\tกะปิ\t1\tช้อนชา\n" + "10.\tปลาร้า\t1\tช้อนโต๊ะ\n" +
                "11.\tเกลือ\t1/2\tช้อนชา'," +

                "'1. ใช้ส้อมหรือไม้แหลมฉีกหน่อไม้ที่ต้มแล้วให้เป็นฝอย\n" + "2. โขลกเครื่องแกงรวมกันให้ละเอียด\n" +
                "3. เจียวกระเทียมที่สับแล้วให้พอเหลือง ใส่เครื่องแกงลงผัดให้หอม ใส่หมูสามชั้น \n" + "4. ผัดให้หมูสุก ใส่พริกชี้ฟ้าที่หั่นเฉียง ใส่หน่อไม้ \n" +
                "5. ผัดให้เข้ากัน พอสุก ปิดไฟ',"+

                "'การต้มหน่อไม้ ควรใส่หน่อไม้ลงต้มขณะที่น้ำเย็น ถ้าเป็นช่วงที่มีหน่อไม้ไล่ ควรใช้หน่อไม้ไล่ต้ม จะมีรสชาติกลมกล่อมกว่า'," +
                "'knm.jpg');";
        db.execSQL(SQLText);

        SQLText = "INSERT INTO cooking (id, name, information, item, step,trick, img)" +
                "VALUES ('008', 'ตำมะละกอกุ้งสด', " +
                "'ตำกุ้ง ใช้วิธีการปรุงแบบเดียวกับตำชนิดอื่นๆ แต่เพิ่มเครื่องปรุง ได้แก่ ดีปลีคั่ว มะแขว่นคั่ว" +
                "สะระแหน่ มะนาว ผักไผ่ ผักชีต้นหอม เพื่อดับคาวกุ้ง', " +
                "'1.\tกุ้งนา\t1\tถ้วย\n" + "2.\tพริกแห้งย่างไฟ\t5\tเม็ด\n" +
                "3.\tกระเทียมย่างไฟ\t5\tกลีบ\n" +
                "4.\tหอมแดงซอย\t2\tช้อนโต๊ะ\n" + "5.\tดีปลีคั่ว\t1\tผล\n" +
                "6.\tมะแขว่นคั่ว\t1\tช้อนชา\n" + "7.\tกะปิย่างไฟ\t1\tช้อนชา\n" +
                "8.\tมะนาว\t1\tลูก\n" + "9.\tสะระแหน่ซอย\t1\tช้อนโต๊ะ\n" +
                "10.\tผักไผ่ซอย\t1\tช้อนโต๊ะ\n" + "11.\tผักชีซอย\t1\tช้อนโต๊ะ\n" +
                "12.\tต้นหอมซอย\t1\tช้อนโต๊ะ\n" + "13.\tเกลือ\t1/2\tช้อนชา'," +

                "'1.\tล้างกุ้งให้สะอาด พักไว้\n" +
                "2.\tโขลก ดีปลี และมะแขว่น ให้ละเอียด ตามด้วย พริกแห้ง กระเทียม และกะปิ โขลกรวมกันให้ละเอียด \n" +
                "3.\tใส่กุ้งลงโขลกรวมกับส่วนผสมให้เข้ากัน\n" +
                "4.\tใส่หอมแดงซอย ผักไผ่ สะระแหน่ และผักชีต้นหอม คลุกเคล้าให้เข้ากัน \n" +
                "5.\tบีบมะนาว แล้วคนให้เข้ากัน',"+

                "'ควรเลือกกุ้งที่สด และล้างให้สะอาด'," +
                "'tk.jpg');";
        db.execSQL(SQLText);

        SQLText = "INSERT INTO cooking (id, name, information, item, step,trick, img)" +
                "VALUES ('009', 'คั่วแค', " +
                "'คั่วแคเป็นอาหารคล้ายกับแกงแค แต่คั่วแคจะมีน้ำแกงน้อยกว่าแกงแค พอขลุกขลิก จึงเรียกว่า คั่วแค', " +
                "'1.\tกบ\t2\tตัว\n" + "2.\tตำลึง\t1\tถ้วย\n" +
                "3.\tชะอม\t1/2\tถ้วย\n" + "4.\tชะพลู\t1/2\tถ้วย\n" +
                "5.\tถั่วฝักยาว\t1/2\tถ้วย\n" + "6.\tมะเขือเปราะ\t1/2\tถ้วย\n" +
                "7.\tมะเขือพวง\t1/4\tถ้วย\n" + "8.\tงิ้ว\t5\tดอก\n" +
                "9.\tเห็ดลมอ่อน\t1/2\tถ้วย\n" + "10.\tถั่วพู\t1/2\tถ้วย\n" +
                "11.\tผักขี้หูด\t1/2\tถ้วย\n" + "12.\tผักเผ็ด\t1/2\tถ้วย\n" +
                "13.\tดอกข่า\t3\tดอก\n" + "14.\tข้าวคั่ว\t2\tช้อนโต๊ะ\n" +
                "15.\tใบมะกรูด\t5\tใบ\n" + "16.\tผักชีฝรั่ง\t2\tต้น\n" +
                "17.\tผักชี\t1/2\tช้อนโต๊ะ\n" + "18.\tต้นหอม\t1/2\tช้อนโต๊ะ\n" +
                "19.\tน้ำมันพืช\t2\tช้อนโต๊ะ\n" + "20.\tกระเทียมสับ\t1\tช้อนโต๊ะ" +
                "21.\tกระเทียม\t10\tกลีบ\n" + "22.\tหอมแดง\t5\tหัว\n" +
                "23.\tข่าหั่น\t1\tช้อนโต๊ะ\n" + "24.\tตะไคร้ซอย\t2\tช้อนโต๊ะ\n" +
                "25.\tกะปิ\t1\tช้อนชา\n" + "26.\tปลาร้าต้มสุก\t1\tช้อนโต๊ะ\n" +
                "27.\tเกลือ\t1\tช้อนชา'," +

                "'1.\tเด็ดหรือหั่นผักทุกชนิด ล้างให้สะอาด พักไว้\n" + "2.\tโขลกเครื่องแกงรวมกันให้ละเอียด \n" +
                "3.\tเจียวกระเทียมพอเหลือง ใส่เครื่องแกงลงผัดให้หอม ใส่กบสับ \n" + "4.\tผัดให้เข้ากัน ใส่น้ำเล็กน้อย ใส่ข้าวคั่ว แล้วผัดต่อจนเดือด\n" +
                "5.\tใส่ผักสุกยาก ตามด้วยผักที่สุกง่าย คั่วจนผักสุก ปิดไฟ',"+

                "'คั่วแคกบบางสูตรไม่ใส่ข้าวคั่ว ผักที่ใช้เป็นส่วนผสม ใช้ชนิดเดียวกับแกงแค และสามารถใส่ผักชนิดอื่นๆ ได้ เช่น หน่อไม้ต้ม ยอดมะพร้าว และจักค่าน '," +
                "'kp.jpg');";
        db.execSQL(SQLText);

        SQLText = "INSERT INTO cooking (id, name, information, item, step,trick, img)" +
                "VALUES ('010', 'แกงสแล', " +
                "'ส่วนที่นำมาใช้แกงสะแลนั้น คือผลสะแลอ่อน มาแกงใส่หมูสามชั้น กระดูกหมู หรือใส่ปลาแห้ง มีวิธีการแกงเช่นเดียวกับแกงผักหวาน ผักเสี้ยว แต่ใส่ข่าและตระไคร้เป็นเครื่องแกงด้วย', " +
                "'1.\tสะแล\t2\tถ้วย\n" + "2.\tเนื้อหมูสามชั้น\t100\tกรัม\n" +
                "3.\tมะเขือเทศลูกเล็ก\t5\tลูก\n" + "4.\tพริกขี้หนูแห้ง\t15\tเม็ด\n" +
                "5.\tกระเทียม\t10\tกลีบ\n" + "6.\tหอมแดง\t5\tหัว\n" +
                "7.\tข่าหั่น\t1\tช้อนโต๊ะ\n" + "8.\tตะไคร้ซอย\t1\tช้อนโต๊ะ\n" +
                "9.\tกะปิ\t1\tช้อนโต๊ะ\n" + "10.\tปลาร้าต้มสุก\t1\tช้อนโต๊ะ\n" +
                "11.\tเกลือ\t1/2\tช้อนชา'," +

                "'1.\tโขลกเครื่องแกงรวมกันให้ละเอียด\n" +
                "2.\tผัดเครื่องแกงให้มีกลิ่นหอม เติมน้ำ ต้มพอเดือด\n" +
                "3.\tใส่หมูสามชั้น ต้มจนหมูสุก\n" +
                "4.\tใส่สะแล ต้มประมาณ 10-15 นาที จนผักนิ่ม\n" +
                "5.\tใส่มะเขือเทศ พอสุก ปิดไฟ',"+

                "'เลือกผลสะแลที่อ่อน ไม่แก่เกินไป ดอกสะแลแก่ เนื้อเหนียว ต้มสุกยาก" +
                "','kcr.jpg');";

        db.execSQL(SQLText);

        SQLText = "INSERT INTO cooking (id, name, information, item, step,trick, img)" +
                "VALUES ('011', 'แกงปลีตาล', " +
                "'ปลีตาล คืองวงตาลอ่อน นิยมนำมาแกงใส่ไก่บ้าน โดยมีเครื่องแกงคล้ายกับแกงอ่อม เพียงแต่ไม่ใส่รากและเมล็ดผักชี มีขั้นตอนการแกงเช่นเดียวกัน', " +
                "'1.\tปลีตาล\t200\tกรัม\n" + "2.\tเนื้อไก่บ้าน\t100\tกรัม\n" +
                "3.\tใบมะกรูด\t5\tใบ\n" + "4.\tน้ำมันพืช\t2\tช้อนโต๊ะ\n" +
                "5.\tพริกแห้ง\t7\tเม็ด\n" + "6.\tหอมแดง\t3\tหัว\n" +
                "7.\tกระเทียม\t10\tกลีบ\n" + "8.\tตะไคร้ซอย\t1\tช้อนโต๊ะ\n" +
                "9.\tข่าซอย\t1\tช้อนโต๊ะ\n" + "10.\tกะปิ\t1/2\tช้อนโต๊ะ\n" +
                "11.\tเกลือป่น\t1\tช้อนชา'," +

                "'1.\tแกะเปลือกปลีตาลออกเหลือแต่เนื้ออ่อน หั่นเป็นชิ้นบางๆ\n" + "2.\tโขลกเครื่องแกงรวมกันให้ละเอียด\n" +
                "3.\tผัดเครื่องแกงกับน้ำมัน จนมีกลิ่นหอม ใส่ไก่ลงผัด พอไก่หดตัว เติมน้ำ เคี่ยวไก่พอสุกนิ่ม\n" + "4.\tใส่ปลีตาล ต้มต่อจนปลีตาลสุก ประมาณ 5 - 10 นาที\n" +
                "5.\tใส่ใบมะกรูด คนให้ทั่ว ปิดไฟ',"+

                "'หั่นปลีตาลแล้ว นำลงแช่น้ำทันที เพื่อไม่ให้มีสีน้ำตาลเคล็ดลับในการเลือกส่วนผสมปลีตาลต้องอ่อน ใหม่ และสด จะทำให้น้ำแกงมีรสหวาน" +
                "','kpt.jpg');";

        db.execSQL(SQLText);

        SQLText = "INSERT INTO cooking (id, name, information, item, step,trick, img)" +
                "VALUES ('012', 'แกงฮังเล', " +
                "'แกงฮังเลมี 2 ชนิด คือ แกงฮังเลม่าน และ แกงฮังเลเชียงแสน เชื่อกันว่าเป็นอาหารที่ได้รับอิทธิพลมาจากพม่า สำหรับแกงฮังเลเชียงแสนจะแตกต่างตรงที่มีถั่วฝักยาว มะเขือยาว พริกสด หน่อไม้ดอง งาขาวคั่ว เพิ่มเข้ามา', " +
                "'1.\tเนื้อสันคอหมู\t300\tกรัม\n" + "2.\tเนื้อหมูสามชั้น\t200\tกรัม\n" +
                "3.\tน้ำอ้อยป่น\t2\tช้อนโต๊ะ\n" + "4.\tน้ำมะขามเปียก\t3\tช้อนโต๊ะ\n" +
                "5.\tขิงซอย\t1/2\tถ้วย\n" + "6.\tกระเทียม\t1/2\tถ้วย\n" +
                "7.\tถั่วลิสงคั่ว\t2\tช้อนโต๊ะ\n" + "8.\tสับปะรด\t2\tช้อนโต๊ะ\n" +
                "9.\tผงฮังเล\t2\tช้อนโต๊ะ\n" + "10.\tพริกแห้ง\t7\tเม็ด\n" +
                "11.\tพริกขี้หนูแห้ง\t4\tเม็ด\n" + "12.\tหอมแดง\t3\tหัว\n" +
                "13.\tกระเทียม\t20\tกลีบ\n" + "14.\tตะไคร้ซอย\t2\tช้อนโต๊ะ\n" +
                "15.\tข่าซอย\t1\tช้อนโต๊ะ\n" + "16.\tเกลือ\t1\tช้อนชา\n" +
                "17.\tกะปิหยาบ\t1/2\tช้อนโต๊ะ'," +

                "'1.\tหั่นเนื้อหมูสันคอและหมูสามชั้นเป็นชิ้น ขนาด 1.5 x 1.5 นิ้ว\n" +
                "2.\tโขลกเครื่องแกงรวมกันให้ละเอียด\n" +
                "3.\tผสมเครื่องแกง ผงฮังเล สับปะรด และเนื้อหมู คลุกเคล้าให้เข้ากัน หมักไว้ประมาณ 1 ชั่วโมง\n" +
                "4.\tนำหมูที่หมักไว้มาตั้งไฟ ใส่น้ำเล็กน้อย ผัดจนกว่าหมูตึงตัว เคี่ยวต่อ คอยเติมน้ำเรื่อยๆ จนหมูนิ่มได้ที่\n" +
                "5.\tใส่น้ำอ้อยป่น น้ำมะขามเปียก ใส่กระเทียม และขิงซอย คนให้เข้ากัน เคี่ยวต่อ\n" +
                "6.\tใส่ถั่วลิสงคั่ว พอเดือดสักพัก ปิดไฟ',"+

                "'การคั่วเครื่องแกง ใช้ไฟปานกลาง ใช้เนื้อกระท้อนแทนมะขามเปียกได้ ให้รสชาติเปรี้ยว และมีกลิ่นหอม\n" +
                "เคล็ดลับในการเลือกส่วนผสม" +
                "หมูสามชั้น ควรเลือกที่มันไม่หนาเกินไป หรือเลือกใช้ซี่โครงหมูแทน ก็ได้" +
                "','khl.jpg');";

        db.execSQL(SQLText);

        SQLText = "INSERT INTO cooking (id, name, information, item, step,trick, img)" +
                "VALUES ('013', 'แกงพ่อค้าตีเมีย', " +
                "'ผักพ่อค้าตีเมีย บ้างเรียกว่า ผักกับแก้ ภาคกลางเรียกผักเฟือยนก เป็นผักสุกยาก มีวิธีการแกงเช่นเดียวกับแกงขนุน แกงบ่าค้อนก้อม (แกงมะรุม) แต่แกงผักพ่อค้าตีเมีย นิยมใส่เห็ดหูหนู หรืออาจใส่เห็ดนางฟ้าด้วย แล้วแต่ชอบ', " +
                "'1.\tผักพ่อค้าตีเมีย\t200\tกรัม\n" + "2.\tปลาแห้ง\t100\tกรัม\n" +
                "3.\tเห็ดนางฟ้า\t100\tกรัม\n" + "4.\tเห็ดหูหนู\t100\tกรัม\n" +
                "5.\tชะอม\t100\tกรัม\n" + "6.\tมะเขือเทศลูกเล็ก\t5\tลูก\n" +
                "7.\tพริกแห้ง\t5\tเม็ด\n" + "8.\tกระเทียม\t5\tเม็ด\n" +
                "9.\tหอมแดง\t5\tหัว\n" + "10.\tกะปิ\t1\tช้อนโต๊ะ\n" +
                "11.\tเกลือ\t1\tช้อนชา'," +

                "'1. โขลกเครื่องแกงรวมกันให้ละเอียด\n" + "2. ต้มน้ำ พอเดือด ละลายเครื่องแกงลงในน้ำเดือด \n" +
                "3. ใส่ปลาแห้ง ต้มจนปลานุ่ม ใส่เห็ดนางฟ้า เห็ดหูหนู ต้มให้เห็ดสุก \n" + "4. ใส่ผักพ่อค้าตีเมีย ต้มจนผักสุก \n" +
                "5. ใส่มะเขือเทศ คนให้เข้ากัน\n" + "6. ใส่ชะอม พอผักสุก ปิดไฟ',"+

                "'ผักพ่อค้าตีเมีย เป็นผักสุกยาก ให้ชิมดูก่อน ถ้าน้ำแกงไม่มีรสเฝื่อน แสดงว่าผักสุกแล้ว ถ้าแกงนานเกินไป จะเสียรสชาติของน้ำแกง" +
                "','kpktm.jpg');";

        db.execSQL(SQLText);

        SQLText = "INSERT INTO cooking (id, name, information, item, step,trick, img)" +
                "VALUES ('014', 'ลาบไก่', " +
                "'ลาบไก่ เป็นอาหารที่นิยมทำกินกันในโอกาสพิเศษหรืองานเลี้ยงหรือในเทศกาลต่างๆ เช่นเดียวกับลาบหมู ลาบควาย ลาบวัว ส่วนประกอบหลักของลาบไก่ " +
                "คือเนื้อไก่สด นำมาสับให้ละเอียดคลุกเคล้ากับเลือดสด ปรุงด้วยเครื่องปรุงอันประกอบด้วยพริกแห้งเผา และเครื่องเทศต่างๆ ลาบกินกับผักสดนานาชนิด " +
                "โดยเฉพาะประเภทสมุนไพรที่มีกลิ่นหอมแรง และเรียกผักที่นำมากินกับลาบว่า ผักกับลาบ ลาบที่ยังไม่สุก เรียกว่า ลาบดิบ ถ้าต้องการรับประทานแบบสุก" +
                " ก็นำไปคั่วกับน้ำมันพืชเล็กน้อย หรือไม่ใส่น้ำมันก็ได้ตามชอบ เรียกว่า ลาบคั่ว ', " +
                "'1.\tเนื้อไก่บ้าน\t300\tกรัม\n" +
                "2.\tน้ำต้มกะปิ\t1/2\tถ้วย\n" +
                "3.\tหนังไก่ทอดกรอบ\t1/2\tถ้วย\n" +
                "4.\tเลือดไก่\t1/2\tถ้วย\n" +
                "5.\tผักชี\t1\tช้อนโต๊ะ\n" +
                "6.\tต้นหอม\t1\tช้อนโต๊ะ\n" +
                "7.\tผักไผ่\t2\tช้อนโต๊ะ\n" +
                "8.\tพริกลาบ\t3\tช้อนโต๊ะ\n" +
                "9.\tเกลือป่น\t1\tช้อนชา'," +

                "'1.\tหั่นเนื้อไก่เป็นชิ้นเล็ก ๆ\n" +
                "2.\tสับไก่ให้ละเอียด ขณะที่สับไก่ใส่เลือดไก่ทีละน้อย \n" +
                "3.\tสับไก่จนละเอียดเป็นเนื้อเดียวกัน\n" +
                "4.\tนำน้ำต้มกะปิ พริกลาบ และเกลือ คนให้เข้ากัน \n" +
                "5.\tใส่เนื้อไก่ที่สับแล้ว แล้วคนให้เข้ากัน \n" +
                "6.\tใส่ผักชีต้นหอมซอย ตามด้วยผักไผ่ซอย คลุกเคล้าให้เข้ากัน \n" +
                "7.\tใส่หนังไก่ทอด คลุกเคล้าให้เข้ากัน \n" +
                "8.\tโรยด้วยกระเทียมเจียว ',"+

                "'ควรเลือกเนื้อไก่ที่มีคุณภาพและเนื้อนุ่มเพื่อที่จะรับประทานง่ายขึ้น" +
                "','lk.jpg');";

        db.execSQL(SQLText);

        SQLText = "INSERT INTO cooking (id, name, information, item, step,trick, img)" +
                "VALUES ('015', 'พริกลาบ', " +
                "'พริกลาบ หรือน้ำพริกลาบ หรือบ้างเรียกว่า น้ำพริกดำ เพราะมีสีดำของพริกแห้งย่างไฟ พริกลาบ ใช้เป็นเครื่องยำลาบ หรือเครื่องปรุงลาบ " +
                "และยำต่างๆ เช่น ยำจิ๊นไก่ ยำกบ ยำเห็ดฟาง ปัจจุบัน มีผู้ทำขาย หาซื้อได้ตามตลาดสด', " +

                "'1.\tพริกแห้ง\t1/2\tกิโลกรัม\n" +
                "2.\tเม็ดผักชี\t2\tช้อนโต๊ะ\n" +
                "3.\tมะแขว่น\t2\tช้อนโต๊ะ\n" +
                "4.\tเทียนข้าวเปลือก\t2\tช้อนโต๊ะ\n" +
                "5.\tมะแหลบ\t2\tช้อนโต๊ะ\n" +
                "6.\tดีปลี\t20\tลูก\n" +
                "7.\tพริกไทยดำ\t1/2\tช้อนโต๊ะ\n" +
                "8.\tกานพลู\t1\tช้อนชา\n" +
                "9.\tโป๊ยกั๊ก\t1\tช้อนโต๊ะ\n" +
                "10.\tเปราะหอม\t2\tช้อนโต๊ะ\n" +
                "11.\tลูกจันทน์เทศ\t4\tลูก\n" +
                "12.\tดอกจันทน์เทศ\t4\tดอก\n" +
                "13.\tอบเชย\t3\tชิ้น\n" +
                "14.\tกระวาน\t1\tช้อนโต๊ะ\n" +
                "15.\tเกลือป่น\t1\tช้อนโต๊ะ'," +

                "'1.\tย่างพริกแห้งกับเตาถ่าน \n" +
                "2.\tคั่วเครื่องเทศที่สุกยากก่อน ได้แก่ ลูกจันทน์เทศ ดีปลี อบเชย โป๊ยกั๊ก กระวาน และเปราะหอม ใช้ไฟอ่อน พอมีกลิ่นหอม \n" +
                "3.\tใส่เครื่องเทศที่เหลือลงคั่วด้วยกัน จนมีกลิ่นหอม พักไว้ให้เย็น\n" +
                "4.\tโขลกเครื่องเทศทั้งหมดรวมกันให้ละเอียด \n" +
                "5.\tใส่พริกย่าง ลงโขลกรวมกันให้ละเอียด\n" +
                "6.\tใส่เกลือลงโขลกรวมกัน คนให้เข้ากัน',"+

                "'เนื้อสัตว์ 1 กิโลกรัม ใช้พริกลาบประมาณ 4-5 ช้อนโต๊ะ เพิ่มหรือลดตามความชอบเผ็ดมากหรือเผ็ดน้อย',"+
                "'pk.jpg');";

        db.execSQL(SQLText);

        SQLText = "INSERT INTO cooking (id, name, information, item, step,trick, img)" +
                "VALUES ('016', 'ลาบปลา', " +
                "'ลาบปลา เป็นอาหารประเภทลาบ ที่มีส่วนประกอบหลัก คือเนื้อปลาต้ม นำมาสับให้ละเอียด ปรุงด้วยเครื่องปรุงอันประกอบด้วยพริกแห้งเผา " +
                "และเครื่องเทศต่างๆ เช่นเดียวกับลาบชนิดอื่นๆ เครื่องเคียง ได้แก่ ผักสดนานาชนิด โดยเฉพาะประเภทสมุนไพรที่มีกลิ่นหอมแรง และเรียกผักที่นำมารับประทานกับลาบว่า ผักกับลาบ', " +
                "'1.\tปลานิล\t300\tกรัม\n" +
                "2.\tข้าวคั่ว\t1/2\tถ้วย\n" +
                "3.\tพริกลาบ\t3\tช้อนโต๊ะ\n" +
                "4.\tกะปิ\t1\tช้อนโต๊ะ\n" +
                "5.\tตะไคร้\t2\tต้น\n" +
                "6.\tขมิ้น\t1\tหัว\n" +
                "7.\tผักชี\t1\tช้อนโต๊ะ\n" +
                "8.\tต้นหอม\t1\tช้อนโต๊ะ\n" +
                "9.\tผักไผ่\t2\tช้อนโต๊ะ\n" +
                "10.\tกระเทียมสับ\t1\tช้อนโต๊ะ\n" +
                "11.\tน้ำมันพืช\t2\tช้อนโต๊ะ'," +

                "'1.\tล้างปลานิลให้สะอาด ใส่หม้อต้มทั้งตัว ใส่กะปิ ตะไคร้ทุบ ขมิ้นทุบ พอปลาสุก ตักขึ้นพักไว้\n" +
                "2.\tแกะปลาเอาแต่เนื้อ นำมาสับให้ละเอียด \n" +
                "3.\tผสมน้ำต้มปลา พริกลาบ และเนื้อปลาสับ คลุกเคล้าให้เข้ากัน\n" +
                "4.\tใส่ข้าวคั่ว คนให้เข้ากัน\n" +
                "5.\tใส่ผักไผ่ ตามด้วยผักชีต้นหอม แล้วคลุกเคล้าให้ทั่ว\n" +
                "6.\tจียวกระเทียมกับน้ำมันพืช พอเหลืองใส่ลาบปลาลงผัดให้หอม เติมน้ำเล็กน้อย ผัดให้เข้ากัน ',"+

                "'การทำข้าวคั่ว ใช้ข้าวสารเจ้า หรือข้าวสารเหนียวก็ได้ มาคั่วไฟอ่อนๆ ให้สีเหลือง แล้วโขลกให้ละเอียด '," +
                "'lp.jpg');";

        db.execSQL(SQLText);

        SQLText = "INSERT INTO cooking (id, name, information, item, step,trick, img)" +
                "VALUES ('017', 'ขนมเทียน', " +
                "'ขนมเทียน หรือ เข้าหนมเตียน มีวิธีการทำคล้ายขนมเกลือ แต่ขนมสุกแล้วจะมีสีน้ำตาลจากสีของน้ำอ้อย รับประทานกับมะพร้าวขูดฝอย สำหรับวิธีการห่อขนม อาจใช้วิธีห่อแบบเดียวกับขนมเกลือ', " +
                "'1.\tแป้งข้าวเจ้า\t500\tกรัม\n" +
                "2.\tน้ำอ้อย\t200\tกรัม\n" +
                "3.\tเกลือ\t1\tช้อนชา\n'," +

                "'1.\tนำแป้งข้าวเจ้า น้ำอ้อย และเกลือ นวดให้เข้ากัน ใส่น้ำตาล\n" +
                "2.\tนวดส่วนผสมจนเป็นเนื้อเดียวกัน นวดส่วนผสม\n" +
                "3.\tนำไปตั้งไฟ ใช้ไม้พายกวนขนม โดยใช้ไฟอ่อนๆ กวนขนม\n" +
                "4.\tเตรียมใบตองเป็นรูปทรงกรวย ใส่ขนมลงในกรวย พับใบตองด้านบนแล้วใช้ไม้กลัด ใส่ขนมลงในกรวย\n" +
                "5.\tนำไปนึ่ง ใช้เวลาประมาณ 20 นาที นึ่งขนม',"+

                "'ควรกวนขนมไปในทิศทางเดียวและกวนตลอดเวลา โดยใช้ไฟอ่อนๆ จะไม่ทำให้แป้งเกาะตัวเป็นก้อน'," +
                "'knt.jpg');";

        db.execSQL(SQLText);

        SQLText = "INSERT INTO cooking (id, name, information, item, step,trick, img)" +
                "VALUES ('018', 'ขนมกล้วย', " +
                "'ขนมกล้วย หรือเข้าหนมกล้วย เป็นขนมชนิดหนึ่งที่ทำจากแป้งข้าวเจ้า ส่วนผสมหลักมีกล้วยน้ำว้าสุกงอม แป้งข้าวเจ้า และน้ำตาลทราย นำมาคลุกเคล้าและนวดให้เข้ากัน', " +
                "'1.\tกล้วยน้ำว้าสุก\t500\tกรัม\n" +
                "2.\tน้ำตาลทราย\t500\tกรัม\n" +
                "3.\tแป้งข้าวเจ้า\t300\tกรัม\n" +
                "4.\tแป้งมัน\t100\tกรัม\n" +
                "5.\tมะพร้าว\t1\tถ้วย\n" +
                "6.\tกะทิ\t3\tถ้วย\n" +
                "7.\tเกลือป่น\t1\tช้อนชา'," +

                "'1.\tแกะเปลือกกล้วยน้ำว้า ใส่ภาชนะ ใส่แป้งข้าวเจ้า\t\n" +
                "2.\tใส่น้ำกะทิ คนให้เข้ากัน\t\n" +
                "3.\tนวดส่วนผสมทั้งหมดให้เข้ากันและขยำกล้วยให้เป็นชิ้นเล็ก ๆ \n" +
                "4.\tใส่น้ำตาลทราย แล้วนวดให้เข้ากันจนน้ำตาลละลาย\t\n" +
                "5.\tฉีกใบตองกว้าง 6 นิ้ว ทำเป็นกรวย แล้วใช้ไม้กลัด กลัดใบตอง\t\n" +
                "6.\tตักส่วนผสมใส่ลงในกรวยให้เต็ม\t\n" +
                "7.\tวางกรวยขนมในรูของลังถึง \n" +
                "8.\tโรยมะพร้าวขูด นึ่งไฟกลาง ประมาณ 20 นาที',"+

                "'เลือกกล้วยน้ำว้าสุกงอม จะทำให้ขนมกล้วยมีรสหวาน หอม\n" +
                "','knk.jpg');";

        db.execSQL(SQLText);

        SQLText = "INSERT INTO cooking (id, name, information, item, step,trick, img)" +
                "VALUES ('019', 'หน่อโอ่', " +
                "'หน่อโอ่ หมายถึง หน่อไม้มีกลิ่น โอ่ แปลว่า เหม็น เนื่องจากหมักดอง หรือหมักดองไม่ได้ที่ นิยมใช้หน่อไม้รวก หน่อไล่ หน่อไม้บง หน่อไม้ซาง" +
                " แกะเปลือกออก ดองไว้ 2-3 คืน และนำมาต้มจนสุก บางสูตรดองหน่อไม้ทั้งเปลือก แกะเปลืองออก แล้วจึงนำมาต้ม การต้มไม่ว่าจะเป็นสูตรใด ต้องต้มนานๆ" +
                " จึงจะอร่อย รับประทานกับเครื่องจิ้ม ซึ่งชาวล้านนา เรียกว่า พริกดำ คือพริกแห้งย่างไฟ และเกลือ โขลกรวมกันให้ละเอียด โรยด้วยใบมะกรูดซอย', " +
                "'1.\tหน่อไม้ไผ่รวก\t2\tหาง\n" +
                "2.\tเกลือ\t2\tช้อนชา\n" +
                "3.\tพริกแห้ง\t5\tเม็ด\n" +
                "4.\tใบมะกรูด\t2\tใบ'," +

                "'1.\tใช้มีดกรีดหน่อไม้ให้เป็นเส้นๆ ตั้งแต่ส่วนโคลนจนถึงส่วนที่อ่อน เหลือส่วนปลายไว้ \n" +
                "2.\tแช่หน่อไม้ในน้ำเปล่าไว้ ดองไว้ 2 คืน\n" +
                "3.\tต้มหน่อไม้ที่ดองได้ที่แล้ว ใส่เกลือ 1 ช้อนชา ต้มจนหน่อไม้สุก \n" +
                "4.\tทำเครื่องจิ้ม โดยย่างพริกแห้ง นำมาโขลกกับเกลือ 1 ช้อนชา ตักใส่ถ้วย ใส่ใบมะกรูดซอย คนให้เข้ากัน ',"+

                "'ต้มหน่อไม้จนสุก จึงจะอร่อย'," +
                "'no.jpg');";

        db.execSQL(SQLText);

        SQLText = "INSERT INTO cooking (id, name, information, item, step,trick, img)" +
                "VALUES ('020', 'จิ้นนึ่ง', " +
                "'จิ๊นนึ่ง คือเนื้อควายหรือเนื้อวัวที่นำมานึ่งให้เปื่อย รับประทานกับน้ำพริก', " +
                "'1.\tเนื้อน่องควาย\t1\tกิโลกรัม\n" +
                "2.\tตะไคร้\t3\tต้น\n" +
                "3.\tกระเทียม\t20\tกลีบ\n" +
                "4.\tเม็ดผักชี\t1\tช้อนโต๊ะ\n" +
                "5.\tรากผักชี\t3\tราก\n" +
                "6.\tเกลือ\t1\tช้อนโต๊ะ'," +

                "'1.\tผ่าเนื้อตามแนวยาวออกเป็นสองส่วน\n" +
                "2.\tโขลกเกลือ เมล็ดผักชี รากผักชี และกระเทียม รวมกันให้ละเอียด\n" +
                "3.\tใส่ส่วนผสมใส่ในชามเนื้อ คลุกเคล้าให้เข้ากัน แล้วหมักไว้ 2 ชั่วโมง\n" +
                "4.\tนำลังถึงใส่น้ำตั้งไฟ วางตะแกรงไม้ลงในลังถึง วางเนื้อลงบนตะแกรง นำตะไคร้ทุบวางบนเนื้อ\n" +
                "5.\tนึ่ง ประมาณ 2 ชั่วโมง คอยเติมน้ำเพื่อไม่ให้น้ำแห้ง\n" +
                "6.\tใช้ไม้จิ้มดูเนื้อ ถ้าเนื้อไม่ติดไม้ แสดงว่าเนื้อสุกแล้ว',"+

                "'เนื้อควายให้เลือกในส่วนที่เป็นน่อง เพราะจะได้เนื้อที่รสชาติอร่อยมากยิ่งขึ้น จะใช้เนื้อวัวหรือเนื้อควายก็ได้ '," +
                "'jn.jpg');";

        db.execSQL(SQLText);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
