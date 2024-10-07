package apicampeonatosfifa.apicampeonatosfifa.core.interfaces.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import apicampeonatosfifa.apicampeonatosfifa.dominio.Seleccion;

@Repository
public interface ISeleccionRepositorio extends JpaRepository<Seleccion, Integer>{

    @Query("SELECT s FROM Seleccion s WHERE LOWER(s.nombre) LIKE LOWER(CONCAT('%', ?1 ,'%'))")
    public List<Seleccion> buscar(String nombre);
}
