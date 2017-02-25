(function () {
    'use strict';

    angular.module('CaronaFront')
            .controller('RegistroController', RegistroController);

    RegistroController.$inject = ['LoginService'];

    function RegistroController(LoginService) {
        var vm = this;

        function verificarLogin(login) {
            LoginService.verificarLogin(login)
                    .then(function (data) {
                        console.log(data);
                    }, function (error) {
                        console.log(error);
                    });
        }

        vm.criarUsuario = function () {
//            verificarLogin(vm.login.login);
            var usuario = vm.login;
            usuario.infoUsuario = vm.usuario;
            LoginService.criarLogin(usuario)
                    .then(function (data) {
                        console.log(data);
                    });
//            console.log(vm.usuario);
//            console.log(vm.login);
        };
    }
})();