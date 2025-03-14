/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfazanimalon;

/**
 *
 * @author luisr
 */
public class Perron implements Animalon {
    @Override
    public void hacerSonido()
    {
     System.out.println("Perro: Guau ");
    }
    
    @Override
    public void mover()
    {
        System.out.println("El perro ha usado placaje");
    }
}
