 
package yt.prueba100002.logica;

import java.util.ArrayList;
import java.util.LinkedList;
import yt.prueba100002.persistencia.ControladoraPersistencia;

 
public class ControladoraLogica {
    // desde logica (teclado) se conecta con persistencia y luego a la DB
    ControladoraPersistencia  controlPersis = new ControladoraPersistencia();
    
    public void crearAlumno(Alumno alu) {
        controlPersis.crearAlumno (alu);
    }
    
    public void eliminarALumno (int id) {
        controlPersis.eliminarAlumno(id);
    }
    
    public void editarAlumno (Alumno alu) {
        controlPersis.editarAlumno (alu);
    }
    
    public Alumno traerAlumno (int id) {
        return controlPersis.traerAlumno(id);
    }
    
    
    
   public ArrayList<Alumno> traerListaAlumnos () {
       return controlPersis.traerListaAlumnos();
   }
    
   
   
   
   //------ CRUD CARRERA
   
    public void crearCarrera(Carrera carre) {
        controlPersis.crearCarrera (carre);
    }
    
    public void eliminarCarrera (int id) {
        controlPersis.eliminarCarrera(id);
    }
    
    public void editarCarrera (Carrera carre) {
        controlPersis.editarCarrera (carre);
    }
    
    public Carrera traerCarrera (int id) {
        return  controlPersis.traerCarrera(id);
    }
    
     
   public ArrayList<Carrera> traerListaCarreras () {
       return controlPersis.traerListaCarreras();
   }
   
   
   
   
   //------ CRUD materia
   
    public void crearMateriacarre(Materia mate) {
        controlPersis.crearMateria(mate);
    }
    
    public void eliminarMateria(int idMateria) {
        controlPersis.eliminarMateria(idMateria);
    }
    
    public void editarMateria(Materia mate) {
        controlPersis.editarMateria(mate);
    }
    
    public Materia traerMateria(int idMateria) {
        return  controlPersis.traerMateria(idMateria);
    }
    
     
   public LinkedList<Materia> traerListaMateria () {
       return controlPersis.traerListaMateria();
   }
   
   
   
}
