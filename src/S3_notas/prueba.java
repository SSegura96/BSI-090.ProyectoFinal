package S3_notas;

/**
 *
 * @author Sergio Segura Vidal
 */
public class prueba 
{ 
    public static void imprimir ()
    {
        int[][] m = {{1,2,3},{4,5,6},{7,8,9}};
        
        for (int i = 0;i<m.length;i++)
        {
            for (int j = 0;j<m[i].length;j++)
            {
                System.out.println(m[i][j]+"\n");
            }
        }
    }
    
    public static void main (String[] args)
    {
        imprimir();
    }
}
