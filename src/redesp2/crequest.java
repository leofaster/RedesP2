package redesp2;
import java.io.Serializable;


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jrosas
 */
public class crequest implements Serializable{

    public int cod;
    public int accion;
    public String data;

    public crequest() {
    }
    /*
     * COD
     * cod TIMESPANT
     * ACCCION
     * 0 buscar por artista 
     * 1 buscar por nombre
     * 2 descarga
     * 3 todos los alcanzables
     */
    public crequest (int cod, int accion, String data) {
        this.cod = cod;
        this.accion = accion;
        this.data = data;
    }
        
}
