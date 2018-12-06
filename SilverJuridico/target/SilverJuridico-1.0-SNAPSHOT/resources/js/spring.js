/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Función que realiza las validaciones para el logueo de un usuario
function logueo()
{
  user = document.getElementById('user').value;
  pass = document.getElementById('pass').value;
  if(user.length < 1)
  {
    $('#erroruse').html('<div class="alert alert-danger animated fadeIn text_btnxs" align="center"><span class="glyphicon glyphicon-exclamation-sign"></span>&nbsp;<b>Dato obligatorio</b></div>');
    return false;
  } else{$('#erroruse').html('');}

  if(pass.length < 1)
  {
    $('#errorpass').html('<div class="alert alert-danger animated fadeIn text_btnxs" align="center"><span class="glyphicon glyphicon-exclamation-sign"></span>&nbsp;<b>Dato obligatorio</b></div>');
      return false;
  }else{$('#errorpass').html('');}
  
  //window.location.href = 'login.html';
  $.ajax({
          url: 'login.html?nombre='+user+'&rubrica='+pass,
          type: 'POST',
          async: true,
          cache: false,
          contentType: "application/json; charset=utf-8",
          success: function (response) {
              console.log("callSucess");
              console.log(response);
          },
          error: function (jqXHR, textStatus, errorThrown) {
              console.log(parametros);
              console.log("request failed" + textStatus);
          }
      });
//  $.ajax({
//        type: "POST",
//		//contentType:"application/json",
//        url: "login.html",
//        data: parametros,
//        dataType: 'json',
//        acept: "application/json",
//        timeuot: 100000,
//        success : function(data) {
//			console.log("SUCCESS: ", data);
//		},
//		error : function(e) {
//			console.log("ERROR: ", e);
//		},
//		done : function(e) {
//			console.log("DONE");
//		}
//	});
 }
 
function validar()
{
    nom = document.getElementById('nom').value;
    app = document.getElementById('app').value;
    if(nom === "" || app === "")
    {
        swal("Campos con *","Obligatorios","error");
        return false;
    }
    else
    {
     swal("Registros guardados","","success");
     return true;
    }
}

function borrarusuario(id)
{
    console.log(id);
  swal(
  {
    title: "¿Estás seguro?",
    text: "El usuario será borrado",
    type: "warning",
    showCancelButton: true,
    confirmButtonClass: "btn-danger",
    confirmButtonText: "¡Sí, Borrar!",
    cancelButtonText: "¡No, cancelar!",
    closeOnConfirm: false,
    closeOnCancel: false
  },
  function(isConfirm) 
  {
    if (isConfirm){
                    console.log(id);
        window.location.href = 'delete.html?idusuario='+id;
        swal("Registros borrados","","success");
        return true;
    }
    else {
        swal("Cancelado", "nada fue eliminado", "error");
        return false;
    }    
  });
}



