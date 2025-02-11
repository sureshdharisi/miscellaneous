/**
 * 
 */

var restapp=angular.module("angularservciesmodule",[])
					.controller("angularservicescontroller",function($scope,$http,$log){
						var successcallback=function(response){
								$scope.employees=response.data.empDetails;
								$log.info(response);
							}
						var errorcallback=function(reason){
								$scope.error=reason.data;
								$log.info(reason);
							}
							$http({
								method: "GET",
								url:"/AngularRestServices/services/angular-services/employees/get/10"
							})
							.then(successcallback,errorcallback);
							
					});

var customapp=angular.module("custommodule",[])
					.controller("customcontroller",function($scope,$log,stringService){
						$scope.transformString=function(src){
							if(!src){
								return src;
							}
							
							var output="";
							for(i=0;i<src.length;i++){
								if(i>0&& src[i]==src[i].toUpperCase()){
									output=output+" ";
								}
								output=output+src[i];
							}
							
							$scope.output=output;
						};
						
						$scope.transform=function(src){
							$log.info("Src==="+src)
							$scope.output1=stringService.processString(src);
						}
					});
							
var restdynamicapp=angular.module("restdynamicmodule",[])
					.controller("restdynamiccontroller",function($scope,$http){
						$scope.getemployees=function($scope,$http){
							$http.get("/AngularRestServices/services/angular-services/employees/get/"+$scope.count)
							.then(function(response){
								$scope.employees=response.data.empDetails;
							});
						}
					});
		
