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
public class ProductoFresco  extends Productos 
{
    
    private String fechaEmbasado;
    private String paisOrigen;

    public ProductoFresco(String fechaVen, String Nombre, int numLote, double precioCU, String paisOrigen, String fechaEmbasado) {
        super(fechaVen, Nombre, numLote, precioCU);
        this.fechaEmbasado = fechaEmbasado;
        this.paisOrigen = paisOrigen;
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
    public String toString() {
        return super.toString()+"\n"
        +"La fecha de embasado es: "+fechaEmbasado+"\n"
        +"El pais de origen es: "+paisOrigen; 
    }
}
