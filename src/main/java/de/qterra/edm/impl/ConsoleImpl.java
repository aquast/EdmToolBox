/**
 * 
 */
package de.qterra.edm.impl;

import java.util.ArrayList;

import de.qterra.edm.model.Edm;
import de.qterra.edm.model.ProvidedCHO;
import de.qterra.edm.model.Aggregation;
import de.qterra.edm.model.OaiRecord;
import de.qterra.edm.model.ResourceAttribute;


/**
 * 
 */
public class ConsoleImpl {

  private String filePath = System.getProperty("user.dir") + System.getProperty("file.separator") + "src/main/resources/EDM.xml";
  /**
   * @param args
   */
  public static void main(String[] args) {
    
    ConsoleImpl impl = new ConsoleImpl();
    Edm exEdm = impl.generateExampleEDM();
    // impl.serializeXml(exEdm);

    if (args != null && args.length > 0) {
      impl.filePath = args[0];
    }
    
      Edm resultEdm =impl.deserializeXml();
      impl.serializeXml(resultEdm);
    
  }
  
  public Edm deserializeXml() {
    DeserializeXml dsXml = new DeserializeXml(filePath);
    return dsXml.deserialize();
    
  }

  public void serializeXml(Edm edm) {
    SerializeXml sXml = new SerializeXml();
    sXml.setEdm(edm);
    sXml.serialize();    
  }
    
  /**
   * @return Edm as Edm object for testing
   */
  public Edm generateExampleEDM() {
    
    ArrayList<String> creator = new ArrayList<>();
    creator.add("Christiane Wesling");
    ArrayList<String> description = new ArrayList<>();
    description.add("Bericht über ein neues Leben");
    description.add("Erfahrungen mit dem Eierrat");
    ArrayList<String> extent = new ArrayList<>();
    extent.add("100 S.");
    extent.add("3 Tafeln");
    String edmType ="TEXT";
    String dcType="Archivalie";

    Edm edm = new Edm();
    
    ProvidedCHO provCho = new ProvidedCHO();
    provCho.addTitle("Eine neue Hühnerfarm");
    provCho.setDcCreator(creator);
    provCho.setDcDescription(description);
    provCho.addContributor("Andres Quast");
    provCho.addContributor("Björn Quast");
    provCho.setDctermsExtent(extent);
    provCho.setEdmType(edmType);
    provCho.addDcType(dcType);

    Aggregation aggregation = new Aggregation();
    aggregation.setDataProvider("Hochschulbibliothekszentrum NRW");
    aggregation.setAggregatedCHO(new ResourceAttribute("12345"));
    
    ArrayList<OaiRecord> oRecord = edm.getOaiMethod().getRecord();
    oRecord.get(0).getMetadata().getRdf().setProvidedCho(provCho);
    oRecord.get(0).getMetadata().getRdf().addAggregation(aggregation);
    return edm;
    
  }

}
