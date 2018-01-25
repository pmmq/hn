package com.pmmq.hotnow_assignment.databinding;

import android.databinding.BindingAdapter;
import android.support.v7.widget.AppCompatImageButton;
import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.AppCompatTextView;
import android.widget.ImageView;

import java.text.DecimalFormat;

import com.bumptech.glide.Glide;
import com.pmmq.hotnow_assignment.HNApplicaiton;

/**
 * Created by Pub on 25/01/2018.
 */

public class ItemBInding {
	
	@BindingAdapter({"android:setSrc"})
	public static void setImageViewResource(AppCompatImageView imageView, String resource) {
		Glide.with(HNApplicaiton.getmApplication()).load(resource).into(imageView);
	}
	
	@BindingAdapter({"android:setDecimal"})
	public static void setTwoDecimal(AppCompatTextView textView, double val) {
		textView.setText(new DecimalFormat("##.##").format(val) + "กม.");
	}
	
	
}
