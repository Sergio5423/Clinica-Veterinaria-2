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
public class Ave extends Veterinaria{
    private double precLimpiezaJaula;

    public Ave() {
    }

    public Ave(LocalDate fecha, long cedulaCliente, String nombreCliente, String metodoPago, double peso, String raza, String alimentacion, String razonConsulta, double precConsulta, double precVentasAd, double precLimpiezaJaula) {
        super(fecha, cedulaCliente, nombreCliente, metodoPago, peso, raza, alimentacion, razonConsulta, precConsulta, precVentasAd);
        this.precLimpiezaJaula = precLimpiezaJaula;
    }

    public double getPrecLimpiezaJaula() {
        return precLimpiezaJaula;
    }

    public void setPrecLimpiezaJaula(double precLimpiezaJaula) {
        this.precLimpiezaJaula = precLimpiezaJaula;
    }
    
    @Override
    public double calcularTotal() {
        double total = this.precConsulta+this.precVentasAd+this.precLimpiezaJaula;
        return total;
    }    
    
    @Override
    public String toString() {
        return super.toString()+"Precio por limpieza de jaula: "+precLimpiezaJaula+" - "+"Costo Total: ";
    }

}
