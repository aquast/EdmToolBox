/**
 * 
 */
package de.qterra.edm.model.serialize;

import java.util.ArrayList;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import de.qterra.edm.model.OaiMethod;
import de.qterra.edm.model.OaiRecord;

/**
 * 
 */
public class SerializeOaiMethod implements OaiMethod{
  
  public SerializeOaiMethod () {
    
  }

  public SerializeOaiMethod(String methodName) {
    if(oaiRecord == null) {
      oaiRecord = new ArrayList<OaiRecord>();
    }
    oaiRecord.add(new SerializeOaiRecord());
  
  }

  
  @JacksonXmlProperty(localName="record")
  @JacksonXmlElementWrapper(useWrapping = false)
  private ArrayList<OaiRecord> oaiRecord = null;

  
  /**
   * @return the record element
   */
  @JacksonXmlProperty(localName="record")
  public ArrayList<OaiRecord> getRecord() {
    return oaiRecord;
  }

  /**
   * @param record the record to set
   */
  @JacksonXmlProperty(localName="record")
  public void setRecord(ArrayList<OaiRecord> record) {
    this.oaiRecord = record;
  }



}
