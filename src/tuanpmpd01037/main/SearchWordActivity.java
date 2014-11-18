package tuanpmpd01037.main;

import java.util.ArrayList;
import java.util.List;

import tuanpmpd01037.database.DatabaseHandler;
import tuanpmpd01037.duan1.R;
import tuanpmpd01037.object.Word;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

public class SearchWordActivity extends Activity {
	EditText txtTimTu;
	ImageView imgSearch;
	ListView listview;
	ArrayAdapter<Word> adapterSearch;
	List<Word> listSearch = new ArrayList<Word>();
	DatabaseHandler db = new DatabaseHandler(SearchWordActivity.this);
	int textlength = 0;
	List<Word> listSort = new ArrayList<Word>();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_search_word);
		imgSearch = (ImageView) findViewById(R.id.imgSearch);
		txtTimTu = (EditText) findViewById(R.id.txtTimTu);
		listview = (ListView) findViewById(R.id.listView);
		listSearch = db.getAllContacts();
		// ==============================tim
		imgSearch.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				onTextChanged();
				

			}

		});
	}

	public void onTextChanged() {
		textlength = txtTimTu.getText().length();
		listSort.clear();
		for (int i = 0; i < listSearch.size(); i++) {
			String _text = (String) listSearch.get(i).getTu();
			if (textlength <= _text.length()) {
				if (txtTimTu
						.getText()
						.toString()
						.equalsIgnoreCase(
								(String) _text.subSequence(0, textlength))) {
					Log.i("array sort", _text);
					listSort.add(listSearch.get(i));
					adapterSearch = new ArrayAdapter<Word>(SearchWordActivity.this,
							android.R.layout.simple_list_item_1, listSort);
					listview.setAdapter(adapterSearch);
				}else{
					Toast.makeText(getApplicationContext(), "The word doesn't exited in the dictionary", Toast.LENGTH_LONG).show();
				}
			}
		}
		
	}
}
