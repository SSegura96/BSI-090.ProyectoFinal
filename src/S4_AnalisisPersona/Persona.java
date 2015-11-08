
package S4_AnalisisPersona;


public class Persona 
{
    private int DNI = 0;
    private String nombre = "";
    private int edad = 0;
    private char sexo = ' ';
    private double peso = 0.0;
    private double altura = 0.0;
    
    public Persona ()
    {
        
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        
        if (sexo == 'M' || sexo == 'H' || sexo == 'm' || sexo == 'h')
        {
            this.sexo = sexo;
        }
        else
        {
            this.sexo = 'H';
        }
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
}
