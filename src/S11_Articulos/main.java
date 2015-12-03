/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S11_Articulos;

import javax.swing.JOptionPane;

/**
 *
 * @author Sergio
 */
public class main 
{

    public static void main(String[] args) 
    {
        boolean seguirMenu = true;

        calcArticulos ca = new calcArticulos();

        String[] x = {"Ejercicio 1", "Ejercicio 2"};

        if (ca.menu(x, "Seleccione una opcion") == 0)
        {

            while (seguirMenu) {

                String[] z = {"Pedir Datos", "Mostar datos", "Precio total", "Promedio", "Maximo", "IVA", "mediana", "Salir"};
                int respSubmenu = ca.menu(z, "Seleccione una opcion", "SubMenu");

                switch (respSubmenu) {
                    case 0:
                        ca.pedirDatos();
                        break;

                    case 1:
                        ca.mostrarDatos();
                        break;

                    case 2:
                        ca.precioTotal();
                        break;

                    case 3:
                        ca.promedioPrecios();
                        break;

                    case 4:
                        ca.maximo();
                        break;

                    case 5:
                        ca.calcIVA();
                        break;

                    case 6:
                        ca.promedioPrecios();
                        break;

                    case 7:
                        seguirMenu = false;
                        break;
                }
            }
        }
    }
}
