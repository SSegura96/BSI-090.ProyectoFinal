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
public class Entrenador extends SeleccionFutbol 
{
    
    String cod;
    String planificarEntrena;
    
    public Entrenador()
    {
        super.puesto = "Entrenador";
        super.nombre = " ";
        super.apellido = " ";
        super.edad = 0;
        super.salario = 0.0;
        this.cod = " ";
        this.planificarEntrena = "";
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }
    
    public void planificarEntrenamiento (String mensaje)
    {
       planificarEntrena = mensaje;
    }
    
    public String toString ()
    {
        return super.toString()+"\n"
              +"ID:       "+cod+"\n"
              +"Su forma de entrenar es: "+entrenamiento+"\n"
              +"El planifica que:        "+planificarEntrena;
    }
}
