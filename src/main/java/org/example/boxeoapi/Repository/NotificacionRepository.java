package org.example.boxeoapi.Repository;

import org.example.boxeoapi.Entidades.Boxeador;
import org.example.boxeoapi.Entidades.Notificacion;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface NotificacionRepository extends JpaRepository<Notificacion, Integer> {
    List<Notificacion> findByBoxeador(Boxeador boxeador);
}