
package cuadros;

import java.util.Scanner;

/**
 *
 * @author Eduardo Huchin
 */
public class Cuadros {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        SegundClase segunda = new SegundClase();
        Scanner leer = new Scanner(System.in);
        int [][]matriz;
        int [] [] parametros;
        int casos;
        String cadena;
        String [] datos;
           
        //Derecha 1
        //Izquierda 2
        //arriba 3
        //abajo 4

        System.out.println("Introduzca el numero de casos");
        casos = leer.nextInt();
        leer.nextLine();
        parametros = new int [casos] [2];
        System.out.println("Introduzca el numero filas y columnas");
        for (int a =0 ; a<casos;a++)
        {
            cadena = leer.nextLine();
            datos = cadena.split(" "); 
            parametros [a] [0] = Integer.parseInt(datos[0]);
            parametros [a] [1] = Integer.parseInt(datos[1]);
            
        }
        
         segunda.operacion(parametros,casos);
        
        
    }
    
    
}

