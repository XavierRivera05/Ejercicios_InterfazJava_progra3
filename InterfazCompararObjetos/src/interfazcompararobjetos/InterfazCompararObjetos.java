/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interfazcompararobjetos;

/**
 *
 * @author luisr
 */
public class InterfazCompararObjetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Producto p1 = new Producto("Laptop", 1500.00);
        Producto p2 = new Producto("Iphone", 800.00);
        
        int resultado = p1.comparar(p2);
        
        if (resultado < 0)
        {
            System.out.println(p1.getNombre() + "es mas barato que " + p2.getNombre());
        }
        else if (resultado > 0)
        {
            System.out.println(p1.getNombre() + "es mas caro que " + p2.getNombre());
        }
        else
        {
            System.out.println(p1.getNombre() + " y " + p2.getNombre() + "tienen el mismito precio :0");
        }
    }
    
}
