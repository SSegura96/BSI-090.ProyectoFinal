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
public interface ICostos 
{
    final double SALARIOXHORAFUT = 5000.0;
    final double SALARIOXHORAENT = 10000.0;
    final double SALARIOXHORAMAS = 8000.0;
    
    public void entrenamiento (String x);
    public void partidoFutbol (String x);
    public void calcularSalario (char tipo, int horas);
    @Override
    public String toString ();
}
