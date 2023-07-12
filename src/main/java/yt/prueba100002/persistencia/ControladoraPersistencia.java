 
package yt.prueba100002.persistencia;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import yt.prueba100002.logica.Alumno;
import yt.prueba100002.logica.Carrera;
import yt.prueba100002.logica.Materia;
import yt.prueba100002.persistencia.exceptions.NonexistentEntityException;

 
public class ControladoraPersistencia {
        
    //-------------------------------- CRUD ALUMNO -------------------------------------------
    AlumnoJpaController alumJPA = new AlumnoJpaController();

    
    public void crearAlumno(Alumno alu) {
       alumJPA.create(alu);  
    }

    public void eliminarAlumno(int id) {
        try {
            alumJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
   
}

    public void editarAlumno(Alumno alu) {
        try {
            alumJPA.edit(alu);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    public Alumno traerAlumno (int id) {
        return  alumJPA.findAlumno(id);
    }
    
    public ArrayList<Alumno> traerListaAlumnos () {
        List <Alumno> listitaProvisoriaHaciaArrayList = alumJPA.findAlumnoEntities();
        ArrayList<Alumno> listaNewAlumnosNuevoArray  = new ArrayList<Alumno>(listitaProvisoriaHaciaArrayList);
        return listaNewAlumnosNuevoArray;
    }
    
    //-------------------------------- CRUD CARRERA -------------------------------------------

    
       CarreraJpaController carreJPA = new CarreraJpaController();
       
       
    public void eliminarCarrera(int idCarrera) {
        try {
            carreJPA.destroy(idCarrera);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void crearCarrera(Carrera carre) {
       carreJPA.create(carre);
    }

    public void editarCarrera(Carrera carre) {
        try {
            carreJPA.edit(carre);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Carrera traerCarrera(int idCarrera) {
      return carreJPA.findCarrera(idCarrera);
    }

    public ArrayList<Carrera> traerListaCarreras() {
        List <Carrera> listaCarrera = carreJPA.findCarreraEntities();
        ArrayList <Carrera> listaArrayCarrera = new ArrayList ();
       return listaArrayCarrera ;
    }
     
    
    //-------------------------------------------CRUD materia desde controladora lógica
    MateriaJpaController mateJpa = new MateriaJpaController();
 

    public void crearMateria(Materia mate) {
        mateJpa.create(mate);
    }

    public void eliminarMateria(int idMateria) {
        try {
            mateJpa.destroy(idMateria);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarMateria(Materia mate) {
        try {
            mateJpa.edit(mate);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Materia traerMateria(int idMateria) {
       return mateJpa.findMateria(idMateria);
    }

    public LinkedList<Materia> traerListaMateria() {
    List <Materia> lista  = mateJpa.findMateriaEntities();
    LinkedList<Materia> listaListMateria = new LinkedList (lista);
    return listaListMateria;
    }

    
    
    
    
    
}

