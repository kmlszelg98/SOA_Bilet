
package test;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Simulator", targetNamespace = "http://test/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Simulator {


    /**
     * 
     */
    @WebMethod
    @RequestWrapper(localName = "start", targetNamespace = "http://test/", className = "test.Start")
    @ResponseWrapper(localName = "startResponse", targetNamespace = "http://test/", className = "test.StartResponse")
    public void start();

    /**
     * 
     * @param strefa
     */
    @WebMethod
    @RequestWrapper(localName = "increment", targetNamespace = "http://test/", className = "test.Increment")
    @ResponseWrapper(localName = "incrementResponse", targetNamespace = "http://test/", className = "test.IncrementResponse")
    public void increment(
        @WebParam(name = "strefa", targetNamespace = "")
        int strefa);

    /**
     * 
     * @param strefa
     */
    @WebMethod
    @RequestWrapper(localName = "decrement", targetNamespace = "http://test/", className = "test.Decrement")
    @ResponseWrapper(localName = "decrementResponse", targetNamespace = "http://test/", className = "test.DecrementResponse")
    public void decrement(
        @WebParam(name = "strefa", targetNamespace = "")
        int strefa);

}
