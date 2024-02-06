/**
 * 
 */
package de.qterra.edm.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import de.qterra.edm.model.deserialize.DeserializeOaiRecord;
import de.qterra.edm.model.serialize.SerializeOaiRecord;

/**
 * 
 */
@JsonDeserialize(as = DeserializeOaiRecord.class)
// @JsonSerialize(as = SerializeOaiRecord.class)
public interface OaiRecord {

   /**
   * @return the metadata
   */
  public OaiMetadata getMetadata();
  
 
  /**
   * @param metadata the metadata to set
   */
  public void setMetadata(OaiMetadata metadata);
  
}
