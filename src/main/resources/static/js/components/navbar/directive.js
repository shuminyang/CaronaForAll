(function() {
  'use strict';
  angular.module('CaronaFront')
    .directive('navBar', navBar);

  function navBar() {
    var directive = {
      controller: 'navBarController as vm',
      templateUrl: 'js/components/navbar/navbar.html',
      restrict: 'E',
      bindToController: {},
      scope: {}
    };

    return directive;
  }
})();
