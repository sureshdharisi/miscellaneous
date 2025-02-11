package com.home.angular.resources.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.ws.rs.core.Response;

import org.springframework.stereotype.Service;

import com.home.angular.resources.CountryResource;
import com.home.angular.response.Country;
import com.home.angular.response.CountryResponse;

@Service
public class CountryResourceImpl implements CountryResource {

	@Override
	public Response getListOfCountries() {
		CountryResponse resp = new CountryResponse();
		List<Country> countryList = new ArrayList<>();
		countryList.add(createCountry("USA",
				Arrays.asList("Atlanta", "New York", "Washington", "Las Vegas", "New Jersy", "Texas")));
		countryList.add(createCountry("INDIA",
				Arrays.asList("Bangalore", "Nellore", "Chennai", "Hyderabad", "New Delhi", "Goa")));
		countryList.add(
				createCountry("UK", Arrays.asList("London", "Paris", "Birmingham", "Frankford", "Britan", "Oslo")));
		resp.setCountries(countryList);
		return Response.ok(resp).build();
	}

	private Country createCountry(String name, List<String> cities) {
		Country cntry = new Country();
		cntry.setCities(cities);
		cntry.setName(name);
		return cntry;
	}

}
