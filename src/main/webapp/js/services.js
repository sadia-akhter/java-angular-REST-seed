var services = angular.module('ngdemo.services', ['ngResource']);

//services.factory('UserFactory', function ($resource) {
//    return $resource('/mavenWebApp/rest/users', {}, {
//        query: {
//            method: 'GET',
//            params: {},
//            isArray: false
//        }
//    })
//});

services.factory('DummyFactory', function($resource) {
	return $resource('/mavenWebApp/rest/dummy', {}, {
		query: {
			method: 'GET',
			params: {},
			isArray: false
		}
	});
});

//services.factory('UsersFactory', function($resource) {
//	return $resource('/mavenWebApp/rest/users', {}, {
//		query: {
//			method: 'GET',
//			isArray: true
//		}
//	});
//});
