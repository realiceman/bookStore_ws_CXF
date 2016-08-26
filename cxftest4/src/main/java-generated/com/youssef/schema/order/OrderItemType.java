
package com.youssef.schema.order;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour OrderItemType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="OrderItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="lineNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="expectedShippingDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="book" type="{http://www.youssef.com/schema/Order}BookType"/&gt;
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="quantityShipped" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderItemType", propOrder = {
    "lineNumber",
    "expectedShippingDate",
    "book",
    "price",
    "quantityShipped"
})
public class OrderItemType {

    protected int lineNumber;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expectedShippingDate;
    @XmlElement(required = true)
    protected BookType book;
    @XmlElement(required = true)
    protected BigDecimal price;
    protected int quantityShipped;

    /**
     * Obtient la valeur de la propriété lineNumber.
     * 
     */
    public int getLineNumber() {
        return lineNumber;
    }

    /**
     * Définit la valeur de la propriété lineNumber.
     * 
     */
    public void setLineNumber(int value) {
        this.lineNumber = value;
    }

    /**
     * Obtient la valeur de la propriété expectedShippingDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpectedShippingDate() {
        return expectedShippingDate;
    }

    /**
     * Définit la valeur de la propriété expectedShippingDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpectedShippingDate(XMLGregorianCalendar value) {
        this.expectedShippingDate = value;
    }

    /**
     * Obtient la valeur de la propriété book.
     * 
     * @return
     *     possible object is
     *     {@link BookType }
     *     
     */
    public BookType getBook() {
        return book;
    }

    /**
     * Définit la valeur de la propriété book.
     * 
     * @param value
     *     allowed object is
     *     {@link BookType }
     *     
     */
    public void setBook(BookType value) {
        this.book = value;
    }

    /**
     * Obtient la valeur de la propriété price.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * Définit la valeur de la propriété price.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrice(BigDecimal value) {
        this.price = value;
    }

    /**
     * Obtient la valeur de la propriété quantityShipped.
     * 
     */
    public int getQuantityShipped() {
        return quantityShipped;
    }

    /**
     * Définit la valeur de la propriété quantityShipped.
     * 
     */
    public void setQuantityShipped(int value) {
        this.quantityShipped = value;
    }

}
