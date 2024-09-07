package apicampeonatosfifa.apicampeonatosfifa.core.interfaces.servicios;

import java.util.List;
import org.springframework.stereotype.Service;

import apicampeonatosfifa.apicampeonatosfifa.dominio.Seleccion;

@Service
public interface ISeleccionServicio {
    public List<Seleccion> listar();
    public Seleccion obtener(Integer id);
    public List<Seleccion> buscar(String nombre);
    public Seleccion agregar(Seleccion pais);
    public Seleccion modificar(Seleccion pais);
    public boolean eliminar(Integer id);
}
