package com.suncm.entity;

import java.util.HashMap;
import java.util.Map;


/**
 * Created by sunchangming on 2017/11/20.
 */
public class Response {
	

	//应答返回码
	protected String resultCode = "";

	//应答数据
	protected Map<String,Object> data = new HashMap<String,Object>();

	public String getResultCode() {
		return resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public Map<String, Object> getData() {
		return data;
	}

	public void setData(Map<String, Object> data) {
		this.data = data;
	}
}
