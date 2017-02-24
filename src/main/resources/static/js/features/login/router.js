(function(){
  'use strict';

  angular.module('CaronaFront')
    .config(routes);

  routes.$inject = ['$stateProvider', '$urlRouterProvider'];

  function routes($stateProvider, $urlRouterProvider) {
    $stateProvider.state('login', {
      url: '/login',
      templateUrl: 'js/features/login/template/login.html',
      controller: 'LoginController as vm'
    });

    return $urlRouterProvider.otherwise('/login');
  }

})();
