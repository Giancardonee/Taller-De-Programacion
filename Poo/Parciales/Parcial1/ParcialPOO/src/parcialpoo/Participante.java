/*
    De cada participante se tiene: Nombre, dni , edad
 */
package parcialpoo;

/**
 *
 * @author Usuario
 */
public class Participante {
    private String nombre;
    private int edad;
    private int dni; // puede ser un string tamb  

    public Participante (String nombre, int dni, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }


    public int getDni() {
        return dni;
    }
    
    public String toString (){
        String aux;
        aux = "Nombre: "+this.getNombre();
        return aux;
    }
    
        /*
    
        COMO NOS PIDE QUE EL CONSTRUCTOR SE INICIE A PARTIR DE TODA SU INFORMACION, A PRIORI SE ME OCURRE QUE
        LA UNICA FORMA DE INSTANCIARLOS SEA SOLO CON EL CONSTRUCTOR, POR LO TANTO LOS SETTERS ESTARIAN O PRIVADOS, 
        O DIRECTAMENTE NO DEBERIAN ESTAR
    
        public void setDni(int dni) {
        this.dni = dni;

         public void setEdad(int edad) {
        this.edad = edad;

        public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    }
    */
    
}
