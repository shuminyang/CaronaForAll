(function () {
    'use strict';

    angular.module('CaronaFront')
            .service('LoginService', LoginService);

    LoginService.$inject = ['$http'];

    function LoginService($http) {

        function verificarLogin(login) {
            return $http({
                method: 'GET',
                url: '/api/usuario/' + login
            });
        }

        function criarLogin(usuario) {
            return $http({
                method: 'POST',
                url: '/api/usuario',
                data: usuario
            });
        }

        var service = {
            verificarLogin: verificarLogin,
            criarLogin: criarLogin
        };

        return service;
    }
})();