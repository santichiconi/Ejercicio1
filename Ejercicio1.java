/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;
 import java.util.Scanner;
/**
 *
 * @author chuPac
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese 1er num");
        int num1 = leer.nextInt();
        System.out.println("Ingrese 2do num");
        int num2 = leer.nextInt();
        int suma = num1 + num2;
        System.out.println(suma);
    }
    
}
