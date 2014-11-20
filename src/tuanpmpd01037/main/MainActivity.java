package tuanpmpd01037.main;

import tuanpmpd01037.database.DatabaseHandler;
import tuanpmpd01037.duan1.R;
import tuanpmpd01037.object.Word;
import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends Activity {
	private Dialog cusDialog;
	DatabaseHandler db=new DatabaseHandler(MainActivity.this);
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		final ImageButton btnTuVung = (ImageButton) findViewById(R.id.imageTuVung);
		final ImageButton btnThemTu = (ImageButton) findViewById(R.id.imageThemTu);
		final ImageButton btnTimKiem = (ImageButton) findViewById(R.id.imageTimKiem);
		final ImageButton btnList = (ImageButton) findViewById(R.id.imageDanhSach);
		// =============================================chu de tu vung
		btnTuVung.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent in = new Intent(MainActivity.this, TuVungActivity.class);
				startActivity(in);
			}
		});
		// ==============================================them
		btnThemTu.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// Intent in = new Intent(MainActivity.this,
				// AddWordActivity.class);
				// startActivity(in);

				// Create custom dialog object
				cusDialog = new Dialog(MainActivity.this);
				// Include dialog.xml file
				cusDialog.setContentView(R.layout.dialog_themtu);
				// Set dialog title
				cusDialog.setTitle("Thêm từ");
				cusDialog.show();
				// set values for custom dialog components - text, image and
				// button
				final EditText txtTu = (EditText) cusDialog
						.findViewById(R.id.edTu);
				final EditText txtNghiaTu = (EditText) cusDialog
						.findViewById(R.id.edNghiaTu);
				//
				Button ButtonOK = (Button) cusDialog.findViewById(R.id.btnOk);
				Button ButtonCanCel = (Button) cusDialog
						.findViewById(R.id.btnHuy);

				// if decline button is clicked, close the custom dialog
				ButtonOK.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View v) {
						if ((txtTu.getText().toString().equals(""))
								|| (txtNghiaTu.getText().toString().equals(""))) {
							Toast.makeText(getApplicationContext(),
									"Vui lòng nhập lại từ ", Toast.LENGTH_LONG)
									.show();
							return;
						} else {
							String a=txtTu.getText().toString();
							String b=txtNghiaTu.getText().toString();
							db.addContact(new Word(txtTu.getText().toString(),
									txtNghiaTu.getText().toString()));
							Log.d("==============", "" + db.getAllContacts());
							Toast.makeText(getApplicationContext(), "Lưu thành công",
									Toast.LENGTH_LONG).show();
							txtNghiaTu.setText("");
							txtTu.setText("");
						}

					}
				});
				ButtonCanCel.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						// Close dialog
						cusDialog.cancel();
					}
				});

			}

		});
		// ================================================danh sach
		btnList.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent in = new Intent(MainActivity.this, ListActivity.class);
				startActivity(in);
			}
		});
		// ==================================================tim kiem
		btnTimKiem.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent in = new Intent(MainActivity.this,
						SearchWordActivity.class);
				startActivity(in);
			}
		});
	}
}
