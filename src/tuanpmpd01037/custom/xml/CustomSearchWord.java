package tuanpmpd01037.custom.xml;

import java.util.List;

import tuanpmpd01037.duan1.R;
import tuanpmpd01037.object.Word;


import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomSearchWord extends BaseAdapter {

	List<Word> list_sort;

	public Activity context;
	public LayoutInflater inflater;

	public CustomSearchWord(Activity context, List<Word> list_sort) {
		super();

		this.context = context;
		this.list_sort = list_sort;
		this.inflater = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return list_sort.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return list_sort.get(position);
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}

	public static class ViewHolder {
		TextView textTu ;
		TextView textNghia;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub

		ViewHolder holder;
		if (convertView == null) {
			holder = new ViewHolder();
			convertView = inflater.inflate(R.layout.item_search, null);

			holder.textTu = (TextView) convertView
					.findViewById(R.id.textTu);
			holder.textNghia = (TextView) convertView
					.findViewById(R.id.textNghiaTu);

			convertView.setTag(holder);
		} else
			holder = (ViewHolder) convertView.getTag();

		Word _entry = (Word) list_sort.get(position);
		// holder.imgLogoTaxi.setImageResource(_Word.getLogoTaxi());
		holder.textTu.setText(_entry.getTu());
		holder.textNghia.setText(_entry.getNghiaTu());

		return convertView;
	}

}
