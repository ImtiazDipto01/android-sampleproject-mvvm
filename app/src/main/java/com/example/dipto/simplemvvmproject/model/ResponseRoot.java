package com.example.dipto.simplemvvmproject.model;

import com.google.gson.annotations.SerializedName;

public class ResponseRoot{

	@SerializedName("data")
	private Data data;

	@SerializedName("error")
	private int error;

	@SerializedName("errorMsg")
	private String errorMsg;

	public void setData(Data data){
		this.data = data;
	}

	public Data getData(){
		return data;
	}

	public void setError(int error){
		this.error = error;
	}

	public int getError(){
		return error;
	}

	public void setErrorMsg(String errorMsg){
		this.errorMsg = errorMsg;
	}

	public String getErrorMsg(){
		return errorMsg;
	}

	@Override
 	public String toString(){
		return 
			"ResponseRoot{" + 
			"data = '" + data + '\'' + 
			",error = '" + error + '\'' + 
			",errorMsg = '" + errorMsg + '\'' + 
			"}";
		}
}