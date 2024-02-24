package com.example;

public class Respuesta2DTO {
	 private boolean exito;
	    private String mensaje;

	    public Respuesta2DTO(boolean exito) {
	        this.exito = exito;
	        if (exito) {
	            this.mensaje = "La notificación se ha editado con éxito";
	        }
	        else {
	        	this.mensaje = "Hubo problemas al editar la notificacion";
	        }
	    }

	    public boolean isExito() {
	        return exito;
	    }

	    public void setExito(boolean exito) {
	        this.exito = exito;
	        if (exito) {
	            this.mensaje = "La notificación se ha editado con éxito";
	        }
	        else {
	        	this.mensaje = "Hubo problemas al editar la notificacion";
	        }
	    }

	    public String getMensaje() {
	        return mensaje;
	    }

	    public void setMensaje(String mensaje) {
	        this.mensaje = mensaje;
	    }
}
