function VerificarContraseña(){
	 $.alert({
			 closeIcon: true,
			 type: 'blue',
			 icon: 'glyphicon glyphicon-warning-sign',
			 title: 'Confirmación',
			 content: 'Confirmación de Contraseña Incorrecta',
			 buttons: {
			 OK: function () {
                btnClass: 'btn-blue',
               document.location.href = '#';
            },
        }
    });
}
function validarpassword(){
    if (document.getElementById('password').value == document.getElementById('confirmacion').value){
        console.log("contraseñas Iguales");

    }else{
        console.log("contraseñas Diferentes");
        VerificarContraseña();
        document.getElementById('password').value="";
        document.getElementById('confirmacion').value="";
        document.getElementById('password').focus();
    }
}