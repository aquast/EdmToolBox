/**
 * 
 */
package de.qterra.edm.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * 
 */
public class AboutAttribute {

  public AboutAttribute() {
    
  }
  public AboutAttribute(String rdfAbout) {
    this.rdfAbout = rdfAbout;
  }
  
  private String rdfAbout = null;

  /**
   * @return the rdfAbout
   */
  @JacksonXmlProperty(localName = "rdf:about", isAttribute = true)
  public String getRdfAbout() {
    return rdfAbout;
  }

  /**
   * @param rdfAbout the rdfAbout to set
   */
  @JacksonXmlProperty(localName = "rdf:about", isAttribute = true)
  public void setRdfAbout(String rdfAbout) {
    this.rdfAbout = rdfAbout;
  }
  
  
  
  
}
