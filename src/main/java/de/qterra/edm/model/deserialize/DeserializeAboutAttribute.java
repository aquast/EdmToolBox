/**
 * 
 */
package de.qterra.edm.model.deserialize;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import de.qterra.edm.model.AboutAttribute;

/**
 * 
 */
public class DeserializeAboutAttribute implements AboutAttribute {

  public DeserializeAboutAttribute() {
    
  }
  public DeserializeAboutAttribute(String rdfAbout) {
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
