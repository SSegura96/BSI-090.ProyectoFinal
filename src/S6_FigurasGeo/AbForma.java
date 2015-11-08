/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S6_FigurasGeo;

import javax.swing.JOptionPane;

/**
 *
 * @author Sergio Segura Vidal
 */
public abstract class AbForma implements IDibujar 
{
	protected String nombre;
	protected String mensaje;
        
        protected double area;
        protected double perimetro;
        protected int tipo;
        
	public AbForma ()
	{
		this.nombre = "";
		this.mensaje = "";
                this.area = 0;
                this.perimetro = 0;
	}

	public void saludo ()
	{
            mensaje = "Bienvenido al analisis del: "+nombre;
	}

        public int getTipo() 
        {
            return tipo;
        }
        
	@Override
	public String toString ()
	{
		return "La figura es: "+nombre+"\n"
                    + "El area es "+area+"\n"
                    + "El perimetro es: "+perimetro;
	}
}
