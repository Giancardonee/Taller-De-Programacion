package parcial.pkg3;
/**
 *
 * @author Usuario
 */
public abstract class Curso {
    private int añoCursada;
    private Alumno vecAlumnos[];
    private int dimL; 
    private int dimF;
    
    
    public Curso (int unAño, int N){ // n es maximo de alumnos
        this.añoCursada= unAño;
        this.vecAlumnos = new Alumno [N];
        this.dimL=0;
        this.dimF=N;
        this.inicializarVector();
    }
    
    private void inicializarVector (){
        for (int i=0; i < dimF; i++){
            vecAlumnos[i]=null;
        }
        
    }
    
    public boolean agregarAlumno (Alumno unAlumno){
        boolean pude;
        if (dimL < dimF){
            vecAlumnos[dimL]= unAlumno;
            dimL++;
            pude=true;
        }
        else{
            pude=false;
        }
        return pude;
    }
    
    private int buscarPorDni (int unDni){
        boolean encontre = false;
        int i=0;
        int pos=-1;
        
        while ( (i < dimL) && (encontre==false) ){
            if (vecAlumnos[i].getDni() == unDni){
                encontre=true;
                pos=i;
            }
            else{
                i++;
            }
        }
        return pos;
    }
    public void indcrementarAsistencia (int unDni){
            int pos= buscarPorDni(unDni);
            if ( pos!= -1){
                vecAlumnos[pos].incrementarAsit();
            }
     }
    
    public void incrementarAutoEvaluacion (int unDni){
            int pos= buscarPorDni(unDni);
            if ( pos!= -1){
                vecAlumnos[pos].incrementarAutoEv();
            }
    }
    
    public abstract boolean puedeRendir (Alumno unAlumno);
    
    public int cantAlumnosPuedenRendir (){
        int cant=0;
        for (int i=0; i < dimL; i++){
            if (this.puedeRendir(vecAlumnos[i])== true){
                cant++;
            }
        }
        return cant; 
    }
    
}
