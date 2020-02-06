
package cuadros;

/**
 *
 * @author Dell
 */
public class SegundClase {
    
    public void operacion (int [][] parametros, int casos)
    {
        int N;//filas
        int M; //Columnas
        int inicio; //Siempre iniciamos a la derecha por tanto el valor sera 1

        inicio =1;
                        
        for (int i =0; i<casos; i++) //Repetimos tanos casos sean
        {
            N= parametros [i][0]; //Extraemos las filas
            M= parametros [i][1]; //Exteaemos las columnas
            inicio =Derecha (inicio,N,M); //Iniciamos en la derecha siempre asi que llamaos al metodo Derecha()
                                          //Nos retornara un int del 1 al 4 
            
            switch (inicio) //Con base a ese int se determinara a que direccion nos quedamos mirando
            {
                case 1:
                    System.out.println("R");
                    
                break;

                case 2:
                    System.out.println("L");
                break;

                case 3:
                   System.out.println("U");
                break;

                case 4:
                    System.out.println("D");
                break;
        
            }
            
        }
        
    }
    
    
    public int Derecha (int inicio, int N, int M)
    {
        int a,b, posicion;
        a=N;
        b=M;
        posicion= inicio;
        
        a= a-1; //Le restamos una fila ya que nos moveremos en filas ya que nos toca ir a la derecha
        if (a>0) 
        {
            
            posicion = Abajo(posicion, a, b); //Si a es mayor que 0 significa que aun queda una fila y por tanto
                                              //una columna, ya hemos recorrido nuestra fila ahora queda doblar a la derecha
                                              //lo que nos conduce a ir abajo por lo que llamamos al metodo Abajo
        }
        else
        {
            posicion = 1;//Si es a es 0 ya no quedan filas ni columnas por lo que quedamos mirando
                        //a la direccion actual
        }
        
        
        
        return posicion;
    }
    
    public int Izquierda (int inicio, int N, int M) 
    {
        
        int a,b, posicion;
        a=N;
        b=M;
        posicion= inicio;
        
        a= a-1;//Le restamos una fila ya que nos moveremos en filas ya que nos toca ir a la izquieda
        if (a>0)
        {
            
            posicion = Arriba(posicion, a, b);//Si a es mayor que 0 significa que aun queda una fila y por tanto
                                              //una columna, ya hemos recorrido nuestra fila ahora queda doblar a la derecha
                                              //lo que nos conduce a ir arriba por lo que llamamos al metodo Arriba
        }
        else
        {
            posicion = 2;//Si es a es 0 ya no quedan filas ni columnas por lo que quedamos mirando
                        //a la direccion actual
        }
        
        
        
        return posicion;
    }
    
    public int Arriba (int inicio, int N, int M)
    {
        int a,b, posicion;
        a=N;
        b=M;
        posicion= inicio; 
        b= b-1; //Le restamos una columna ya que nos moveremos en columnas ya que nos toca ir a arriba
        if (b>0)
        {
            
            posicion = Derecha(posicion, a, b);//Si a es mayor que 0 significa que aun queda una columna y por tanto
                                              //una fila, ya hemos recorrido nuestra columna ahora queda doblar a la derecha
                                              //lo que nos conduce a ir a la derecha por lo que llamamos al metodo Derecha
        }
        else
        {
            posicion = 3;//Si es a es 0 ya no quedan filas ni columnas por lo que quedamos mirando
                        //a la direccion actual
        }
        
        
        
        return posicion;
    }
    
    
    public int Abajo (int inicio, int N, int M)
    {
        int a,b, posicion;
        a=N;
        b=M;   
        posicion= inicio;
        
        b= b-1;//Le restamos una columna ya que nos moveremos en columnas ya que nos toca ir a abajo
        
        if (b>0)
        {
            
            posicion = Izquierda(posicion, a, b);//Si a es mayor que 0 significa que aun queda una columna y por tanto
                                              //una fila, ya hemos recorrido nuestra columna ahora queda doblar a la derecha
                                              //lo que nos conduce a ir a la izquierda por lo que llamamos al metodo Izquierda
        }
        else
        {
            posicion = 4;//Si es a es 0 ya no quedan filas ni columnas por lo que quedamos mirando
                        //a la direccion actual
        }
        
        
        
        return posicion;
    }
    
   
    
}
