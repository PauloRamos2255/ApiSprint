package com.example;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "notificacion")
public class Notificacion {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
    private String mensaje;
    private boolean leida;
    private String remitente;
    private String estado;
    private String destinatario;

    // Constructor por defecto
    public Notificacion() {
    }

	public Notificacion(int id, String mensaje, boolean leida, String remitente, String estado, String destinatario) {
		super();
		this.id = id;
		this.mensaje = mensaje;
		this.leida = leida;
		this.remitente = remitente;
		this.estado = estado;
		this.destinatario = destinatario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public boolean isLeida() {
		return leida;
	}

	public void setLeida(boolean leida) {
		this.leida = leida;
	}

	public String getRemitente() {
		return remitente;
	}

	public void setRemitente(String remitente) {
		this.remitente = remitente;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}





}
