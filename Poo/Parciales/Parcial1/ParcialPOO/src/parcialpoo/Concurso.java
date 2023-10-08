package parcialpoo;
/**
 *
 * @author Usuario
 */
public class Concurso {
    private Pareja vParejas [];
    private int cantParejas; //dimF
    private int parejasCargadas; // dimL
    
    public Concurso (int cantParejas){
        vParejas = new Pareja [cantParejas];
        parejasCargadas = 0;
        this.cantParejas = cantParejas;
    }

    public int getCantParejas() {
        return cantParejas;
    }

    private int getParejasCargadas() {
        return parejasCargadas;
    }    
    
    public Pareja parejaMasDiferenciaEdad (){
        Pareja parejaMax = null;
        int difEdadMax=0;
        for (int i=0; i < this.getParejasCargadas();i++){
            if (vParejas[i].obtenerDiferenciaEdad() > difEdadMax){
                difEdadMax = vParejas[i].obtenerDiferenciaEdad();
                parejaMax = vParejas[i];
            }
        }
        return parejaMax;
    }
   
    
    public void agregarPareja (Pareja parejaRecibida){
   // ese asuma que hay lugar es trambolico, pero bueno el if no lo pongo entonces ( SIGO EL ENUNCIADO )
        vParejas[parejasCargadas] = parejaRecibida;
        parejasCargadas++;
        
    }
    
    
    
    
}
