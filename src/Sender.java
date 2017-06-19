import com.google.gson.Gson;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import ticket.Message;
import ticket.Ticket;

import java.io.IOException;

/**
 * Created by Kamil on 28.05.2017.
 */
public class Sender {

    static Client client = Client.create();
    public static void send(Message message) throws IOException {

        WebResource webResource = client
                .resource("http://localhost:8080/Glowny/info/message/newMessage");


        Gson gson = new Gson();
        String string = gson.toJson(message);
        System.out.println(string);
        client.setFollowRedirects(false);
        ClientResponse resp = webResource.type("application/json").post(ClientResponse.class, string);


    }
}
