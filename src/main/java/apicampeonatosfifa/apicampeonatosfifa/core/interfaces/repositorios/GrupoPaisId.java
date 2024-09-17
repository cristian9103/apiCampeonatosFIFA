package apicampeonatosfifa.apicampeonatosfifa.core.interfaces.repositorios;

import java.util.Objects;

public class GrupoPaisId {

    private int grupo;
    private int pais;
    
    public GrupoPaisId() {
    }

    public GrupoPaisId(int grupo, int pais) {
        this.grupo = grupo;
        this.pais = pais;
    }

    public int getGrupo() {
        return grupo;
    }

    public void setGrupo(int grupo) {
        this.grupo = grupo;
    }

    public int getPais() {
        return pais;
    }

    public void setPais(int pais) {
        this.pais = pais;
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        GrupoPaisId that = (GrupoPaisId) o; 
        return grupo == that.grupo && pais == that.pais;
    }

    @Override
    public int hashCode(){
        return Objects.hash(grupo, pais);
    }

}
