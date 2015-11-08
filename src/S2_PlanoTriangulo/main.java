package S2_PlanoTriangulo;

import S3_notas.Cuadrado;
import S3_notas.CursoPromedio;
import javax.swing.JOptionPane;

/**
 * @author Sergio Segura Vidal
 */
public class main {

    /**
     * @param args the command line arguments
     */
    
    public static void menu (String datoMostrar)
    {
        JOptionPane.showMessageDialog(null, datoMostrar);
    }
    
    public static int menu (String datoMostrar, String op1, String op2)
    {
        String[] botones = {op1,op2};
        
        return JOptionPane.showOptionDialog(null, datoMostrar, null,
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE
                , null, botones, botones[0]);
    }
    
    public static int menu (String datoMostrar, String op1, String op2, String op3)
    {
        String[] botones = {op1,op2, op3};
        
        return JOptionPane.showOptionDialog(null, datoMostrar, null,
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE
                , null, botones, botones[0]);
    }
    
    public static int menu (String datoMostrar, String op1, String op2, String op3, String op4)
    {
        String[] botones = {op1,op2, op3, op4};
        
        return JOptionPane.showOptionDialog(null, datoMostrar, null,
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE
                , null, botones, botones[0]);
    }
    
    public static int menuInput (String datoMostrar)
    {
       return Integer.parseInt(JOptionPane.showInputDialog(datoMostrar));
    }
    
    public static double menuInputDouble (String datoMostrar)
    {
       return Double.parseDouble(JOptionPane.showInputDialog(datoMostrar));
    }
    
   public static void main(String[] args) 
    {
        int respMenu = 0, respContinuar = 0;
        boolean seguirMenuPrincipal = true;

        while (seguirMenuPrincipal)
        {
           
            respMenu = menu("Selecciones la una opcion", "Triangulo"
                ,"Plano Cartesiano","Cuadrado","Promedios por curso");

           if (respMenu != 0 || respMenu != 1 || respMenu != 2 || respMenu != 3)
           {
               seguirMenuPrincipal = false;
           }

            switch (respMenu)
            {
                //Triangulo
                case 0:
                    int[] lado = new int[3];

                    for (int i = 0;i<3;i++)
                    {
                        lado[(i)] = menuInput("Digite el lado #"+((i+1)));
                    }

                    Triangulo tri1 = new Triangulo(lado[0], lado[1], lado[2]);

                    tri1.ladoMayor();

                    menu(tri1.toString(tri1.equilatero()));

                    respContinuar = menu("Desea volver al menu principal ", "si", "no");
                    if (respContinuar == 1)
                        seguirMenuPrincipal = false;
                break;

                //Plano cartesiano
                case 1:
                    int[] cordenadas = new int[2];

                    for (int i =0;i<2;i++)
                    {
                        String[] cor = {"x","y"};

                        cordenadas [i] = menuInput("Digite la cordenada en "+cor[i]);
                    }

                    PlanoCartesiano pc = new PlanoCartesiano(cordenadas[0],cordenadas[1]);

                   pc.cordenada();
                   pc.cuadrante();
                   pc.calcDistancia();
                   menu(pc.toString());
                   if (menu("¿Desea volver al menu principal?", "si", "no")==1)
                       seguirMenuPrincipal = false;
                break;

                //Cuadrado
                case 2:

                   boolean seguirCuadrado = true; 

                   int ladoCuadrado = 0;

                   while (seguirCuadrado)
                   {    
                       ladoCuadrado = menuInput("Digite el lado");

                       if (ladoCuadrado == 0 || ladoCuadrado < 0)
                       {
                            seguirCuadrado = true;
                            menu("El lado debe de ser positvo"); 
                       }
                       else
                       {
                           seguirCuadrado = false;
                       }
                   }

                    Cuadrado cube = new Cuadrado(ladoCuadrado);
                    cube.areaPerimetro();
                    menu(cube.toString());
                    if (menu("¿Desea volver al menu principal?", "si", "no")==1)
                    {
                        seguirMenuPrincipal = false;
                    }
                break;

                //Promedio Cursos
                case 3:
                    CursoPromedio  cursoP = new CursoPromedio();

                    cursoP.cargarDatos("/src/PracticaSemanaIII");
                    cursoP.promedio();
                    cursoP.notaMaxima();
                    cursoP.notaMinima();
                    cursoP.deviacion();
                    menu(cursoP.toString());

                if (menu("¿Desea volver al menu principal?", "si", "no")==1)
                {
                    seguirMenuPrincipal = false;
                }
                break;
            }
        }
    }   
}
