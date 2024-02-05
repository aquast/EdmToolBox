/**
 * 
 */
package de.qterra.edm.model.deserialize;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import de.qterra.edm.model.OaiMetadata;
import de.qterra.edm.model.Rdf;

/**
 * 
 */
@JsonIgnoreProperties(ignoreUnknown = true)  
public class DeserializeOaiMetadata implements OaiMetadata {

  @JacksonXmlProperty(localName="RDF")
  private Rdf rdf = null;

  /**
   * @return the rdf
   */
  @Override
  @JacksonXmlProperty(localName="RDF")
  public Rdf getRdf() {
    return rdf;
  }

  /**
   * @param rdf the rdf to set
   */
  @Override
  @JacksonXmlProperty(localName="RDF")
  public void setRdf(Rdf rdf) {
    this.rdf = rdf;
  }
  

}
