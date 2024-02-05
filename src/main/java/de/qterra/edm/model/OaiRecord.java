/**
 * 
 */
package de.qterra.edm.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * 
 */
public class OaiRecord {

  @JacksonXmlProperty(localName="header")
  private OaiHeader header = new OaiHeader();
  private OaiMetadata metadata = new OaiMetadata();

  /**
   * @return the metadata
   */
  @JacksonXmlProperty(localName="metadata")
  public OaiMetadata getMetadata() {
    return metadata;
  }
  
  

  /**
   * @param metadata the metadata to set
   */
  @JacksonXmlProperty(localName="metadata")
  public void setMetadata(OaiMetadata metadata) {
    this.metadata = metadata;
  }
  
  
}
