/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S4_PoligonosRegulares;

/**
 *
 * @author Sergio Segura Vidal
 */
public class PoligonoRegular 
{
    protected String figura;
    protected int numLados;
    protected double longLado;            
    protected double apotema;            
    protected double area;            
    protected double perimetro;            

    public PoligonoRegular() {
        this.numLados = 0;
        this.longLado = 0.0;
        this.apotema = 0.0;
    }

    public String getFigura() {
        return figura;
    }

    public void setFigura(String figura) {
        this.figura = figura;
    }
    
    public double getLongLado() {
        return longLado;
    }

    public void setLongLado(double longLado) {
        this.longLado = longLado;
    }

    public double getApotema() {
        return apotema;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;
    }

    public int getNumLados() {
        return numLados;
    }

    public void setNumLados(int numLados) {
        this.numLados = numLados;
    }
    
    public void calcularArea ()
    {
       area = (longLado*numLados*apotema)/2; 
    }
    
    public void calcularPerimetro ()
    {
        perimetro = numLados*longLado;
    }
    
    @Override
    public String toString ()
    {
        return "La figura es un "+figura+"\n"
               +"Sus lados miden "+longLado+"\n"
               +"Su area es "+area+"\n"
               +"Su perimetro es "+perimetro;
    }
}
