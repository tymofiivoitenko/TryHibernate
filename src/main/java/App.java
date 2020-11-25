import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import org.hibernate.service.spi.SessionFactoryServiceRegistryBuilder;

public class App {

    public static void main(String[] args) {
        Alien newAlien = new Alien();

        newAlien.setId(200);
        newAlien.setAname("Masha");
        newAlien.setColour("u");


        Configuration cfg=new Configuration().configure().addAnnotatedClass(Alien.class);
        StandardServiceRegistryBuilder builder= new StandardServiceRegistryBuilder().applySettings(
                cfg.getProperties());
        SessionFactory sessionFactory = cfg.buildSessionFactory(builder.build());

        Session session = sessionFactory.openSession();

        Transaction tx = session.beginTransaction();
        //session.save(newAlien);

       Alien fetchedAlien = (Alien) session.get(Alien.class, 200);
        System.out.println(fetchedAlien);
        tx.commit();
    }
}
