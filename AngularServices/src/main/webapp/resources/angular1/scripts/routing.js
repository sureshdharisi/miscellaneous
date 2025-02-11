/**
 * 
 */

var routinApp=angular.module("routingModule",["ngRoute"])
					.config(function($routeProvider,$locationProvider){
						$locationProvider.hashPrefix('');
						$routeProvider
						.when("/home",{
							templateUrl:"template/home.html",
							controller:"homeController"
						})
						.when("/courses",{
							templateUrl:"template/courses.html",
							controller:"coursesController"
						})
						.when("/students",{
							templateUrl:"template/students.html",
							controller:"studentsController"
						})
						.when("/students/:name",{
							templateUrl:"template/studentsDetails.html",
							controller:"studentDetailsController"
						})
						.otherwise({
							redirectTo:"/home"
						});
					})
					.controller("homeController", function($scope){
						$scope.message="Home page";
					})
					.controller("coursesController", function($scope){
						$scope.message="Course we offer";
					})
					.controller("studentsController", function($scope){
						$scope.message="Students";
					})
					.controller("studentDetailsController",function($scope,$routeParams){
						$scope.name=$routeParams.name;
					});