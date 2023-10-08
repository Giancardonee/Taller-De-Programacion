/*
    Cada pareja tiene 2 participantes y un estilo de baile
 */
package parcialpoo;

/**
 *
 * @author Usuario
 */
public class Pareja {
    
    // podria hacerse un vector de 0 a cantParticipantes (2)
    private Participante participante1;
    private Participante participante2;
    
    private String estiloBaile;
    
    public Pareja (String unEstiloBaile, Participante p1, Participante p2){
        this.estiloBaile = unEstiloBaile;
        this.participante1 = p1;
        this.participante2 = p2;
    }

    public Participante getParticipante1() {
        return participante1;
    }

    public Participante getParticipante2() {
        return participante2;
    }
    
    public String getEstiloBaile() {
        return estiloBaile;
    }

    public int obtenerDiferenciaEdad (){
         int edad1 = this.participante1.getEdad();
         int edad2 = this.participante2.getEdad();
         int resultado;
         if (edad1>edad2) {
             resultado = edad1-edad2;
         }
         else {
             resultado = edad2-edad1;
         }
         return resultado;
    }
    
    
    public String toString (){
        String aux;
        aux =this.participante1.toString()+ " "+this.participante2.toString();
        return aux;
    }
    
    
    
    
}
