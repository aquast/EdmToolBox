/**
 * 
 */
package de.qterra.edm.model.serialize;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import de.qterra.edm.model.OaiMetadata;
import de.qterra.edm.model.Rdf;



/**
 * 
 */
@JsonIgnoreProperties(ignoreUnknown = true)  
public class SerializeOaiMetadata implements OaiMetadata {

  private Rdf rdf = new SerializeRdf();

  /**
   * @return the rdf
   */
  @JacksonXmlProperty(localName="rdf:RDF")
  public Rdf getRdf() {
    return rdf;
  }

  /**
   * @param rdf the rdf to set
   */
  @Override
   @JacksonXmlProperty(localName="rdf:RDF")
  public void setRdf(Rdf rdf) {
    this.rdf = rdf;
  }

  

}
