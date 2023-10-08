/*


1. Representar un concurso de baile. El concurso tiene a lo sumo N parejas. Cada pareja tiene 2
participantes y un estilo de baile. De los participantes se tiene dni, nombre, edad

a) Genere las clases necesarias. Provea constructores para iniciar: el concurso para un máximo de N
parejas (inicialmente sin parejas cargadas); las parejas y los participantes a partir de toda su información.

b) Implemente métodos en las clases adecuadas para permitir:
- Agregar una pareja al concurso. Asuma que hay lugar.
-Obtener la diferencia de edad de la pareja.
-Obtener la pareja con más diferencia de edad del concurso.

2. Realice un programa que instancie un concurso, cargue 2 parejas y a partir del concurso muestre: los
nombres de los participantes de la pareja con más diferencia de edad


 */
package parcialpoo;
/**
 *
 * @author Gianca
 */
public class ParcialPOO {
    public static void main(String[] args) {
        Concurso concurso1 = new Concurso (4);
        
        Participante p1 = new Participante ("PrimerParticipante", 000, 45);
        Participante p2 = new Participante ("SegundoParticipante",000, 42);
        Pareja pareja1 = new Pareja ("unEstiloBaile",p1,p2);
        concurso1.agregarPareja(pareja1);
        
        Participante p3 = new Participante ("TercerParticipante", 444, 32);
        Participante p4 = new Participante ("CuartoParticipante",444, 24);
        Pareja pareja2 = new Pareja ("unEstiloBaile",p3,p4);
        concurso1.agregarPareja(pareja2);
        
        Pareja parejaMaxima = concurso1.parejaMasDiferenciaEdad();
        System.out.println(parejaMaxima.toString());
        
    }
    
    
}
