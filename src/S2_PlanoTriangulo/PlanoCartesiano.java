/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S2_PlanoTriangulo;

/**
 *
 * @author Sergio Segura Vidal
 */
public class PlanoCartesiano 
{
    double x, y;
    int cuadrante;
    double distancia;
    String cordenada;
    
    public PlanoCartesiano(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public void cuadrante ()
    {
        if (x>0 && y>0)
        {
            cuadrante = 1;
        }
        
        if (x<0 && y>0)
        {
            cuadrante = 2;
        }
        
        if (x>0 && y<0)
        {
            cuadrante = 3;
        }
        
        if (x<0 && y<0)
        {
            cuadrante = 4;
        }
    }
    
    public void cordenada ()
    {
        cordenada = "("+x+","+y+")";
    }
    
    public void calcDistancia ()
    {
        double num1=x, num2=y;
        
        if (x<0)
        {
            num1*=-1;
        }
        
        if (y<0)
        {
            num2*=-1;
        }
        
        distancia = (Math.sqrt(Math.pow(num1,2)+Math.pow(num2,2)));
    }
    
        
    @Override
    public String toString ()
    {
        return "los datos son: X="+x+", Y="+y+"\n"
            +  "la cordenada es: "+cordenada+"\n"
            +  "se encuenta en el cuadrante: "+cuadrante+"\n"
            +  "la distancia del punto al \n "
            +  "origen es: "+distancia; 
    }
}
