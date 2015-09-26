package org.simonme.demo.hibernate.service;

import java.util.List;

import org.simonme.demo.hibernate.model.TestBean;

public interface ITestBeanService
{

    public List<TestBean> findAll();
}
