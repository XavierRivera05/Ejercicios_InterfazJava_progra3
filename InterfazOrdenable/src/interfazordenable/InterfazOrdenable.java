/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interfazordenable;
import java.util.Arrays;
/**
 *
 * @author luisr
 */
public class InterfazOrdenable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaNumeros lista = new ListaNumeros(Arrays.asList(5, 3, 8, 1, 9));
        
        lista.mostrarLista();
        lista.ordenar();
    }
    
}
