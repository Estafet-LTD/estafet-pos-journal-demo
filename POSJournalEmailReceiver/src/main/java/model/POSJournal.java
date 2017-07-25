package model;

import java.util.Date;
import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;

@CsvRecord( separator = "," )
public class POSJournal {
	@DataField(pos = 4)
    private String commissionOperator;

	@DataField(pos = 7)
    private String name;

	@DataField(pos = 9)
    private float quantity;

	@DataField(pos = 5, pattern="dd/MM/yyyy")
	private Date dateTime;

	@DataField(pos = 3)
    private int commissionOperatorID;

	@DataField(pos = 8)
    private float price;

	@DataField(pos = 6)
    private int iD;

	@DataField(pos = 2)
    private String siteName;

	@DataField(pos = 1)
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
		