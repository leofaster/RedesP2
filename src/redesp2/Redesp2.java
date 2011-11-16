/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package redesp2;

import corejava.*;

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
       if ( args[i].equals ("-p")| args[i].equals("-P")) {
           puerto = Integer.parseInt(args[i+1]) ;
       }
       if (args[i].equals("-n") | args[i].equals("-N")){
           nodo = args[i+1];
       }
       if (args[i].equals("-b") | args[i].equals("-B")){
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
    
    String letra = Console.readString("Seleccion :");

    if (letra.equals("C") | letra.equals("c")) {
     System.out.println("Entro en C");  
     
     
    }else if (letra.equals("d")| letra.equals("D")){
     System.out.println("Entro en d");   
    }else if (letra.equals("A")| letra.equals("a")){
        System.out.println("Entro en a");
    }else if (letra.equals("Q")| letra.equals("q")){
        System.out.println("Entro en q");
        salida =true;
    }
    }
    
    
    }
}
