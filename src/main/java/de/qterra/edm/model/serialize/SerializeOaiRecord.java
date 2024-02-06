/**
 * 
 */
package de.qterra.edm.model.serialize;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import de.qterra.edm.model.OaiHeader;
import de.qterra.edm.model.OaiRecord;
import de.qterra.edm.model.OaiMetadata;

/**
 * 
 */
public class SerializeOaiRecord implements OaiRecord{

  @JacksonXmlProperty(localName="header")
  private OaiHeader header = new OaiHeader();
  private OaiMetadata metadata = new SerializeOaiMetadata();

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
    this.metadata = (SerializeOaiMetadata) metadata;
  }
  
  
}
