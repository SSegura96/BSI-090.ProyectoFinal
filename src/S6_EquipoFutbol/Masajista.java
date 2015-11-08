/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S6_EquipoFutbol;

import javax.swing.JOptionPane;

/**
 *
 * @author sergio
 */
public class Masajista extends SeleccionFutbol
{
    String titulacion;
    int annosExperiencia;
    boolean darMasaje;
    String masaje;
    
    public Masajista ()
    {
        super.puesto = "Masajista";
        super.nombre = " ";
        super.apellido = " ";
        super.edad = 0;
        super.salario = 0.0;
        this.titulacion = " ";
        this.annosExperiencia = 0;
        this.darMasaje = false;
        this.masaje = "";
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAnnosExperiencia() {
        return annosExperiencia;
    }
    
    public void setAnnosExperiencia(int annosExperiencia) {
        this.annosExperiencia = annosExperiencia;
    }
    
    public void darMasaje ()
    {
        if (annosExperiencia >0)
        {
            darMasaje = true;
            masaje = "Si puede dar masajes";
        }
        else
        {
            masaje = "No puede dar masajes";
        }
    }
    
    public String toString ()
    {
        return super.toString()+"\n"
              +"Años experincia          "+annosExperiencia+"\n"
              +"Titulo de:               "+titulacion+"\n"
              +"Condición:               "+masaje;
    }
}
