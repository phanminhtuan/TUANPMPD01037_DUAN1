package tuanpmpd01037.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;


import tuanpmpd01037.duan1.R;
import tuanpmpd01037.object.ChuDe;
import tuanpmpd01037.object.TuVung;

import android.app.Activity;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DetailTuVungActivity extends Activity {
	public static List<ChuDe> listDetail = new ArrayList<ChuDe>();
	ImageView btnnext, btnback;
	ImageButton btnLoa;
	TextView tv1, tv2, tv3,tv4,tv5;
	static int id = 0;
	TextToSpeech ttobj;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_detail_tu_vung);
		getWigetsControl();
		TuVung tv = listDetail.get(0).getListTuVung().get(0);
		tv1.setText(tv.getTu());
		tv2.setText(tv.getLoaiTu());
		tv3.setText(tv.getNghiaTu());
		tv4.setText(tv.getCauViDu());
		tv5.setText(tv.getNghiaCauViDu());
		//xu ly button Next
		btnnext.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				id++;
				if (id >= listDetail.get(0).getListTuVung().size() - 1) {
					id = listDetail.get(0).getListTuVung().size() - 1;
					TuVung a = listDetail.get(0).getListTuVung().get(id);
					tv1.setText(a.getTu());
					tv2.setText(a.getLoaiTu());
					tv3.setText(a.getNghiaTu());
					tv4.setText(a.getCauViDu());
					tv5.setText(a.getNghiaCauViDu());
				} else {
					TuVung a = listDetail.get(0).getListTuVung().get(id);
					tv1.setText(a.getTu());
					tv2.setText(a.getLoaiTu());
					tv3.setText(a.getNghiaTu());
					tv4.setText(a.getCauViDu());
					tv5.setText(a.getNghiaCauViDu());
				}

			}
		});
		// xu ly button back
		btnback.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				id--;
				if (id <= 0) {
					id = 0;
					TuVung c = listDetail.get(0).getListTuVung().get(id);
					tv1.setText(c.getTu());
					tv2.setText(c.getLoaiTu());
					tv3.setText(c.getNghiaTu());
					tv4.setText(c.getCauViDu());
					tv5.setText(c.getNghiaCauViDu());

				} else {
					TuVung d = listDetail.get(0).getListTuVung().get(id);
					tv1.setText(d.getTu());
					tv2.setText(d.getLoaiTu());
					tv3.setText(d.getNghiaTu());
					tv4.setText(d.getCauViDu());
					tv5.setText(d.getNghiaCauViDu());
				}

			}
		});
		btnLoa.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				TuVung a = listDetail.get(0).getListTuVung().get(id);
//				Toast.makeText(getApplicationContext(), "" + a.getTu(),
//						Toast.LENGTH_LONG).show();
				ttobj.speak(a.getTu(), TextToSpeech.QUEUE_FLUSH, null);
			}
		});
		ttobj = new TextToSpeech(getApplicationContext(),
				new TextToSpeech.OnInitListener() {
					@Override
					public void onInit(int status) {
						if (status != TextToSpeech.ERROR) {
							ttobj.setLanguage(Locale.US);
						}
					}
				});

	
	}
	void getWigetsControl(){
		tv1=(TextView)findViewById(R.id.txtTu);
		tv2=(TextView)findViewById(R.id.txtLoaiTu);
		tv3=(TextView)findViewById(R.id.txtNghiaTU);
		tv4=(TextView)findViewById(R.id.txtCauVidu);
		tv5=(TextView)findViewById(R.id.txtNghiaCau);
		btnback=(ImageView)findViewById(R.id.imgBack);
		btnnext=(ImageView)findViewById(R.id.imgNext);
		btnLoa=(ImageButton)findViewById(R.id.imageLoa);
	}
}
