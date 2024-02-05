/**
 * 
 */
package de.qterra.edm.model.deserialize;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import de.qterra.edm.model.ProvidedCHO;
import de.qterra.edm.model.ResourceAttribute;
import de.qterra.edm.model.AboutAttribute;



/**
 * 
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class DeserializeProvidedCHO implements ProvidedCHO{
  

  @JacksonXmlElementWrapper(useWrapping = false)
  private List<String> dcTitle = new ArrayList<>();
  @JacksonXmlElementWrapper(useWrapping = false)
  private ArrayList<String> dcDescription = new ArrayList<>();
  @JacksonXmlElementWrapper(useWrapping = false)
  private ArrayList<String> dcCreator = new ArrayList<>();
  @JacksonXmlElementWrapper(useWrapping = false)
  private ArrayList<String> dcContributor = new ArrayList<>();
  @JacksonXmlElementWrapper(useWrapping = false)
  private ArrayList<String> dcIdentifier = new ArrayList<>();
  @JacksonXmlElementWrapper(useWrapping = false)
  private ArrayList<String> dcPublisher = new ArrayList<>();
  @JacksonXmlElementWrapper(useWrapping = false)
  private ArrayList<String> dcLanguage = new ArrayList<>();
  @JacksonXmlElementWrapper(useWrapping = false)
  private ArrayList<String> dcType = new ArrayList<>();
  @JacksonXmlElementWrapper(useWrapping = false)
  private ArrayList<String> dcDate = new ArrayList<>();
  
  private String dctermsCreated = new String();
  private String dctermsIssued = new String();
  @JacksonXmlElementWrapper(useWrapping = false)
  private ArrayList<String> dctermsExtent = new ArrayList<>();
  @JacksonXmlElementWrapper(useWrapping = false)
  private ArrayList<ResourceAttribute> dctermsIsReferencedBy = new ArrayList<>();
  @JacksonXmlElementWrapper(useWrapping = false)
  private ArrayList<String> dctermsProvenance = new ArrayList<>();
  
  private String edmType = new String();
  
  // add to List
  /**
   * @param add item to dctermsExtent
   */
  @Override
  @JacksonXmlProperty(localName="extent")
  public void addDctermsExtend(String extent) {
    this.dctermsExtent.add(extent);
  }
  /**
   * @param add item to dctermsIsReferencedBy
   */
  @Override
  @JacksonXmlProperty(localName="isReferencedBy")
  public void addDctermsIsReferencedBy(ResourceAttribute isReferencedBy) {
    this.dctermsIsReferencedBy.add(isReferencedBy);
  }
  /**
   * @param add item to dctermsProvenance
   */
  @Override
  @JacksonXmlProperty(localName="provenance")
  public void addDctermsProvenance(String provenance) {
    this.dctermsProvenance.add(provenance);
  }
  /**
   * @param add item to dcTitle
   */
  @Override
  @JacksonXmlProperty(localName="title")
  public void addDcTitle(String title) {
    this.dcTitle.add(title);
  }
  /**
   * @param add item to dcDescription
   */
  @Override
  @JacksonXmlProperty(localName="description")
  public void addDcDescription(String description) {
    this.dcDescription.add(description);
  }
  /**
   * @param dcCreator the dcCreator to set
   */
  @Override
  @JacksonXmlProperty(localName="creator")
  public void addDcCreator(String creator) {
    this.dcCreator.add(creator);
  }
  /**
   * @param dcContributor the dcContributor to set
   */
  @Override
  @JacksonXmlProperty(localName="contributor")
  public void addDcContributor(String contributor) {
    this.dcContributor.add(contributor);
  }
  /**
   * @param dcIdentifier the dcIdentifier to set
   */
  @Override
  @JacksonXmlProperty(localName="identifier")
  public void addDcIdentifier(String identifier) {
    this.dcIdentifier.add(identifier);
  }
  /**
   * @param dcPublisher the dcPublisher to set
   */
  @Override
  @JacksonXmlProperty(localName="publisher")
  public void addDcPublisher(String publisher) {
    this.dcPublisher.add(publisher);
  }
  /**
   * @param dcLanguage the dcLanguage to set
   */
  @Override
  @JacksonXmlProperty(localName="language")
  public void addDcLanguage(String language) {
    this.dcLanguage.add(language);
  }
  /**
   * @param dcType the dcType to set
   */
  public void addDcType(String dcType) {
    this.dcType.add(dcType);
  }
  /**
   * @param dcDate the dcDate to set
   */
  public void addDcDate(String date) {
    this.dcDate.add(date);
  }

  // Getter
  /**
   * @return the dcTitle
   */
  @JacksonXmlProperty(localName="title")
  public List<String> getDcTitle() {
    return dcTitle;
  }
  /**
   * @return the dcDescription
   */
  @JacksonXmlProperty(localName="description")
  public ArrayList<String> getDcDescription() {
    return dcDescription;
  }
  /**
   * @return the dcCreator
   */
  @JacksonXmlProperty(localName="creator")
  public ArrayList<String> getDcCreator() {
    return dcCreator;
  }
  /**
   * @return the dcContributor
   */
  @JacksonXmlProperty(localName="contributor")
  public ArrayList<String> getDcContributor() {
    return dcContributor;
  }
  /**
   * @return the dcIdentifier
   */
  @JacksonXmlProperty(localName="identifier")
  public ArrayList<String> getDcIdentifier() {
    return dcIdentifier;
  }
  /**
   * @return the dcPublisher
   */
  @JacksonXmlProperty(localName="publisher")
  public ArrayList<String> getDcPublisher() {
    return dcPublisher;
  }
  /**
   * @return the dcLanguage
   */
  @JacksonXmlProperty(localName="language")
  public ArrayList<String> getDcLanguage() {
    return dcLanguage;
  }
  /**
   * @return the dcType
   */
  @JacksonXmlProperty(namespace="http://purl.org/dc/elements/1.1/", localName="dc:type")
  public ArrayList<String> getDcType() {
    return dcType;
  }
  /**
   * @return the dcDate
   */
  @JacksonXmlProperty(localName="date")
  public ArrayList<String> getDcDate() {
    return dcDate;
  }
  /**
   * @return the dctermsCreated
   */
  @JacksonXmlProperty(localName="created")
  public String getDctermsCreated() {
    return dctermsCreated;
  }
  /**
   * @return the dctermsIssued
   */
  @JacksonXmlProperty(localName="issued")
  public String getDctermsIssued() {
    return dctermsIssued;
  }
  /**
   * @return the dctermsExtent
   */
  @JacksonXmlProperty(localName="extent")
  public ArrayList<String> getDctermsExtent() {
    return dctermsExtent;
  }
  /**
   * @return the dctermsIsReferencedBy
   */
  @JacksonXmlProperty(localName="dc:isReferencedBy")
  public ArrayList<ResourceAttribute> getDctermsIsReferencedBy() {
    return dctermsIsReferencedBy;
  }
  /**
   * @return the dctermsProvenance
   */
  @JacksonXmlProperty(localName="provenance")
  public ArrayList<String> getDctermsProvenance() {
    return dctermsProvenance;
  }
  /**
   * @return the edmType
   */
  @JacksonXmlProperty(localName="type")
  public String getEdmType() {
    return edmType;
  }
  
  // Setter
  /**
   * @param dctermsCreated the dctermsCreated to set
   */
  @JacksonXmlProperty(localName="created")
  public void setDctermsCreated(String dctermsCreated) {
    this.dctermsCreated = dctermsCreated;
  }
  /**
   * @param dctermsIssued the dctermsIssued to set
   */
  @JacksonXmlProperty(localName="issued")
  public void setDctermsIssued(String dctermsIssued) {
    this.dctermsIssued = dctermsIssued;
  }
  /**
   * @param dctermsExtent the dctermsExtent to set
   */
  @JacksonXmlProperty(localName="extent")
  public void setDctermsExtent(ArrayList<String> dctermsExtent) {
    this.dctermsExtent = dctermsExtent;
  }
  /**
   * @param dctermsIsReferencedBy the dctermsIsReferencedBy to set
   */
  @JacksonXmlProperty(localName="dc:isReferencedBy")
  public void setDctermsIsReferencedBy(ArrayList<ResourceAttribute> dctermsIsReferencedBy) {
    this.dctermsIsReferencedBy = dctermsIsReferencedBy;
  }
  /**
   * @param dctermsProvenance the dctermsProvenance to set
   */
  @JacksonXmlProperty(localName="provenance")
  public void setDctermsProvenance(ArrayList<String> dctermsProvenance) {
    this.dctermsProvenance = dctermsProvenance;
  }
  /**
   * @param edmType the edmType to set
   */
  @JacksonXmlProperty(localName="type")
  public void setEdmType(String edmType) {
    this.edmType = edmType;
  }
  /**
   * @param dcTitle the dcTitle to set
   */
  @JacksonXmlProperty(localName="title")
  public void setDcTitle(ArrayList<String> title) {
    this.dcTitle = title;
  }
  /**
   * @param dcDescription the dcDescription to set
   */
  @JacksonXmlProperty(localName="description")
  public void setDcDescription(ArrayList<String> description) {
    this.dcDescription = description;
  }
  /**
   * @param dcCreator the dcCreator to set
   */
  @JacksonXmlProperty(localName="creator")
  public void setDcCreator(ArrayList<String> creator) {
    if(this.dcCreator == null) {
      this.dcCreator = new ArrayList<String>();
    }
    this.dcCreator = creator;
  }
  /**
   * @param dcContributor the dcContributor to set
   */
  @JacksonXmlProperty(localName="contributor")
  public void setDcContributor(ArrayList<String> contributor) {
    this.dcContributor = contributor;
  }
  /**
   * @param dcIdentifier the dcIdentifier to set
   */
  @JacksonXmlProperty(localName="identifier")
  public void setDcIdentifier(ArrayList<String> identifier) {
    this.dcIdentifier = identifier;
  }
  /**
   * @param dcPublisher the dcPublisher to set
   */
  @JacksonXmlProperty(localName="publisher")
  public void setDcPublisher(ArrayList<String> publisher) {
    this.dcPublisher = publisher;
  }
  /**
   * @param dcLanguage the dcLanguage to set
   */
  @JacksonXmlProperty(localName="language")
  public void setDcLanguage(ArrayList<String> language) {
    this.dcLanguage = language;
  }
  /**
   * @param dcType the dcType to set
   */
  @JacksonXmlProperty(namespace="http://purl.org/dc/elements/1.1/", localName="dc:type")
 public void setDcType(ArrayList<String> type) {
    this.dcType = type;
  }
  /**
   * @param dcDate the dcDate to set
   */
  @JacksonXmlProperty(localName="date")
  public void setDcDate(ArrayList<String> date) {
    this.dcDate = date;
  }
}
