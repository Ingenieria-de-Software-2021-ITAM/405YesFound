
package ws_alta;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ws_alta package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _RegistrarProyecto_QNAME = new QName("http://ws_alta/", "registrarProyecto");
    private final static QName _RegistrarProyectoResponse_QNAME = new QName("http://ws_alta/", "registrarProyectoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws_alta
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RegistrarProyecto }
     * 
     */
    public RegistrarProyecto createRegistrarProyecto() {
        return new RegistrarProyecto();
    }

    /**
     * Create an instance of {@link RegistrarProyectoResponse }
     * 
     */
    public RegistrarProyectoResponse createRegistrarProyectoResponse() {
        return new RegistrarProyectoResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrarProyecto }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RegistrarProyecto }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws_alta/", name = "registrarProyecto")
    public JAXBElement<RegistrarProyecto> createRegistrarProyecto(RegistrarProyecto value) {
        return new JAXBElement<RegistrarProyecto>(_RegistrarProyecto_QNAME, RegistrarProyecto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrarProyectoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RegistrarProyectoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws_alta/", name = "registrarProyectoResponse")
    public JAXBElement<RegistrarProyectoResponse> createRegistrarProyectoResponse(RegistrarProyectoResponse value) {
        return new JAXBElement<RegistrarProyectoResponse>(_RegistrarProyectoResponse_QNAME, RegistrarProyectoResponse.class, null, value);
    }

}
