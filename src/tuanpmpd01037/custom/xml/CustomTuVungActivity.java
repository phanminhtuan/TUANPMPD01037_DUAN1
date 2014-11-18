package tuanpmpd01037.custom.xml;

import java.util.List;

import tuanpmpd01037.duan1.R;
import tuanpmpd01037.object.ChuDe;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomTuVungActivity extends BaseAdapter {

	List<ChuDe> arrayChude;

	public Activity context;
	public LayoutInflater inflater;

	public CustomTuVungActivity(Activity context, List<ChuDe> arrayChude) {
		super();

		this.context = context;
		this.arrayChude = arrayChude;
		this.inflater = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return arrayChude.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return arrayChude.get(position);
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}

	public static class ViewHolder {
		ImageView img;
		TextView txtChude;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub

		ViewHolder holder;
		if (convertView == null) {
			holder = new ViewHolder();
			convertView = inflater.inflate(R.layout.item_tuvung, null);
			holder.img = (ImageView) convertView.findViewById(R.id.imageChude);
			holder.txtChude = (TextView) convertView.findViewById(R.id.txtChude);

			convertView.setTag(holder);
		} else
			holder = (ViewHolder) convertView.getTag();

		ChuDe _entry = (ChuDe) arrayChude.get(position);
		holder.img.setImageResource(_entry.getImage());
		holder.txtChude.setText(_entry.getIdChude());

		return convertView;
	}

}
