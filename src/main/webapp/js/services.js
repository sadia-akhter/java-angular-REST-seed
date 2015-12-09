angular.module('ngdemo.services', ['ngResource'])
.factory('DummyFactory', function($resource) {
   return $resource('/mavenWebApp/rest/dummy', {}, {
      query: {
         method: 'GET',
         isArray: false
      }
   });
})
.factory('UsersFactory', function($resource) {
   return $resource('/mavenWebApp/rest/users', {}, {
      query: {
    	 cache: false,
         method: 'GET',
         isArray: true
      }
   });
})
.factory('UserFactory', function ($resource) {
   return $resource('/mavenWebApp/rest/users/:id', {}, {
      show: { method: 'GET' },
      create: { method: 'POST', headers: {'Content-Type': 'application/json'} },
      update: { method: 'PUT', headers: {'Content-Type': 'application/json'} },
      remove: { method: 'DELETE', params: {id: '@id'}}
   });
});