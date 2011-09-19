package com.DataRack.android.dashboard;

import java.util.List;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

public class DashBoardAdapter extends ArrayAdapter<DashBoardAdapter.DashBoardItem> {

	public static class DashBoardItem{
		public String name;
		public Bitmap icon;
	}
	
	private static class ViewHolder{
		public ImageView item;
		
		public ViewHolder(ImageView item){
			this.item = item;
		}
	}
		
	public DashBoardAdapter(Context context, int textViewResourceId,
			DashBoardItem[] objects) {

		super(context, textViewResourceId, objects);
		this.textViewResourceId = textViewResourceId;
	}
	
	private LayoutInflater inflater;
	private int textViewResourceId;
	
	public DashBoardAdapter(Context context, int textViewResourceId,
			List<DashBoardItem> objects) {
	
		super(context, textViewResourceId, objects);

		inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

		this.textViewResourceId = textViewResourceId;
		setNotifyOnChange(false);
	}
	
	@Override
	public View getView(final int position, View convertView, ViewGroup parent) {

		DashBoardItem item = getItem(position);
		ViewHolder holder = null;
		
		if (convertView == null){
			
			convertView = inflater.inflate(textViewResourceId, null);
			holder = new ViewHolder(
					(ImageView) convertView.findViewWithTag("icon"));
			convertView.setTag(holder);
			
		} else {
			holder = (ViewHolder) convertView.getTag();
		}

		holder.item.setImageBitmap(item.icon);

		return convertView;
	}
}
