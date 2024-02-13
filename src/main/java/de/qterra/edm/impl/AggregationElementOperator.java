package de.qterra.edm.impl;

import java.util.ArrayList;
import java.util.Hashtable;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import de.qterra.edm.model.Aggregation;
import de.qterra.edm.model.Rdf;
import de.qterra.edm.model.ResourceAttribute;
import de.qterra.edm.model.WebResource;
import de.qterra.edm.model.deserialize.DeserializeResourceAttribute;
import de.qterra.edm.model.serialize.SerializeRdf;

/**
 * A Class to replace Element values and attributes within the EDM Aggregation Core Element. 
 * The class operates on a complete EDM Object (embraced by root element <rdf:RDF>) in order
 * to cover necessary dependencies at EDM WebResources Core Element.
 *     
 */
public class AggregationElementOperator {
  //TODO: Implement all operations on the data you wish to have ;-)
  final static Logger logger = LogManager.getLogger(AggregationElementOperator.class);

  /**
   * Constructor takes deserialized EDM metadata (as Rdf object).  
   * @param rdf
   */
  public  AggregationElementOperator(Rdf rdf) {
    this.rdf = rdf;
  }
  
  /**
   * Constructor takes absolute file Path to serialized EDM.xml.  
   * @param filePath
   */
  public  AggregationElementOperator(String filePath) {
    this.edmImpl.setFilePath(filePath);
    rdf = edmImpl.deserializeXml();
  }

  
  private EdmImpl edmImpl = new EdmImpl();
  private Rdf rdf = null; 
  
  /**
   * Replace content of Attributes rdf:resource within all <edm:isShownBy> child elements. 
   * @param replacement
   */
  public void replaceAllIsShownBy(ArrayList<String> replacement) {
    Hashtable<String, String> replaceTable = new Hashtable<>();
    ArrayList<? extends Aggregation> aggregation = rdf.getAggregation();
    
    if(replacement.size() == aggregation.size()) {
      for(int i = 0; i < aggregation.size(); i++) {
        replaceTable.put(aggregation.get(i).getEdmIsShownBy().getRdfResource(),replacement.get(i));
        logger.info(aggregation.get(i).getEdmIsShownBy().getRdfResource() + ", " + replacement.get(i));
        aggregation.get(i).getEdmIsShownBy().setRdfResource(replacement.get(i));
        
      }
    }
    ArrayList<? extends WebResource> webResource = rdf.getWebResource();
    if(replacement.size() == webResource.size()) {
      for(int i = 0; i < webResource.size(); i++) {
        if(webResource.get(i).getEdmIsNextInSequence().getRdfResource() != null ){
          logger.info(webResource.get(i).getEdmIsNextInSequence().getRdfResource());
          String key = webResource.get(i).getEdmIsNextInSequence().getRdfResource();
          webResource.get(i).setEdmIsNextInSequence(new DeserializeResourceAttribute(key));
          logger.info(replaceTable.get(webResource.get(i).getEdmIsNextInSequence().getRdfResource()));
        };
        webResource.get(i).setWebResourceAbout(replacement.get(i));
        
      }
    }
  }

  /**
   * Replace content of Attributes rdf:resource within all <edm:isShownAt> child elements. 
   * @param replacement
   */
  public void replaceAllIsShownAt(ArrayList<String> replacement) {
    ArrayList<? extends Aggregation> aggregation = rdf.getAggregation();
    if(replacement.size() == aggregation.size()) {
      for(int i = 0; i < aggregation.size(); i++) {
        aggregation.get(i).getEdmIsShownAt().setRdfResource(replacement.get(i));
      }
    }
  }
  
  /**
   * Replace value of Attribute rdf:resource within one dedicated <edm:isShownBy> child element. 
   * @param c
   * @param value 
   */
  public void replaceIsShownBy(int c, String value) {
    ArrayList<? extends Aggregation> aggregation = rdf.getAggregation();
    if(c < aggregation.size()) {
        aggregation.get(c).getEdmIsShownBy().setRdfResource(value);
      }
    }
  

  /**
   * return complete EDM metadata as serialization to String
   */
  @Override
  public String toString() {
    XmlMapper xmlMapper = new XmlMapper();
    String xml = null;
    try {
      xmlMapper.writerFor(SerializeRdf.class);
      xml = xmlMapper.writerWithDefaultPrettyPrinter().writeValueAsString(rdf);
    } catch (JsonProcessingException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

    return xml;
  }
  
}
