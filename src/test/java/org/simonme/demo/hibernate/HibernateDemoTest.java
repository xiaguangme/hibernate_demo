package org.simonme.demo.hibernate;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.Before;
import org.junit.Test;
import org.simonme.demo.hibernate.model.TestBean;

/**
 * <一句话功能简述>
 * <功能详细描述>
 * 
 * @author  Chenxiaguang
 * @version  [版本号, 2015-9-23]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public class HibernateDemoTest
{

    private SessionFactory sessionFactory;

    @Before
    public void setUp() throws Exception
    {
        
     // hibernate 5.x测试
        // A SessionFactory is set up once for an application!
//        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure() // configures settings from hibernate.cfg.xml
//        .build();
//        try
//        {
//            sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
//        }
//        catch (Exception e)
//        {
//            e.printStackTrace();
//            // The registry would be destroyed by the SessionFactory, but we had trouble building the SessionFactory
//            // so destroy it manually.
//            StandardServiceRegistryBuilder.destroy(registry);
//        }
        
//        hiberate3.0
        Configuration configuration = new Configuration();
        configuration.configure("/hibernate.cfg.xml");
        sessionFactory = configuration.buildSessionFactory();
    }

    @Test
    public void testSave()
    {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        TestBean testBean = new TestBean();
        testBean.setDesciption("hahahha_from_demo");
        testBean.setUpdateDate(new Date());
        testBean.setName("test_demo");
        session.save(testBean);
        session.getTransaction().commit();
        session.close();
    }
}
