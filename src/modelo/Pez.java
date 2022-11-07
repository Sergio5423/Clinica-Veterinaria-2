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
public class Pez extends Veterinaria{
    private double precLimpiezaPecera;

    public Pez() {
    }

    public Pez(LocalDate fecha, long cedulaCliente, String nombreCliente, String metodoPago, double peso, String raza, String alimentacion, String razonConsulta, double precConsulta, double precVentasAd, double precLimpiezaPecera) {
        super(fecha, cedulaCliente, nombreCliente, metodoPago, peso, raza, alimentacion, razonConsulta, precConsulta, precVentasAd);
        this.precLimpiezaPecera = precLimpiezaPecera;
    }

    public double getPrecLimpiezaPecera() {
        return precLimpiezaPecera;
    }

    public void setPrecLimpiezaPecera(double precLimpiezaPecera) {
        this.precLimpiezaPecera = precLimpiezaPecera;
    }
    
    @Override
    public double calcularTotal() {
        double total = this.precConsulta+this.precVentasAd+this.precLimpiezaPecera;
        return total;
    }    
    
    @Override
    public String toString() {
        return super.toString()+"Precio por limpieza de pecera: "+precLimpiezaPecera+" - "+"Costo Total: ";
    }
}
