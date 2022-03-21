package com.springREST.info;

public class Information {
	
private String state;
private String city;
private String country;
private String zip;

public Information() {
	}

    public Information(String state, String city, String country, String zip) {
	super();
	this.state = state;
	this.city = city;
	this.country = country;
	this.zip = zip;
}
	public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public String getZip() {
	return zip;
}
public void setZip(String zip) {
	this.zip = zip;
}
	

}
