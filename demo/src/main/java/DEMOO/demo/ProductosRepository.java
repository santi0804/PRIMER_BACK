package DEMOO.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface ProductosRepository extends JpaRepository<Productos, Integer> {

}
