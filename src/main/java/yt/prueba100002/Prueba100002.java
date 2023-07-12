

package yt.prueba100002;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import yt.prueba100002.logica.Alumno;
import yt.prueba100002.logica.Carrera;
import yt.prueba100002.logica.ControladoraLogica; 
import yt.prueba100002.logica.Materia;
import yt.prueba100002.persistencia.ControladoraPersistencia;

public class Prueba100002 {

    public static void main(String[] args) {
        ControladoraLogica controlLog = new ControladoraLogica ();
        
        
         //-------------- creacion carrera para que pueda ALBERGAR materias, pero
         //es necesario que antes se crea la lista vacia de materias que se va asociar
      
         
          LinkedList <Materia> listaMaterias= new LinkedList<Materia>();
    Carrera car1 = new Carrera (212, "Tecnicatura en divagar",listaMaterias);
        controlLog.crearCarrera(car1);
        
        //creacion de materia y guardado en BD. Solo se asocian las ID, LISTA DE materias aun esta vacia
        Materia materia1 = new Materia ("mirar mariposas", 1, "cuatrimestral",car1);
        Materia materia2 = new Materia ("tiktok", 2, "anual", car1);      
        Materia materia3 = new Materia ("instagram", 6, "Anual", car1);
        controlLog.crearMateriacarre(materia1);
        controlLog.crearMateriacarre(materia2);
        controlLog.crearMateriacarre(materia3);
        
        //agregacion de materias a la lista
       
        listaMaterias.add(materia1);
        listaMaterias.add(materia2);
        listaMaterias.add(materia3);
        
        //edicion de la lista de materias
        car1.setListaLinkmateria(listaMaterias);
        controlLog.editarCarrera(car1);
        
        
 
        
        Alumno alu = new Alumno(81, "bobo",  "chiquito", new Date(), car1);

        Alumno alu1 = new Alumno(65, "patricio",  "castro", new Date(), car1);
        controlLog.crearAlumno(alu);
        controlLog.crearAlumno(alu1);
        
        System.out.println("\n-----------------"
                + "DATOS: \n");
      

        //   controlLog.eliminarALumno(5);
//            alu.setNombre("oli");
//            controlLog.editarAlumno(alu);



//           Alumno x= controlLog.traerAlumno(4);
//            x.toString();
//            System.out.println("busqueda unitaria +"
//                    + "el alumno es: " + x.toString())
//                    ;
//         

 
          System.out.println("Búsqueda individual");  
            ArrayList <Alumno> listaAlArray = controlLog.traerListaAlumnos();
            
            for (Alumno aux : listaAlArray) {
                System.out.println("El alumno es: " + aux.toString() );
                System.out.println(" cursa la carrera" + alu.getCarre());
                System.out.println(" con las materias" + car1.getListaLinkmateria());
        }
            
    }
    
     
}
