/* Lo primero que vamos a hacer es crear una tortilla que pueda aceptar distintos parámetros
 * según la necesidad de cada restaurante, para poder producir tortillas diferentes
 * para esto utilizaremos la clase Tortilla, que tendrá 2 métodos*/

class Tortilla {
	
	//Iniciamos las variables que vamos a utilizar como paámetros
    String lugar;      // String con el nombre de la ciudad
    String[] ingredientes;   // Array con los ingredientes de la tortilla
    int tiempoDeFritura;    // variable tipo int que representa el tiempo de fritura en minutos

    /* Iniciamos el constructor de la clase Tortilla que recibe el String del lugar,
     *  un array con la lista de ingredientes y tiempo de fritura como parámetros */
    
      Tortilla(String lugar, String[] ingredientes, int tiempoDeFritura) {
    	  
    	//asignamos el valor del parámetro lugar al atributo con el mismo nombre y así con el resto
        this.lugar = lugar; 
        this.ingredientes = ingredientes;
        this.tiempoDeFritura = tiempoDeFritura;
        
        // Imprimimos la tortilla resultante con sus ingredientes y tiempo de fritura 
        
        System.out.println("Tortilla de " + this.lugar);  
        /* Esta línea fue un dolor de cabeza hasta que encontré el método String.join,
         * hasta ese momento estaba usando un for loop para imprimir los 3 ingredientes,
         * no se me ocurría otra manera*/
        System.out.println("Ingredientes: " + String.join(", ", this.ingredientes)); 
        System.out.println("Tiempo de fritura: " + this.tiempoDeFritura + " minutos\n"); 
    }

    // Método de fábrica crearTortilla para crear las Tortillas.
    public static Tortilla crearTortilla(String lugar, String[] ingredientes, int tiempoDeFritura) {
        return new Tortilla(lugar, ingredientes, tiempoDeFritura);
    }
}

public class Main {
    public static void main(String[] args) {
    	//Asignamos los ingredientes a cada array
        String[] ingredientesBerlin = {"Huevo", "Patata", "Cerveza"};
        String[] ingredientesMexico = {"Huevo", "Patata", "Chile"};
        String[] ingredientesLaCoruna = {"Huevo", "Patata", "Cebolla"};
        
        //Y al fin tenemos la tortilla! usando el metodo y pasandole los 3 argumentos.
        Tortilla.crearTortilla("Berlín", ingredientesBerlin, 4);
        Tortilla.crearTortilla("México", ingredientesMexico, 5);
        Tortilla.crearTortilla("La Coruña", ingredientesLaCoruna, 6);
    }
}


