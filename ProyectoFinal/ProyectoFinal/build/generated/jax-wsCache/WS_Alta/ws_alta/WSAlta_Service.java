
package ws_alta;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.0
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "WS_Alta", targetNamespace = "http://ws_alta/", wsdlLocation = "http://localhost:8080/ProyectoFinal_WS_All/WS_Alta?WSDL")
public class WSAlta_Service
    extends Service
{

    private final static URL WSALTA_WSDL_LOCATION;
    private final static WebServiceException WSALTA_EXCEPTION;
    private final static QName WSALTA_QNAME = new QName("http://ws_alta/", "WS_Alta");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/ProyectoFinal_WS_All/WS_Alta?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WSALTA_WSDL_LOCATION = url;
        WSALTA_EXCEPTION = e;
    }

    public WSAlta_Service() {
        super(__getWsdlLocation(), WSALTA_QNAME);
    }

    public WSAlta_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), WSALTA_QNAME, features);
    }

    public WSAlta_Service(URL wsdlLocation) {
        super(wsdlLocation, WSALTA_QNAME);
    }

    public WSAlta_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WSALTA_QNAME, features);
    }

    public WSAlta_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WSAlta_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WSAlta
     */
    @WebEndpoint(name = "WS_AltaPort")
    public WSAlta getWSAltaPort() {
        return super.getPort(new QName("http://ws_alta/", "WS_AltaPort"), WSAlta.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WSAlta
     */
    @WebEndpoint(name = "WS_AltaPort")
    public WSAlta getWSAltaPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws_alta/", "WS_AltaPort"), WSAlta.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WSALTA_EXCEPTION!= null) {
            throw WSALTA_EXCEPTION;
        }
        return WSALTA_WSDL_LOCATION;
    }

}
