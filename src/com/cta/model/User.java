package com.cta.model;

public class User {
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getSalutation() {
		return salutation;
	}
	public void setSalutation(String salutation) {
		this.salutation = salutation;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTimeZone() {
		return timeZone;
	}
	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}
	public String getDateFormat() {
		return dateFormat;
	}
	public void setDateFormat(String dateFormat) {
		this.dateFormat = dateFormat;
	}
	public String getPmc() {
		return pmc;
	}
	public void setPmc(String pmc) {
		this.pmc = pmc;
	}
	public String getPrimaryLanguage() {
		return primaryLanguage;
	}
	public void setPrimaryLanguage(String primaryLanguage) {
		this.primaryLanguage = primaryLanguage;
	}
	public String getSecondaryLanguage() {
		return secondaryLanguage;
	}
	public void setSecondaryLanguage(String secondaryLanguage) {
		this.secondaryLanguage = secondaryLanguage;
	}
	public Password getPassword() {
		return password;
	}
	public void setPassword(Password password) {
		this.password = password;
	}
	
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getGmtOffset() {
		return gmtOffset;
	}
	public void setGmtOffset(String gmtOffset) {
		this.gmtOffset = gmtOffset;
	}	
	
	private String userName;
	private String salutation;
	private String firstName;
	private String lastName;
	private String address1;
	private String address2;
	private String city;
	private String countryCode;
	private String state;
	private String zipCode;
	private String phone;
	private String fax;
	private String email;
	private String timeZone;
	private String dateFormat;
	private String pmc;
	private String primaryLanguage;
	private String secondaryLanguage;
	private Password password;
	private String gmtOffset;
	
}
