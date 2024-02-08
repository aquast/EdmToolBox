/**
 * 
 */
package de.qterra.edm.impl;

import de.qterra.edm.model.Rdf;

/**
 * 
 */
public class EdmImpl {
  
  
  public EdmImpl() {
    
  }
  
  public EdmImpl(String filePath) {
    this.filePath = filePath;
  }
  
  private String filePath = null; 

      /**
       * @return Rdf
       */
      public Rdf deserializeXml() {
        DeserializeEdmXml dsXml = new DeserializeEdmXml(filePath);
        return dsXml.deserialize();
        
      }

      /**
       * create an XML serialization from Rdf object
       * @param Rdf
       */
      public void serializeXml(Rdf rdf) {
        SerializeEdmXml sXml = new SerializeEdmXml();
        sXml.setEdm(rdf);
        sXml.serialize();    
      }

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
