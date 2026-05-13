package org.example.boxeoapi.Repository;

import org.example.boxeoapi.Entidades.Entrenamiento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EntrenamientoRepository extends JpaRepository<Entrenamiento, Integer> {
}