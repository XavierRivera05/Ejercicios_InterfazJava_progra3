/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfazcalculadora;

/**
 *
 * @author luisr
 */
public class DescuentoFijo implements Descontable {
    private double cantidadFija;
    
    //Albañil
    public DescuentoFijo(double cantidadFija)
    {
        this.cantidadFija = cantidadFija;
    }
    
    @Override
    public double calcularDescuento(double precio)
    {
        double precioFinal = precio - cantidadFija;
        return(precioFinal < 0) ? 0 : precioFinal;
    }
}
