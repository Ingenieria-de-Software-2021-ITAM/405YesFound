
package ws_votar;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for votar complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="votar"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="clvAlumno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="clvContienda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="clvProyecto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "votar", propOrder = {
    "clvAlumno",
    "clvContienda",
    "clvProyecto"
})
public class Votar {

    protected String clvAlumno;
    protected String clvContienda;
    protected String clvProyecto;

    /**
     * Gets the value of the clvAlumno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClvAlumno() {
        return clvAlumno;
    }

    /**
     * Sets the value of the clvAlumno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClvAlumno(String value) {
        this.clvAlumno = value;
    }

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
     * Gets the value of the clvProyecto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClvProyecto() {
        return clvProyecto;
    }

    /**
     * Sets the value of the clvProyecto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClvProyecto(String value) {
        this.clvProyecto = value;
    }

}
