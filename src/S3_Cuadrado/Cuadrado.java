/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S3_Cuadrado;

/**
 *
 * @author sergio
 */
public class Cuadrado 
{
    private double lado;
    private double area;
    private double perimetro;

    public Cuadrado(double lado) 
    {
        this.lado = lado;
    }
    
    public void areaPerimetro ()
    {
        perimetro = lado*4;
        
        area = (lado*lado);
    }
    
    @Override
    public String toString ()
    {
        return "El valor de los lados es: "+lado
              +",\n el area es: "+area+"m2 ,"
              + " \nel perimetro es: "+perimetro;
    }
}
