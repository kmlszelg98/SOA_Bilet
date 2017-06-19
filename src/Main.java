import com.google.gson.Gson;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import org.hibernate.HibernateException;
import org.hibernate.Metamodel;
import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ticket.Message;
import ticket.Ticket;

import javax.persistence.metamodel.EntityType;

import java.io.IOException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Map;

/**
 * Created by Kamil on 28.05.2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        LocalDateTime time1 = LocalDateTime.now();
        Timestamp time11 = Timestamp.valueOf(time1);

        Message message = new Message("content",1);
        Sender sender = new Sender();
        sender.send(message);
    }
}