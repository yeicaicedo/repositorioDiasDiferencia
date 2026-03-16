/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Controlador;

/**
 *
 * @author isabe
 */
import Modelo.NumeroModelo;
import Vista.Vista;
        

public class DiasDiferencia {

    public static void main(String[] args) {
        NumeroModelo modelo = new NumeroModelo();
        Vista vista = new Vista();
        
        String fecha1 = vista.pedirFecha("primer");
        String fecha2 = vista.pedirFecha("segunda");
        
        modelo.setFecha1(fecha1);
        modelo.setFecha2(fecha2);
        
        String mensaje = modelo.verificarFecha();
        vista.mostrarPosibleError(mensaje);
        
        if (mensaje.equals("Fechas validas")) {
            int diferencia = modelo.calcularDiferencia();
            vista.mostrarResultado(diferencia);
}
    }
}
