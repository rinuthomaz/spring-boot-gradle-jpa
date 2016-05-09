var app = angular.module('myApp', ['ngRoute']);


app.config(function($routeProvider) {
	
	function Hello($scope, $http) {
	    //$http.get('http://127.0.0.1:8080/dei/site/findById/1').
		$http.get('http://rest-service.guides.spring.io/greeting').
	        success(function(data) {
	            $scope.greeting = data;
	        });
	}

  $routeProvider

  .when('/', {
    templateUrl : 'home',
    controller  : 'HomeController'
  })

  .when('/blog', {
    templateUrl : './static/blog.html',
    
  })

  .when('/about', {
    templateUrl : '../static/about.html',
    controller  : 'AboutController'
  })
  
  .when('/sample', {
    templateUrl : 'sample',
    controller  : 'sampleController'
  })

  .otherwise({redirectTo: '/'});
});

