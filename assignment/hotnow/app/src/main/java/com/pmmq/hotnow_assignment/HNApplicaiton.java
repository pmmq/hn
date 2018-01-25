package com.pmmq.hotnow_assignment;

import android.app.Application;

import com.pmmq.hotnow_assignment.di.ApplicaitonComponent;
import com.pmmq.hotnow_assignment.di.DaggerApplicaitonComponent;
import com.pmmq.hotnow_assignment.di.module.ApplicationModule;

public class HNApplicaiton extends Application {
	
	private static HNApplicaiton mApplication;
	private static ApplicaitonComponent applicaitonComponent;
	@Override
	public void onCreate() {
		super.onCreate();
		mApplication = this;
		applicaitonComponent = DaggerApplicaitonComponent.builder()
				.applicationModule(new ApplicationModule(mApplication))
				.build();
		
	}
	
	public static HNApplicaiton getmApplication() {
		return mApplication;
	}
	
	public ApplicaitonComponent getApplicationComponent() {
		return applicaitonComponent;
	}
	
}
