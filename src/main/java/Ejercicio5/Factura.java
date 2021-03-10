/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio5;

/**
 *
 * @author Sebastian
 */
public class Factura extends Precio{
    //Atributos
    private final String emisor;
    private final String cliente;
    
    //Constructor
    public Factura(String emisor, String cliente, Double aCancelar) {
        this.emisor = emisor;
        this.cliente = cliente;
        this.pesos = aCancelar;
    }
    
    //Métodos
    public void ImprimirFactura(){
        System.out.println("Factura generada por : "+this.emisor);
        System.out.println("Cliente: "+this.cliente);
        System.out.println("Valor cancelado "+this.getPesos());
    }
    
}