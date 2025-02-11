/**
 * 
 */

var app=angular.module("nestedModule",[])
				.controller("countryController",function($scope){
					$scope.name="India";
				})
				.controller("stateController",function($scope){
					$scope.name="Karnataka";
				})
				.controller("cityController",function($scope){
					$scope.name="Bangalore";
				})
				.controller("countryAsController",function(){
					this.name="India";
				})
				.controller("stateAsController",function(){
					this.name="Karnataka";
				})
				.controller("cityAsController",function(){
					this.name="Bangalore";
				});