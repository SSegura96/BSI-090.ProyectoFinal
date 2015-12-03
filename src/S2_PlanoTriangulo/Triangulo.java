package S2_PlanoTriangulo;

/**
 * @author Sergio Segura Vidal
 */

public class Triangulo 
{
    private double ladoA;
    private double ladoB;
    private double ladoC;
    private double ladoMayor;
    private String mensaje;

    public Triangulo(double ladoA, double ladoB, double ladoC) 
    {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }
    
    public void setMensaje(String mensaje) 
    {
        this.mensaje = mensaje;
    }
    
    public double mayor (double x, double y)
    {
        if (x<y)
        {
            return y;
        }
        else
        {
            return x;
        }
    }
    
    
    public void ladoMayor ()
    {
        ladoMayor = mayor(mayor(ladoA,ladoB),ladoC);
    }
    
    public boolean equilatero ()
    {
        boolean equilatero = false;
        mensaje = "los lados del tringualo son "
                + "\n"+ladoA+","+ladoB+","+ladoC+" Respectivamente\n";
        
        if (ladoA == ladoB && ladoB == ladoC)
        {
            mensaje += "El triangulo es Equilatero";
            
            equilatero = true;
        }
        else
        {
            mensaje += "El triandulo no es Equilatero";
        }
        
        return equilatero;
    }
    
    public String toString (boolean equilatero)
    {
        if (equilatero == false)
        {
            return mensaje+"\nel numero mayor es: "+ladoMayor+".";
        }
        else
        {
            return mensaje+"\nno existe un lado mayor todo son iguales.";
        }
    }
}
