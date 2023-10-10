/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial.pkg3;

/**
 *
 * @author Usuario
 */
public class CursoPresencial extends Curso{
    private int numeroAula;
    
    public CursoPresencial (int unAño, int N,int unNroAula){
        super(unAño,N);
        this.numeroAula=unNroAula;
    }
    
    @Override
    public boolean puedeRendir (Alumno unAlumno){
        return ( (unAlumno.getCantAsistencias()>=3) ); 
    }
}
