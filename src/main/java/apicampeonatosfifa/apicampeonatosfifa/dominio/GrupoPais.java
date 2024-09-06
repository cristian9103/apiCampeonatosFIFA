package apicampeonatosfifa.apicampeonatosfifa.dominio;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "grupopais")
public class GrupoPais {
    @Id
    @ManyToOne
    @JoinColumn(name = "idgrupo", referencedColumnName = "id")
    private Grupo grupo;

    @Id
    @ManyToOne
    @JoinColumn(name = "idpais", referencedColumnName = "id")
    private Seleccion pais;

    public GrupoPais() {
    }

    public GrupoPais(Grupo grupo, Seleccion pais) {
        this.grupo = grupo;
        this.pais = pais;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public Seleccion getPais() {
        return pais;
    }

    public void setPais(Seleccion pais) {
        this.pais = pais;
    }
}

