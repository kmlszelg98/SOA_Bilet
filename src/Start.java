import ticket.TicketBox;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 * Created by Kamil on 22.05.2017.
 */

@ApplicationPath("/start")
public class Start extends Application {

    public static final TicketBox box = new TicketBox();
}
