package parcial.pkg2;
public class Torneo {
    private String nombre; 
    private Goleador matriz[][]; // matriz por fecha y cant goleadores
    private int vecCantGoleadores[]; // cant goleadores por fecha. Contador
    private int cantFechas; 
    private int cantGoleadores;

    
    public Torneo(String unNombre, int unaCantFechas, int unaCantGoleadores) {
        this.nombre = unNombre; 
        this.cantFechas= unaCantFechas; 
        this.cantGoleadores=unaCantGoleadores;
        matriz = new Goleador [cantFechas][cantGoleadores];
        vecCantGoleadores = new int [cantFechas];
        inicializarVecCantGoleadores();
    }
   
    private void inicializarVecCantGoleadores (){
        for(int i=0; i < this.cantFechas; i++){
            vecCantGoleadores[i]=0;
        }
    }
    
    private void incrementarGoleadorEnFecha (int fecha){
        vecCantGoleadores[fecha]++;
    }
    
    
    // SE ASUME QUE X ESTA EN RANGO 1..CANTFECHAS Y QUE DICHA FECHA TIENE LUGAR PARA UN GOLEADOR MAS
    // tener en cuenta, que a la fecha del main, hay que restarle 1 para que coincida con el indice.
    public void agregarJugador (Goleador unGoleador, int fechaX){ // x es la fecha
        
        fechaX--; // decremento la fecha para que tenga el valor real de la matriz.  
                // ej si recibe desde el main la fecha 1, en la matriz es la fecha 0.
                
                
        int ultGoleador = vecCantGoleadores[fechaX];// me traigo la dimL 
        matriz[fechaX][ultGoleador] = unGoleador; // lo asigno en el ultimo lugar de la fecha
        incrementarGoleadorEnFecha(fechaX); // incremento la cantidad de goleadores de esa fecha
     }

    private boolean efectuoMenosGoles (int golesAct, int golesMin){
        return golesAct < golesMin;
    }
    
    public Goleador goleadorConMenosGoles (int fechaX){
        fechaX--; //para que coincida con el indice de la matriz
        int cantGoles;
        int golesMin=999;
        Goleador goleadorMin=null;
        int goleadores = vecCantGoleadores[fechaX]; 
        for (int i=0; i <goleadores; i++){
             cantGoles = matriz[fechaX][i].getCantGoles();
             if (efectuoMenosGoles(cantGoles,golesMin)){
                 golesMin = cantGoles;
                 goleadorMin = matriz[fechaX][i]; 
             }
        }
        return goleadorMin;
    }
    
    public int cantGoleadoresRegistrados (){
        int cant=0;
        for (int i=0; i < this.cantFechas; i++){
            cant+= vecCantGoleadores[i];
        }
        return cant; 
    }
    
    private String dataGoleadoresFecha (int fechaAct, int goleadoresFecha){
        String aux="->Goleadores: \n"; 
        for (int i=0; i < goleadoresFecha; i++){
            aux += "------>"+matriz[fechaAct][i].toString()+ "\n";
        }
        return aux;
    }
    
    private String recorroPorFecha (){
        String aux="";
        int goleadoresFecha;
        for (int i=0; i< this.cantFechas; i++){
            aux += "\n || Fecha "+(i+1)+" || \n";
            goleadoresFecha = vecCantGoleadores[i];
            aux +=  ">>> Cantidad de goleadores: "+goleadoresFecha+"\n";
            if (goleadoresFecha>0){
               aux += dataGoleadoresFecha(i,goleadoresFecha);   
            }
        }
        return aux;
    }
    
    public String toString () {
        String aux; 
        aux ="Torneo 2023: "+this.nombre;
        aux += this.recorroPorFecha();
        return aux;
    }
    
}
