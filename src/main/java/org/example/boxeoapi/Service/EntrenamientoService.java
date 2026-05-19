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

    public List<Entrenamiento> getTodos() {
        return entrenamientoRepository.findAll();
    }


    public void eliminar(int id) {
        entrenamientoRepository.deleteById(id);
    }
}