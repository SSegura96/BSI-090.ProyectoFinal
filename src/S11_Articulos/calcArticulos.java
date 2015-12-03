package S11_Articulos;

import java.util.Iterator;
import java.util.LinkedList;
import javax.swing.JOptionPane;

/**
 * @author Sergio
 */
public class calcArticulos
{
    LinkedList <Double> lista = new LinkedList();
    double precio;
    
    Iterator <Double> it =  lista.iterator();
    
    String mensaje;
    
    double totalSuma = 0.0;
    
    double promedio = 0.0;
    
    double maximo = 0.0;
    
    double iva = 0.0;
            
    double impuesto = 0.0; 
    
    public int menu (String[] botones, String mensaje)
    {
         return JOptionPane.showOptionDialog(null,
                "mensaje", null, JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, botones, botones[0]);
    }
    
    public int menu (String[] botones, String mensaje, String titulo)
    {
          String valor = JOptionPane.showInputDialog(null,
                "mensaje", titulo, JOptionPane.DEFAULT_OPTION, null, botones, botones[0]).toString();
          
          for (int i = 0 ; i<botones.length ; i++)
          {
              if (valor == botones[i])
              {
                  int indice = i;
                  i = botones.length;
                  return indice;
              }
          }
          
          return  0;
    }
    
    public void pedirDatos ()
    {
        boolean seguirValidar = true;
        boolean seguirNVeces = true;
        String mensaje = "Usted digito un valor invalido";
        int i = 1;
        
        while (seguirValidar)
        {
            try 
            {
                while (seguirNVeces)
                {
                    precio = Double.parseDouble(JOptionPane.showInputDialog("Digite el precio unitario N"+i+""));
                
                    if (precio <= 0)
                    {
                        mensaje = "Usted digito un precio  \n menor o igual a cero";
                        throw new NumberFormatException();
                    }
                    
                    seguirValidar = false;
                    
                    lista.add(precio);
                    
                    i++;
                    
                    if (JOptionPane.showOptionDialog(null, "Desea agregar otro precio?", null
                            , JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE
                            , null, null, null) == 0)
                    {
                        seguirNVeces = true;
                    }
                    else
                    {
                        seguirNVeces = false;
                    }
                }
            }
            catch (NumberFormatException e)
            {
                JOptionPane.showMessageDialog(null, mensaje);
                seguirValidar = true;
            }
        }
    }
    
    public void precioTotal ()
    {
        for (int i = 0; i<lista.size();i++)
        {
            totalSuma += lista.get(i);
        }
        
        JOptionPane.showMessageDialog(null, "El resultado de la suma \n de los precios es: "+totalSuma);
    }
    
    public void promedioPrecios ()
    {
       precioTotal();
       promedio = totalSuma/lista.size();
       
       JOptionPane.showMessageDialog(null, "El promedio de los "+lista.size()+" numeros es "+promedio);
    }
    
    public void maximo ()
    {
        for (int i = 0;i<lista.size();i++)
        {
            if (lista.get(i) > maximo)
            {
                maximo = lista.get(i);
            }
        }
        
        JOptionPane.showMessageDialog(null, "El valor maximo es: "+maximo);
    }
    
    public void mostrarDatos ()
    {
        
        String listo = "|";
        
        for (int i = 0;i<lista.size();i++)
        {
            listo += lista.get(i) + "|";
        }
        
        JOptionPane.showMessageDialog(null, listo);
    }
    
    public void calcIVA ()
    {
        precioTotal();
        iva = totalSuma * 0.13;
        impuesto = totalSuma +iva;
        
        JOptionPane.showMessageDialog(null, "El precio neto es: "+totalSuma+"\n"
                                          + "El impuesto es:  "+iva+"\n"
                                          + "El monto total a pagar es: "+impuesto);
    }
    
    public void ordenarNumeros ()
    {
        double max = 0;
        
        for (int i = 0;i<lista.size();i++)
        {
            if (lista.get(i)>max)
            {
                max = lista.get(i);
            }
        }
    }
    
    public void calcMediana ()
    {
        
    }
}
