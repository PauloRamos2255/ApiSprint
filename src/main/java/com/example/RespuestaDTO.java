package com.example;

public class RespuestaDTO {
	 private boolean exito;
	    private String mensaje;

	    public RespuestaDTO(boolean exito) {
	        this.exito = exito;
	        if (exito) {
	            this.mensaje = "La notificación se ha registrado con éxito";
	        }
	        else {
	        	this.mensaje = "Hubo problemas al registrar la notificacion";
	        }
	    }

	    public boolean isExito() {
	        return exito;
	    }

	    public void setExito(boolean exito) {
	        this.exito = exito;
	        if (exito) {
	            this.mensaje = "La notificación se ha registrado con éxito";
	        }
	        else {
	        	this.mensaje = "Hubo problemas al registrar la notificacion";
	        }
	    }

	    public String getMensaje() {
	        return mensaje;
	    }

	    public void setMensaje(String mensaje) {
	        this.mensaje = mensaje;
	    }
}
