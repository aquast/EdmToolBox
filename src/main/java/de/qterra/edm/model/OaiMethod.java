/**
 * 
 */
package de.qterra.edm.model;

import java.util.ArrayList;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import de.qterra.edm.model.deserialize.DeserializeOaiMethod;
import de.qterra.edm.model.serialize.SerializeOaiMethod;
/**
 * 
 */
@JsonDeserialize(as = DeserializeOaiMethod.class)
// @JsonSerialize(as = SerializeOaiMethod.class)
public interface OaiMethod {
  
  /**
   * @return the record element
   */
  public ArrayList<? extends OaiRecord> getRecord();

  /**
   * @param record the record to set
   */
  public void setRecord(ArrayList<? extends OaiRecord> record);
  
}
