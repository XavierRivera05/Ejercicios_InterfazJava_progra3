/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaznotificacion;

/**
 *
 * @author luisr
 */
public class CorreoElectronico implements Notificable {
    
    @Override
    public void enviarNoti()
    {
        System.out.println("Enviando notificacion por el correo");
    }
}
