var app = angular.module('ngdemo.controllers', ['ngdemo.services']);

//Clear browser cache (in development mode)
app.run(function ($rootScope, $templateCache) {
   $rootScope.$on('$viewContentLoaded', function () {
      $templateCache.removeAll();
   });
});

//app.controller('DummyCtrl', ['$scope', 'DummyFactory', function ($scope, UserFactory) {
//    UserFactory.get({}, function (userFactory) {
//        $scope.firstname = userFactory.firstName;
//    })
//}]);

app.controller('DummyCtrl', ['$scope', 'DummyFactory', 
   function ($scope, DummyFactory) {
      DummyFactory.get({}, function (dummyFactory) {
         $scope.firstname = dummyFactory.firstName;
         $scope.lastname = dummyFactory.lastName;
      })
   }])
.controller('UserListCtrl', ['$scope', 'UsersFactory', 'UserFactory', 
   function ($scope, UsersFactory, UserFactory) {

	UserFactory.get({}, function(UserFactory){
		console.log(UserFactory);
		$scope.firstName = UserFactory.firstName;
		$scope.lastName = UserFactory.lastName;
//		$scope.selectedUser.firstName = UserFactory.firstName;
//		$scope.selectedUser.lastName = UserFactory.lastName;		
	});

	$scope.users = [
         {
            firstName: 'Foo1',
            lastName: 'Bar1'
         },
         {
            firstName: 'Foo2',
            lastName: 'Bar2'
         },
         {
            firstName: 'Foo3',
            lastName: 'Bar3'
         },
         {
            firstName: 'Foo4',
            lastName: 'Bar4'
         },
   ];
}]);
