/**
 * 
 */

var restapp=angular.module("controllerAsModule",[])
					.controller("controllerAsController",function($http){
							var vm=this;
							$http.get("/AngularRestServices/services/angular-services/employees/get/10")
							.then(function(response){
								vm.employees=response.data.empDetails;
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
		
