/**
 * 
 */
var app = angular.module("jsonsModule", [])
	
	.controller("jsonsController",function($scope){
		var employees=[
			{name:"Ben", dateOfBirth: new Date("November 23, 1980"), gender: "Male", salary: 55000.788, city:"London"},
			{name:"Sara", dateOfBirth: new Date("May 05, 1970"), gender: "Female", salary: 68000, city:"Bangalore"},
			{name:"Mark", dateOfBirth: new Date("AUgust 15, 1974"), gender: "Male", salary: 57000, city:"London"},
			{name:"Pam", dateOfBirth: new Date("October 27, 1979"), gender: "Female", salary: 53000, city:"Bangalore"},
			{name:"Todd", dateOfBirth: new Date("December 30, 1983"), gender: "Male", salary: 60000, city:"London"}
		];
		
		var empBasicDetails=[
			{name:'Ben', gender: 'Male', salary: 55000.788, city:'London'},
			{name:'Sara', gender: 'Female', salary: 68000, city:'Bangalore'},
			{name:'Mark', gender: 'Male', salary: 57000, city:'London'},
			{name:'Pam', gender: 'Female', salary: 53000, city:'Bangalore'},
			{name:'Todd', gender: 'Male', salary: 60000, city:'London'}
		];
		
		$scope.empBasicDetails=empBasicDetails;
		$scope.employees=employees;
		$scope.rowLimit=1;
		$scope.sortColumn="name";

		$scope.showName=true;
		$scope.showDob=true;
		$scope.showGender=true;
		$scope.showSal=true;
		$scope.showCity=true;
		
		$scope.reverseSort=false;
		
		$scope.sortData=function(column){
			$scope.reverseSort=($scope.sortColumn==column)?!$scope.reverseSort:false;
			$scope.sortColumn=column;
		}
		
		$scope.getSortClass=function(column){
			if($scope.sortColumn==column){
				return $scope.reverseSort ? 'arrow-down':'arrow-up';
			}
			return "";
		}
		
		$scope.search=function(item){
			if($scope.searchEmp==undefined){
				return true;
			}else{
				if(item.name.toLocaleLowerCase().indexOf($scope.searchEmp.toLowerCase())!=-1||
						item.city.toLocaleLowerCase().indexOf($scope.searchEmp.toLowerCase())!=-1){
					return true;
				}
			}
			
			return false;
		}
		
		var customemployees=[
			{name:"Ben", dateOfBirth: new Date("November 23, 1980"), gender: 1, salary: 55000.788, city:"London"},
			{name:"Sara", dateOfBirth: new Date("May 05, 1970"), gender: 2, salary: 68000, city:"Bangalore"},
			{name:"Mark", dateOfBirth: new Date("AUgust 15, 1974"), gender: 1, salary: 57000, city:"London"},
			{name:"Pam", dateOfBirth: new Date("October 27, 1979"), gender: 2, salary: 53000, city:"Bangalore"},
			{name:"Todd", dateOfBirth: new Date("December 30, 1983"), gender: 1, salary: 60000, city:"London"}
		];
		
		$scope.customemployees=customemployees;
		
		$scope.includeDetailsView="nginclude_table.html";
		$scope.includeDetailsListView="nginclude_list.html";
	})