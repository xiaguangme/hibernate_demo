package org.simonme.demo.hibernate.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.simonme.demo.hibernate.model.TestBean;
import org.simonme.demo.hibernate.service.ITestBeanService;
import org.simonme.demo.hibernate.service.impl.TestBeanServiceImpl;


public class DemoServlet extends HttpServlet
{
    
    private final static Logger log = LogManager.getLogger(DemoServlet.class);
    
    static
    {
        log.debug("add jvm shutdown hook");
        Runtime.getRuntime().addShutdownHook(new Thread()
        {

            @Override
            public void run()
            {
                log.debug("--shutdown hook has been ivoked");
                super.run();
            }
            
        });
    }
    
    private ITestBeanService testBeanService = new TestBeanServiceImpl();

    /**
     * 注释内容
     */
    private static final long serialVersionUID = -6362156149329510181L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        String action = req.getParameter("action");
        log.debug("Action is " + action);
        if ("hibernateQueryDemo".equals(action))
        {
            hibernateQueryDemo(req, resp);
        }
    }
    
    protected void hibernateQueryDemo(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        log.debug("Enter the hibernateQueryDemo method");
        List<TestBean> reslut = testBeanService.findAll();
        log.debug(reslut.size());
    }
    
    

}
