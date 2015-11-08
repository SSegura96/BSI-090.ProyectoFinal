/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S6_EquipoFutbol;

/**
 *
 * @author sergio
 */
public class Futbolista extends SeleccionFutbol
{
    
    int dorsal;
    String demarcacion;
    String entrevista;
    
    public Futbolista ()
    {
        super.puesto = "Futbolista";
        super.nombre = " ";
        super.apellido = " ";
        super.edad = 0;
        super.salario = 0.0;
        this.dorsal = 0;
        this.demarcacion = " ";
        this.entrevista = "";
    }
    
    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }
    
    public void entrevista (String mensaje)
    {
        entrevista = mensaje;
    }
    
    public String toString ()
    {
        return super.toString()+"\n" 
              +"Su dorsal:               "+dorsal+"\n"
              +"Su demarcacion:          "+demarcacion+"\n"
              +"entrevista:              "+entrevista;
    }
    
}
