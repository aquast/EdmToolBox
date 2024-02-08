/**
 * 
 */
package de.qterra.edm.impl;

import java.util.ArrayList;

import de.qterra.edm.model.OaiPmh;
import de.qterra.edm.model.ProvidedCHO;
import de.qterra.edm.model.Aggregation;
import de.qterra.edm.model.OaiRecord;
import de.qterra.edm.model.ResourceAttribute;
import de.qterra.edm.model.serialize.SerializeAggregation;
import de.qterra.edm.model.serialize.SerializeOaiPmh;
import de.qterra.edm.model.serialize.SerializeProvidedCHO;
import de.qterra.edm.model.serialize.SerializeResourceAttribute;

/**
 * 
 */
public class OaiPmhImpl {

  public OaiPmh deserializeXml() {
    DeserializeOaiPmhXml dsXml = new DeserializeOaiPmhXml(filePath);
    return dsXml.deserialize();
    
  }

  public void serializeXml(OaiPmh edm) {
    SerializeOaiPmhXml sXml = new SerializeOaiPmhXml();
    sXml.setEdm(edm);
    sXml.serialize();    
  }
  
  private String filePath = null;
    
  /**
   * @return the filePath
   */
  public String getFilePath() {
    return filePath;
  }

  /**
   * @param filePath the filePath to set
   */
  public void setFilePath(String filePath) {
    this.filePath = filePath;
  }

}
