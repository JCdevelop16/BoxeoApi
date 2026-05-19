package org.example.boxeoapi.Controller;

import org.example.boxeoapi.Entidades.Entrenamiento;
import org.example.boxeoapi.Service.EntrenamientoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api")
public class EntrenamientoController {

    @Autowired
    private EntrenamientoService entrenamientoService;

    @GetMapping("/entrenamientos")
    public ResponseEntity<List<Entrenamiento>> getTodos() {
        return ResponseEntity.ok(entrenamientoService.getTodos());
    }

    @DeleteMapping("/entrenamientos/{id}")
    public ResponseEntity<?> eliminar(@PathVariable int id) {
        entrenamientoService.eliminar(id);
        return ResponseEntity.ok().build();
    }
}