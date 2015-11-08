/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S3_notas;

import S2_PlanoTriangulo.main;
import java.io.File;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author sergio
 */
public class CursoPromedio 
{
    String[] materias = new String[4];
    double[] vecPromedios = new double[4];
    double[] vecDesviacion = new double[4];
    double[][] matrisNotas = new double[2][4];
    double notaMasAlta=0;
    double notaMasBaja=0;    
    
    public void cargarDatos (String ubucacion)
    {
       File file = new File(ubucacion);
       
       main.menu("Es necesario que se introduzcan "
               + "\n los nombres de las materias");
       
        for (int i = 0;i<materias.length;i++)
        {
            materias[i]=JOptionPane.showInputDialog("Digite la materia #"+(i+1));
        }
       
        if (main.menu("Seleccione una opcion","Introducir notas","cargar notas")== 0)
        {
            for (int columna = 0;columna<matrisNotas.length;columna++)
            {
               JOptionPane.showMessageDialog(null, "bimestre #"+(columna+1));
               for (int fila = 0;fila<matrisNotas[columna].length;fila++)
               {
                   matrisNotas[columna][fila] = main.menuInputDouble("Digite la nota"
                           + " obtenida en: "+materias[fila]);
               }
            }
        } 
        else
        {
            try 
            {
                Scanner in = new Scanner(file);


            }
            catch (Exception e )
            {

            }
        }
    }
    
    public void promedio ()
    {
         
        int fila = 0;
        
        while (fila<4)
        {
            double sumaNotas = 0.0; 
            for (int columna = 0;columna<matrisNotas.length;columna++)
            {
               sumaNotas+=matrisNotas[columna][fila];
            }
            vecPromedios[fila] = sumaNotas/2;
            fila++;
        }
    }
       
    public void notaMaxima ()
    {
        notaMasAlta = matrisNotas[0][0];
        
       for (int fila = 0;fila<matrisNotas.length;fila++)
       {
            for (int columna = 0;columna<matrisNotas[fila].length;columna++)
            {
                if (matrisNotas[fila][columna]>notaMasAlta)
                {
                    notaMasAlta = matrisNotas[fila][columna];
                }
            }   
       }
    }
    
    public void notaMinima ()
    {
        notaMasBaja = matrisNotas[0][0];
        
       for (int fila = 0;fila<matrisNotas.length;fila++)
       {
            for (int columna = 0;columna<matrisNotas[fila].length;columna++)
            {
                if (matrisNotas[fila][columna]<notaMasBaja)
                {
                    notaMasBaja = matrisNotas[fila][columna];
                }
            }   
       }
    }
    
    public void deviacion ()
    {
        int fila = 0;
        while (fila<4)
        {
            double temp = 0;
            for (int columna = 0 ; columna < 2; columna++)
            {
                temp+= Math.pow((matrisNotas[columna][fila]-vecPromedios[fila]),2); 
            }
            vecDesviacion[fila]=(Math.sqrt(temp/5));
            fila++;
        }
        
        
    }
    
    @Override 
    public String toString ()
    {
        return "El promedios de notas por año lectivo es:\n"
            +" - "+materias[0]+" "+vecPromedios[0]+"\n"
            +" - "+materias[1]+" "+vecPromedios[1]+"\n"
            +" - "+materias[2]+" "+vecPromedios[2]+"\n"
            +" - "+materias[3]+" "+vecPromedios[3]+"\n"
            +"La nota mayor es: "+notaMasAlta+"\n"
            +"La nota menor es: "+notaMasBaja+"\n"
            +"Las desviaciones estandar son:\n"
            +" - "+materias[0]+" "+vecDesviacion[0]+"\n"
            +" - "+materias[1]+" "+vecDesviacion[1]+"\n"
            +" - "+materias[2]+" "+vecDesviacion[2]+"\n"
            +" - "+materias[3]+" "+vecDesviacion[3]+"\n"
                ;              
    }
}
