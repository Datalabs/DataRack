package com.DataRack.android;

import com.DataRack.android.dashboard.DashBoard;

import android.app.Activity;
import android.os.Bundle;

public class DataRack extends Activity {

	private DashBoard _dashborad;

	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        findViews();
        setListeners();
    }
	
	private void findViews(){
		_dashborad = (DashBoard)findViewById(R.id.dashboard);
	}
	
	private void setListeners(){
	// TODO イベント設定。
	}
}