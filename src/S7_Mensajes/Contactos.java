package S7_Mensajes;

/**
 *
 * @author Sergio Segura Vidal
 */
public class Contactos 
{
    private String nombre;
    private String numTel;
    private String fechaCumpleannos;

    public Contactos(String nombre, String numTel, String fechaCumpleannos) {
        this.nombre = nombre;
        this.numTel = numTel;
        this.fechaCumpleannos = fechaCumpleannos;
    }

    public String getNombre() 
    {
        return nombre;
    }

    public String getNumTel() 
    {
        return numTel;
    }

    public String getFechaCumpleannos() 
    {
        return fechaCumpleannos;
    }
}
