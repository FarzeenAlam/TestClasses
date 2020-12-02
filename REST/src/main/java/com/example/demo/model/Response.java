package com.example.demo.model;

public class Response {
	
	private int returnCode;
	private String returnMessage;
	private student returnData;
	private String returnType;
	
	public Response() {
	}

	public int getReturnCode() {
		return returnCode;
	}

	public void setReturnCode(int returnCode) {
		this.returnCode = returnCode;
	}

	public String getReturnMessage() {
		return returnMessage;
	}

	public void setReturnMessage(String returnMessage) {
		this.returnMessage = returnMessage;
	}


	
	@Override
	public String toString() {
		return "Response [returnCode=" + returnCode + ", returnMessage=" + returnMessage + ", returnData=" + returnData
				+ ", returnType=" + returnType + "]";
	}

	public student getReturnData() {
		return returnData;
	}

	public void setReturnData(student returnData) {
		this.returnData = returnData;
	}

	public String getReturnType() {
		return returnType;
	}

	public void setReturnType(String returnType) {
		this.returnType = returnType;
	}
	
	

}
