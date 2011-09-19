package com.DataRack.android.dashboard;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.GridView;

import com.DataRack.android.dashboard.DashBoardAdapter.DashBoardItem;

public class DashBoard extends GridView {

	private List<DashBoardItem> _items = new ArrayList<DashBoardItem>(6);
	private DashBoardAdapter _adapter;
	
	public DashBoard(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		setDashBorad();
		setListeners();
		setAdapter();
	}
	
	private void setDashBorad(){
		// TODO ここで、アイコンを読み込む。
	}
	
	private void setListeners(){
		// TODO ダッシュボードのイベント設定。
	}
	
	private void setAdapter(){
		// TODO アダプタの設定。
	}
}
