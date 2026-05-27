import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Coche implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Esta es la clave primaria que se auto incrementea
    
    private String color; // Lo que nos pide de tipo texto

    // Constructor sin parámetros 
    public Coche() {
    }

    // Constructor con parametro pa que sea mas facil crear la instancia
    public Coche(String color) {
        this.color = color;
    }

    // Métodos Getter y Setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    }
}
