package org.example.boxeoapi.Repository;

import org.example.boxeoapi.Entidades.Boxeador;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface BoxeadorRepository extends JpaRepository<Boxeador, Integer> {
    Optional<Boxeador> findByNombreAndApellidos(String nombre, String apellidos);
}