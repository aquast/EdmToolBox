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
public class OaiMethod {
  
  public OaiMethod() {
    
  }

  public OaiMethod(String methodName) {
    record.add(new OaiRecord());
  
  }

  
  @JacksonXmlProperty(localName="record")
  @JacksonXmlElementWrapper(useWrapping = false)
  private ArrayList<OaiRecord> record = new ArrayList<>();

  
  /**
   * @return the record element
   */
  @JacksonXmlProperty(localName="record")
  public ArrayList<OaiRecord> getRecord() {
    return record;
  }

  /**
   * @param record the record to set
   */
  @JacksonXmlProperty(localName="record")
  public void setRecord(ArrayList<OaiRecord> record) {
    this.record = record;
  }



}
