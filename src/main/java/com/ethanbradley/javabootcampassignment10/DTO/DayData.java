package com.ethanbradley.javabootcampassignment10.DTO;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DayData {

	@JsonProperty("meals")
	private List<Meals> meals;
	@JsonProperty("nutrients")
	private NutrientsData nutrients;

	public List<Meals> getMeals() {
		return meals;
	}

	public void setMeals(List<Meals> meals) {
		this.meals = meals;
	}

	public NutrientsData getNutrients() {
		return nutrients;
	}

	public void setNutrients(NutrientsData nutrients) {
		this.nutrients = nutrients;

	}
}