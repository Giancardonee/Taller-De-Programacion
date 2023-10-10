package parcial.pkg3;
public class CursoADistancia extends Curso{
    private String linkSalaVirtual;
    
    public CursoADistancia (int unAño, int N,String unLink){
        super(unAño,N);
        this.linkSalaVirtual = unLink;
    }
    
    @Override
    public boolean puedeRendir (Alumno unAlumno){
        return ( (unAlumno.getAutoEvaluaciones()>=3) && (unAlumno.getCantAsistencias()>=1) ); 
    }
    
    
}
