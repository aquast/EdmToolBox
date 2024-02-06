/**
 * 
 */
package de.qterra.edm.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import de.qterra.edm.model.deserialize.DeserializeAboutAttribute;
import de.qterra.edm.model.serialize.SerializeAboutAttribute;

/**
 * 
 */
@JsonDeserialize(as = DeserializeAboutAttribute.class)
@JsonSerialize(as = SerializeAboutAttribute.class)
public interface AboutAttribute {

  /**
   * @return the rdfAbout
   */
  public String getRdfAbout();

  /**
   * @param rdfAbout the rdfAbout to set
   */
  public void setRdfAbout(String rdfAbout);
  
  
  
  
}
