angular.module('smcsApp')
    .controller('FilmsCtrl', function ($scope, $http) {
        $http({
            method: 'GET',
            url: '/films'
        }).then(function (response) {
            $scope.films = response.data;
        }, function(response) {
            console.error('Error requesting films.')
        });
    });