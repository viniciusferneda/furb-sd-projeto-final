
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

    private final static QName _AddTeatro_QNAME = new QName("http://ws/", "addTeatro");
    private final static QName _AddCinema_QNAME = new QName("http://ws/", "addCinema");
    private final static QName _AddRestaurante_QNAME = new QName("http://ws/", "addRestaurante");
    private final static QName _ReservarRestaurante_QNAME = new QName("http://ws/", "reservarRestaurante");
    private final static QName _RecuperaCinemaResponse_QNAME = new QName("http://ws/", "recuperaCinemaResponse");
    private final static QName _RecuperaRestaurante_QNAME = new QName("http://ws/", "recuperaRestaurante");
    private final static QName _AddCinemaResponse_QNAME = new QName("http://ws/", "addCinemaResponse");
    private final static QName _RecuperaTeatro_QNAME = new QName("http://ws/", "recuperaTeatro");
    private final static QName _AddRestauranteResponse_QNAME = new QName("http://ws/", "addRestauranteResponse");
    private final static QName _RecuperaTeatroResponse_QNAME = new QName("http://ws/", "recuperaTeatroResponse");
    private final static QName _ComprarIngressoCinema_QNAME = new QName("http://ws/", "comprarIngressoCinema");
    private final static QName _ComprarIngressoTeatro_QNAME = new QName("http://ws/", "comprarIngressoTeatro");
    private final static QName _RecuperaCinema_QNAME = new QName("http://ws/", "recuperaCinema");
    private final static QName _ReservarRestauranteResponse_QNAME = new QName("http://ws/", "reservarRestauranteResponse");
    private final static QName _ComprarIngressoTeatroResponse_QNAME = new QName("http://ws/", "comprarIngressoTeatroResponse");
    private final static QName _AddTeatroResponse_QNAME = new QName("http://ws/", "addTeatroResponse");
    private final static QName _RecuperaRestauranteResponse_QNAME = new QName("http://ws/", "recuperaRestauranteResponse");
    private final static QName _ComprarIngressoCinemaResponse_QNAME = new QName("http://ws/", "comprarIngressoCinemaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RecuperaRestauranteResponse }
     * 
     */
    public RecuperaRestauranteResponse createRecuperaRestauranteResponse() {
        return new RecuperaRestauranteResponse();
    }

    /**
     * Create an instance of {@link ComprarIngressoCinemaResponse }
     * 
     */
    public ComprarIngressoCinemaResponse createComprarIngressoCinemaResponse() {
        return new ComprarIngressoCinemaResponse();
    }

    /**
     * Create an instance of {@link AddTeatroResponse }
     * 
     */
    public AddTeatroResponse createAddTeatroResponse() {
        return new AddTeatroResponse();
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
     * Create an instance of {@link RecuperaTeatroResponse }
     * 
     */
    public RecuperaTeatroResponse createRecuperaTeatroResponse() {
        return new RecuperaTeatroResponse();
    }

    /**
     * Create an instance of {@link ComprarIngressoCinema }
     * 
     */
    public ComprarIngressoCinema createComprarIngressoCinema() {
        return new ComprarIngressoCinema();
    }

    /**
     * Create an instance of {@link ComprarIngressoTeatro }
     * 
     */
    public ComprarIngressoTeatro createComprarIngressoTeatro() {
        return new ComprarIngressoTeatro();
    }

    /**
     * Create an instance of {@link RecuperaCinema }
     * 
     */
    public RecuperaCinema createRecuperaCinema() {
        return new RecuperaCinema();
    }

    /**
     * Create an instance of {@link AddRestauranteResponse }
     * 
     */
    public AddRestauranteResponse createAddRestauranteResponse() {
        return new AddRestauranteResponse();
    }

    /**
     * Create an instance of {@link RecuperaRestaurante }
     * 
     */
    public RecuperaRestaurante createRecuperaRestaurante() {
        return new RecuperaRestaurante();
    }

    /**
     * Create an instance of {@link RecuperaTeatro }
     * 
     */
    public RecuperaTeatro createRecuperaTeatro() {
        return new RecuperaTeatro();
    }

    /**
     * Create an instance of {@link AddCinemaResponse }
     * 
     */
    public AddCinemaResponse createAddCinemaResponse() {
        return new AddCinemaResponse();
    }

    /**
     * Create an instance of {@link RecuperaCinemaResponse }
     * 
     */
    public RecuperaCinemaResponse createRecuperaCinemaResponse() {
        return new RecuperaCinemaResponse();
    }

    /**
     * Create an instance of {@link ReservarRestaurante }
     * 
     */
    public ReservarRestaurante createReservarRestaurante() {
        return new ReservarRestaurante();
    }

    /**
     * Create an instance of {@link AddRestaurante }
     * 
     */
    public AddRestaurante createAddRestaurante() {
        return new AddRestaurante();
    }

    /**
     * Create an instance of {@link AddCinema }
     * 
     */
    public AddCinema createAddCinema() {
        return new AddCinema();
    }

    /**
     * Create an instance of {@link AddTeatro }
     * 
     */
    public AddTeatro createAddTeatro() {
        return new AddTeatro();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddTeatro }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "addTeatro")
    public JAXBElement<AddTeatro> createAddTeatro(AddTeatro value) {
        return new JAXBElement<AddTeatro>(_AddTeatro_QNAME, AddTeatro.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddCinema }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "addCinema")
    public JAXBElement<AddCinema> createAddCinema(AddCinema value) {
        return new JAXBElement<AddCinema>(_AddCinema_QNAME, AddCinema.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddRestaurante }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "addRestaurante")
    public JAXBElement<AddRestaurante> createAddRestaurante(AddRestaurante value) {
        return new JAXBElement<AddRestaurante>(_AddRestaurante_QNAME, AddRestaurante.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link RecuperaCinemaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "recuperaCinemaResponse")
    public JAXBElement<RecuperaCinemaResponse> createRecuperaCinemaResponse(RecuperaCinemaResponse value) {
        return new JAXBElement<RecuperaCinemaResponse>(_RecuperaCinemaResponse_QNAME, RecuperaCinemaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecuperaRestaurante }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "recuperaRestaurante")
    public JAXBElement<RecuperaRestaurante> createRecuperaRestaurante(RecuperaRestaurante value) {
        return new JAXBElement<RecuperaRestaurante>(_RecuperaRestaurante_QNAME, RecuperaRestaurante.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddCinemaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "addCinemaResponse")
    public JAXBElement<AddCinemaResponse> createAddCinemaResponse(AddCinemaResponse value) {
        return new JAXBElement<AddCinemaResponse>(_AddCinemaResponse_QNAME, AddCinemaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecuperaTeatro }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "recuperaTeatro")
    public JAXBElement<RecuperaTeatro> createRecuperaTeatro(RecuperaTeatro value) {
        return new JAXBElement<RecuperaTeatro>(_RecuperaTeatro_QNAME, RecuperaTeatro.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddRestauranteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "addRestauranteResponse")
    public JAXBElement<AddRestauranteResponse> createAddRestauranteResponse(AddRestauranteResponse value) {
        return new JAXBElement<AddRestauranteResponse>(_AddRestauranteResponse_QNAME, AddRestauranteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecuperaTeatroResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "recuperaTeatroResponse")
    public JAXBElement<RecuperaTeatroResponse> createRecuperaTeatroResponse(RecuperaTeatroResponse value) {
        return new JAXBElement<RecuperaTeatroResponse>(_RecuperaTeatroResponse_QNAME, RecuperaTeatroResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link RecuperaCinema }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "recuperaCinema")
    public JAXBElement<RecuperaCinema> createRecuperaCinema(RecuperaCinema value) {
        return new JAXBElement<RecuperaCinema>(_RecuperaCinema_QNAME, RecuperaCinema.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link AddTeatroResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "addTeatroResponse")
    public JAXBElement<AddTeatroResponse> createAddTeatroResponse(AddTeatroResponse value) {
        return new JAXBElement<AddTeatroResponse>(_AddTeatroResponse_QNAME, AddTeatroResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecuperaRestauranteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "recuperaRestauranteResponse")
    public JAXBElement<RecuperaRestauranteResponse> createRecuperaRestauranteResponse(RecuperaRestauranteResponse value) {
        return new JAXBElement<RecuperaRestauranteResponse>(_RecuperaRestauranteResponse_QNAME, RecuperaRestauranteResponse.class, null, value);
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
