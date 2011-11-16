/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package redesp2;

import java.io.Console;

/**
 *
 * @author leofaster
 */
public class Redesp2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     boolean salida = false;
    
    //int i = 0;
        int puerto;
        String directorio;
        String nodo;
    for (int i=0 ; i < args.length; i++){
       if ( args[i].equals ("-p")) {
           puerto = Integer.parseInt(args[i+1]) ;
       }
       if (args[i].equals("-n")){
           nodo = args[i+1];
       }
       if (args[i].equals("-b")){
           directorio = args[i+1];
       }
    }
    
    while (!salida){
    System.out.println(" --   Menu del programa   --- ");
    
    System.out.println(" - Preciona C ");
    System.out.println("    - Para realizar una consulta ");
    System.out.println(" - Preciona D ");
    System.out.println("    - Para descargar una cancion ");
    System.out.println(" - Preciona A ");
    System.out.println("    - Para imprimir los nodos alcanzables ");
    System.out.println(" - Preciona Q ");
    System.out.println("    - Para salir del programa ");
    
    BufferedReader reader;
    reader = new BufferedReader(new InputStreamReader(System.in));
    name = reader.readLine();

    }
    
    
    }
}
