package com.ethanbradley.javabootcampassignment10.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Week {
	@JsonProperty("monday")
private DayData monday;
	@JsonProperty("tuesday")
private DayData tuesday;
	@JsonProperty("wednesday")
private DayData wednesday;
	@JsonProperty("thursday")
private DayData thursday;
	@JsonProperty("friday")
private DayData friday;
	@JsonProperty("saturday")
private DayData saturday;
	@JsonProperty("sunday")
private DayData sunday;

public DayData getMonday() {
	return monday;
}
public void setMonday(DayData monday) {
	this.monday = monday;
}
public DayData getTuesday() {
	return tuesday;
}
public void setTuesday(DayData tuesday) {
	this.tuesday = tuesday;
}
public DayData getWednesday() {
	return wednesday;
}
public void setWednesday(DayData wednesday) {
	this.wednesday = wednesday;
}
public DayData getThursday() {
	return thursday;
}
public void setThursday(DayData thursday) {
	this.thursday = thursday;
}
public DayData getFriday() {
	return friday;
}
public void setFriday(DayData friday) {
	this.friday = friday;
}
public DayData getSaturday() {
	return saturday;
}
public void setSaturday(DayData saturday) {
	this.saturday = saturday;
}
public DayData getSunday() {
	return sunday;
}
public void setSunday(DayData sunday) {
	this.sunday = sunday;
}

}
