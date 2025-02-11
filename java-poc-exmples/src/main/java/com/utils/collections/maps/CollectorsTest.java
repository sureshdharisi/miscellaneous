package com.utils.collections.maps;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.utils.collections.entity.Employee;

public class CollectorsTest {
	
	public static void main(String[] args) {
		
		System.out.println(collectorsUsingSingleGroupByDepartment());
		
		System.out.println(collectorsUsingSingleGroupByDepartmentAndCalculateAge());
		System.out.println(collectorsUsingSingleGroupByDepartmentSorted());
		
		System.out.println(collectorsUsingSingleGroupByDepartmentSorted2());
		
	}
	
	private static Map<String,List<Employee>> collectorsUsingSingleGroupByDepartment() {
		List<Employee> empList=new ArrayList<>();
		empList.add(new Employee("John Doe Sales1", 30, "Sales"));
		empList.add(new Employee("John Doe1 Marketting1", 25, "Marketting"));
		empList.add(new Employee("John Doe Sales2", 40, "Sales"));
		empList.add(new Employee("John Doe1 Marketting2", 35, "Marketting"));
		
		
		return empList.stream().collect(Collectors.groupingBy(Employee::getDepartment));
	}
	
	private static Map<String,List<Employee>> collectorsUsingSingleGroupByDepartmentSorted() {
		List<Employee> empList=new ArrayList<>();
		empList.add(new Employee("John Doe1 Sales1", 30, "Sales"));
		empList.add(new Employee("John Doe1 Marketting1", 25, "Marketting"));
		empList.add(new Employee("John Doe2 Sales2", 40, "Sales"));
		empList.add(new Employee("John Doe2 Marketting2", 35, "Marketting"));
		
		Map<String,List<Employee>> unsortedMap=empList.stream().collect(Collectors.groupingBy(Employee::getDepartment));
		return unsortedMap.entrySet().stream()
				.sorted(Map.Entry.comparingByKey((key1,key2)->key2.compareTo(key1)))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
	}
	
	private static Map<String,String> collectorsUsingSingleGroupByDepartmentSorted2() {
		List<Employee> empList=new ArrayList<>();
		empList.add(new Employee("John Doe1 Sales1", 30, "Sales"));
		empList.add(new Employee("John Doe1 Marketting1", 25, "Marketting"));
		empList.add(new Employee("John Doe2 Sales2", 40, "Sales"));
		empList.add(new Employee("John Doe2 Marketting2", 35, "Marketting"));
		
		Map<String,String> unsortedMap=empList.stream().collect(Collectors.toMap(Employee::getName, Employee::getName));
		return unsortedMap.entrySet().stream()
				.sorted(Map.Entry.comparingByKey((key1,key2)->{
//					System.out.println(key1);
//					System.out.println(key2);
					return key2.compareTo(key1);
				}))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
	}
	
	private static Map<String,Double> collectorsUsingSingleGroupByDepartmentAndCalculateAge() {
		List<Employee> empList=new ArrayList<>();
		empList.add(new Employee("John Doe Sales1", 30, "Sales"));
		empList.add(new Employee("John Doe1 Marketting 1", 25, "Marketting"));
		empList.add(new Employee("John Doe Sales 2", 40, "Sales"));
		empList.add(new Employee("John Doe1 Marketting 2", 35, "Marketting"));
		
		
		return empList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getAge)));
	}

}
