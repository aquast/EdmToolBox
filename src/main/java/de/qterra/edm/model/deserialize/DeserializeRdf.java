package de.qterra.edm.model.deserialize;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import de.qterra.edm.model.Aggregation;
import de.qterra.edm.model.ProvidedCHO;
import de.qterra.edm.model.Rdf;

@JsonIgnoreProperties(ignoreUnknown = true)  
@JacksonXmlRootElement(localName="rdf:RDF")
public class DeserializeRdf implements Rdf{

  private final String rdfXmlns = "http://www.w3.org/1999/02/22-rdf-sysntax-ns#"; 
  private final String edmXmlns = "http://www.europeana.eu/schemas/edm/"; 
  private final String oreXmlns = "http://www.openarchives.org/ore/terms/"; 
  private final String dcXmlns = "http://purl.org/dc/elements/1.1/"; 
  private final String dctermsXmlns = "http://purl.org/dc/terms/"; 
  
  private ProvidedCHO providedCHO = new DeserializeProvidedCHO();
  private ArrayList<DeserializeAggregation> aggregation = new ArrayList<>();
  
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
  @Override
  public void addAggregation(Aggregation aggregation) {
    if(this.aggregation == null) {
      this.aggregation = new ArrayList<DeserializeAggregation>();
    }
    this.aggregation.add((DeserializeAggregation) aggregation);
  }

  /**
   * @return the providedCHO
   */
  @Override
  @JacksonXmlProperty(localName="edm:ProvidedCHO")
  public ProvidedCHO getProvidedCho() {
    return providedCHO;
  }

  /**
   * @return the aggregation
   */
  @Override
  @JacksonXmlElementWrapper(useWrapping = false)
  @JacksonXmlProperty(localName="ore:Aggregation")
  public ArrayList<DeserializeAggregation> getAggregation() {
    return aggregation;
  }

  /**
   * @param aggregation the aggregation to set
   */
  @Override
  @JacksonXmlElementWrapper(useWrapping = false)
  @JacksonXmlProperty(localName="Aggregation")
  public void setAggregation(ArrayList<? extends Aggregation> aggregation) {
    if(this.aggregation == null) {
      this.aggregation = new ArrayList<DeserializeAggregation>();
    }
    this.aggregation = (ArrayList<DeserializeAggregation>) aggregation;
  }

  /**
   * @param providedCHO the providedCHO to set
   */
  @Override
  @JacksonXmlProperty(localName="ProvidedCHO")
  public void setProvidedCho(ProvidedCHO providedCHO) {
    this.providedCHO = providedCHO;
  }



}
