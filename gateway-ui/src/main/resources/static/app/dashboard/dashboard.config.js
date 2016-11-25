(function () {
  'use strict';

  angular
    .module('app.dashboard')
    .config(DashboardConfig);

  DashboardConfig.$inject = ['$routeProvider'];

  function DashboardConfig($routeProvider) {
    $routeProvider
      .when('/dashboard', {
        controller: 'DashboardController',
        controllerAs: 'dlc',
        templateUrl: 'app/dashboard/dashboard.html'
      })
  }

})();
