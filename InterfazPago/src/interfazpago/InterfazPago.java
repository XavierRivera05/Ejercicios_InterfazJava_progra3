/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interfazpago;

/**
 *
 * @author luisr
 */
public class InterfazPago {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Pago pagoTarjeta = new PagoconTarjeta();
       Pago pagoEfectivo = new PagoconEfectivo();
       
       pagoTarjeta.procesarPago(150.75);
       pagoEfectivo.procesarPago(80.50);
    }
    
}
