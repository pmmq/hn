package com.pmmq.hotnow_assignment.ui.main;

import com.pmmq.hotnow_assignment.data.entity.HotNowData;

public class DetailViewModel {
	
	HotNowData mHotNowData;
	
	public DetailViewModel(final HotNowData hotNowData) {
		mHotNowData = hotNowData;
	}
	
	public HotNowData getHotNowData() {
		return mHotNowData;
	}
}
