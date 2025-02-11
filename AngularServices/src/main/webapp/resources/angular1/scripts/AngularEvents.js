/**
 * 
 */

var eventapp=angular.module("eventModule",[])
					.controller("eventController", function($scope) {
						var technologies=[
							{name:"Java", likes:0, dislikes:0},
							{name:"Spring", likes:0, dislikes:0},
							{name:"Hibernate", likes:0, dislikes:0},
							{name:"Webservices", likes:0, dislikes:0}
						];
						$scope.technos=technologies;
						
						$scope.incrementLikes=function(tech){
							tech.likes++;
						}
						$scope.incrementDisLikes=function(tech){
							tech.dislikes++;
						}
					})