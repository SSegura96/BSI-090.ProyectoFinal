package S4_AnalisisPersona;

import java.awt.Event;

public class AnalisisPersona 
{   
    public void mensajesError()
    {
        String[] error = {"Error usted el caracter digitado no es valido"}; 
    }
    
    public int CalcularIMC (double altura ,double peso)
    {   
        double imc = peso/Math.pow(altura,2);
        
        if (imc<18) 
        {
            return -1;
        }
        else
        {
            if (imc >=18 && imc <=26.9)
            {
                return 0;
            }
            else
            {
                return 1;
            }
        }
    }
    
    public boolean EsMayorDeEdad (int Edad)
    {
        if (Edad >= 18)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
