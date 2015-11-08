/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S6_FigurasGeo;

/**
 *
 * @author Sergio Segura Vidal
 */
public class Rectangulo extends AbForma
{
	
    private double ancho;
    private double largo;

    public Rectangulo(double ancho, double largo) 
    {
        this.ancho = ancho;
        this.largo = largo;
    }

    @Override
    public void saludo ()
    {
        nombre = "Rectangulo";
        mensaje = "Bienvenido al calculo del Rectangulo";
    }

    @Override
    public void calcArea ()
    {
        area = largo*ancho;
    }

    @Override
    public void calcPerimetro ()
    {
        perimetro = (2*largo)+(2*ancho);
    }

    @Override
    public void dibujarFigura ()
    {
       tipo = 3;
    }
}
