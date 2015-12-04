angular.module('ngdemo.services', ['ngResource'])
.factory('DummyFactory', function($resource) {
   return $resource('/mavenWebApp/rest/dummy', {}, {
      query: {
         method: 'GET',
         params: {},
         isArray: false
      }
   });
})
.factory('UsersFactory', function($resource) {
   return $resource('/mavenWebApp/rest/users', {}, {
      query: {
         method: 'GET',
         isArray: true
      }
   });
})
.factory('UserFactory', function ($resource) {
   return $resource('/mavenWebApp/rest/users', {}, {
   query: {
      method: 'GET',
      params: {},
      isArray: false
   }
   });
});