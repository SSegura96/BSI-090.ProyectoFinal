package S10_LinkedList;

import java.util.LinkedList;
import javax.swing.JOptionPane;

/**
 * @author sergio
 */

public class NumerosAzar
{
    LinkedList LLista = new LinkedList();
    
    public void llenarLinkedList()
    {
        System.out.println( "\t Menú \t" );
            System.out.println( "Operaciones con listas" );
            System.out.println( "1.- Insertar al principio" );
            System.out.println( "2.- Insertar al final" );
            System.out.println( "3.- Borrar al principio" );
            System.out.println( "4.- Borrar al final" );
            System.out.println( "5.- Mostrar la lista" );
            System.out.println( "6.- Borrar toda la lista" );
            System.out.println( "7.- Salir" );
            System.out.println( "\n" );
            System.out.println( "Elija la operación que desee" );
    }
}