/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S10_LinkedList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author sergio
 */
public class main {

    public static void main(String args[]) {
        Scanner leer = new Scanner(System.in);
        int num;
        int op;

        LinkedList lista = new LinkedList();
        do {
            
            System.out.println("\t Menú \t");
            System.out.println("Operaciones con listas");
            System.out.println("1.- Insertar un numero al azar");
            System.out.println("2.- mostar los datos");
            System.out.println("3.- Borrar el ultimo");
            System.out.println("4.- Salir");
            System.out.println("\n");
            System.out.println("Elija la operación que desee");

            op = leer.nextInt();

            switch (op) 
            {
                case 1:
                    System.out.println("");
                    num = (int)(Math.floor(Math.random()*(0-100)-100));
                    lista.addFirst(num);
                break;
                
                case 2:
                    System.out.println("Se van a mostar los datos");
                    num = leer.nextInt();
                    lista.addLast(num);
                break;
                
                case 3:
                    System.out.println("Se borrara el ultimo elemento");
                    lista.removeFirst();
                break;
                
                case 4:
                    System.out.println("Fin");
                break;
            }
            
        }while (op != 3);
    }
}
