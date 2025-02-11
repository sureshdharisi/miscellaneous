/**
 * 
 */
var app = angular.module("ngrepeatModule", [])

	.controller("ngrepeatController", function($scope) {

		var employees = [



			{
				firstName : "Suresh1",
				lastName : "Dharisi1",
				gender : "Male",
				sal : 10000
			},

			{
				firstName : "Suresh2",
				lastName : "Dharisi2",
				gender : "Male",
				sal : 11000
			},

			{
				firstName : "Suresh3",
				lastName : "Dharisi3",
				gender : "Male",
				sal : 12000
			},

			{
				firstName : "Suresh4",
				lastName : "Dharisi4",
				gender : "Male",
				sal : 13000
			},

			{
				firstName : "Suresh5",
				lastName : "Dharisi5",
				gender : "Male",
				sal : 14000
			}

		];



		$scope.emps = employees;



		var countrys = [



			{
				name : "UK",

				cities : [

					{
						name : "London"
					},

					{
						name : "Manchester"
					},

					{
						name : "Birmgham"
					}

				]
			},

			{
				name : "US",

				cities : [

					{
						name : "New York"
					},

					{
						name : "New Jersy"
					},

					{
						name : "Washington D.C."
					}

				]
			},

			{
				name : "India",

				cities : [

					{
						name : "Bangalore"
					},

					{
						name : "Nellore"
					},

					{
						name : "Chennai"
					}

				]
			}

		];



		$scope.countries = countrys;

	});