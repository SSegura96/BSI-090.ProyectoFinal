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
public class Linea extends AbForma
{
    double valorSegmento;

    public Linea(double valorSegmento) 
    {
        this.valorSegmento = valorSegmento;
    }

    @Override
    public void saludo ()
    {
        nombre = "Linea";
        mensaje = "Bienvenido al calculo de la Linea";
    }

    @Override
    public void calcArea ()
    {
        area = 0;
    }

    @Override
    public void calcPerimetro ()
    {
        perimetro = valorSegmento;
    }

    @Override
    public void dibujarFigura ()
    {
       tipo = 2;
    }
}
