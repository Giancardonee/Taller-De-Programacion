package parcial.pkg3;
public class Parcial3 {
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Estoy en curso Presencial:");
        CursoPresencial cursoPresencial1 = new CursoPresencial (5,10,4); // año, N, aula 
        Alumno alumno4 = new Alumno ("José",43200);
        Alumno alumno5 = new Alumno ("Lautaro",480);
        Alumno alumno6 = new Alumno ("Lucas",90);
        cursoPresencial1.agregarAlumno(alumno4);
         cursoPresencial1.agregarAlumno(alumno5);
          cursoPresencial1.agregarAlumno(alumno6);
           cursoPresencial1.indcrementarAsistencia(43200);
            cursoPresencial1.indcrementarAsistencia(43200);
             cursoPresencial1.indcrementarAsistencia(43200);
          System.out.println(cursoPresencial1.cantAlumnosPuedenRendir());
          
          System.out.println("--------------------------------------------");
          System.out.println("Estoy en curso a Distancia:");
        CursoADistancia cursoADistancia1 = new CursoADistancia (4,2,"https:://daskdklsadj"); 
        Alumno alumno1 = new Alumno ("Gianluca",45200);
        Alumno alumno2 = new Alumno ("Franco",48800);
        Alumno alumno3 = new Alumno ("Nahuel",9990);
           cursoADistancia1.agregarAlumno(alumno1);
            cursoADistancia1.agregarAlumno(alumno2);
             cursoADistancia1.agregarAlumno(alumno3);
             
             cursoADistancia1.indcrementarAsistencia(45200);
             cursoADistancia1.incrementarAutoEvaluacion(45200);
             cursoADistancia1.incrementarAutoEvaluacion(45200);
             cursoADistancia1.incrementarAutoEvaluacion(45200);
             
             System.out.println("El alumno 1 puede rendir? "+cursoADistancia1.puedeRendir(alumno1));
             System.out.println("La cantidad de alumnos que pueden rendir son: "+cursoADistancia1.cantAlumnosPuedenRendir());
             
             
    }
    
}
