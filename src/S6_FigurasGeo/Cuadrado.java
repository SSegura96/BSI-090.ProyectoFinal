package S6_FigurasGeo;

/**
 *
 * @author Sergio Segura Vidal
 */
public class Cuadrado extends AbForma
{
    double valorLado;

    public Cuadrado(double valorLado) 
    {
        this.valorLado = valorLado;
    }

    @Override
    public void saludo ()
    {
        nombre = "Cuadrado";
        mensaje = "Bienvenido al calculo del Cuadrado";
    }

    @Override
    public void calcArea ()
    {
        area = valorLado*valorLado;
    }

    @Override
    public void calcPerimetro ()
    {
        perimetro = valorLado * 4;
    }

    @Override
    public void dibujarFigura ()
    {
       tipo = 1;
    }

    public double getValorLado()
    {
        return valorLado;
    }

    public void setValorLado(int valorLado) 
    {
        this.valorLado = valorLado;
    }
}
