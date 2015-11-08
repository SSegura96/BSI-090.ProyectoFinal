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
public class Productos 
{
    private String fechaVen;
    protected String Nombre;
    private int numLote;
    protected double precioCU;

    public Productos(String fechaVen, String Nombre, int numLote,double precioCU) {
        this.fechaVen = fechaVen;
        this.Nombre = Nombre;
        this.numLote = numLote;
        this.precioCU = precioCU;
    }
    
    @Override
    public String toString ()
    {
        return "La fecha de vencimiento es: "+fechaVen+"\n"
              +"El nombre es: "+Nombre+"\n"
              +"El numero de lote es: "+numLote;
    }
}

