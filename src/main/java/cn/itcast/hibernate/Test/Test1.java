package cn.itcast.hibernate.Test;

/**
 * Created by spring on 2017/4/10.
 */


import cn.itcast.hibernate.domain.User;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

import cn.itcast.hibernate.util.HibernateUtil;

import java.util.Date;


public class Test1 {


    public void addUser(User user) {
        Session s = null;
        Transaction tx = null;
        try {
             s = HibernateUtil.getSession();
             tx = s.beginTransaction();
             s.save(user);
             tx.commit();
        } catch(HibernateException e) {
            if(tx != null) {
                tx.rollback();
            }
            throw e;
        } finally {
            if (s!=null) {
                s.close();
            }
        }
    }
    @Test
    public void test2() {
        User user = new User();
        user.setBirthday(new Date());
        user.setName("name22");
        addUser(user);
        System.out.println(user.getId());
    }
    @Test
    public void test1() {
        Session s = HibernateUtil.getSession();
        Transaction tx = s.beginTransaction();

        User user  = new User();

        user.setBirthday(new Date());
        user.setName("name");

        s.save(user);
        tx.commit();

        s.close();


    }
}
