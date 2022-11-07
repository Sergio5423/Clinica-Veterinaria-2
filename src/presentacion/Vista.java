/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package presentacion;

import java.time.LocalDate;
import java.util.ArrayList;
import modelo.Ave;
import modelo.Gato;
import modelo.Hamster;
import modelo.Perro;
import modelo.Pez;
import modelo.Veterinaria;

/**
 *
 * @author SERGIO TARRIFA
 */
public class Vista {
    public static void main(String[] args) {
        LocalDate hoy = LocalDate.now();
        
        Ave a1 = new Ave();
        a1.setFecha(hoy);
        a1.setCedulaCliente(1240316234);
        a1.setNombreCliente("Hugo");
        a1.setMetodoPago("Efectivo");
        a1.setPeso(0.27);
        a1.setRaza("Loro");
        a1.setAlimentacion("Fruta");
        a1.setRazonConsulta("Caida de plumas");
        a1.setPrecConsulta(50000);
        a1.setPrecVentasAd(30000);
        a1.setPrecLimpiezaJaula(10000);
        a1.calcularTotal();
        
        Gato g1 = new Gato();
        g1.setFecha(hoy);
        g1.setCedulaCliente(1085644823);
        g1.setNombreCliente("Martin");
        g1.setMetodoPago("Tarjeta de credito");
        g1.setPeso(4.42);
        g1.setRaza("Gato Persa");
        g1.setAlimentacion("Concentrado");
        g1.setRazonConsulta("No tiene apetito");
        g1.setPrecConsulta(60000);
        g1.setPrecVentasAd(70000);
        g1.setPrecCorte(40000);
        g1.setPrecVacunas(80000);
        g1.calcularTotal();
        
        Hamster h1 = new Hamster();
        h1.setFecha(hoy);
        h1.setCedulaCliente(1206432849);
        h1.setNombreCliente("Lucas");
        h1.setMetodoPago("Tarjeta debito");
        h1.setPeso(0.90);
        h1.setRaza("Hamster Enano Ruso");
        h1.setAlimentacion("Fruta y verdura");
        h1.setRazonConsulta("Acaros");
        h1.setPrecConsulta(30000);
        h1.setPrecVentasAd(10000);
        h1.setPrecCorte(0);
        h1.setPrecVacunas(0);
        h1.calcularTotal();
        
        Perro p1 = new Perro();
        p1.setFecha(hoy);
        p1.setCedulaCliente(1512037619);
        p1.setNombreCliente("Pablo");
        p1.setMetodoPago("Efectivo");
        p1.setPeso(35);
        p1.setRaza("Pastor Aleman");
        p1.setAlimentacion("Concentrado");
        p1.setRazonConsulta("Garrapatas");
        p1.setPrecConsulta(80000);
        p1.setPrecVentasAd(100000);
        p1.setPrecCorte(53000);
        p1.setPrecVacunas(90000);
        p1.calcularTotal();
        
        Pez pe1 = new Pez();
        pe1.setFecha(hoy);
        pe1.setCedulaCliente(8521345);
        pe1.setNombreCliente("Leo");
        pe1.setMetodoPago("Tarjeta debito");
        pe1.setPeso(20);
        pe1.setRaza("Pez dorado");
        pe1.setAlimentacion("Comida de pez");
        pe1.setRazonConsulta("Punto Blanco");
        pe1.setPrecConsulta(35000);
        pe1.setPrecVentasAd(23000);
        pe1.setPrecLimpiezaPecera(25000);
        pe1.calcularTotal();       
        
        ArrayList<Veterinaria> lista = new ArrayList ();
        lista.add(a1);
        lista.add(g1);
        lista.add(h1);
        lista.add(p1);
        lista.add(pe1);
        
        for (Veterinaria a: lista) {
            System.out.println(a.toString() + a.calcularTotal());            
        }
    }
}
