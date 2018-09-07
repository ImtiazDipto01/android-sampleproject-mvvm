package com.example.dipto.simplemvvmproject.model;

import com.google.gson.annotations.SerializedName;

public class ShopsItem{

	@SerializedName("street_address")
	private String streetAddress;

	@SerializedName("process_id")
	private String processId;

	@SerializedName("last_sync")
	private Object lastSync;

	@SerializedName("cash_in")
	private int cashIn;

	@SerializedName("buy")
	private int buy;

	@SerializedName("thana_id")
	private int thanaId;

	@SerializedName("process_at")
	private String processAt;

	@SerializedName("created_at")
	private String createdAt;

	@SerializedName("shop_name")
	private String shopName;

	@SerializedName("shop_image")
	private String shopImage;

	@SerializedName("sale")
	private int sale;

	@SerializedName("trade_license")
	private String tradeLicense;

	@SerializedName("updated_at")
	private String updatedAt;

	@SerializedName("cash_out")
	private int cashOut;

	@SerializedName("id")
	private int id;

	@SerializedName("district_id")
	private int districtId;

	@SerializedName("process_updated_at")
	private String processUpdatedAt;

	@SerializedName("shopowner_id")
	private int shopownerId;

	public void setStreetAddress(String streetAddress){
		this.streetAddress = streetAddress;
	}

	public String getStreetAddress(){
		return streetAddress;
	}

	public void setProcessId(String processId){
		this.processId = processId;
	}

	public String getProcessId(){
		return processId;
	}

	public void setLastSync(Object lastSync){
		this.lastSync = lastSync;
	}

	public Object getLastSync(){
		return lastSync;
	}

	public void setCashIn(int cashIn){
		this.cashIn = cashIn;
	}

	public int getCashIn(){
		return cashIn;
	}

	public void setBuy(int buy){
		this.buy = buy;
	}

	public int getBuy(){
		return buy;
	}

	public void setThanaId(int thanaId){
		this.thanaId = thanaId;
	}

	public int getThanaId(){
		return thanaId;
	}

	public void setProcessAt(String processAt){
		this.processAt = processAt;
	}

	public String getProcessAt(){
		return processAt;
	}

	public void setCreatedAt(String createdAt){
		this.createdAt = createdAt;
	}

	public String getCreatedAt(){
		return createdAt;
	}

	public void setShopName(String shopName){
		this.shopName = shopName;
	}

	public String getShopName(){
		return shopName;
	}

	public void setShopImage(String shopImage){
		this.shopImage = shopImage;
	}

	public String getShopImage(){
		return shopImage;
	}

	public void setSale(int sale){
		this.sale = sale;
	}

	public int getSale(){
		return sale;
	}

	public void setTradeLicense(String tradeLicense){
		this.tradeLicense = tradeLicense;
	}

	public String getTradeLicense(){
		return tradeLicense;
	}

	public void setUpdatedAt(String updatedAt){
		this.updatedAt = updatedAt;
	}

	public String getUpdatedAt(){
		return updatedAt;
	}

	public void setCashOut(int cashOut){
		this.cashOut = cashOut;
	}

	public int getCashOut(){
		return cashOut;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setDistrictId(int districtId){
		this.districtId = districtId;
	}

	public int getDistrictId(){
		return districtId;
	}

	public void setProcessUpdatedAt(String processUpdatedAt){
		this.processUpdatedAt = processUpdatedAt;
	}

	public String getProcessUpdatedAt(){
		return processUpdatedAt;
	}

	public void setShopownerId(int shopownerId){
		this.shopownerId = shopownerId;
	}

	public int getShopownerId(){
		return shopownerId;
	}

	@Override
 	public String toString(){
		return 
			"ShopsItem{" + 
			"street_address = '" + streetAddress + '\'' + 
			",process_id = '" + processId + '\'' + 
			",last_sync = '" + lastSync + '\'' + 
			",cash_in = '" + cashIn + '\'' + 
			",buy = '" + buy + '\'' + 
			",thana_id = '" + thanaId + '\'' + 
			",process_at = '" + processAt + '\'' + 
			",created_at = '" + createdAt + '\'' + 
			",shop_name = '" + shopName + '\'' + 
			",shop_image = '" + shopImage + '\'' + 
			",sale = '" + sale + '\'' + 
			",trade_license = '" + tradeLicense + '\'' + 
			",updated_at = '" + updatedAt + '\'' + 
			",cash_out = '" + cashOut + '\'' + 
			",id = '" + id + '\'' + 
			",district_id = '" + districtId + '\'' + 
			",process_updated_at = '" + processUpdatedAt + '\'' + 
			",shopowner_id = '" + shopownerId + '\'' + 
			"}";
		}
}