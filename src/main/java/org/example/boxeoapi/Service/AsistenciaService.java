package org.example.boxeoapi.Service;

import org.example.boxeoapi.Repository.AsistenciaRepository;
import org.example.boxeoapi.Repository.ParticipacionRepository;
import org.example.boxeoapi.Entidades.AsistenciaEntreno;
import org.example.boxeoapi.Entidades.ParticipacionCompe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AsistenciaService {

    @Autowired
    private AsistenciaRepository asistenciaRepository;

    @Autowired
    private ParticipacionRepository participacionRepository;

    public void confirmarAsistencia(int id) {
        AsistenciaEntreno asistencia = asistenciaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Asistencia no encontrada"));
        asistencia.setEstado(true);
        asistenciaRepository.save(asistencia);
    }

    public void confirmarParticipacion(int id) {
        ParticipacionCompe participacion = participacionRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Participación no encontrada"));
        participacion.setConfirmado(true);
        participacionRepository.save(participacion);
    }
}