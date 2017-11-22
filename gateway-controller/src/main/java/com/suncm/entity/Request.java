package com.suncm.entity;

import java.util.Map;


/**
 * Created by sunchangming on 2017/11/20.
 */
public class Request {
	

	//服务类型
	protected String serviceType = "";

	//数据体
	protected Map<String,Object> data;

	public String getServiceType() {
		return serviceType;
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public Map<String, Object> getData() {
		return data;
	}

	public void setData(Map<String, Object> data) {
		this.data = data;
	}
}
