/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package ws;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author USUARIO
 */
@WebService(serviceName = "WSOperaciones")
public class WSOperaciones {

    

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Login")
    public Boolean Login(@WebParam(name = "usuario") String usuario, @WebParam(name = "contrasena") String contrasena) {
        //TODO write your implementation code here:
        if (usuario.equals("marcos")&&contrasena.equals("marcos2001")) {
            return true;
        }else{
            return false;
        }
        
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "ProcesarPago")
    public int ProcesarPago(@WebParam(name = "total") int total, @WebParam(name = "pago") int pago) {
        if (pago>=total) {
            
            return pago-total;
        }else{
            return -1;
        }
    }
}
