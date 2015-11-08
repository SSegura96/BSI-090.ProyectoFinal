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
public class main 
{
    public static void main (String[] args)
    {
        //futbolista
        Futbolista fut = new Futbolista();
        fut.setNombre("Lionel");
        fut.setApellido("Mesi");
        fut.setDorsal(10);
        fut.setDemarcacion("Delantero");
        fut.setEdad(28);
        fut.entrevista("En el partido se diero muchas oportunidades");
        fut.entrenamiento("Horas de entrenamiento: 2");
        fut.partidoFutbol("No hizo goles no asistencias");
        fut.calcularSalario('F', 8);
        
        JOptionPane.showMessageDialog(null, fut.toString());
        
        //Entrenador
        Entrenador ent = new Entrenador();
        ent.setNombre("Pepe");
        ent.setApellido("Guardiola");
        ent.setEdad(44);
        ent.setCod("Sd18s");
        ent.entrenamiento("Planifico jugadas");
        ent.partidoFutbol("Realizo dos cambios");
        ent.planificarEntrenamiento("Formacion Alfa Delta");
        ent.calcularSalario('E', 9);
        
        JOptionPane.showMessageDialog(null, ent.toString());
        
        //Masajista
        Masajista mas = new Masajista();
        mas.setNombre("Ivan");
        mas.setApellido("Montes");
        mas.setEdad(46);
        mas.setAnnosExperiencia(4);
        mas.setTitulacion("Institulo Morelence de cinencias medicas");
        ent.entrenamiento("Busco posibles soluciones a las leciones mas comunes");
        ent.partidoFutbol("Trato una lecion");
        mas.calcularSalario('M', 4);
        mas.darMasaje();
        
        JOptionPane.showMessageDialog(null, mas.toString());
        
    }
    
}
