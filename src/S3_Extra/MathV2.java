/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S3_Extra;

import java.lang.Math;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author sergio
 */
public class MathV2
{
   
   ArrayList <Integer> listaNumeros = new ArrayList(); 
   
   String mensaje = "";
   
   int max = 0;
   int min = 0;
   int sum = 0;
   int medArit = 0;
   int medGeo = 0;
   
   public void desplegarMenu()
   {
       JOptionPane.showMessageDialog(null, "Bienvenido al sistema de numeros");
       
       
       boolean seguirMenu = true;
       
       int num = 0;
       
       while (seguirMenu)
       {
            try
            {
                listaNumeros.add(num = Integer.parseInt(JOptionPane.showInputDialog("para comenzar debe ingresar un numero")));
              System.out.print(num +"-");

                int respMenuContinuar = JOptionPane.showOptionDialog(null, "¿Desea agregar otro numero?",
                        null, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                        null, null, null);
                
                if (respMenuContinuar == 1)
                {
                    seguirMenu = false;
                }
            
            }
            catch (NumberFormatException caca)
            {
                seguirMenu = false;
            }
       }
   }
   
   public void opMax ()
   {
       for (int i = 0; i<listaNumeros.size();i++)
       {
           
          if (listaNumeros.get(i) > max)
               max = listaNumeros.get(i);
       }
       
       mensaje = "el numero maximo es: "+max;
   }
   
   public void opMin ()
   {
       for (int i = 0; i<listaNumeros.size();i++)
       {
          if (listaNumeros.get(i) < min)
               min = listaNumeros.get(i);  
       }
   }
   
   public void opSum ()
   {
       for (int i = 0; i<listaNumeros.size();i++)
       {
           
       }
   }
   
   public void opMedArit ()
   {
       for (int i = 0; i<listaNumeros.size();i++)
       {
           
       }
   }
   
   public void opMedGeo ()
   {
       for (int i = 0; i<listaNumeros.size();i++)
       {
           
       }
   }
   
   public void desplegarMenuAcciones ()
   {
       String[] botones = {"Maximo","Minimo","sumatorio", "media aritmética", "media geométrica"};
       
       int respMenu = JOptionPane.showOptionDialog(null, "Seleccione una operacio", null,
               JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
               null, botones, botones[0]);
       
       switch (respMenu)
       {
            //Maximo
            case 0:
                opMax();
            break;
           
            //Minimo
            case 1:
               opMin();
            break;
           
            //Sumatoria
            case 2:
               opSum();
            break;
           
            //operacion Aritmetica
            case 3:
                opMedArit();
            break;
           
            //operacion Geometrica
            case 4:
                opMedGeo();
            break;
       }
       
       JOptionPane.showMessageDialog(null, mensaje);
   }
}
