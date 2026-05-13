package org.example.boxeoapi.Repository;

import org.example.boxeoapi.Entidades.Boxeador;
import org.example.boxeoapi.Entidades.ParticipacionCompe;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ParticipacionRepository extends JpaRepository<ParticipacionCompe, Integer> {
    List<ParticipacionCompe> findByBoxeador(Boxeador boxeador);
}