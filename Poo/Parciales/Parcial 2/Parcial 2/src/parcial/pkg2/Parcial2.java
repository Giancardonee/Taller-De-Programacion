package parcial.pkg2;
/**
 *
 * @author Gianca
 */
public class Parcial2 {
    public static void main(String[] args) {
     Torneo torneo1 = new Torneo ("Torneo intercolegial",5,5); // nombreTorneo,cantFechas,cantGoleadores
     Goleador goleador1 = new Goleador ("Gianluca","EDLP",7); // nombreGoleador, nombreEquipo, cantGoles;
     torneo1.agregarJugador(goleador1, 1); // fecha 1 corresponde a indice 0 (en fecha)en la matriz 
     Goleador goleador2 = new Goleador ("Franco","Chacarita",3); // nombreGoleador, nombreEquipo, cantGoles;
     torneo1.agregarJugador(goleador2, 1);
     Goleador goleador3 = new Goleador ("Nahu","Boca",8);
     torneo1.agregarJugador(goleador3, 3);
     
     System.out.println(torneo1.toString());
     System.out.println("Se registraron "+torneo1.cantGoleadoresRegistrados()+ " goleadores.");
     System.out.println("El goleador con menos goles es: "+torneo1.goleadorConMenosGoles(1).toString());   
    }
    
}
