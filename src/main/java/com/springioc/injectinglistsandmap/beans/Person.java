package com.springioc.injectinglistsandmap.beans;

import java.util.List;
import java.util.Map;

public class Person {
	List<String> cars;
	Map<String, String> details;

	public List<String> getCars() {
		return cars;
	}

	public void setCars(List<String> cars) {
		this.cars = cars;
	}

	public Map<String, String> getDetails() {
		return details;
	}

	public void setDetails(Map<String, String> details) {
		this.details = details;
	}

}
