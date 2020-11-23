/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema3;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author Usuario iTC
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Scanner entrada= new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int contador = 1;
        String nombre;
        int Dia;
        double Dias;
        double total;
        String cadena="";
        while(contador <= 5){
        System.out.println("Ingrese el mombre del empleado");
        nombre = entrada.nextLine();
        System.out.println("Ingrese el número de días trabajados");
        Dia = entrada.nextInt();
        System.out.println("Ingrese el costo del día trabajado");
        Dias = entrada.nextDouble();
        entrada.nextLine();
        
        total = Dia * Dias; 
            cadena = String.format("%s\t%s\t%d\t$%.2f\t$%.2f\n", cadena,
                    nombre, Dia, Dias, total);
        
        contador = contador + 1;
    }
        System.out.printf("%S\n",cadena);
    }
    
}
