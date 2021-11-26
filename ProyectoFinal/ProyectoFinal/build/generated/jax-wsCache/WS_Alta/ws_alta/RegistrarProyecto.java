
package ws_alta;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for registrarProyecto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="registrarProyecto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="clvContienda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nomProye" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="descCorta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "registrarProyecto", propOrder = {
    "clvContienda",
    "nomProye",
    "descCorta",
    "desc"
})
public class RegistrarProyecto {

    protected String clvContienda;
    protected String nomProye;
    protected String descCorta;
    protected String desc;

    /**
     * Gets the value of the clvContienda property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClvContienda() {
        return clvContienda;
    }

    /**
     * Sets the value of the clvContienda property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClvContienda(String value) {
        this.clvContienda = value;
    }

    /**
     * Gets the value of the nomProye property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomProye() {
        return nomProye;
    }

    /**
     * Sets the value of the nomProye property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomProye(String value) {
        this.nomProye = value;
    }

    /**
     * Gets the value of the descCorta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescCorta() {
        return descCorta;
    }

    /**
     * Sets the value of the descCorta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescCorta(String value) {
        this.descCorta = value;
    }

    /**
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesc(String value) {
        this.desc = value;
    }

}
