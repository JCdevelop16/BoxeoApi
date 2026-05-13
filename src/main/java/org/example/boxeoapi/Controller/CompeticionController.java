package org.example.boxeoapi.Controller;

import org.example.boxeoapi.Entidades.Competicion;
import org.example.boxeoapi.Service.CompeticionesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api")
public class CompeticionController {

    @Autowired
    private CompeticionesService competicionService;

    @GetMapping("/competiciones")
    public ResponseEntity<List<Competicion>> getTodos() {
        return ResponseEntity.ok(competicionService.getTodos());
    }

    @PostMapping("/competiciones")
    public ResponseEntity<Competicion> crear(@RequestBody Competicion competicion) {
        return ResponseEntity.ok(competicionService.crear(competicion));
    }

    @DeleteMapping("/competiciones/{id}")
    public ResponseEntity<?> eliminar(@PathVariable int id) {
        competicionService.eliminar(id);
        return ResponseEntity.ok().build();
    }
}