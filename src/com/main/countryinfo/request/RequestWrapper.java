package com.main.countryinfo.request;

public class RequestWrapper<T> {
	private String operationName;
	private T payload;
	
	public RequestWrapper(String operationName, T payload) {
		super();
		this.operationName = operationName;
		this.payload = payload;
	}
	public String getOperationName() {
		return operationName;
	}
	public void setOperationName(String operationName) {
		this.operationName = operationName;
	}
	public T getPayload() {
		return payload;
	}
	public void setPayload(T payload) {
		this.payload = payload;
	}

}
