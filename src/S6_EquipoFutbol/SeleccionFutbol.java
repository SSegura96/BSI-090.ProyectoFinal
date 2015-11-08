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
abstract class SeleccionFutbol implements ICostos
{
    protected String puesto;
    protected String nombre;
    protected String apellido;
    protected int edad;
    protected double salario;
    protected String entrenamiento;
    protected String partido;
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void calcularSalario (char tipo, int horas)
    {
        switch (tipo)
        {
            case 'F':
                salario = SALARIOXHORAFUT*horas;
            break;
            
            case 'E':
                salario = SALARIOXHORAENT*horas;
            break;
            
            case 'M':
                salario = SALARIOXHORAMAS*horas;
            break;
        }
    }
    
    public void entrenamiento (String mensaje)
    {
        entrenamiento = mensaje;
    }
    
    public void partidoFutbol (String mensaje)
    {
        partido = mensaje;
    }
    
    @Override
    public String toString ()
    {
        return "Puesto:   "+puesto+"\n"
              +"Nombre:   "+nombre+"\n"
              +"Apellido: "+apellido+"\n"
              +"Edad:     "+edad+"\n"
              +"Su forma de entrenar es: "+entrenamiento+"\n"
              +"En el partido el:        "+partido+"\n"
              +"Salario:                 "+salario;
    }
}
