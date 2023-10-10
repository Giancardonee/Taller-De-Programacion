/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial.pkg2;
public class Goleador {
    private String nombre; 
    private String equipo;
    private int cantGoles; 

    public Goleador(String unNombre,String unNombreEquipo, int unaCantGoles) {
        this.equipo = unNombreEquipo;
        this.cantGoles = unaCantGoles;
        this.nombre= unNombre;
    }
    
    public int getCantGoles (){
        return this.cantGoles;
    }
    
    public String toString (){
        return "nombre: "+this.nombre+" equipo: "+this.equipo+ " goles anotados: "+this.cantGoles;
    }
    
}
