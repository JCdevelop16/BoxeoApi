package org.example.boxeoapi.Controller;

import org.example.boxeoapi.Entidades.*;
import org.example.boxeoapi.Service.BoxeadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class BoxeadorController {

    @Autowired
    private BoxeadorService boxeadorService;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody Map<String, String> datos) {
        String nombre = datos.get("nombre");
        String apellidos = datos.get("apellidos");

        Boxeador boxeador = boxeadorService.login(nombre, apellidos);

        if (boxeador != null) {
            return ResponseEntity.ok(boxeador);
        } else {
            return ResponseEntity.status(404).body("Usted no está dado de alta en la aplicación");
        }
    }

    @GetMapping("/boxeador/{id}")
    public ResponseEntity<?> getDatos(@PathVariable int id) {
        Boxeador box = boxeadorService.getDatos(id);
        if (box != null) return ResponseEntity.ok(box);
        return ResponseEntity.status(404).body("Boxeador no encontrado");
    }

    @GetMapping("/boxeador/{id}/entrenamientos")
    public ResponseEntity<?> getEntrenamientos(@PathVariable int id) {
        List<AsistenciaEntreno> lista = boxeadorService.getEntrenamientos(id);
        if (lista != null) return ResponseEntity.ok(lista);
        return ResponseEntity.status(404).body("Boxeador no encontrado");
    }

    @GetMapping("/boxeador/{id}/competiciones")
    public ResponseEntity<?> getCompeticiones(@PathVariable int id) {
        List<ParticipacionCompe> lista = boxeadorService.getCompeticiones(id);
        if (lista != null) return ResponseEntity.ok(lista);
        return ResponseEntity.status(404).body("Boxeador no encontrado");
    }

    @GetMapping("/boxeador/{id}/notificaciones")
    public ResponseEntity<?> getNotificaciones(@PathVariable int id) {
        List<Notificacion> lista = boxeadorService.getNotificaciones(id);
        if (lista != null) return ResponseEntity.ok(lista);
        return ResponseEntity.status(404).body("Boxeador no encontrado");
    }
}