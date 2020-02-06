
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
        int f;
        int c;
        int inicio;
        int matriz [][];
        
        f=0;
        c=0;
        inicio =1;
        
        
        
        for (int i =0; i<casos; i++)
        {
            N= parametros [i][0];
            M= parametros [i][1];
            matriz = new int [N][M];
            inicio =Recorrido(N,M,inicio, matriz,f, c);
            
            switch (inicio)
            {
                case 1:
                    System.out.println("R");
                    
                break;

                case 2:
                    System.out.println("L");
                break;

                case 3:
                   System.out.println("D");
                break;

                case 4:
                    System.out.println("U");
                break;
        
            }
            
        }
        
    }
    
    public int Recorrido (int N, int M, int inicio, int [][] matriz,int f, int c)
    {
        int a;
        int b;
        int comodin;
        int pos;
        int [][] ocupado;
        
        ocupado= matriz;
        
        pos=inicio;
        
        switch(pos)
        {
            case 1:
                
                
                comodin = 0;
                a=f;
                pos=4;
                for (b=c;b<N;b++)
                {
                    
                    comodin = b;
                    if (ocupado[a][b] ==1)
                    {
                        pos=Recorrido(N,M,pos, ocupado,a+1, b);
                        
                        break;
                    }
                    
                    if (ocupado[a][b] !=1)
                    {
                        ocupado[a][b]=1;  
                        
                    }
                    
                    
                }
                if ((a+1)<N)
                {
                    if (ocupado[a+1][comodin] !=1)
                    {
                        pos=Recorrido(N,M,pos, ocupado,a+1, comodin);
                        
                        
                    }
                }
                
            
            break;
            
            case 2:
                
                comodin = 0;
                a=f;
                pos=3;
                for (b=c;b>-1;b--)
                {
                    comodin = b;
                    if (ocupado[a][b] ==1)
                    {
                        pos=Recorrido(N,M,pos, ocupado,a-1, b);
                        
                        break;
                    }
                    
                    if (ocupado[a][b] !=1)
                    {
                        ocupado[a][b]=1;  
                        
                    }
                    
                    
                }
                if ((a-1)>-1)
                {
                    if (ocupado[a-1][comodin] !=1)
                    {
                       pos=Recorrido(N,M,pos, ocupado,a-1, comodin);
                        
                        
                    }
                }
                
                
            
            break;
            
            
            case 3:
                
                comodin = 0;
                b=c;
                pos=1;
                   
                for (a=f;a>-1;a--)
                {
                    comodin = a;
                    if (ocupado[a][b] ==1)
                    {
                        pos=Recorrido(N,M,pos, ocupado,a, b+1);
                        
                        break;
                    }
                    
                    if (ocupado[a][b] !=1)
                    {
                        ocupado[a][b]=1;  
                        
                    }                   
                    
                }
                if ((b+1)<M)
                {
                    if (ocupado[comodin][b+1] !=1)
                    {
                       pos=Recorrido(N,M,pos, ocupado,comodin, b+1);
                        
                        
                    }
                }
                
 
            break;
            
            
            case 4:
                b=c;
                pos=2;
                comodin =0;
                
                for (a=f;a<M;a++)
                {
                    comodin = a;
                    if (ocupado[a][b] ==1)
                    {
                        pos=Recorrido(N,M,pos, ocupado,comodin, b-1);
                        
                        break;
                    }
                    
                    if (ocupado[a][b] !=1)
                    {
                        ocupado[a][b]=1;  
                        
                    }                   
                    
                }
                if ((b+1)<M)
                {
                    if (ocupado[comodin][b-1] !=1)
                    {
                       pos=Recorrido(N,M,pos, ocupado,a, b-1);
                        
                        
                    }
                }
                
                
               
            
            break;
                
        }
       
        
        return pos;
    }
    
}
