package tuanpmpd01037.main;

import java.util.ArrayList;
import java.util.List;

import tuanpmpd01037.database.DatabaseHandler;
import tuanpmpd01037.duan1.R;
import tuanpmpd01037.object.Word;


import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddWordActivity extends Activity {
EditText txtTu,txtNghiaTu;
Button btnSave;
List<Word> listWord = new ArrayList<Word>();
  DatabaseHandler db=new DatabaseHandler(AddWordActivity.this);
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_add_word);
		txtNghiaTu=(EditText)findViewById(R.id.txtNghiaTu);
		txtTu=(EditText)findViewById(R.id.txtTu);
		btnSave=(Button)findViewById(R.id.btnSave);
		//===========================================
		
		btnSave.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if ((txtTu.getText().toString().equals(""))
						|| (txtNghiaTu.getText().toString().equals(""))) {
					Toast.makeText(getApplicationContext(),
							"Please enter your word ", Toast.LENGTH_LONG)
							.show();
					return;
				} else {
					AlertDialog.Builder b = new AlertDialog.Builder(
							AddWordActivity.this);
					b.setTitle("Save Word ");
					b.setMessage("Do you want to save this word?");
					b.setPositiveButton("Yes",
							new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface dialog,
										int which) {
									String a=txtTu.getText().toString();
									String b=txtNghiaTu.getText().toString();
									db.addContact(new Word(txtTu.getText().toString(),
											txtNghiaTu.getText().toString()));
									Log.d("==============", "" + db.getAllContacts());
									Toast.makeText(getApplicationContext(), "Successfull",
											Toast.LENGTH_LONG).show();
									txtNghiaTu.setText("");
									txtTu.setText("");
								}
							});
					b.setNegativeButton("No",
							new DialogInterface.OnClickListener() {

								@Override
								public void onClick(DialogInterface dialog,
										int which) {
									dialog.cancel();
								}
							});
					b.create().show();
										
				}
					
				}				
			
		});
	}
}
