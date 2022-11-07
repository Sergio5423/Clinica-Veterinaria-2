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
public abstract class Veterinaria {
    private LocalDate fecha;
    private long cedulaCliente;
    private String nombreCliente;
    private String metodoPago;
    private double peso;
    private String raza;
    private String alimentacion;
    private String razonConsulta;
    double precConsulta;
    double precVentasAd;

    public Veterinaria() {
    }

    public Veterinaria(LocalDate fecha, long cedulaCliente, String nombreCliente, String metodoPago, double peso, String raza, String alimentacion, String razonConsulta, double precConsulta, double precVentasAd) {
        this.fecha = fecha;
        this.cedulaCliente = cedulaCliente;
        this.nombreCliente = nombreCliente;
        this.metodoPago = metodoPago;
        this.peso = peso;
        this.raza = raza;
        this.alimentacion = alimentacion;
        this.razonConsulta = razonConsulta;
        this.precConsulta = precConsulta;
        this.precVentasAd = precVentasAd;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public long getCedulaCliente() {
        return cedulaCliente;
    }

    public void setCedulaCliente(long cedulaCliente) {
        this.cedulaCliente = cedulaCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getAlimentacion() {
        return alimentacion;
    }

    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }

    public String getRazonConsulta() {
        return razonConsulta;
    }

    public void setRazonConsulta(String razonConsulta) {
        this.razonConsulta = razonConsulta;
    }

    public double getPrecConsulta() {
        return precConsulta;
    }

    public void setPrecConsulta(double precConsulta) {
        this.precConsulta = precConsulta;
    }

    public double getPrecVentasAd() {
        return precVentasAd;
    }

    public void setPrecVentasAd(double precVentasAd) {
        this.precVentasAd = precVentasAd;
    }
        
    
    public abstract double calcularTotal();
    @Override
    public String toString() {
        return fecha+" - "+"Cédula: "+cedulaCliente+" - "+"Nombre: "+nombreCliente+" - "+"Metodo de pago: "+metodoPago
               +" - "+"Peso: "+peso+" - "+"Raza: "+raza+" - "+"Alimentacion: "+alimentacion+" - "+"Razón de consulta: "+
               razonConsulta+" - "+"Costo por Consulta: "+precConsulta+" - "+"Costo por compras adicionales: "+precVentasAd+" - ";        
    }
}
