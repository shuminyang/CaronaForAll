(function () {
    'use strict';

    angular.module('CaronaFront')
            .config(routes);
    
    routes.$inject = ['$stateProvider', '$urlRouterProvider'];

    function routes($stateProvider, $urlRouterProvider) {
        
        $stateProvider.state('registro', {
            url: '/registro',
            templateUrl: 'js/features/registro/template/registro.html',
            controller: 'RegistroController as vm'
        });
        
        return $urlRouterProvider.otherwise('/login');

    }

})();