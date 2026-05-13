package org.example.boxeoapi.Controller;

import org.example.boxeoapi.Service.AsistenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class AsistenciaController {

    @Autowired
    private AsistenciaService asistenciaService;

    @PutMapping("/asistencia/{id}/confirmar")
    public ResponseEntity<?> confirmarAsistencia(@PathVariable int id) {
        asistenciaService.confirmarAsistencia(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/participacion/{id}/confirmar")
    public ResponseEntity<?> confirmarParticipacion(@PathVariable int id) {
        asistenciaService.confirmarParticipacion(id);
        return ResponseEntity.ok().build();
    }
}