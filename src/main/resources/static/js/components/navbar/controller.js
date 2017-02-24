(function() {
  'use strict';
  angular.module('CaronaFront')
    .controller('navBarController', navBarController);

  navBarController.$inject = ['$state'];

  function navBarController($state) {
    var vm = this;
  }
})();
