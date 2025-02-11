///<reference path="../Scripts/angular.js" />



var myApp = angular.module("firstModule", []);

//create controllers

var firstController = function($scope) {



	$scope.message = "Welcome to create controllers";



};



//register controller to module



myApp.controller("firstController", firstController);



myApp.controller("complexContrller", function($scope) {



	var employee = {
		"name" : "suresh",

		"desig" : "Tech Lead",

		"sal" : "10000"
	}



	$scope.employee = employee;



})



var methodChain = angular

	.module("methodChainModule", [])

	.controller("complexContrller", function($scope) {



		var employee = {
			"name" : "suresh",

			"desig" : "Tech Lead",

			"sal" : "10000"
		}



		$scope.employee = employee;



	});



var twowayDataBinding = angular.module("twowaybinding", [])

	.controller("twowaycontroller", function($scope) {

		$scope.message = "Welcome to angular"

		var employee = {
			"firstName" : "Dharisi",

			"lastName" : "Venkata"
		}



		$scope.emp = employee

	});