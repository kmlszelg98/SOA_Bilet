import com.google.gson.Gson;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import ticket.Message;
import ticket.Ticket;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Timestamp;
import java.time.LocalDateTime;

/**
 * Created by Kamil on 24.05.2017.
 */
@WebServlet("/create")
public class Create extends HttpServlet {


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String numer = request.getParameter("numer");
        String rodzaj = request.getParameter("rodzaj");
        String time = request.getParameter("czas");
        String strefa = request.getParameter("strefa");
        int s = Integer.parseInt(strefa);

        LocalDateTime time1 = LocalDateTime.now();
        Timestamp time11 = Timestamp.valueOf(time1);

        int t = Integer.parseInt(time);
        LocalDateTime time2 = time1.plusMinutes(t);

        Timestamp time22 = Timestamp.valueOf(time2);
        Ticket ticket = new Ticket(numer,rodzaj,time11,time22,s);

        System.out.println(Start.box.getAll().size());
        Start.box.newTicket(ticket);

        Message message = new Message("Zakupiono bilet"+ticket.toString(),s);
        Sender sender = new Sender();
        sender.send(message);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
