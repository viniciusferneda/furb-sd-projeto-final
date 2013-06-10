
package ws.client;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ServidorWeb", targetNamespace = "http://ws/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ServidorWeb {


    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "comprarIngressoCinema", targetNamespace = "http://ws/", className = "ws.client.ComprarIngressoCinema")
    @ResponseWrapper(localName = "comprarIngressoCinemaResponse", targetNamespace = "http://ws/", className = "ws.client.ComprarIngressoCinemaResponse")
    @Action(input = "http://ws/ServidorWeb/comprarIngressoCinemaRequest", output = "http://ws/ServidorWeb/comprarIngressoCinemaResponse")
    public String comprarIngressoCinema(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        int arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        int arg3);

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "comprarIngressoTeatro", targetNamespace = "http://ws/", className = "ws.client.ComprarIngressoTeatro")
    @ResponseWrapper(localName = "comprarIngressoTeatroResponse", targetNamespace = "http://ws/", className = "ws.client.ComprarIngressoTeatroResponse")
    @Action(input = "http://ws/ServidorWeb/comprarIngressoTeatroRequest", output = "http://ws/ServidorWeb/comprarIngressoTeatroResponse")
    public String comprarIngressoTeatro(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        int arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        int arg3);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "reservarRestaurante", targetNamespace = "http://ws/", className = "ws.client.ReservarRestaurante")
    @ResponseWrapper(localName = "reservarRestauranteResponse", targetNamespace = "http://ws/", className = "ws.client.ReservarRestauranteResponse")
    @Action(input = "http://ws/ServidorWeb/reservarRestauranteRequest", output = "http://ws/ServidorWeb/reservarRestauranteResponse")
    public String reservarRestaurante(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1);

}
