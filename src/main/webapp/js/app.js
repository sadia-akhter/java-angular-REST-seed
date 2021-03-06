// Declare app level module which depends on filters, and services
angular.module('mavenWebApp', ['ngdemo.services', 'ngdemo.controllers', 'ngRoute'])
.config(function ($routeProvider, $httpProvider) {
   $routeProvider
      .when('/dummy', {templateUrl: 'views/dummy.html', controller: 'DummyCtrl'})
      .when('/user-list', {templateUrl: 'views/user-list.html', controller: 'UserListCtrl'})
      .when('/user-detail/:id', {templateUrl: 'views/user-detail.html', controller: 'UserListCtrl'})
      .when('/user/new', {templateUrl: 'views/new.html', controller: ''})
      .otherwise({redirectTo: '/dummy'});
});
