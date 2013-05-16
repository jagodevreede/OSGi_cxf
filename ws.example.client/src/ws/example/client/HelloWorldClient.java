package ws.example.client;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.hello_world_soap_http.Greeter;

public class HelloWorldClient {
	 private Greeter m_greeter;

	    public void start() {
	        System.out.println("Starting hello world client:");
	        try {
	            JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
	            factory.setServiceClass(Greeter.class);
	            factory.setAddress("http://localhost:9000/mockGreeter_SOAPBinding");
	            m_greeter = (Greeter) factory.create();
	           
	            String greetMe = m_greeter.greetMe("world");
	            System.out.println(greetMe);
	        }
	        catch (Throwable e) {
	            e.printStackTrace();
	        }
	    }
}
