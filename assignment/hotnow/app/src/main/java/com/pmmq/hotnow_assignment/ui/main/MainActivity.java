package com.pmmq.hotnow_assignment.ui.main;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;

import javax.inject.Inject;

import com.pmmq.hotnow_assignment.HNApplicaiton;
import com.pmmq.hotnow_assignment.R;
import com.pmmq.hotnow_assignment.databinding.ActivityMainBinding;
import com.pmmq.hotnow_assignment.ui.BaseActivity;

public class MainActivity extends BaseActivity<ActivityMainBinding> {
	
	@Inject HNApplicaiton mApplicaiton;
	MainViewModel mMainViewModel;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		mMainViewModel = new MainViewModel(mApplicaiton);
		DetailAdapter mAdapter = new DetailAdapter(mMainViewModel.getDataList());
		dataBinding.rvData.setLayoutManager(new LinearLayoutManager(this));
		dataBinding.rvData.setAdapter(mAdapter);
		dataBinding.rvData.setHasFixedSize(true);
	}
	
	@Override
	public int getLayouteRes() {
		return R.layout.activity_main;
	}
	
	@Override
	public void inject() {
		((HNApplicaiton) getApplication()).getApplicationComponent().inject(this);
	}
}
