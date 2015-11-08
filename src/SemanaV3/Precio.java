/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SemanaV3;

/**
 *
 * @author sergio
 */
public class Precio 
{
    String emisor;
    String cliente;
    
    @Override
    public String toString ()
    {
        return "El emisor es: "+emisor+"\n"
                +"El cliente es: "+cliente;
    }
}
