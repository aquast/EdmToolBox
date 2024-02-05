package de.qterra.edm.model;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JsonIgnoreProperties(ignoreUnknown = true)  
@JacksonXmlRootElement(localName="rdf:RDF")
public interface Rdf {

  /**
   * @return the rdfXmlns
   */
  public String getRdfXmlns();

  /**
   * @return the edmXmlns
   */
  public String getEdmXmlns();

  /**
   * @return the oreXmlns
   */
  public String getOreXmlns();

  /**
   * @return the dcXmlns
   */
  public String getDcXmlns();

  /**
   * @return the dctermsXmlns
   */
  public String getDctermsXmlns();

  /**
   * @param aggregation the aggregation to set
   */
  public void addAggregation(Aggregation aggregation);

  /**
   * @return the providedCHO
   */
  public ProvidedCHO getProvidedCho();

  /**
   * @return the aggregation
   */
  public ArrayList<Aggregation> getAggregation();

  /**
   * @param aggregation the aggregation to set
   */
  public void setAggregation(ArrayList<Aggregation> aggregation);

  /**
   * @param providedCHO the providedCHO to set
   */
  public void setProvidedCho(ProvidedCHO providedCHO);
  

}
