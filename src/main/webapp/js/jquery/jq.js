$(function () {
    $('#signInButton').dialog({
        autoOpen: false,
        show: {
            effect: 'blind',
            duration: 300
        },
        hide: {
            effect: 'explode',
            duration:300
        }
    });    
    $('#loginForm').on('click', function () {        
        $('#signInButton').dialog('open');
    });
});