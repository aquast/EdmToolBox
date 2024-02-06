/**
 * 
 */
package de.qterra.edm.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import de.qterra.edm.model.serialize.SerializeEdm;
import de.qterra.edm.model.Edm;

/**
 * 
 */
public class SerializeXml {

  private Edm edm = new SerializeEdm();
  
  
  public void serialize() {
    XmlMapper xmlMapper = new XmlMapper();
    String xml;
    try {
      xmlMapper.writerFor(SerializeEdm.class);
      xml = xmlMapper.writerWithDefaultPrettyPrinter().writeValueAsString(edm);
      System.out.println(xml);
      
      //System.out.println("XML Desearialzing....");
      //SerializeEdm edm = xmlMapper.readValue(xml, SerializeEdm.class);
      //System.out.println(xmlMapper.writeValueAsString(edm));
    } catch (JsonProcessingException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    }


  /**
   * @return the edm
   */
  public Edm getEdm() {
    return edm;
  }


  /**
   * @param edm the edm to set
   */
  public void setEdm(Edm edm) {
    this.edm = edm;
  }
  

}
