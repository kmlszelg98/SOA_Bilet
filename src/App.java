import test.SimulatorService;
import ticket.Ticket;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 * Created by Kamil on 22.05.2017.
 */

@Path("/tickets")
public class App {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Ticket get() {
        return new Ticket();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/all")
    public ArrayList<Ticket> getAll() {
        return Start.box.getAll();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/active")
    public ArrayList<Ticket> getActive() {
        getNumber();
        return  Start.box.getList();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/disabled")
    public ArrayList<Ticket> getDisabled() {
        return Start.box.getDisabled();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/add")
    public void receiveXMLMessage(Ticket message) {
        System.out.println(message.getNumerRejestracyjny());
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/check")
    public ArrayList<Integer> getNumber(){
        ArrayList<Ticket> tickets = Start.box.getAll();
        LocalDateTime time1 = LocalDateTime.now();
        Timestamp time11 = Timestamp.valueOf(time1);
        for (Ticket t:tickets){
            if (time11.after(t.getEndTime())) {
                Start.box.remove(t);
            }
        }
        return Start.box.getNumber();
    }





}
