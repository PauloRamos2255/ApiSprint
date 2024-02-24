package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NoficacionService {
	@Autowired
    private NotificacionRepository notificacionRepository;

	public List<Notificacion> ListarNotificacion() {
        return notificacionRepository.findAll();
    }

    public Notificacion ListaPorID(int id) {
        return notificacionRepository.findById(id).orElse(null);
    }

    public boolean crearNotificacion(Notificacion pregunta) {
        try {
        	notificacionRepository.save(pregunta);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean actualizarNotificacion(int id, Notificacion nuevaNotificacion) {
        Notificacion notificacionExistente = notificacionRepository.findById(id).orElse(null);

        if (notificacionExistente != null) {
            notificacionExistente.setMensaje(nuevaNotificacion.getMensaje());
            notificacionExistente.setLeida(nuevaNotificacion.isLeida());
            notificacionExistente.setRemitente(nuevaNotificacion.getRemitente());
            notificacionExistente.setDestinatario(nuevaNotificacion.getDestinatario());
            notificacionExistente.setEstado(nuevaNotificacion.getEstado());

            try {
                notificacionRepository.save(notificacionExistente);
                return true;
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }

        return false;
    }



    public boolean eliminarNotificacion(int id) {
        try {
        	notificacionRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
