/**
 * 
 */

var restapp=angular.module("countryModule",[])
					.controller("countryController",function($scope,$http,$log,$location,$anchorScroll){
							$http.get("/AngularRestServices/services/angular-services/countries/get")
							.then(function(response){
								$scope.countries=response.data.countries;
							});
							
							$scope.scrollTo=function(countryName){
								$location.hash(countryName);
								$anchorScroll.yOffset=20;
								$anchorScroll();
							}
					})
					;
		
