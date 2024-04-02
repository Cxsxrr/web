package pe.edu.upc.demowallet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.demowallet.entities.Servicios;

@Repository
public interface iServiciosRepository extends JpaRepository<Servicios,Integer> {
}
