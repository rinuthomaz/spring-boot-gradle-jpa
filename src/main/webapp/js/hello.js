var myApp = angular.module('myApp', []);

app.service('fleetDB', ['$http', function($http) {
    fleetDB = this;
   fleetDB.fleetDBHierarchy = function(url) {

       return $http.get(url);
   };
   
/*   fleetDB.saveUserDefinedMetrics = function(url,data) {
   	console.log(url);
       return $http.put(url,data);
   };*/
}]);


$scope.getSites= function(){
//	console.log("on change of bu get sites"+$scope.businessUnit.businessUnitId);
	//fleetDB.fleetDBHierarchy('businessUnit/'+ $scope.businessUnit.businessUnitId)
	fleetDB.fleetDBHierarchy('checkout/K00139/MFR/kk/1')
    .success(function(response) {
        $scope.sites = response;
    }).error(function(err, status) {
    	alert("Some error occured while fetching sites! \n Please contact ITSC if problem still persists");
        console.log(err);
    });
}

function MyCtrl($scope) {
	/*$http.get('http://127.0.0.1:8080/dei/site/findById/1').
    success(function(data) {
        $scope.item = data;
    });*/
	
	$scope.items =[{
		"equipmentId": "1",
		"resourceId": "1",
		"assignedBy": "deisup1",
		"shift": "1",
		"equipmentName": "HE PM QCI FORM",
		"equipmentType": "Baler",
		"equipmentDescription": "HEAVY EQP QCI FORM"
	}, {
		"equipmentId": "1",
		"resourceId": "1",
		"assignedBy": "deisup1",
		"shift": "1",
		"equipmentName": "2 RAM BALER",
		"equipmentType": "Baler",
		"equipmentDescription": "Harris Baler 1"
	}];
}

/*function Hello($scope, $http) {
    $http.get('http://127.0.0.1:8080/dei/site/findById/1').
        success(function(data) {
            $scope.checkout = data;
        });
}*/