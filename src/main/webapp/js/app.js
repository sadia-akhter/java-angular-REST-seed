// Declare app level module which depends on filters, and services
angular.module('mavenWebApp', ['ngdemo.services', 'ngdemo.controllers', 'ngRoute'])
.config(function ($routeProvider, $httpProvider) {
	$routeProvider
		.when('/dummy', {templateUrl: 'views/dummy.html', controller: 'DummyCtrl'})
		.otherwise({redirectTo: '/dummy'});
});
