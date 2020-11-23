/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema5;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author Usuario iTC
 */
public class Problema5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner entrada= new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int contador= 1;
        String nombre;
        double promedio;
        String cadenaf="";
        while(contador<=4){
            System.out.println("Ingrese el nombre del estudiante:");
            nombre= entrada.nextLine();
            System.out.println("Integrese el promedio:");
            promedio= entrada.nextDouble();
            System.out.println("El nombre es: "+nombre);
            System.out.println("El promedio es: "+promedio);
            if(promedio>=7){
                cadenaf = String.format("%s\t%s\t%.2f\t"+"aprobado\n",cadenaf,
                    nombre, promedio);
            }else{
                cadenaf = String.format("%s\t%s\t%.2f\t"+"reprobado\n",cadenaf,
                    nombre, promedio);
            }
            contador=contador+1;
            entrada.nextLine();
        }
        System.out.printf("%S\n",cadenaf);
    }
    
}
