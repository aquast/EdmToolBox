/**
 * 
 */
package de.qterra.edm.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import de.qterra.edm.model.serialize.SerializeRdf;
import de.qterra.edm.model.Rdf;

/**
 * 
 */
public class SerializeEdmXml {

  private Rdf rdf = new SerializeRdf();
  
  
  public void serialize() {
    XmlMapper xmlMapper = new XmlMapper();
    String xml;
    try {
      xmlMapper.writerFor(SerializeRdf.class);
      xml = xmlMapper.writerWithDefaultPrettyPrinter().writeValueAsString(rdf);
      System.out.println(xml);
      
      //System.out.println("XML Desearialzing....");
      //SerializeOaiPmh rdf = xmlMapper.readValue(xml, SerializeOaiPmh.class);
      //System.out.println(xmlMapper.writeValueAsString(rdf));
    } catch (JsonProcessingException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    }


  /**
   * @return the rdf
   */
  public Rdf getEdm() {
    return rdf;
  }


  /**
   * @param rdf the rdf to set
   */
  public void setEdm(Rdf rdf) {
    this.rdf = rdf;
  }
  

}
