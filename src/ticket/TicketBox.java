package ticket;

import java.util.ArrayList;

/**
 * Created by Kamil on 23.05.2017.
 */

public class TicketBox {

    public static final DataBase base = new DataBase();
    private ArrayList<Ticket> list = new ArrayList<>();
    private ArrayList<Ticket> disabled = new ArrayList<>();
    private ArrayList<Ticket> all = new ArrayList<>();

    private int a1,a2,a3;

    public TicketBox(){

    }

    public ArrayList<Ticket> getList() {
        return list;
    }

    public ArrayList<Ticket> getDisabled() {
        return disabled;
    }

    public ArrayList<Ticket> getAll() {return all; }

    public void newTicket(Ticket ticket) {
        list.add(ticket);
        all.add(ticket);
        System.out.println(ticket);
        switch (ticket.getStrefa()){
            case 1: {
                a1++;
                break;
            }
            case 2:{
                a2++;
                break;
            }
            case 3:{
                a3++;
                break;
            }
        }
        base.add(ticket);
    }

    public void remove(Ticket t){
        list.remove(t);
        //all.remove(t);
        disabled.add(t);
        switch (t.getStrefa()){
            case 1: {
                a1--;
                break;
            }
            case 2:{
                a2--;
                break;
            }
            case 3:{
                a3--;
                break;
            }
        }
    }

    public ArrayList<Integer> getNumber(){
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(a1);
        arrayList.add(a2);
        arrayList.add(a3);
        return arrayList;
    }

}
