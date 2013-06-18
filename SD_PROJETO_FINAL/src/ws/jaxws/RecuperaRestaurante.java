
package ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "recuperaRestaurante", namespace = "http://ws/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "recuperaRestaurante", namespace = "http://ws/")
public class RecuperaRestaurante {

    @XmlElement(name = "arg0", namespace = "")
    private short arg0;

    /**
     * 
     * @return
     *     returns short
     */
    public short getArg0() {
        return this.arg0;
    }

    /**
     * 
     * @param arg0
     *     the value for the arg0 property
     */
    public void setArg0(short arg0) {
        this.arg0 = arg0;
    }

}
