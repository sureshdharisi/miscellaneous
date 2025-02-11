package com.home.practice.java.collections;

import java.util.Arrays;
import java.util.List;

public class StreamsExample {

	public static void streamStrings() {
		List<String> strList = Arrays.<String>asList("Dharisi", null, "Venkata", "Suresh");

		strList.stream().forEach(System.out::println);
	}

	public static void streamNullList() {
		List<String> strList = null;

		strList.stream().forEach(System.out::println);
	}

	public static void main(String[] args) {
		streamStrings();
		// streamNullList();
	}
}
