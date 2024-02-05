/**
 * 
 */
package de.qterra.edm.model;

import java.util.ArrayList;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * 
 */
public interface OaiMethod {
  
  /**
   * @return the record element
   */
  public ArrayList<OaiRecord> getRecord();

  /**
   * @param record the record to set
   */
  public void setRecord(ArrayList<OaiRecord> record);
  
}
