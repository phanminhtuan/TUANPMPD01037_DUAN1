package tuanpmpd01037.main;

import tuanpmpd01037.duan1.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		final ImageButton btnTuVung = (ImageButton) findViewById(R.id.imageTuVung);
		final ImageButton btnThemTu = (ImageButton) findViewById(R.id.imageThemTu);
		final ImageButton btnTimKiem = (ImageButton) findViewById(R.id.imageTimKiem);
		final ImageButton btnList = (ImageButton) findViewById(R.id.imageDanhSach);
		//=============================================chu de tu vung
		btnTuVung.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent in = new Intent(MainActivity.this, TuVungActivity.class);
				startActivity(in);
			}
		});
		//==============================================them
		btnThemTu.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent in = new Intent(MainActivity.this, AddWordActivity.class);
				startActivity(in);				
			}
		});
		//================================================danh sach
		btnList.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent in = new Intent(MainActivity.this, ListActivity.class);
				startActivity(in);					
			}
		});
		//==================================================tim kiem
		btnTimKiem.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent in = new Intent(MainActivity.this, SearchWordActivity.class);
				startActivity(in);
			}
		});
	}
}
