package com.ethanbradley.javabootcampassignment10.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WeekResponse {
	@JsonProperty("week")
	private Week weekData;

	public Week getWeekData() {
		return weekData;
	}

	public void setWeekData(Week weekData) {
		this.weekData = weekData;
	}

}
