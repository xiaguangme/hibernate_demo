package org.simonme.demo.hibernate.service.impl;

import java.util.List;

import org.simonme.demo.hibernate.dao.ITestBeanDao;
import org.simonme.demo.hibernate.dao.impl.TestBeanDaoImpl;
import org.simonme.demo.hibernate.model.TestBean;
import org.simonme.demo.hibernate.service.ITestBeanService;

public class TestBeanServiceImpl implements ITestBeanService
{

    private ITestBeanDao testBeanDao;
    
    public TestBeanServiceImpl()
    {
        testBeanDao = new TestBeanDaoImpl();
    }
    
    public List<TestBean> findAll()
    {
        return testBeanDao.findAll();
    }

}
