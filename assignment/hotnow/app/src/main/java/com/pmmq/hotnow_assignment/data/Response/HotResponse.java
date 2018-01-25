package com.pmmq.hotnow_assignment.data.Response;

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.pmmq.hotnow_assignment.data.entity.HotNowData;

/**
 * Created by Pub on 25/01/2018.
 */

public class HotResponse {
	
	@SerializedName("data")
	List<HotNowData> mHotNowData;
	
	public List<HotNowData> getHotNowData() {
		return mHotNowData;
	}
	
}
