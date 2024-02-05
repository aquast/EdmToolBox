/**
 * 
 */
package de.qterra.edm.model.deserialize;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import de.qterra.edm.model.Aggregation;
import de.qterra.edm.model.ResourceAttribute;

/**
 * 
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class DeserializeAggregation implements Aggregation {

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
  public ResourceAttribute getEdmAggregatedCHO() {
    return aggregatedCHO;
  }

  /**
   * @return the provider
   */
  public String getEdmProvider() {
    return provider;
  }

  /**
   * @return the dataProvider
   */
  @JacksonXmlProperty(localName = "dataProvider")
  public String getEdmDataProvider() {
    return dataProvider;
  }

  /**
   * @return the isShownBy
   */
  public ResourceAttribute getEdmIsShownBy() {
    return isShownBy;
  }

  /**
   * @return the isShownAt
   */
  public String getEdmIsShownAt() {
    return isShownAt;
  }

  /**
   * @return the object
   */
  public ResourceAttribute getEdmObject() {
    return object;
  }

  /**
   * @return the rights
   */
  public ResourceAttribute getEdmRights() {
    return rights;
  }

  /**
   * @param aggregatedCHO the aggregatedCHO to set
   */
   @JacksonXmlProperty(localName = "aggregatedCHO")
   @Override
   public void setEdmAggregatedCHO(ResourceAttribute aggregatedCHO) {
    this.aggregatedCHO = aggregatedCHO;
  }

  /**
   * @param provider the provider to set
   */
   @Override
   @JacksonXmlProperty(localName = "provider")
  public void setEdmProvider(String provider) {
    this.provider = provider;
  }

  /**
   * @param dataProvider the dataProvider to set
   */
   @Override
  @JacksonXmlProperty(localName = "dataProvider")
  public void setEdmDataProvider(String dataProvider) {
    this.dataProvider = dataProvider;
  }

  /**
   * @param isShownBy the isShownBy to set
   */
   @Override
   @JacksonXmlProperty(localName = "isShownBy")
   public void setEdmIsShownBy(ResourceAttribute isShownBy) {
    this.isShownBy = isShownBy;
  }

  /**
   * @param isShownAt the isShownAt to set
   */
   @Override
   @JacksonXmlProperty(localName = "isShownAt")
  public void setEdmIsShownAt(String isShownAt) {
    this.isShownAt = isShownAt;
  }

  /**
   * @param object the object to set
   */
   @Override
   @JacksonXmlProperty(localName = "object")
  public void setEdmObject( ResourceAttribute object) {
    this.object = object;
  }

  /**
   * @param rights the rights to set
   */
   @Override
   @JacksonXmlProperty(localName = "rights")
  public void setEdmRights( ResourceAttribute rights) {
    this.rights = rights;
  }
  
  /**
   * @param resource the resource to set
   */
   @Override
  @JacksonXmlProperty(localName = "about", isAttribute = true)
  public void setEdmAboutCHOResource(String CHOAbout) {
    this.cHOAbout = CHOAbout;
  }

}







