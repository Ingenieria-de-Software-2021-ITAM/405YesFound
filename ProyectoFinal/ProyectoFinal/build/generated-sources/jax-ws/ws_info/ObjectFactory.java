
package ws_info;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ws_info package. 
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

    private final static QName _GetContiendas_QNAME = new QName("http://ws_info/", "getContiendas");
    private final static QName _GetContiendasResponse_QNAME = new QName("http://ws_info/", "getContiendasResponse");
    private final static QName _GetProyectos_QNAME = new QName("http://ws_info/", "getProyectos");
    private final static QName _GetProyectosResponse_QNAME = new QName("http://ws_info/", "getProyectosResponse");
    private final static QName _GetStatistics_QNAME = new QName("http://ws_info/", "getStatistics");
    private final static QName _GetStatisticsResponse_QNAME = new QName("http://ws_info/", "getStatisticsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws_info
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetContiendas }
     * 
     */
    public GetContiendas createGetContiendas() {
        return new GetContiendas();
    }

    /**
     * Create an instance of {@link GetContiendasResponse }
     * 
     */
    public GetContiendasResponse createGetContiendasResponse() {
        return new GetContiendasResponse();
    }

    /**
     * Create an instance of {@link GetProyectos }
     * 
     */
    public GetProyectos createGetProyectos() {
        return new GetProyectos();
    }

    /**
     * Create an instance of {@link GetProyectosResponse }
     * 
     */
    public GetProyectosResponse createGetProyectosResponse() {
        return new GetProyectosResponse();
    }

    /**
     * Create an instance of {@link GetStatistics }
     * 
     */
    public GetStatistics createGetStatistics() {
        return new GetStatistics();
    }

    /**
     * Create an instance of {@link GetStatisticsResponse }
     * 
     */
    public GetStatisticsResponse createGetStatisticsResponse() {
        return new GetStatisticsResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetContiendas }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetContiendas }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws_info/", name = "getContiendas")
    public JAXBElement<GetContiendas> createGetContiendas(GetContiendas value) {
        return new JAXBElement<GetContiendas>(_GetContiendas_QNAME, GetContiendas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetContiendasResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetContiendasResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws_info/", name = "getContiendasResponse")
    public JAXBElement<GetContiendasResponse> createGetContiendasResponse(GetContiendasResponse value) {
        return new JAXBElement<GetContiendasResponse>(_GetContiendasResponse_QNAME, GetContiendasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProyectos }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetProyectos }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws_info/", name = "getProyectos")
    public JAXBElement<GetProyectos> createGetProyectos(GetProyectos value) {
        return new JAXBElement<GetProyectos>(_GetProyectos_QNAME, GetProyectos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProyectosResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetProyectosResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws_info/", name = "getProyectosResponse")
    public JAXBElement<GetProyectosResponse> createGetProyectosResponse(GetProyectosResponse value) {
        return new JAXBElement<GetProyectosResponse>(_GetProyectosResponse_QNAME, GetProyectosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStatistics }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetStatistics }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws_info/", name = "getStatistics")
    public JAXBElement<GetStatistics> createGetStatistics(GetStatistics value) {
        return new JAXBElement<GetStatistics>(_GetStatistics_QNAME, GetStatistics.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStatisticsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetStatisticsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws_info/", name = "getStatisticsResponse")
    public JAXBElement<GetStatisticsResponse> createGetStatisticsResponse(GetStatisticsResponse value) {
        return new JAXBElement<GetStatisticsResponse>(_GetStatisticsResponse_QNAME, GetStatisticsResponse.class, null, value);
    }

}
