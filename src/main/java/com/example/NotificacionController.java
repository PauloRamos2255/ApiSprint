package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/notificacion")
public class NotificacionController {

	    @Autowired
	    private NoficacionService notificacionService;

	    @GetMapping
	    public List<Notificacion> ListaPregunta() {
	        return notificacionService.ListarNotificacion();
	    }

	    @GetMapping("/{id}")
	    public Notificacion ListaPregunta(@PathVariable int id) {
	        return notificacionService.ListaPorID(id);
	    }

	    @PostMapping
	    public RespuestaDTO crearPregunta(@RequestBody Notificacion notificacion) {
	        boolean exito = notificacionService.crearNotificacion(notificacion);
	        return new RespuestaDTO(exito);
	    }

	    @PutMapping("/{id}")
	    public Respuesta2DTO actualizarMarca(@PathVariable int id, @RequestBody Notificacion notificacion) {
	        boolean exito = notificacionService.actualizarNotificacion(id, notificacion);
	        return new Respuesta2DTO(exito);
	    }

	    @DeleteMapping("/{id}")
	    public Respuesta3DTO eliminarMarca(@PathVariable int id) {
	        boolean exito = notificacionService.eliminarNotificacion(id);
	        return new Respuesta3DTO(exito);
	    }

}
