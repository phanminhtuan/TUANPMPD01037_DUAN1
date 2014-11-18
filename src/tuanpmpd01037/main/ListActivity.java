package tuanpmpd01037.main;

import java.util.ArrayList;
import java.util.List;

import tuanpmpd01037.custom.xml.Custom_List_Word;
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
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

public class ListActivity extends Activity {
	ListView mylist;
	List<Word> listWord = new ArrayList<Word>();
	Custom_List_Word adapterList;
	DatabaseHandler db = new DatabaseHandler(ListActivity.this);

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_list);
		// ===================================
		mylist = (ListView) findViewById(R.id.mylist);
		//====================================
		Log.d("list", "" + db.getAllContacts());
		//=======================================
		listWord = db.getAllContacts();
		adapterList = new Custom_List_Word(ListActivity.this, listWord);
		mylist.setAdapter(adapterList);
		mylist.setOnItemClickListener(new OnItemClickListener(
				) {

					@Override
					public void onItemClick(AdapterView<?> parent, View view,
						final	int position, long id) {
						AlertDialog.Builder b = new AlertDialog.Builder(
								ListActivity.this);
						b.setTitle("Delete Word ");
						b.setMessage("Do you want to delete this word?");
						b.setPositiveButton("Yes",
								new DialogInterface.OnClickListener() {
									@Override
									public void onClick(DialogInterface dialog,
											int which) {
										db.deleteContact(listWord.get(position)
												.getTu());
										listWord.remove(position);
										adapterList.notifyDataSetChanged();
										mylist.setAdapter(adapterList);
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
		});
	}
}
