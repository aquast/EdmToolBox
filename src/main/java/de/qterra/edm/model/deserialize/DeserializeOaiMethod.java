/**
 * 
 */
package de.qterra.edm.model.deserialize;

import java.util.ArrayList;
import java.util.Iterator;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import de.qterra.edm.model.OaiMethod;
import de.qterra.edm.model.OaiRecord;

/**
 * 
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class DeserializeOaiMethod implements OaiMethod{
  
  public DeserializeOaiMethod () {
    
  }

  //public DeserializeOaiMethod(String methodName) {
   // if(oaiRecord == null) {
   //   oaiRecord = new ArrayList<DeserializeOaiRecord>();
   // }
   // oaiRecord.add(new DeserializeOaiRecord());
  
  //}

  
  @JacksonXmlProperty(localName="record")
  @JacksonXmlElementWrapper(useWrapping = false)
  private ArrayList<OaiRecord> oaiRecord = new ArrayList<>();

  
  /**
   * @return the oaiRecord element
   */
  @JacksonXmlProperty(localName="record")
  public ArrayList<OaiRecord> getRecord() {
    return oaiRecord;
  }

  /**
   * @param oaiRecord the oaiRecord to set
   */
  @JacksonXmlProperty(localName="record")
  public void setRecord(ArrayList<OaiRecord> oaiRecord) {
    this.oaiRecord = oaiRecord;
    
  }



}
