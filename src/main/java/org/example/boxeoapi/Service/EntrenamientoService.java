package org.example.boxeoapi.Service;

import org.example.boxeoapi.Entidades.Entrenamiento;
import org.example.boxeoapi.Repository.EntrenamientoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EntrenamientoService {

    @Autowired
    private EntrenamientoRepository entrenamientoRepository;

    @Autowired
    private NotificacionService notificacionService;

    public List<Entrenamiento> getTodos() {
        return entrenamientoRepository.findAll();
    }

    public Entrenamiento crear(Entrenamiento entrenamiento) {
        Entrenamiento nuevo = entrenamientoRepository.save(entrenamiento);
        notificacionService.enviarATopic(
                "entrenamientos",
                "Nuevo entrenamiento",
                "Se ha añadido un entrenamiento de " + nuevo.getTipo() + " el " + nuevo.getFecha()
        );
        return nuevo;
    }

    public void eliminar(int id) {
        entrenamientoRepository.deleteById(id);
    }
}