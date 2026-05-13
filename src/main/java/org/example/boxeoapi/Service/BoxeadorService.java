package org.example.boxeoapi.Service;

import org.example.boxeoapi.Entidades.*;
import org.example.boxeoapi.Repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class BoxeadorService {

    @Autowired private BoxeadorRepository boxeadorRepository;
    @Autowired private AsistenciaRepository asistenciaRepository;
    @Autowired private ParticipacionRepository participacionRepository;
    @Autowired private NotificacionRepository notificacionRepository;

    public Boxeador login(String nombre, String apellidos) {
        Optional<Boxeador> boxeador = boxeadorRepository.findByNombreAndApellidos(nombre, apellidos);
        return boxeador.orElse(null);
    }

    public Boxeador getDatos(int id) {
        return boxeadorRepository.findById(id).orElse(null);
    }

    public List<AsistenciaEntreno> getEntrenamientos(int id) {
        Boxeador box = boxeadorRepository.findById(id).orElse(null);
        if (box == null) return null;
        return asistenciaRepository.findByBoxeador(box);
    }

    public List<ParticipacionCompe> getCompeticiones(int id) {
        Boxeador box = boxeadorRepository.findById(id).orElse(null);
        if (box == null) return null;
        return participacionRepository.findByBoxeador(box);
    }

    public List<Notificacion> getNotificaciones(int id) {
        Boxeador box = boxeadorRepository.findById(id).orElse(null);
        if (box == null) return null;
        return notificacionRepository.findByBoxeador(box);
    }
}