/*
 * 文 件 名:  ITestBeanDao.java
 * 版    权:   . Copyright 2008-2015,  All rights reserved Hiaward Information Technology Co.,Ltd.
 * 描    述:  <描述>
 * 修 改 人:  Chenxiaguang
 * 修改时间:  2015-9-25
 */
package org.simonme.demo.hibernate.dao;

import java.util.List;

import org.simonme.demo.hibernate.model.TestBean;

/**
 * <一句话功能简述>
 * <功能详细描述>
 * 
 * @author  Chenxiaguang
 * @version  [版本号, 2015-9-25]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public interface ITestBeanDao
{
    public List<TestBean> findAll();
}
