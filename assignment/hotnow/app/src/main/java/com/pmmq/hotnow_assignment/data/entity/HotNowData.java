package com.pmmq.hotnow_assignment.data.entity;

import com.google.gson.annotations.SerializedName;

public class HotNowData {

	@SerializedName("company_profile_image")
	String mCompanyProfileImage;
	@SerializedName("deal_title")
	String mDealTitle;
	@SerializedName("deal_description")
	String mDealDescription;
	@SerializedName("deal_image")
	String mDealImage;
	@SerializedName("distance")
	double mDistance;
	@SerializedName("company_name")
	String mCompanyName;
	
	public String getCompanyProfileImage() {
		return mCompanyProfileImage;
	}
	
	public String getDealTitle() {
		return mDealTitle;
	}
	
	public String getDealDescription() {
		return mDealDescription;
	}
	
	public String getDealImage() {
		return mDealImage;
	}
	
	public double getDistance() {
		return mDistance;
	}
	
	public String getCompanyName() {
		return mCompanyName;
	}
}
