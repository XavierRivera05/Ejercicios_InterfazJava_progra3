/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfazanimalon;

/**
 *
 * @author luisr
 */
public class Gato implements Animalon {
    @Override
    public void hacerSonido ()
    {
        System.out.println("Gato: Miau");
    }
    
    @Override
   public void mover()
   {
       System.out.println("El gato usa sigilo");
   }
}
