/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alimentacion;

/**
 *
 * @author luisr
 */
public class Alimentacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Alimentado persona = new Persona();
        Alimentado animal = new Animal();
        
        persona.comer();
        animal.comer();
    }
    
}
