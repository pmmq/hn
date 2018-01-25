package com.pmmq.hotnow_assignment.ui.main;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import com.pmmq.hotnow_assignment.R;
import com.pmmq.hotnow_assignment.data.entity.HotNowData;
import com.pmmq.hotnow_assignment.databinding.ItemHnBinding;


public class DetailAdapter extends RecyclerView.Adapter<DetailAdapter.DetailHolder> {
	
	List<HotNowData> mHotNowData;
	LayoutInflater inflater;
	public DetailAdapter(final List<HotNowData> hotNowData) {
		mHotNowData = hotNowData;
	}
	
	@Override
	public DetailHolder onCreateViewHolder(final ViewGroup parent, final int viewType) {
		if (inflater == null) {
			inflater = LayoutInflater.from(parent.getContext());
		}
		ItemHnBinding holderBinding = DataBindingUtil.inflate(inflater, viewType, parent, false);
		return new DetailHolder(holderBinding);
	}
	
	@Override
	public int getItemViewType(final int position) {
		return R.layout.item_hn;
	}
	
	@Override
	public void onBindViewHolder(final DetailHolder holder, final int position) {
		DetailViewModel item = new DetailViewModel(mHotNowData.get(position));
		holder.mBinding.setVm(item);
	}
	
	@Override
	public int getItemCount() {
		return mHotNowData.size();
	}
	
	public class DetailHolder extends RecyclerView.ViewHolder{
		ItemHnBinding mBinding;
		
		public DetailHolder(final ItemHnBinding binding) {
			super(binding.getRoot());
			mBinding = binding;
		}
	}
	
}
