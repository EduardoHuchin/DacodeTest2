
package cuadros;

import java.util.Scanner;

/**
 *
 * @author Eduardo Huchin
 */
public class Cuadros {


    public static void main(String[] args) {
        
        SegundClase segunda = new SegundClase();
        Scanner leer = new Scanner(System.in);
        int [] [] parametros; //Un arreglo en donde se guardaran todos los parametros de los casos
        int casos; //Numero de casos a resolver
        String cadena; //Para dar el estilo separado 
        String [] datos; //Para hacer un split y luego pasarlo a parametros
           
        //Derecha 1
        //Izquierda 2
        //arriba 3
        //abajo 4

        System.out.println("Introduzca el numero de casos");
        casos = leer.nextInt();
        leer.nextLine();
        parametros = new int [casos] [2]; //Parametros sera siempre un arreglo de N filas y 2 columnas
        System.out.println("Introduzca el numero filas y columnas");
        for (int a =0 ; a<casos;a++)
        {
            cadena = leer.nextLine();
            datos = cadena.split(" "); //Convertimos el String en int
            parametros [a] [0] = Integer.parseInt(datos[0]);//Almacenamos las filas
            parametros [a] [1] = Integer.parseInt(datos[1]);//Almacenamos las columnas
            
        }
        
        segunda.operacion(parametros,casos); //LLamamos a la clse operación la cual le daremos
                                            //la matriz de parametros y el numero de casos 
        
        
    }
    
    
}

