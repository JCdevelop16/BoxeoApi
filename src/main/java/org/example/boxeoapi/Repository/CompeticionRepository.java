package org.example.boxeoapi.Repository;

import org.example.boxeoapi.Entidades.Competicion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompeticionRepository extends JpaRepository<Competicion, Integer> {
}