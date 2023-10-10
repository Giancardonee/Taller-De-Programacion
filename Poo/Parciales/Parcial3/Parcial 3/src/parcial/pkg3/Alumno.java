package parcial.pkg3;
/**
 *
 * @author Usuario
 */
public class Alumno {
    private int dni; 
    private String nombre;
    private int asistencia;
    private int aEvaluacionesAprob;
    
    public Alumno (String unNombre, int unDni){
        this.nombre= unNombre;
        this.dni = unDni;
        this.asistencia=0;
        this.aEvaluacionesAprob=0;
    }
    
    public int getDni (){
        return dni;
    }
   
    public void incrementarAsit (){
        this.asistencia++;
    }
    
    public void incrementarAutoEv (){
        this.aEvaluacionesAprob++;
    }
    
    public int getAutoEvaluaciones (){
        return this.aEvaluacionesAprob;
    }
    
    public int getCantAsistencias (){
        return this.asistencia;
    }
    
}
