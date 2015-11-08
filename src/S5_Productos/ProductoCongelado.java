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
public class ProductoCongelado extends Productos
{
    private double tempRecomendada;

    public ProductoCongelado(String fechaVen, String Nombre, int numLote, double precioCU,double tempRecomendada) {
        super(fechaVen, Nombre, numLote, precioCU);
        this.tempRecomendada = tempRecomendada;
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
        return "La temperatura recomendada es "+tempRecomendada+"°";
    }
}
