/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package redesp2;

import corejava.Console;
import java.util.StringTokenizer;
import nanoxml.XMLElement;
import java.io.*;

/**
 *
 * @author leofaster
 */
public class Redesp2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  throws Exception {
        boolean salida = false;

        //int i = 0;
        int puerto;
        String directorio;
        String nodo;
        for (int i = 0; i < args.length; i++) {
            if (args[i].equals("-p") | args[i].equals("-P")) {
                puerto = Integer.parseInt(args[i + 1]);
            }
            if (args[i].equals("-n") | args[i].equals("-N")) {
                nodo = args[i + 1];
            }
            if (args[i].equals("-b") | args[i].equals("-B")) {
                directorio = args[i + 1];
            }
        }
        String letra = "";
        String comp;
        String comp2 = null;

        StringTokenizer st;
        StringTokenizer st2;

        String busqueda = null;
        String busqueda1 = null;
        String aux = "";
        while (!salida) {
            System.out.println(" --   Menu del programa   --- ");

            System.out.println(" - Preciona C ");
            System.out.println("    - Para realizar una consulta ");
            System.out.println(" - Preciona D ");
            System.out.println("    - Para descargar una cancion ");
            System.out.println(" - Preciona A ");
            System.out.println("    - Para imprimir los nodos alcanzables ");
            System.out.println(" - Preciona Q ");
            System.out.println("    - Para salir del programa ");
            letra = Console.readString("Seleccion :");
            st = new StringTokenizer(letra);

            // salir = false;
            //  while (st.hasMoreTokens() & !salir) {
            comp = st.nextToken();

            comp = comp.trim();
            //System.out.println("Esto es " + comp);
            if (comp.equals("C") | comp.equals("c")) {
                System.out.println("Entro en C");
                comp2 = st.nextToken();
                while (st.hasMoreTokens()) {
                    comp2 = comp2 + " " + st.nextToken();
                }
                //comp = st.nextToken();
                System.out.println(comp2);
                st2 = new StringTokenizer(comp2);
                comp = st2.nextToken();
                if (comp.equals("-a") | comp.equals("-A")) {
                    busqueda = st2.nextToken();
                
                while (st2.hasMoreTokens()) {
                    busqueda = busqueda + " " +st2.nextToken();
                    
                }
                System.out.println("buscaremos el autor " + busqueda);
                }
                if (comp.equals("-t") | comp.equals("-T")) {
                    busqueda1 = st2.nextToken();
                    while (st2.hasMoreTokens()) {
                        busqueda1 = busqueda1 + " " + st2.nextToken();
                       
                    }
                    System.out.println("buscaremos el titulo " + busqueda1);
                }
                //comp = st.nextToken();


            }
            //}
            if (comp.equals("d") | comp.equals("D")) {
                System.out.println("Entro en d");

            }
            if (comp.equals("A") | comp.equals("a")) {
                System.out.println("Entro en a");
            XMLElement xml = new XMLElement();
            FileReader reader = new FileReader("test.xml");
	    xml.parseFromReader(reader);
            System.out.println(xml);
            }
            if (comp.equals("Q") | comp.equals("q")) {
                System.out.println("Entro en q");

                salida = true;
                //  }   


            }








        }


    }
}
