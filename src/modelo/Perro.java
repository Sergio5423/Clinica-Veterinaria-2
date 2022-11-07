/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.time.LocalDate;

/**
 *
 * @author SERGIO TARRIFA
 */
public class Perro extends Veterinaria{
    private double precCorte;
    private double precVacunas;

    public Perro() {
    }

    public Perro(LocalDate fecha, long cedulaCliente, String nombreCliente, String metodoPago, double peso, String raza, String alimentacion, String razonConsulta, double precConsulta, double precVentasAd, double precCorte, double precVacunas) {
        super(fecha, cedulaCliente, nombreCliente, metodoPago, peso, raza, alimentacion, razonConsulta, precConsulta, precVentasAd);
        this.precCorte = precCorte;
        this.precVacunas = precVacunas;
    }

    public double getPrecCorte() {
        return precCorte;
    }

    public void setPrecCorte(double precCorte) {
        this.precCorte = precCorte;
    }

    public double getPrecVacunas() {
        return precVacunas;
    }

    public void setPrecVacunas(double precVacunas) {
        this.precVacunas = precVacunas;
    }

    @Override
    public double calcularTotal() {    
        double total = this.precConsulta+this.precVentasAd+this.precCorte+this.precVacunas;
        return total;
    }  
    
    @Override
    public String toString() {
        return super.toString()+"Precio por Corte: "+precCorte+" - "+"Precio Vacunas: "+precVacunas+" - "+"Costo Total: ";
    }
    
}
