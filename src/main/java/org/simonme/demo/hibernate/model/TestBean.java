package org.simonme.demo.hibernate.model;

import java.util.Date;

public class TestBean
{

    private Long id;
     
    private String name;
    
    private String desciption;
    
    private Date updateDate;
    
    private Long testLong = 0l;

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getDesciption()
    {
        return desciption;
    }

    public void setDesciption(String desciption)
    {
        this.desciption = desciption;
    }

    public Date getUpdateDate()
    {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate)
    {
        this.updateDate = updateDate;
    }

    public long getTestLong()
    {
        return testLong;
    }

    public void setTestLong(Long testLong)
    {
        this.testLong = testLong;
    }

    @Override
    public String toString()
    {
        return "TestBean [id=" + id + ", name=" + name + ", desciption=" + desciption + ", updateDate=" + updateDate
                + ", testLong=" + testLong + "]";
    }
}
