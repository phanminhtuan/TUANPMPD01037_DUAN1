package tuanpmpd01037.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import tuanpmpd01037.custom.xml.CustomSearchWord;
import tuanpmpd01037.database.DatabaseHandler;
import tuanpmpd01037.duan1.R;
import tuanpmpd01037.object.Word;
import android.app.Activity;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

public class SearchWordActivity extends Activity {
	EditText txtTimTu;
	ImageView imgSearch,imgXoa,imgDoc ;
	ListView listview;
	CustomSearchWord adapterSearch;
	List<Word> listSearch = new ArrayList<Word>();
	DatabaseHandler db = new DatabaseHandler(SearchWordActivity.this);
	int textlength = 0;
	List<Word> listSort = new ArrayList<Word>();
	TextToSpeech speak;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_search_word);
		imgDoc=(ImageView)findViewById(R.id.imgDoc);
		imgSearch = (ImageView) findViewById(R.id.imgSearch);
		imgXoa=(ImageView)findViewById(R.id.imageXoa);
		txtTimTu = (EditText) findViewById(R.id.txtTimTu);
		listview = (ListView) findViewById(R.id.listView);
		listSearch = db.getAllContacts();
		Log.d("Danh sách từ", ""+listSearch);
		// ==============================tim
		imgSearch.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				if (txtTimTu.getText().toString().equals("")) {
					Toast.makeText(getApplicationContext(), "Nhập từ cần tìm",
							Toast.LENGTH_LONG).show();
				} else {
					onTextChanged();
					adapterSearch = new CustomSearchWord(SearchWordActivity.this, listSort);
					listview.setAdapter(adapterSearch);
				}
				txtTimTu.setText("");
			}

		});
		//===========================xoa
		imgXoa.setOnClickListener(new OnClickListener(
				) {
			
			@Override
			public void onClick(View v) {
				txtTimTu.setText("");
			}
		});
	
		speak = new TextToSpeech(getApplicationContext(),
				new TextToSpeech.OnInitListener() {
					@Override
					public void onInit(int status) {
						if (status != TextToSpeech.ERROR) {
							speak.setLanguage(Locale.UK);
						}
					}
				});
		//============================phát âm
		imgDoc.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				speak.speak(txtTimTu.getText().toString(), TextToSpeech.QUEUE_FLUSH, null);				
			}
		});
		
	}

	@Override
	protected void onPause() {
		if (speak != null) {
			speak.stop();
			speak.shutdown();
		}		super.onPause();
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

				} 
				
			}else {
				Toast.makeText(getApplicationContext(),
						"Từ này không có trong từ điển",
						Toast.LENGTH_LONG).show();
			}
}

	}
}
