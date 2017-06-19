
package test;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the test package. 
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

    private final static QName _Start_QNAME = new QName("http://test/", "start");
    private final static QName _Increment_QNAME = new QName("http://test/", "increment");
    private final static QName _IncrementResponse_QNAME = new QName("http://test/", "incrementResponse");
    private final static QName _StartResponse_QNAME = new QName("http://test/", "startResponse");
    private final static QName _DecrementResponse_QNAME = new QName("http://test/", "decrementResponse");
    private final static QName _Decrement_QNAME = new QName("http://test/", "decrement");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: test
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DecrementResponse }
     * 
     */
    public DecrementResponse createDecrementResponse() {
        return new DecrementResponse();
    }

    /**
     * Create an instance of {@link Decrement }
     * 
     */
    public Decrement createDecrement() {
        return new Decrement();
    }

    /**
     * Create an instance of {@link Start }
     * 
     */
    public Start createStart() {
        return new Start();
    }

    /**
     * Create an instance of {@link Increment }
     * 
     */
    public Increment createIncrement() {
        return new Increment();
    }

    /**
     * Create an instance of {@link IncrementResponse }
     * 
     */
    public IncrementResponse createIncrementResponse() {
        return new IncrementResponse();
    }

    /**
     * Create an instance of {@link StartResponse }
     * 
     */
    public StartResponse createStartResponse() {
        return new StartResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Start }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test/", name = "start")
    public JAXBElement<Start> createStart(Start value) {
        return new JAXBElement<Start>(_Start_QNAME, Start.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Increment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test/", name = "increment")
    public JAXBElement<Increment> createIncrement(Increment value) {
        return new JAXBElement<Increment>(_Increment_QNAME, Increment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IncrementResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test/", name = "incrementResponse")
    public JAXBElement<IncrementResponse> createIncrementResponse(IncrementResponse value) {
        return new JAXBElement<IncrementResponse>(_IncrementResponse_QNAME, IncrementResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StartResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test/", name = "startResponse")
    public JAXBElement<StartResponse> createStartResponse(StartResponse value) {
        return new JAXBElement<StartResponse>(_StartResponse_QNAME, StartResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DecrementResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test/", name = "decrementResponse")
    public JAXBElement<DecrementResponse> createDecrementResponse(DecrementResponse value) {
        return new JAXBElement<DecrementResponse>(_DecrementResponse_QNAME, DecrementResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Decrement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test/", name = "decrement")
    public JAXBElement<Decrement> createDecrement(Decrement value) {
        return new JAXBElement<Decrement>(_Decrement_QNAME, Decrement.class, null, value);
    }

}
