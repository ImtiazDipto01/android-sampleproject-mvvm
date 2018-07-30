package com.example.dipto.simplemvvmproject.model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Data{

	@SerializedName("current_date")
	private String currentDate;

	@SerializedName("shops")
	private List<ShopsItem> shops;

	@SerializedName("users")
	private Users users;

	public void setCurrentDate(String currentDate){
		this.currentDate = currentDate;
	}

	public String getCurrentDate(){
		return currentDate;
	}

	public void setShops(List<ShopsItem> shops){
		this.shops = shops;
	}

	public List<ShopsItem> getShops(){
		return shops;
	}

	public void setUsers(Users users){
		this.users = users;
	}

	public Users getUsers(){
		return users;
	}

	@Override
 	public String toString(){
		return 
			"Data{" + 
			"current_date = '" + currentDate + '\'' + 
			",shops = '" + shops + '\'' + 
			",users = '" + users + '\'' + 
			"}";
		}
}