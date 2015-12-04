angular.module('ngdemo.controllers', ['ngdemo.services'])
.run(function ($rootScope, $templateCache) {   //Clear browser cache (in development mode)
   $rootScope.$on('$viewContentLoaded', function () {
      $templateCache.removeAll();
   });
})
.controller('DummyCtrl', ['$scope', 'DummyFactory', 
   function ($scope, DummyFactory) {
      DummyFactory.get({}, function (dummyFactory) {
         $scope.firstname = dummyFactory.firstName;
         $scope.lastname = dummyFactory.lastName;
      })
   }])
.controller('UserListCtrl', ['$scope', 'UsersFactory',
   function ($scope, UsersFactory) {
      $scope.users = UsersFactory.query();
   }]);