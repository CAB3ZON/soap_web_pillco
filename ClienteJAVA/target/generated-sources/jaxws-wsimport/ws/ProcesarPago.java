
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ProcesarPago complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ProcesarPago">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="total" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="pago" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcesarPago", propOrder = {
    "total",
    "pago"
})
public class ProcesarPago {

    protected int total;
    protected int pago;

    /**
     * Obtiene el valor de la propiedad total.
     * 
     */
    public int getTotal() {
        return total;
    }

    /**
     * Define el valor de la propiedad total.
     * 
     */
    public void setTotal(int value) {
        this.total = value;
    }

    /**
     * Obtiene el valor de la propiedad pago.
     * 
     */
    public int getPago() {
        return pago;
    }

    /**
     * Define el valor de la propiedad pago.
     * 
     */
    public void setPago(int value) {
        this.pago = value;
    }

}
