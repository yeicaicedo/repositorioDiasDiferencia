/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

/**
 *
 * @author isabe
 */
import java.util.Scanner;

public class Vista {
    private Scanner scanner;
    
    public Vista() {
        scanner = new Scanner(System.in);
    }
    //Metodo para pedir las fechas
    public String pedirFecha (String fe){
        System.out.println("Ingresa la " + fe + " fecha (dd/mm/aaaa):");
        return scanner.nextLine();
    }
    
    //Metodo para mostrar el resultado
    public void mostrarPosibleError (String mensaje){
        System.out.println("................................");
        System.out.println(mensaje);
        System.out.println("................................");
    }
     public void mostrarResultado (int diferencia){
        System.out.println("Los dias de difencia son: " + diferencia);
        System.out.println("................................");
        System.out.println("  ");
    }
}
