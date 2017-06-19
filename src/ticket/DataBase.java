package ticket;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

import javax.persistence.metamodel.EntityType;
import javax.persistence.metamodel.Metamodel;
import java.util.ArrayList;

//import org.hibernate.query.Query;


public class DataBase {

    private static SessionFactory sessionFactory;
    private static Session session;
    private static ArrayList<Ticket> list = new ArrayList<>();
    private static Transaction transaction;

    public DataBase(){
        generate();
    }

    public void generate(){

        try {
            Configuration configuration = new Configuration();
            configuration.configure();

            sessionFactory = configuration.buildSessionFactory();
            session = getSession();

            final Metamodel metamodel = session.getSessionFactory().getMetamodel();
            for (EntityType<?> entityType : metamodel.getEntities()) {
                final String entityName = entityType.getName();
                final Query query = session.createQuery("from Ticket ");
                for (Object o : query.list()) {
                    list.add((Ticket)o);
                }
            }


        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }



    public void finish(){
        if(session!=null && session.isOpen()) session.close();
    }

    public void add(Ticket klient){
        transaction = session.beginTransaction();
        session.save(klient);
        transaction.commit();
        list.add(klient);
    }

    public void remove(Ticket klient){
        transaction = session.beginTransaction();
        session.delete(klient);
        transaction.commit();
        list.remove(klient);
    }

    public void update(Ticket klient){
        transaction = session.beginTransaction();
        session.update(klient);
        transaction.commit();

    }

    public static Session getSession() throws HibernateException {
        return sessionFactory.openSession();
    }

    public static ArrayList<Ticket> getList() {
        return list;
    }
}
