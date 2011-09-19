package com.DataRack.android.dashboard;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ArrayAdapter;

public class DashBoardAdapter extends ArrayAdapter<DashBoardAdapter.DashBoardItem> {

	public static class DashBoardItem{
		public String name;
		public Bitmap icon;
	}		
		
	public DashBoardAdapter(Context context, int textViewResourceId,
			DashBoardItem[] objects) {

		super(context, textViewResourceId, objects);
		// TODO Auto-generated constructor stub
	}
}
