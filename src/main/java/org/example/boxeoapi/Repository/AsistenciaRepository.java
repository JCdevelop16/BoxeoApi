package org.example.boxeoapi.Repository;

import org.example.boxeoapi.Entidades.AsistenciaEntreno;
import org.example.boxeoapi.Entidades.Boxeador;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface AsistenciaRepository extends JpaRepository<AsistenciaEntreno, Integer> {
    List<AsistenciaEntreno> findByBoxeador(Boxeador boxeador);
}