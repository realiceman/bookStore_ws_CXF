
package com.youssef.schema.order;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour OrderInquiryType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="OrderInquiryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="uniqueOrderId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="orderQuantity" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="accountId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ean13" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderInquiryType", propOrder = {
    "uniqueOrderId",
    "orderQuantity",
    "accountId",
    "ean13"
})
public class OrderInquiryType {

    protected int uniqueOrderId;
    protected int orderQuantity;
    protected int accountId;
    protected long ean13;

    /**
     * Obtient la valeur de la propriété uniqueOrderId.
     * 
     */
    public int getUniqueOrderId() {
        return uniqueOrderId;
    }

    /**
     * Définit la valeur de la propriété uniqueOrderId.
     * 
     */
    public void setUniqueOrderId(int value) {
        this.uniqueOrderId = value;
    }

    /**
     * Obtient la valeur de la propriété orderQuantity.
     * 
     */
    public int getOrderQuantity() {
        return orderQuantity;
    }

    /**
     * Définit la valeur de la propriété orderQuantity.
     * 
     */
    public void setOrderQuantity(int value) {
        this.orderQuantity = value;
    }

    /**
     * Obtient la valeur de la propriété accountId.
     * 
     */
    public int getAccountId() {
        return accountId;
    }

    /**
     * Définit la valeur de la propriété accountId.
     * 
     */
    public void setAccountId(int value) {
        this.accountId = value;
    }

    /**
     * Obtient la valeur de la propriété ean13.
     * 
     */
    public long getEan13() {
        return ean13;
    }

    /**
     * Définit la valeur de la propriété ean13.
     * 
     */
    public void setEan13(long value) {
        this.ean13 = value;
    }

}
