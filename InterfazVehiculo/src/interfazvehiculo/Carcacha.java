/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfazvehiculo;

/**
 *
 * @author luisr
 */
public class Carcacha implements Vehiculo {
    
    @Override
    public void arrancar()
    {
        System.out.println("El Chevy del 63 está arrancando...");
    }
    
    @Override
    public void detener()
    {
        System.out.println("El Chevy se ha detenido.");
    }
}
