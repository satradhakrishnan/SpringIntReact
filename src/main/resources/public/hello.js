angular.module('demo', [])
.controller('Hello', function($scope, $http) {
    $http.get('http://localhost:8080/city/weather/23').
        then(function(response) {
            $scope.gree = response.data;
        });
})