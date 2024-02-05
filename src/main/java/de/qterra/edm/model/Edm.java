/**
 * 
 */
package de.qterra.edm.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/**
 * 
 */
@JacksonXmlRootElement(localName="OAI-PMH")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Edm {
  
  public Edm() {
    // oaiMethod = new OaiMethod("ListRecords");

  }

  private final String oaiXmlns = "http://www.openarchives.org/OAI/2.0/"; 
  private final String xsiXmlns = "http://www.w3.org/2001/XMLSchema-instance"; 
  private final String xsiSchemaLocation = "http://www.openarchives.org/OAI/2.0/ http://www.openarchives.org/OAI/2.0/OAI-PMH.xsd"; 
  private String ResponseDate = null; 

  @JacksonXmlProperty(localName="ListRecords")
  private OaiMethod oaiMethod = new OaiMethod("ListRecords");

  /**
   * @return the oaiXmlns
   */
  @JacksonXmlProperty(localName="xmlns", isAttribute = true)
  public String getOaiXmlns() {
    return oaiXmlns;
  }

  /**
   * @return the xsiXmlns
   */
  @JacksonXmlProperty(localName="xmlns:xsi", isAttribute = true)
  public String getXsiXmlns() {
    return xsiXmlns;
  }

  /**
   * @return the getRecord
   */
  @JacksonXmlProperty(localName="ListRecords")
  public OaiMethod getOaiMethod() {
    return oaiMethod;
  }

  /**
   * @return the xsiSchemaLocation
   */
  @JacksonXmlProperty(localName="xsi:schemaLocation", isAttribute = true)
  public String getXsiSchemaLocation() {
    return xsiSchemaLocation;
  }

  /**
   * @return the responseDate
   */
  @JacksonXmlProperty(localName="responseDate")
  public String getResponseDate() {
    return ResponseDate;
  }

  @JacksonXmlProperty(localName="responseDate")
  public void setResponseDate(String rDate) {
    this.ResponseDate = rDate;
  }



  /**
   * @param oMethod the oMethod to set
   */
  @JacksonXmlProperty(localName="ListRecords")
  public void setOaiMethod(OaiMethod oaiMethod) {
    this.oaiMethod = oaiMethod;
  }

}
