/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema1;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author Usuario iTC
 */
public class Problema1 {
          
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner entrada= new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String usuario;
        String empresa;
        double netflix= 10;
        double disney= 6;
        double apple= 5;
        double amazon= 4.50;
        double total;
        double impuesto;
        boolean bandera=true;
        while(bandera){
        System.out.println("Ingrese nombre del usuario\n");
        usuario= entrada.nextLine();
        System.out.println("Ingrese el nombre de la empresa\nNetlix\nDisney\n"
                + "Apple\nAmazon");
        empresa= entrada.nextLine();
        switch(empresa){
            case "Netflix":
                impuesto= (netflix*10)/100;
                total= netflix+impuesto;
                System.out.printf("El usuario es: %s\n"+"El nombre de la"
                        + "empresa es: %s\n"+"El precio base es: %.2f\n"
                        +"El impuesto a pagar es: %.2f\n"+"El total a pagar"
                        + " es: %.2f\n",usuario,empresa,netflix,impuesto,total);
                break;
            case "Disney":
                impuesto = (disney*12)/100;
                total= disney+impuesto;
                System.out.printf("El usuario es: %s\n"+"El nombre de la"
                        + "empresa es: %s\n"+"El precio base es: %.2f\n"
                        +"El impuesto a pagar es: %.2f\n"+"El total a pagar"
                        + " es: %.2f\n",usuario,empresa,disney,impuesto,total);
                break;
            case "Apple":
                impuesto= (apple*14)/100;
                total= apple+impuesto;
                System.out.printf("El usuario es: %s\n"+"El nombre de la"
                        + "empresa es: %s\n"+"El precio base es: %.2f\n"
                        +"El impuesto a pagar es: %.2f\n"+"El total a pagar"
                        + "es: %.2f\n",usuario,empresa,apple,impuesto,total);
                break;
            case "Amazon":
                impuesto = (amazon*16)/100;
                total= amazon+impuesto;
                System.out.printf("El usuario es: %s\n"+"El nombre de la"
                        + "empresa es: %s\n"+"El precio base es: %.2f\n"
                        +"El impuesto a pagar es: %.2f\n"+"El total a pagar"
                        + " es: %.2f\n",usuario,empresa,amazon,impuesto,total);
                break;
                    
                
                
        }
        System.out.println("Ingresar el valor -1 para salir de la secuencia");
            int temporal = entrada.nextInt();
            if (temporal == -1) {
                bandera = false;
        
    }
            entrada.nextLine();
    }
        
    }
    
}
