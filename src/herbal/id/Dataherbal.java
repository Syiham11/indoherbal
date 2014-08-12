package herbal.id;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Dataherbal extends SQLiteOpenHelper {
	private static final String DATABASE_NAME = "dbherbal";
	public static final String PENYAKIT= "penyakit";
	public static final String HERBAL = "herbal";
	public static final String BUAT = "buat";

	//Constructor DataKamus untuk initiate database
	public Dataherbal(Context context) {
		super(context, DATABASE_NAME, null, 1);
	}

	//method createTable untuk membuat table kamus
	public void createTable(SQLiteDatabase db){
		db.execSQL("DROP TABLE IF EXISTS obatherbal");
		db.execSQL("CREATE TABLE if not exists obatherbal (id INTEGER PRIMARY KEY AUTOINCREMENT, penyakit TEXT, herbal TEXT,buat TEXT);");
	}

	//method generateData untuk mengisikan data ke kamus.
	public void generateData(SQLiteDatabase db){
		ContentValues cv=new ContentValues();
		cv.put(PENYAKIT, "diabetes");
		cv.put(HERBAL, "Buah Ciplukan");
		cv.put(BUAT, "Cabut tumbuhan ciplukan yang berbuah sampai ke akarnya , kemudian layukan dan rebus dengan 3 gelas air hingga mendidih sampai tersisa 1 gelas, saring dan minum 1x sehari");
		db.insert("obatherbal", PENYAKIT, cv);
		cv.put(PENYAKIT, "Sembelit");
		cv.put(HERBAL, "Teh Daun Jati China");
		cv.put(BUAT, "siapkan air panas 100 ml kemudian masukkan daun jati cina , lalu tunggu hingaa air berubah menjadi warna hijau , kemudian minum");
		db.insert("obatherbal", PENYAKIT, cv);
		cv.put(PENYAKIT, "hypertensi");
		cv.put(HERBAL, "Mengkudu");
		cv.put(BUAT, "dosis 2-3 buah yang matang");
		db.insert("obatherbal", PENYAKIT, cv);
		cv.put(PENYAKIT, "stroke");
		cv.put(HERBAL, "Jamur Kuping Hitam");
		cv.put(BUAT, "siapkan 3 buah jamur kemudian direbus dengan air mendidih selama 15 menit (setengah matang)");
		db.insert("obatherbal", PENYAKIT, cv);
		cv.put(PENYAKIT, "rematik");
		cv.put(HERBAL, "Belimbing Wuluh");
		cv.put(BUAT, "100gr daun blimbing wuluh , 10 biji cengkeh dan 15 biji mrica di cuci kemudian giling halus, tambahkan cuka secukupnya sampai jadi adonan bubur,oleskan kebagian yg sakit");
		db.insert("obatherbal", PENYAKIT, cv);
		cv.put(PENYAKIT, "keputihan");
		cv.put(HERBAL, "Daun Sirih");
		cv.put(BUAT, "siapkan 7-10 lembar daun sirih di rebus dengan 2,5 l air sampai mendidih kemudian air rebusan dalam keadaan hangat di pakai untuk membahus membersihkan area kewanitaan");
		db.insert("obatherbal", PENYAKIT, cv);
		cv.put(PENYAKIT, "bronkhitis");
		cv.put(HERBAL, "Daun Sirih");
		cv.put(BUAT, "Rajangan 7 lembar daun sirih dan 1 potong gula batu kemudian rebus dengan dua gelas air sampai mendidih hingga tinggal satu gelas dan disaring, di minum 3x sehari 1 sendok makan ");
		db.insert("obatherbal", PENYAKIT, cv);
		cv.put(PENYAKIT, "batuk");
		cv.put(HERBAL, "Daun sirih");
		cv.put(BUAT, "4 lembar daun sirih kemudian rebus dengan 4 gelas air sampai mendidih setelah dingin dipakai untuk berkumur, diulang secara teratur sampai sembuh");
		db.insert("obatherbal", PENYAKIT, cv);
		cv.put(PENYAKIT, "cacingan");
		cv.put(HERBAL, "Daun Kelor");
		cv.put(BUAT, "3 daun kelor,1 gagang cabe, 1-2 batang meniran di rebus hingga mendidih hinnga tinggal satu gelas disaring lalu minum");
		db.insert("obatherbal", PENYAKIT, cv);
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
	}
}