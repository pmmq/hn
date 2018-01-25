package com.pmmq.hotnow_assignment.ui;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Pub on 25/01/2018.
 */

public abstract class BaseActivity<DB extends ViewDataBinding> extends AppCompatActivity {
	
	public DB dataBinding;
	
	@LayoutRes
	public abstract int getLayouteRes();
	
	@Override
	protected void onCreate(@Nullable final Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		inject();
		dataBinding = DataBindingUtil.setContentView(this, getLayouteRes());
	}
	
	public abstract void inject();
	
}
