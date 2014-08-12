package herbal.id;



import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;



public class HerbalActivity extends Activity{
	 private SQLiteDatabase db = null;
		private Cursor herbaCursor = null;
		private EditText txtpenyakit;
		private EditText txtherbal;
		private EditText txtbuat;
		private Dataherbal dataherbal = null;
		public static final String PENYAKIT = "penyakit";
		public static final String HERBAL = "herbal";
		public static final String BUAT = "buat";
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        dataherbal = new Dataherbal(this);
		db = dataherbal.getWritableDatabase();
		dataherbal.createTable(db);
		dataherbal.generateData(db);
        setContentView(R.layout.herbal_layout);
        txtpenyakit = (EditText) findViewById(R.id.txtsakit);
		txtherbal = (EditText) findViewById(R.id.txtobat);
		txtbuat = (EditText) findViewById(R.id.txtolah);

    }

	public void getHerbal(View view) {
		String result = "";
		String herbaltype = txtpenyakit.getText().toString().trim();
		herbaCursor = db.rawQuery("SELECT ID, PENYAKIT, HERBAL "
				+ "FROM obatherbal where PENYAKIT='" + herbaltype
				+ "' ORDER BY PENYAKIT", null);

		if (herbaCursor.moveToFirst()) {
			result = herbaCursor.getString(2);
			for (; !herbaCursor.isAfterLast(); herbaCursor.moveToNext()) {
				result = herbaCursor.getString(2);
				}
		}
		if (result.equals("")) {
			result = "Kata kunci tidak sesuai coba ulangi lagi";
		}
		txtherbal.setText(result);
		 
		String resulto = "";
		String caratype = txtpenyakit.getText().toString();
		herbaCursor = db.rawQuery("SELECT ID, PENYAKIT, BUAT "
				+ "FROM obatherbal where PENYAKIT='" + herbaltype
				+ "' ORDER BY BUAT", null);

		if (herbaCursor.moveToFirst()) {
			resulto = herbaCursor.getString(2);
			for (; !herbaCursor.isAfterLast(); herbaCursor.moveToNext()) {
				resulto = herbaCursor.getString(2);
				}
		}
		if (resulto.equals("")) {
			resulto = "Kata kunci tidak sesuai coba ulangi lagi";
		}
		txtbuat.setText(resulto);
	
		

	}
	
		// TODO Auto-generated method stub

	
	
	

}
