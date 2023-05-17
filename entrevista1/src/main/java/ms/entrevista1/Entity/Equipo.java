package ms.entrevista1.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="equipo")
public class Equipo {
    @Id
    @Column(name = "Id_equipo")
    private Integer id;
    @Column(name = "Marca")
    private String marca;

    public Equipo() {
    }

    public Equipo(Integer id, String marca) {
        this.id = id;
        this.marca = marca;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "id=" + id +
                ", marca='" + marca + '\'' +
                '}';
    }
}