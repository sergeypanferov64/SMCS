angular
    .module('smcsApp', [
        'ngAnimate',
        'ngCookies',
        'ngResource',
        'ngRoute',
        'ngSanitize',
        'ngTouch'
    ])
    .config(function ($routeProvider) {
        $routeProvider
            .when('/', {
                templateUrl: 'views/main.html',
                controller: 'MainCtrl'
            })
            .when('/films', {
                templateUrl: 'views/films.html',
                controller: 'FilmsCtrl'
            })
            .otherwise({
                redirectTo: '/'
            });
    });