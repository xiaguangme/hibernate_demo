package org.simonme.demo.hibernate.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.simonme.demo.hibernate.dao.ITestBeanDao;
import org.simonme.demo.hibernate.model.TestBean;

public class TestBeanDaoImpl implements ITestBeanDao
{

    private SessionFactory sessionFactory;
    
    public TestBeanDaoImpl()
    {
        try
        {
            this.setUp();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public void setUp()
    {
        
        // hibernate 5.x测试
//        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure() // configures settings from hibernate.cfg.xml
//        .build();
//        try
//        {
//            sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
//        }
//        catch (Exception e)
//        {
//            e.printStackTrace();
//            StandardServiceRegistryBuilder.destroy(registry);
//        }
        
        // hibrenate3.x版本测试代码
//      hiberate3.0
      Configuration configuration = new Configuration();
      configuration.configure("/hibernate.cfg.xml");
      sessionFactory = configuration.buildSessionFactory();
        
    }

    @SuppressWarnings("unchecked")
    public List<TestBean> findAll()
    {
        List<TestBean> result = null;
        Session session = sessionFactory.openSession();
        try
        {
            result = (List<TestBean>)session.createQuery("from TestBean").list();
        }
        finally
        {
            session.close();    
        }
        return result;
    }

}
