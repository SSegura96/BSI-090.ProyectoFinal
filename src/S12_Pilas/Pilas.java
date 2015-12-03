/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S12_Pilas;

import java.util.Stack;
import javax.swing.JOptionPane;

/**
 * @author Sergio
 */


public class Pilas 
{
    String nombre = "";
    
    Stack <Character> letras = new Stack <Character> ();
    
    Stack <Double> potencias = new Stack <Double> ();
    
    public void menu ()
    {
        boolean seguir = true;
        
        while (seguir)
        {
            String[] botones = {"Voltear un nombre","Calcular las 10 bases","Palindromo","Salir"};
        
        
            int resp = JOptionPane.showOptionDialog(null, "Seleccione una opcion", null,
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
                    null, botones, botones[0]);

            if (resp == 0)
            {
                voltearNombre();
            }
            else
            {
                if (resp == 1)
                {
                    potenciasCubicas();
                }
                else
                {
                    if (resp == 2)
                    {
                        palindromo();
                    }
                    else
                    {
                        seguir = false;
                    }
                }
            }
        }
    }
    
    public void voltearNombre ()
    {
        String listo = "";
        
        nombre = JOptionPane.showInputDialog("Digite el nombre al cual desea voltear");
        
        for (int i = 0;i<nombre.length();i++)
        {
            letras.push(nombre.charAt(i));
        }
        
        while (!letras.empty())
        {
            listo += letras.pop();
        }
        
        JOptionPane.showMessageDialog(null, listo);
    }
    
    public void potenciasCubicas ()
    {
        for (int i = 1; i<=10;i++)
        {
            potencias.push(Math.pow(i,3));
        }
        
        String dato = "";
        
        for (int i = 0; i<10 ; i++)
        {
            dato += (10-i)+"^3 = "+potencias.pop()+"\n";
        }
        
        JOptionPane.showMessageDialog(null, dato);
    }
    
    public void palindromo ()
    {
        String palabra = JOptionPane.showInputDialog("Digite la palabra");
        
        for (int i = 0;i<palabra.length();i++)
        {
            letras.push(palabra.charAt(i));
        }
        
        String alReves = "";
        
        while (!letras.empty())
        {
            alReves += letras.pop()+"";
        }
        
        String mensaje = "";
        
        if (palabra.equalsIgnoreCase(alReves))
        {
            mensaje = "Si es palindromo";
        }
        else
        {
            mensaje = "No es palindromo";
        }
        
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
