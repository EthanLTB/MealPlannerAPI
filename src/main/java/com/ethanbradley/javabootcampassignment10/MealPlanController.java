package com.ethanbradley.javabootcampassignment10;

import java.net.URI;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.ethanbradley.javabootcampassignment10.DTO.DayResponse;
import com.ethanbradley.javabootcampassignment10.DTO.WeekResponse;

@RestController
public class MealPlanController {

	@Value("${spoonacular.urls.base}")
	private String base;

	@Value("${apiKey}")
	private String apiKey;

	@GetMapping("mealplanner/week")

	public ResponseEntity<WeekResponse> getWeekMeals(Optional<String> numCalories, Optional<String> diet,
			Optional<String> exclusions) {

		RestTemplate weekResponseTemplate = new RestTemplate();
		URI weekUri = UriComponentsBuilder.fromHttpUrl(base)
										  .queryParam("timeFrame", "week")
									   	  .queryParamIfPresent("targetCalories", numCalories)
										  .queryParamIfPresent("diet", diet)
										  .queryParamIfPresent("exclusions", exclusions)
										  .queryParam("apiKey", apiKey)
										  .build()
										  .toUri();

		ResponseEntity<WeekResponse> response = weekResponseTemplate.getForEntity(weekUri, WeekResponse.class);
		return response;

	}

	@GetMapping("mealplanner/day")

	public ResponseEntity<DayResponse> getDayMeals(Optional<String> numCalories, Optional<String> diet,
			Optional<String> exclusions) {

		RestTemplate weekResponseTemplate = new RestTemplate();
		URI dayUri = UriComponentsBuilder.fromHttpUrl(base)
				                         .queryParam("timeFrame", "day")
				                         .queryParamIfPresent("targetCalories", numCalories)
				                         .queryParamIfPresent("diet", diet)
				                         .queryParamIfPresent("exclusions", exclusions)
				                         .queryParam("apiKey", apiKey)
				                         .build()
				                         .toUri();

		ResponseEntity<DayResponse> response = weekResponseTemplate.getForEntity(dayUri, DayResponse.class);
		return response;

	}
}
