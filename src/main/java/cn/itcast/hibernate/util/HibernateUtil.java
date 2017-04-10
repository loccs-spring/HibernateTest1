package cn.itcast.hibernate.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by spring on 2017/4/10.
 */
final public class HibernateUtil {
    private static SessionFactory sessionFactory;
    private HibernateUtil () {

    }
    static {
        Configuration cfg = new Configuration();
        // System.out.println("");
        cfg.configure();
        sessionFactory = cfg.buildSessionFactory();

    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public static Session getSession() {
        return sessionFactory.openSession();
    }
}
