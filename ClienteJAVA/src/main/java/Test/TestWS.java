/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Test;

import ws.WSOperaciones;
import ws.WSOperaciones_Service;

/**
 *
 * @author USUARIO
 */
public class TestWS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        WSOperaciones_Service servicio=new WSOperaciones_Service();
        WSOperaciones cliente= servicio.getWSOperacionesPort();
        
        //LOGIN
        if (cliente.login("marcos", "marcos2001")) {
            System.out.println("CREDENCIALES CORRECTAS");
        }else{
             System.out.println("CREDENCIALES INCORRECTAS");
        }
        System.out.println(cliente.procesarPago(1000, 8000));
    }
    
}
