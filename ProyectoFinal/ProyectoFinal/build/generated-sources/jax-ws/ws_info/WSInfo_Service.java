
package ws_info;

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
@WebServiceClient(name = "WS_Info", targetNamespace = "http://ws_info/", wsdlLocation = "http://localhost:8080/ProyectoFinal_WS_All/WS_Info?WSDL")
public class WSInfo_Service
    extends Service
{

    private final static URL WSINFO_WSDL_LOCATION;
    private final static WebServiceException WSINFO_EXCEPTION;
    private final static QName WSINFO_QNAME = new QName("http://ws_info/", "WS_Info");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/ProyectoFinal_WS_All/WS_Info?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WSINFO_WSDL_LOCATION = url;
        WSINFO_EXCEPTION = e;
    }

    public WSInfo_Service() {
        super(__getWsdlLocation(), WSINFO_QNAME);
    }

    public WSInfo_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), WSINFO_QNAME, features);
    }

    public WSInfo_Service(URL wsdlLocation) {
        super(wsdlLocation, WSINFO_QNAME);
    }

    public WSInfo_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WSINFO_QNAME, features);
    }

    public WSInfo_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WSInfo_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WSInfo
     */
    @WebEndpoint(name = "WS_InfoPort")
    public WSInfo getWSInfoPort() {
        return super.getPort(new QName("http://ws_info/", "WS_InfoPort"), WSInfo.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WSInfo
     */
    @WebEndpoint(name = "WS_InfoPort")
    public WSInfo getWSInfoPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws_info/", "WS_InfoPort"), WSInfo.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WSINFO_EXCEPTION!= null) {
            throw WSINFO_EXCEPTION;
        }
        return WSINFO_WSDL_LOCATION;
    }

}
