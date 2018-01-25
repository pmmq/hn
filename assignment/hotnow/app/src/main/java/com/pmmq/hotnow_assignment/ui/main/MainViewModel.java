package com.pmmq.hotnow_assignment.ui.main;

import java.util.List;

import javax.inject.Inject;

import com.pmmq.hotnow_assignment.HNApplicaiton;
import com.pmmq.hotnow_assignment.data.ApplicationData;
import com.pmmq.hotnow_assignment.data.entity.HotNowData;

public class MainViewModel {
	
	@Inject ApplicationData mApplicationData;
	
	private List<HotNowData> mDataList;
	
	public MainViewModel(HNApplicaiton applicaiton) {
		applicaiton.getApplicationComponent().inject(this);
	}
	
	public List<HotNowData> getDataList(){
		if(mDataList == null){
			mDataList = mApplicationData.getHotData();
		}
		return mDataList;
	}
	
}
