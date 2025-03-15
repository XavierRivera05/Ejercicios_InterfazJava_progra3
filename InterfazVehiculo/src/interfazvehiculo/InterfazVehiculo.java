/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interfazvehiculo;

/**
 *
 * @author luisr
 */
public class InterfazVehiculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vehiculo Chevy63 = new Carcacha();
        Vehiculo Mibici = new Bicicleta();
        
        Chevy63.arrancar();
        Chevy63.detener();
        
        System.out.println();
        
        Mibici.arrancar();
        Mibici.detener();
    }
}
