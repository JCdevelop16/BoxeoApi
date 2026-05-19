package org.example.boxeoapi.Service;

import org.example.boxeoapi.Entidades.Competicion;
import org.example.boxeoapi.Repository.CompeticionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CompeticionesService {

    @Autowired
    private CompeticionRepository competicionRepository;

    public List<Competicion> getTodos() {
        return competicionRepository.findAll();
    }


    public void eliminar(int id) {
        competicionRepository.deleteById(id);
    }
}