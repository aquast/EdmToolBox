/**
 * 
 */
package de.qterra.edm.model;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * 
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Aggregation {

  private ResourceAttribute aggregatedCHO = null;
  
  private String provider = "Digitales Archiv Nordrhein-Westfalen";
  
  private String dataProvider = new String();

  @JacksonXmlProperty(localName = "isShownBy")
  private ResourceAttribute isShownBy = null;

  @JacksonXmlProperty(localName = "isShownAt")
  private String isShownAt = null;

  @JacksonXmlProperty(localName = "object")
  private ResourceAttribute object = null;
  
  @JacksonXmlProperty(localName = "rights")
  private ResourceAttribute rights = null;

  @JacksonXmlProperty(localName = "rdf:about", isAttribute = true)
  private String cHOAbout = generateUuid();

  private String generateUuid() {
    UUID uuid = UUID.randomUUID();
    return uuid.toString();
  }


  
  
  
  /**
   * @return the aggregatedCHO
   */
  @JacksonXmlProperty(localName = "aggregatedCHO")
  public ResourceAttribute getAggregatedCHO() {
    return aggregatedCHO;
  }

  /**
   * @return the provider
   */
  public String getProvider() {
    return provider;
  }

  /**
   * @return the dataProvider
   */
  @JacksonXmlProperty(localName = "dataProvider")
  public String getDataProvider() {
    return dataProvider;
  }

  /**
   * @return the isShownBy
   */
  public ResourceAttribute getIsShownBy() {
    return isShownBy;
  }

  /**
   * @return the isShownAt
   */
  public String getIsShownAt() {
    return isShownAt;
  }

  /**
   * @return the object
   */
  public ResourceAttribute getObject() {
    return object;
  }

  /**
   * @return the rights
   */
  public ResourceAttribute getRights() {
    return rights;
  }

  /**
   * @param aggregatedCHO the aggregatedCHO to set
   */
   @JacksonXmlProperty(localName = "aggregatedCHO")
   public void setAggregatedCHO(ResourceAttribute aggregatedCHO) {
    this.aggregatedCHO = aggregatedCHO;
  }

  /**
   * @param provider the provider to set
   */
  public void setProvider(String provider) {
    this.provider = provider;
  }

  /**
   * @param dataProvider the dataProvider to set
   */
  @JacksonXmlProperty(localName = "dataProvider")
  public void setDataProvider(String dataProvider) {
    this.dataProvider = dataProvider;
  }

  /**
   * @param isShownBy the isShownBy to set
   */
  public void setIsShownBy(ResourceAttribute isShownBy) {
    this.isShownBy = isShownBy;
  }

  /**
   * @param isShownAt the isShownAt to set
   */
  public void setIsShownAt(String isShownAt) {
    this.isShownAt = isShownAt;
  }

  /**
   * @param object the object to set
   */
  public void setObject( ResourceAttribute object) {
    this.object = object;
  }

  /**
   * @param rights the rights to set
   */
  public void setRights( ResourceAttribute rights) {
    this.rights = rights;
  }
  
  /**
   * @param resource the resource to set
   */
  @JacksonXmlProperty(localName = "rdf:about", isAttribute = true)
  public void setAboutChoResource(String CHOAbout) {
    this.cHOAbout = CHOAbout;
  }
  



}
