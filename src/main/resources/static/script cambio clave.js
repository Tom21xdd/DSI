
 function mostrarContrasena(id){
    var tipo = document.getElementById(id);
    if(tipo.type == "password"){
        tipo.type = "text";
    }else{
        tipo.type = "password";
    }
}

function alerta() {
    var contenido = document.getElementById("nueva").value;   
    var contenido2 = document.getElementById("confirmar").value;    
   if (contenido!=contenido2 || contenido.length<8) {
    swal({
        text: "No coincide la contraseña nueva",
        icon: "error",
        button: false,
      });
   }else{
    swal({
        text: "Datos de contraseña nueva correctamente ingresados",
        icon: "success",
        button: false,
      });
   }
}