/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interfazcalculadora;

/**
 *
 * @author luisr
 */
public class InterfazCalculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      double precioOriginal = 1000.00;
      
      //descuento del megapaca 20%
      Descontable descuentoPorcentaje = new DescuentoPorcentaje(20);
      double precioConDescuentoPorcentaje = descuentoPorcentaje.calcularDescuento(precioOriginal);
      System.out.println("Precio con el descuento del 20%: " + precioConDescuentoPorcentaje);
      
      //con 150 bolas o dólares
      Descontable descuentoFijo = new DescuentoFijo(150);
      double precioConDescuentoFijo = descuentoFijo.calcularDescuento(precioOriginal);
      System.out.println("Precio con descuento fijo de 150 biyuyos: " + precioConDescuentoFijo);
    }
    
}
