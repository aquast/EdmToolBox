/**
 * 
 */
package de.qterra.edm.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * 
 */
public class ResourceAttribute {

  public ResourceAttribute() {
    
  }
  public ResourceAttribute(String rdfResource) {
    this.rdfResource = rdfResource;
  }
  
  private String rdfResource = null;

  /**
   * @return the rdfResource
   */
  @JacksonXmlProperty(localName = "resource", isAttribute = true)
  public String getRdfResource() {
    return rdfResource;
  }

  /**
   * @param rdfResource the rdfResource to set
   */
  @JacksonXmlProperty(localName = "resource", isAttribute = true)
  public void setRdfResource(String rdfResource) {
    this.rdfResource = rdfResource;
  }
  
  
  
  
}
