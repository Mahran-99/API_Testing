package API;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

public class Handler implements HttpHandler {
	
		APIconnection connection = new APIconnection();	
		
public void handle(HttpExchange t) throws IOException {
	          String response = connection.getresponse();
	          t.sendResponseHeaders(200, response.length());
	          OutputStream os = t.getResponseBody();
	          os.write(response.getBytes());
	          os.close();
}

}