angular.module('smcsApp')
    .controller('MainCtrl', function ($scope, $http) {
        $http({
            method: 'GET',
            url: '/books'
        }).then(function (response) {
            $scope.books = response.data;
        }, function (response) {
            console.error('Error requesting races');
        });
    });