 
package yt.prueba100002.logica;

import java.io.Serializable;
import java.util.LinkedList;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

 @Entity
public class Carrera implements Serializable {
 @Id
 @GeneratedValue (strategy=GenerationType.AUTO)
 private int idCarrera;
 private String nombreCarrera;
 @OneToMany(mappedBy = "carre")
 private LinkedList<Materia> listaLinkmateria;
        
        
    public Carrera() {
    }

    public Carrera(int idCarrera, String nombreCarrera, LinkedList<Materia> listaLinkmateria) {
        this.idCarrera = idCarrera;
        this.nombreCarrera = nombreCarrera;
        this.listaLinkmateria = listaLinkmateria;
    }

    public LinkedList<Materia> getListaLinkmateria() {
        return listaLinkmateria;
    }

    public void setListaLinkmateria(LinkedList<Materia> listaLinkmateria) {
        this.listaLinkmateria = listaLinkmateria;
    }



    public int getIdCarrera() {
        return idCarrera;
    }

    public void setIdCarrera(int idCarrera) {
        this.idCarrera = idCarrera;
    }

    public String getNombreCarrera() {
        return nombreCarrera;
    }

    public void setNombreCarrera(String nombreCarrera) {
        this.nombreCarrera = nombreCarrera;
    }

    @Override
    public String toString() {
        return "Carrera " + "idCarrera=" + idCarrera + ", nombreCarrera=" + nombreCarrera  ;
    }
 
 
    
    
    
}
