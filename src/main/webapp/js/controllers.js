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
.controller('UserListCtrl', ['$scope', '$location', 'UsersFactory', 'UserFactory',
   function ($scope, $location, UsersFactory, UserFactory) {	
      $scope.users = UsersFactory.query();
      $scope.confirmDelete = false;

      $scope.editUser = function(id) {
         $location.path('/user-detail/' + id);
      };
      
      $scope.createNewUser = function() {
         $location.path('/user/new');
      };
      
      $scope.deleteUser = function(user) {
    	  $scope.confirmDelete = true;
       };
      
      $scope.confirmDeleteUser = function (user) {
          UserFactory.remove(user);
    	  $scope.confirmDelete = false;
          $location.path(/user-list/)    	  
      };
   }])
.controller('UserDetailCtrl', ['$scope', 'UserFactory', '$routeParams', '$location',
   function($scope, UserFactory, $routeParams, $location) {
      $scope.user = UserFactory.show({id: $routeParams.id});
      
      $scope.cancel = function() {
    	 $location.path('/user-list/'); 
      };
      
      $scope.update = function () {
    	  UserFactory.update($scope.user);
     	  $location.path('/user-list/');   	  
      };      
   }])
.controller('NewUserCtrl', ['$scope', '$location', 'UserFactory',
   function($scope, $location, UserFactory){
      $scope.cancel = function() {
   	     $location.path('/user-list/'); 
      };
      
      $scope.create = function() {
    	 UserFactory.create($scope.user); 
    	 $location.path('/user-list/'); 	  
      };
	
   }]);
