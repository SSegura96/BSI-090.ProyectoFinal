/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S5_Productos;

/**
 *
 * @author sergio
 */
public class ProductoRefrigerado extends Productos
{
    private String codOSA;

    public ProductoRefrigerado(String fechaVen, String Nombre, int numLote, double precioCU, String codOSA) {
        super(fechaVen, Nombre, numLote, precioCU);
        this.codOSA = codOSA;
    }
    
    public String getNombre() 
    {
        return Nombre;
    }
    
    public double getPrecio() 
    {
        return precioCU;
    }
    
    @Override
    public String toString ()
    {
        return super.toString() + "\n"
        +"El codigo del Organizmo de supervicion alimentaria es: "+codOSA;
    }
}
