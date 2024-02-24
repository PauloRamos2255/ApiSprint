package com.example;

public class Respuesta3DTO {
	 private boolean exito;
	    private String mensaje;

	    public Respuesta3DTO(boolean exito) {
	        this.exito = exito;
	        if (exito) {
	            this.mensaje = "La notificación se ha eliminado con éxito";
	        }
	        else {
	        	this.mensaje = "Hubo problemas al eliminar la notificacion";
	        }
	    }

	    public boolean isExito() {
	        return exito;
	    }

	    public void setExito(boolean exito) {
	        this.exito = exito;
	        if (exito) {
	            this.mensaje = "La notificación se ha eliminado con éxito";
	        }
	        else {
	        	this.mensaje = "Hubo problemas al eliminar la notificacion";
	        }
	    }

	    public String getMensaje() {
	        return mensaje;
	    }

	    public void setMensaje(String mensaje) {
	        this.mensaje = mensaje;
	    }
}
