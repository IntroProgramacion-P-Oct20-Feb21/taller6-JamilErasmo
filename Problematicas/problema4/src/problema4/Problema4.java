/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema4;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author Usuario iTC
 */
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner entrada= new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int contador= 1;
        String nombre;
        int cpuntos;
        int cfaltas;
        String cadenaf="";
        while(contador<=10){
            System.out.println("Ingrese el nombre del jugador:");
            nombre= entrada.nextLine();
            System.out.println("Ingrese la cantidad de puntos anotados");
            cpuntos= entrada.nextInt();
            System.out.println("Ingrese la cantidad de faltas");
            cfaltas= entrada.nextInt();
            contador= contador+1;
            cadenaf = String.format("%s\t%s\t%d\t%d\n", cadenaf,
                    nombre, cpuntos, cfaltas);
            entrada.nextLine();
            
            
        }
        System.out.printf("%S\n",cadenaf);
     
    }
    
}
