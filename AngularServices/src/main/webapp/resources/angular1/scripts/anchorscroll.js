/**
 * 
 */

var restapp=angular.module("anchormodule",[])
					
					.controller("anchorcontroller",function($scope,$http,$log,$location,$anchorScroll){
						
						$scope.employees=[];
						$scope.getemployees=function(count){
							$log.info("Action invoked === "+count)
							$http.get("/AngularRestServices/services/angular-services/employees/get/"+count)
							.then(function(response){
								$scope.employees=response.data.empDetails;
							});
						};
						$scope.scrollTo=function(scrollLocation){
							$location.hash(scrollLocation);
							$anchorScroll.yOffset=20;
							$anchorScroll();
						}
					});
		
