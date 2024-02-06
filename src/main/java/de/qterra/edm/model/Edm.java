/**
 * 
 */
package de.qterra.edm.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import de.qterra.edm.model.deserialize.DeserializeEdm;
import de.qterra.edm.model.serialize.SerializeEdm;

/**
 * 
 */
@JsonDeserialize(as = DeserializeEdm.class)
// @JsonSerialize(as = SerializeEdm.class)
@JacksonXmlRootElement(localName="OAI-PMH")
@JsonIgnoreProperties(ignoreUnknown = true)
public interface Edm {
  
  /**
   * @return the oaiXmlns
   */
  public String getOaiXmlns();

  /**
   * @return the xsiXmlns
   */
  public String getXsiXmlns();

  /**
   * @return the getRecord
   */
  public OaiMethod getOaiMethod();

  /**
   * @return the xsiSchemaLocation
   */
  public String getXsiSchemaLocation();

  /**
   * @return the responseDate
   */
  public String getResponseDate();

  public void setResponseDate(String rDate);

  /**
   * @param oMethod the oMethod to set
   */
  public void setOaiMethod(OaiMethod oaiMethod);

}
