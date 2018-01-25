package com.pmmq.hotnow_assignment.data;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.LinkedList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.pmmq.hotnow_assignment.HNApplicaiton;
import com.pmmq.hotnow_assignment.R;
import com.pmmq.hotnow_assignment.data.Response.HotResponse;
import com.pmmq.hotnow_assignment.data.entity.HotNowData;

public class ApplicationData {
	
	HNApplicaiton mApplicaiton;
	
	public ApplicationData(HNApplicaiton applicaiton) {
		mApplicaiton = applicaiton;
	}
	
	public List<HotNowData> getHotData() {
		InputStream is = mApplicaiton.getApplicationContext().getResources().openRawResource(R.raw.hot_now_data);
		Writer writer = new StringWriter();
		char[] buffer = new char[1024];
		try {
			Reader reader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
			int n;
			while ((n = reader.read(buffer)) != -1) {
				writer.write(buffer, 0, n);
			}
			is.close();
		}catch(UnsupportedEncodingException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		String jsonString = writer.toString();
		HotResponse response = new Gson().fromJson(jsonString, HotResponse.class);
		return response != null ? response.getHotNowData() : new LinkedList<HotNowData>();
	}
}
