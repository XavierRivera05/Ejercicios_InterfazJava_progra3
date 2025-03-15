/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alimentacion;

/**
 *
 * @author luisr
 */
public class Persona implements Alimentado {
    @Override 
    public void comer()
    {
        System.out.println("la persona está comiendo comida envenenada del Hollyday ");
    }
}
