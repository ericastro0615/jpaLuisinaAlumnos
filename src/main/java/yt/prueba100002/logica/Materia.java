 
package yt.prueba100002.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

 @Entity
public class Materia implements Serializable {
    private String nombreMateria;
    @Id
    @GeneratedValue(strategy =GenerationType.AUTO)
    private int idMateria;
    private String tipoDuracion;
    //relacion bidireccional carrera y materias se conocen AMBAS
    @ManyToOne
    private  Carrera carre;

    
    
    
    public Materia(String nombreMateria, int idMateria, String tipoDuracion, Carrera carre) {
        this.nombreMateria = nombreMateria;
        this.idMateria = idMateria;
        this.tipoDuracion = tipoDuracion;
        this.carre = carre;
    }

    public Carrera getCarre() {
        return carre;
    }

    public void setCarre(Carrera carre) {
        this.carre = carre;
    }
    
    public Materia() {
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public String getTipoDuracion() {
        return tipoDuracion;
    }

    public void setTipoDuracion(String tipoDuracion) {
        this.tipoDuracion = tipoDuracion;
    }

    @Override
    public String toString() {
        return "Materia{" + "nombreMateria=" + nombreMateria + ", idMateria=" + idMateria + ", tipoDuracion=" + tipoDuracion + '}';
    }
    
    
    
    
}
