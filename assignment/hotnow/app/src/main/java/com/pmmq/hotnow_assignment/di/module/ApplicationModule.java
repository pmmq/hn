package com.pmmq.hotnow_assignment.di.module;

import android.content.Context;
import android.content.SharedPreferences;

import javax.inject.Named;
import javax.inject.Singleton;

import com.pmmq.hotnow_assignment.HNApplicaiton;
import com.pmmq.hotnow_assignment.data.ApplicationData;
import dagger.Module;
import dagger.Provides;

@Module
public class ApplicationModule {
	
	HNApplicaiton mApplication;
	
	public ApplicationModule(final HNApplicaiton application) {
		mApplication = application;
	}
	
	@Provides
	@Singleton
	HNApplicaiton provideApplication() {
		return mApplication;
	}
	
	@Provides
	@Singleton
	ApplicationData provideApplicationData(HNApplicaiton application) {
		return new ApplicationData(application);
	}
}
