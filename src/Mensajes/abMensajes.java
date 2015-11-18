/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mensajes;

/**
 *
 * @author Sergio
 */
public abstract class abMensajes
{
    String tipoMenaje;
    String mensaje;
    int numDestinatario;
    int numRemitente;

    public abMensajes() {
        this.tipoMenaje = "";
        this.mensaje = "";
        this.numDestinatario = 0;
        this.numRemitente = 0;
    }

    public String getTipoMenaje() {
        return tipoMenaje;
    }

    public void setTipoMenaje(String tipoMenaje) {
        this.tipoMenaje = tipoMenaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public int getNumDestinatario() {
        return numDestinatario;
    }

    public void setNumDestinatario(int numDestinatario) {
        this.numDestinatario = numDestinatario;
    }

    public int getNumRemitente() {
        return numRemitente;
    }

    public void setNumRemitente(int numRemitente) {
        this.numRemitente = numRemitente;
    }
    
    public void ObtenerNumeros ()
    {
        
    }
}
