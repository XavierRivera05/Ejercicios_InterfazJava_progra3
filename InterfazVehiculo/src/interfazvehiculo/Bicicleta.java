/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfazvehiculo;

/**
 *
 * @author luisr
 */
public class Bicicleta implements Vehiculo {
    
    @Override
    public void arrancar()
    {
        System.out.println("La bicicleta empieza a andar");
    }
    @Override
    public void detener()
    {
        System.out.println("La bicicleta frena choyando la yina en la llanta");
    }
}
