package com.example.dipto.simplemvvmproject.model;

import com.google.gson.annotations.SerializedName;

public class Users{

	@SerializedName("address")
	private Object address;

	@SerializedName("api_token")
	private String apiToken;

	@SerializedName("nid")
	private Object nid;

	@SerializedName("thana_id")
	private int thanaId;

	@SerializedName("photo")
	private Object photo;

	@SerializedName("active")
	private int active;

	@SerializedName("created_at")
	private String createdAt;

	@SerializedName("notification_id")
	private int notificationId;

	@SerializedName("package_id")
	private int packageId;

	@SerializedName("deleted_at")
	private Object deletedAt;

	@SerializedName("extend_code")
	private Object extendCode;

	@SerializedName("expire_date")
	private String expireDate;

	@SerializedName("deleted")
	private int deleted;

	@SerializedName("trade_license")
	private Object tradeLicense;

	@SerializedName("balance")
	private int balance;

	@SerializedName("updated_at")
	private String updatedAt;

	@SerializedName("phone")
	private String phone;

	@SerializedName("name")
	private String name;

	@SerializedName("fbid")
	private Object fbid;

	@SerializedName("id")
	private int id;

	@SerializedName("district_id")
	private int districtId;

	@SerializedName("email")
	private String email;

	@SerializedName("reseller_id")
	private int resellerId;

	public void setAddress(Object address){
		this.address = address;
	}

	public Object getAddress(){
		return address;
	}

	public void setApiToken(String apiToken){
		this.apiToken = apiToken;
	}

	public String getApiToken(){
		return apiToken;
	}

	public void setNid(Object nid){
		this.nid = nid;
	}

	public Object getNid(){
		return nid;
	}

	public void setThanaId(int thanaId){
		this.thanaId = thanaId;
	}

	public int getThanaId(){
		return thanaId;
	}

	public void setPhoto(Object photo){
		this.photo = photo;
	}

	public Object getPhoto(){
		return photo;
	}

	public void setActive(int active){
		this.active = active;
	}

	public int getActive(){
		return active;
	}

	public void setCreatedAt(String createdAt){
		this.createdAt = createdAt;
	}

	public String getCreatedAt(){
		return createdAt;
	}

	public void setNotificationId(int notificationId){
		this.notificationId = notificationId;
	}

	public int getNotificationId(){
		return notificationId;
	}

	public void setPackageId(int packageId){
		this.packageId = packageId;
	}

	public int getPackageId(){
		return packageId;
	}

	public void setDeletedAt(Object deletedAt){
		this.deletedAt = deletedAt;
	}

	public Object getDeletedAt(){
		return deletedAt;
	}

	public void setExtendCode(Object extendCode){
		this.extendCode = extendCode;
	}

	public Object getExtendCode(){
		return extendCode;
	}

	public void setExpireDate(String expireDate){
		this.expireDate = expireDate;
	}

	public String getExpireDate(){
		return expireDate;
	}

	public void setDeleted(int deleted){
		this.deleted = deleted;
	}

	public int getDeleted(){
		return deleted;
	}

	public void setTradeLicense(Object tradeLicense){
		this.tradeLicense = tradeLicense;
	}

	public Object getTradeLicense(){
		return tradeLicense;
	}

	public void setBalance(int balance){
		this.balance = balance;
	}

	public int getBalance(){
		return balance;
	}

	public void setUpdatedAt(String updatedAt){
		this.updatedAt = updatedAt;
	}

	public String getUpdatedAt(){
		return updatedAt;
	}

	public void setPhone(String phone){
		this.phone = phone;
	}

	public String getPhone(){
		return phone;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setFbid(Object fbid){
		this.fbid = fbid;
	}

	public Object getFbid(){
		return fbid;
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

	public void setEmail(String email){
		this.email = email;
	}

	public String getEmail(){
		return email;
	}

	public void setResellerId(int resellerId){
		this.resellerId = resellerId;
	}

	public int getResellerId(){
		return resellerId;
	}

	@Override
 	public String toString(){
		return 
			"Users{" + 
			"address = '" + address + '\'' + 
			",api_token = '" + apiToken + '\'' + 
			",nid = '" + nid + '\'' + 
			",thana_id = '" + thanaId + '\'' + 
			",photo = '" + photo + '\'' + 
			",active = '" + active + '\'' + 
			",created_at = '" + createdAt + '\'' + 
			",notification_id = '" + notificationId + '\'' + 
			",package_id = '" + packageId + '\'' + 
			",deleted_at = '" + deletedAt + '\'' + 
			",extend_code = '" + extendCode + '\'' + 
			",expire_date = '" + expireDate + '\'' + 
			",deleted = '" + deleted + '\'' + 
			",trade_license = '" + tradeLicense + '\'' + 
			",balance = '" + balance + '\'' + 
			",updated_at = '" + updatedAt + '\'' + 
			",phone = '" + phone + '\'' + 
			",name = '" + name + '\'' + 
			",fbid = '" + fbid + '\'' + 
			",id = '" + id + '\'' + 
			",district_id = '" + districtId + '\'' + 
			",email = '" + email + '\'' + 
			",reseller_id = '" + resellerId + '\'' + 
			"}";
		}
}