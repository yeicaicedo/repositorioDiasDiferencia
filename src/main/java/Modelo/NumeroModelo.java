/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author isabe
 */
public class NumeroModelo {
    //atributos

    private String fecha1;
    private String fecha2;

    public NumeroModelo() {
    }

    public NumeroModelo(String fecha1, String fecha2) {
        this.fecha1 = fecha1;
        this.fecha2 = fecha2;
    }

    public String getFecha1() {
        return fecha1;
    }

    public void setFecha1(String fecha1) {
        this.fecha1 = fecha1;
    }

    public String getFecha2() {
        return fecha2;
    }

    public void setFecha2(String fecha2) {
        this.fecha2 = fecha2;
    }

    private int[] convertirFecha(String fecha) {
    String[] partes = fecha.split("/");
    int dia = Integer.parseInt(partes[0]);
    int mes = Integer.parseInt(partes[1]);
    int anio = Integer.parseInt(partes[2]);

    return new int[]{dia, mes, anio};
    }
    
    public String verificarFecha() {
        int[] f1 = convertirFecha(this.fecha1);
        int[] f2 = convertirFecha(this.fecha2);

        int dia1 = f1[0];
        int mes1 = f1[1];
        int anio1 = f1[2];

        int dia2 = f2[0];
        int mes2 = f2[1];
        int anio2 = f2[2];

        if (dia1 <= 0 || dia2 <= 0 || dia1 > 30 || dia2 > 30) {
            return ("Fecha invalida");
        }
        if (mes1 <= 0 || mes2 <= 0 || mes1 > 12 || mes2 > 12) {
            return ("Fecha invalida");
        }
        if (anio1 < 0 || anio2 < 0) {
            return ("Fecha invalida");
        }

        return "Fechas validas";
    }

    public int calcularDiferencia() {
        int[] f1 = convertirFecha(this.fecha1);
        int[] f2 = convertirFecha(this.fecha2);
        
        int ranios = f2[2] - f1[2];
        int rmes = f2[1] - f1[1];
        int rdia = f2[0] - f1[0];

        int diferencia = Math.abs((ranios * 360) + (rmes * 30) + rdia);

        return diferencia;
    }

}
