
package generated_1497953965160;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Item">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="SiteID" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                   &lt;element name="SiteName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="CommissionOperatorID" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                   &lt;element name="CommissionOperator" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="DateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                   &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Price" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *                   &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "item"
})
@XmlRootElement(name = "POSJournal")
public class POSJournal {

    @XmlElement(name = "Item", required = true)
    protected POSJournal.Item item;

    /**
     * Gets the value of the item property.
     * 
     * @return
     *     possible object is
     *     {@link POSJournal.Item }
     *     
     */
    public POSJournal.Item getItem() {
        return item;
    }

    /**
     * Sets the value of the item property.
     * 
     * @param value
     *     allowed object is
     *     {@link POSJournal.Item }
     *     
     */
    public void setItem(POSJournal.Item value) {
        this.item = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="SiteID" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *         &lt;element name="SiteName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="CommissionOperatorID" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *         &lt;element name="CommissionOperator" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="DateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Price" type="{http://www.w3.org/2001/XMLSchema}float"/>
     *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "siteID",
        "siteName",
        "commissionOperatorID",
        "commissionOperator",
        "dateTime",
        "id",
        "name",
        "price",
        "quantity"
    })
    public static class Item {

        @XmlElement(name = "SiteID")
        protected byte siteID;
        @XmlElement(name = "SiteName", required = true)
        protected String siteName;
        @XmlElement(name = "CommissionOperatorID")
        protected byte commissionOperatorID;
        @XmlElement(name = "CommissionOperator", required = true)
        protected String commissionOperator;
        @XmlElement(name = "DateTime", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar dateTime;
        @XmlElement(name = "ID")
        protected byte id;
        @XmlElement(name = "Name", required = true)
        protected String name;
        @XmlElement(name = "Price")
        protected float price;
        @XmlElement(name = "Quantity")
        protected byte quantity;

        /**
         * Gets the value of the siteID property.
         * 
         */
        public byte getSiteID() {
            return siteID;
        }

        /**
         * Sets the value of the siteID property.
         * 
         */
        public void setSiteID(byte value) {
            this.siteID = value;
        }

        /**
         * Gets the value of the siteName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSiteName() {
            return siteName;
        }

        /**
         * Sets the value of the siteName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSiteName(String value) {
            this.siteName = value;
        }

        /**
         * Gets the value of the commissionOperatorID property.
         * 
         */
        public byte getCommissionOperatorID() {
            return commissionOperatorID;
        }

        /**
         * Sets the value of the commissionOperatorID property.
         * 
         */
        public void setCommissionOperatorID(byte value) {
            this.commissionOperatorID = value;
        }

        /**
         * Gets the value of the commissionOperator property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCommissionOperator() {
            return commissionOperator;
        }

        /**
         * Sets the value of the commissionOperator property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCommissionOperator(String value) {
            this.commissionOperator = value;
        }

        /**
         * Gets the value of the dateTime property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDateTime() {
            return dateTime;
        }

        /**
         * Sets the value of the dateTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDateTime(XMLGregorianCalendar value) {
            this.dateTime = value;
        }

        /**
         * Gets the value of the id property.
         * 
         */
        public byte getID() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         */
        public void setID(byte value) {
            this.id = value;
        }

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * Gets the value of the price property.
         * 
         */
        public float getPrice() {
            return price;
        }

        /**
         * Sets the value of the price property.
         * 
         */
        public void setPrice(float value) {
            this.price = value;
        }

        /**
         * Gets the value of the quantity property.
         * 
         */
        public byte getQuantity() {
            return quantity;
        }

        /**
         * Sets the value of the quantity property.
         * 
         */
        public void setQuantity(byte value) {
            this.quantity = value;
        }

    }

}
