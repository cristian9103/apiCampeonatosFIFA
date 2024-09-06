package apicampeonatosfifa.apicampeonatosfifa.dominio;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "estadio")
public class Estadio {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "secuencia_estadio")
    @GenericGenerator(name = "secuencia_estadio", strategy = "increment")
    private int id;

    @Column(name = "estadio")
    private String nombre;

    @Column(name = "capacidad")
    private int capacidad;

    @ManyToOne
    @JoinColumn(name = "idciudad", referencedColumnName = "id")
    private Ciudad ciudad;

    public Estadio() {
    }

    public Estadio(int id, String nombre, int capacidad, Ciudad ciudad) {
        this.id = id;
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.ciudad = ciudad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }
}

