/**
 * 
 */

var restapp=angular.module("restmodule",[])
					.controller("restcontroller",function($scope,$http){
							$http.get("/AngularRestServices/services/angular-services/employees/get/10")
							.then(function(response){
								$scope.employees=response.data.empDetails;
							});
					})
					.controller("restdynamiccontroller",function($scope,$http,$log){
						
						$scope.employees=[];
						$scope.getemployees=function(count){
							$log.info("Action invoked === "+count)
							$http.get("/AngularRestServices/services/angular-services/employees/get/"+count)
							.then(function(response){
								$scope.employees=response.data.empDetails;
							});
						};
					});
		
