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

    @Autowired
    private NotificacionService notificacionService;

    public List<Competicion> getTodos() {
        return competicionRepository.findAll();
    }

    public Competicion crear(Competicion competicion) {
        Competicion nueva = competicionRepository.save(competicion);
        notificacionService.enviarATopic(
                "competiciones",
                "Nueva competición",
                "Se ha añadido la competición " + nueva.getNombre() + " en " + nueva.getLugar()
        );
        return nueva;
    }

    public void eliminar(int id) {
        competicionRepository.deleteById(id);
    }
}