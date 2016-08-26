
package com.youssef.schema.order;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour OrderStatusType.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="OrderStatusType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="READY"/&gt;
 *     &lt;enumeration value="FULFILLED"/&gt;
 *     &lt;enumeration value="BACKOREDER"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OrderStatusType")
@XmlEnum
public enum OrderStatusType {

    READY,
    FULFILLED,
    BACKOREDER;

    public String value() {
        return name();
    }

    public static OrderStatusType fromValue(String v) {
        return valueOf(v);
    }

}
