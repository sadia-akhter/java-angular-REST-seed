var app = angular.module('ngdemo.controllers', []);

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

app.controller('DummyCtrl', ['$scope', 'DummyFactory', function ($scope, DummyFactory) {
	DummyFactory.get({}, function (dummyFactory) {
  $scope.firstname = dummyFactory.firstName;
  $scope.lastname = dummyFactory.lastName;
})
}]);


//app.controller('UserListCtrl', ['$scope', 'UsersFactory', function ($scope, UsersFactory) {
//	$scope.users = UsersFactory.query();
//}])