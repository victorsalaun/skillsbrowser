(function () {
  'use strict';

  angular
    .module('app.employee')
    .config(EmployeeConfig);

  EmployeeConfig.$inject = ['$routeProvider'];

  function EmployeeConfig($routeProvider) {
    $routeProvider
      .when('/employee/list', {
        controller: 'EmployeeListController',
        controllerAs: 'elc',
        templateUrl: 'app/employee/list/employee.list.html'
      })
  }

})();
