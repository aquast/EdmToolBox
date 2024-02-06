/**
 * 
 */
package de.qterra.edm.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import de.qterra.edm.model.deserialize.DeserializeOaiMetadata;
import de.qterra.edm.model.serialize.SerializeOaiMetadata;

/**
 * 
 */
@JsonDeserialize(as = DeserializeOaiMetadata.class)
// @JsonSerialize(as = SerializeOaiMetadata.class)
public interface OaiMetadata {

  /**
   * @return the rdf
   */
  public Rdf getRdf();

  /**
   * @param rdf the rdf to set
   */
  public void setRdf(Rdf rdf);
  

}
