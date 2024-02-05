/**
 * 
 */
package de.qterra.edm.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * 
 */
@JsonIgnoreProperties(ignoreUnknown = true)  
public class OaiMetadata {

  @JacksonXmlProperty(localName="RDF")
  private Rdf rdf = new Rdf();

  /**
   * @return the rdf
   */
  @JacksonXmlProperty(localName="RDF")
  public Rdf getRdf() {
    return rdf;
  }

  /**
   * @param rdf the rdf to set
   */
  @JacksonXmlProperty(localName="RDF")
  public void setRdf(Rdf rdf) {
    this.rdf = rdf;
  }
  

}
