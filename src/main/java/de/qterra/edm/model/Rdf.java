package de.qterra.edm.model;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JsonIgnoreProperties(ignoreUnknown = true)  
@JacksonXmlRootElement(localName="rdf:RDF")
public class Rdf {

  private final String rdfXmlns = "http://www.w3.org/1999/02/22-rdf-sysntax-ns#"; 
  private final String edmXmlns = "http://www.europeana.eu/schemas/edm/"; 
  private final String oreXmlns = "http://www.openarchives.org/ore/terms/"; 
  private final String dcXmlns = "http://purl.org/dc/elements/1.1/"; 
  private final String dctermsXmlns = "http://purl.org/dc/terms/"; 
  
  private String testElement = null;

  private ProvidedCHO providedCHO = new ProvidedCHO();
  @JacksonXmlElementWrapper(useWrapping = false)
  private ArrayList<Aggregation> aggregation = new ArrayList<>();
  
  /**
   * @return the rdfXmlns
   */
  @JacksonXmlProperty(localName="xmlns:rdf", isAttribute = true)
  public String getRdfXmlns() {
    return rdfXmlns;
  }

  /**
   * @return the edmXmlns
   */
  @JacksonXmlProperty(localName="xmlns:edm", isAttribute = true)
  public String getEdmXmlns() {
    return edmXmlns;
  }

  /**
   * @return the oreXmlns
   */
  @JacksonXmlProperty(localName="xmlns:ore", isAttribute = true)
  public String getOreXmlns() {
    return oreXmlns;
  }

  /**
   * @return the dcXmlns
   */
  @JacksonXmlProperty(localName="xmlns:dc", isAttribute = true)
  public String getDcXmlns() {
    return dcXmlns;
  }

  /**
   * @return the dctermsXmlns
   */
  @JacksonXmlProperty(localName="xmlns:dcterms", isAttribute = true)
  public String getDctermsXmlns() {
    return dctermsXmlns;
  }

  /**
   * @param aggregation the aggregation to set
   */
  public void addAggregation(Aggregation aggregation) {
    if(this.aggregation == null) {
      this.aggregation = new ArrayList<Aggregation>();
    }
    this.aggregation.add(aggregation);
  }

  /**
   * @return the providedCHO
   */
 @JacksonXmlProperty(localName="ProvidedCHO")
  public ProvidedCHO getProvidedCho() {
    return providedCHO;
  }

  /**
   * @return the aggregation
   */
 @JacksonXmlProperty(localName="Aggregation")
  public ArrayList<Aggregation> getAggregation() {
    return aggregation;
  }

  /**
   * @param aggregation the aggregation to set
   */
  @JacksonXmlProperty(localName="Aggregation")
  public void setAggregation(ArrayList<Aggregation> aggregation) {
    if(this.aggregation == null) {
      this.aggregation = new ArrayList<Aggregation>();
    }
    this.aggregation = aggregation;
  }

  /**
   * @param providedCHO the providedCHO to set
   */
 @JacksonXmlProperty(localName="ProvidedCHO")
  public void setProvidedCho(ProvidedCHO providedCHO) {
    this.providedCHO = providedCHO;
  }

  /**
   * @return the testElement
   */
  @JacksonXmlProperty(localName="moinsen")
  public String getTestElement() {
    return testElement;
  }

  /**
   * @param testElement the testElement to set
   */
  @JacksonXmlProperty(localName="moinsen")
  public void setTestElement(String testElement) {
    this.testElement = testElement;
  }

  

}