/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interfazanimalon;

/**
 *
 * @author luisitocomunica
 */
public class InterfazAnimalon {
    public static void main (String[] args) //main del programa
    {
        Animalon perro = new Perron();
        Animalon gato = new Gato();
        
        perro.hacerSonido();
        perro.mover();
        
        System.out.println();
        
        gato.hacerSonido();
        gato.mover();
    }
    
}
