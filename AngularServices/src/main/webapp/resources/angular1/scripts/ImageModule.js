/**
 * 
 */

///<reference path="/AngularProject/angular.js" />





var imageApp = angular.module("ngsrcModule", [])

	.controller("ngSrcController", function($scope) {

		var company = {
			"name" : "Infinite",

			"flag" : "/AngularProject/Images/infinite.png"
		};



		$scope.company = company;

	})