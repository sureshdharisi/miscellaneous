/**
 * 
 */

var imageApp = angular.module("twowaybindingModule", [])

	.controller("twowaybindingController", function($scope) {

		$scope.message = "Two way binding message";
		var employee = {
			firstName : "Suresh",
			lastName : "Dharisi",
			gender : "Male"
		}
		$scope.emp = employee;
	})