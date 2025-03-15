/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interfaznotificacion;

/**
 *
 * @author luisr
 */
public class InterfazNotificacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Notificable correo = new CorreoElectronico();
        Notificable sms = new SMS();
        
        correo.enviarNoti();
        sms.enviarNoti();
    }
    
}
