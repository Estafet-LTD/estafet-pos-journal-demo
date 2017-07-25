package model;

import java.util.Date;

public class POSJournal {
    private String commissionOperator;

    private String name;

    private float quantity;

    private Date dateTime;

    private int commissionOperatorID;

    private float price;

    private int iD;

    private String siteName;

    private int siteID;

    public String getCommissionOperator ()
    {
        return commissionOperator;
    }

    public void setCommissionOperator (String commissionOperator)
    {
        this.commissionOperator = commissionOperator;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public float getQuantity ()
    {
        return quantity;
    }

    public void setQuantity (float quantity)
    {
        this.quantity = quantity;
    }

    public Date getDateTime ()
    {
        return dateTime;
    }

    public void setDateTime (Date dateTime)
    {
        this.dateTime = dateTime;
    }

    public int getCommissionOperatorID ()
    {
        return commissionOperatorID;
    }

    public void setCommissionOperatorID (int commissionOperatorID)
    {
        this.commissionOperatorID = commissionOperatorID;
    }

    public float getPrice ()
    {
        return price;
    }

    public void setPrice (float price)
    {
        this.price = price;
    }

    public int getID ()
    {
        return iD;
    }

    public void setID (int iD)
    {
        this.iD = iD;
    }

    public String getSiteName ()
    {
        return siteName;
    }

    public void setSiteName (String siteName)
    {
        this.siteName = siteName;
    }

    public int getSiteID ()
    {
        return siteID;
    }

    public void setSiteID (int siteID)
    {
        this.siteID = siteID;
    }

    @Override
    public String toString()
    {
        return "POSJournal2 [commissionoperatorMike = "+commissionOperator+", name = "+name+", quantity = "+quantity+", dateTime = "+dateTime+", commissionoperatorID = "+commissionOperatorID+", price = "+price+", id = "+iD+", siteName = "+siteName+", siteID = "+siteID+"]";
    }
}
		