
package ws.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ws.client package. 
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

    private final static QName _ComprarIngressoCinema_QNAME = new QName("http://ws/", "comprarIngressoCinema");
    private final static QName _ComprarIngressoTeatro_QNAME = new QName("http://ws/", "comprarIngressoTeatro");
    private final static QName _ReservarRestauranteResponse_QNAME = new QName("http://ws/", "reservarRestauranteResponse");
    private final static QName _ComprarIngressoTeatroResponse_QNAME = new QName("http://ws/", "comprarIngressoTeatroResponse");
    private final static QName _ReservarRestaurante_QNAME = new QName("http://ws/", "reservarRestaurante");
    private final static QName _ComprarIngressoCinemaResponse_QNAME = new QName("http://ws/", "comprarIngressoCinemaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ComprarIngressoCinemaResponse }
     * 
     */
    public ComprarIngressoCinemaResponse createComprarIngressoCinemaResponse() {
        return new ComprarIngressoCinemaResponse();
    }

    /**
     * Create an instance of {@link ReservarRestaurante }
     * 
     */
    public ReservarRestaurante createReservarRestaurante() {
        return new ReservarRestaurante();
    }

    /**
     * Create an instance of {@link ReservarRestauranteResponse }
     * 
     */
    public ReservarRestauranteResponse createReservarRestauranteResponse() {
        return new ReservarRestauranteResponse();
    }

    /**
     * Create an instance of {@link ComprarIngressoTeatroResponse }
     * 
     */
    public ComprarIngressoTeatroResponse createComprarIngressoTeatroResponse() {
        return new ComprarIngressoTeatroResponse();
    }

    /**
     * Create an instance of {@link ComprarIngressoTeatro }
     * 
     */
    public ComprarIngressoTeatro createComprarIngressoTeatro() {
        return new ComprarIngressoTeatro();
    }

    /**
     * Create an instance of {@link ComprarIngressoCinema }
     * 
     */
    public ComprarIngressoCinema createComprarIngressoCinema() {
        return new ComprarIngressoCinema();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ComprarIngressoCinema }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "comprarIngressoCinema")
    public JAXBElement<ComprarIngressoCinema> createComprarIngressoCinema(ComprarIngressoCinema value) {
        return new JAXBElement<ComprarIngressoCinema>(_ComprarIngressoCinema_QNAME, ComprarIngressoCinema.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ComprarIngressoTeatro }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "comprarIngressoTeatro")
    public JAXBElement<ComprarIngressoTeatro> createComprarIngressoTeatro(ComprarIngressoTeatro value) {
        return new JAXBElement<ComprarIngressoTeatro>(_ComprarIngressoTeatro_QNAME, ComprarIngressoTeatro.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReservarRestauranteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "reservarRestauranteResponse")
    public JAXBElement<ReservarRestauranteResponse> createReservarRestauranteResponse(ReservarRestauranteResponse value) {
        return new JAXBElement<ReservarRestauranteResponse>(_ReservarRestauranteResponse_QNAME, ReservarRestauranteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ComprarIngressoTeatroResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "comprarIngressoTeatroResponse")
    public JAXBElement<ComprarIngressoTeatroResponse> createComprarIngressoTeatroResponse(ComprarIngressoTeatroResponse value) {
        return new JAXBElement<ComprarIngressoTeatroResponse>(_ComprarIngressoTeatroResponse_QNAME, ComprarIngressoTeatroResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReservarRestaurante }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "reservarRestaurante")
    public JAXBElement<ReservarRestaurante> createReservarRestaurante(ReservarRestaurante value) {
        return new JAXBElement<ReservarRestaurante>(_ReservarRestaurante_QNAME, ReservarRestaurante.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ComprarIngressoCinemaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "comprarIngressoCinemaResponse")
    public JAXBElement<ComprarIngressoCinemaResponse> createComprarIngressoCinemaResponse(ComprarIngressoCinemaResponse value) {
        return new JAXBElement<ComprarIngressoCinemaResponse>(_ComprarIngressoCinemaResponse_QNAME, ComprarIngressoCinemaResponse.class, null, value);
    }

}
