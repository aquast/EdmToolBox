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
import de.qterra.edm.model.serialize.SerializeAggregation;
import de.qterra.edm.model.serialize.SerializeEdm;
import de.qterra.edm.model.serialize.SerializeProvidedCHO;
import de.qterra.edm.model.serialize.SerializeResourceAttribute;


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
    SerializeEdm exEdm = (SerializeEdm) impl.generateExampleEDM();
    //impl.serializeXml(exEdm);

    if (args != null && args.length > 0) {
      impl.filePath = args[0];
    }
    
      Edm resultEdm =impl.deserializeXml();
      System.out.println(resultEdm.getOaiMethod());
      //impl.serializeXml((SerializeEdm) resultEdm);
    
  }
  
  public Edm deserializeXml() {
    DeserializeXml dsXml = new DeserializeXml(filePath);
    return dsXml.deserialize();
    
  }

  public void serializeXml(SerializeEdm edm) {
    SerializeXml sXml = new SerializeXml();
    sXml.setEdm(edm);
    sXml.serialize();    
  }
    
  /**
   * @return SerializeEdm as SerializeEdm object for testing
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

    Edm edm = new SerializeEdm();
    
    ProvidedCHO provCho = new SerializeProvidedCHO();
    provCho.addDcTitle("Eine neue Hühnerfarm");
    provCho.setDcCreator(creator);
    provCho.setDcDescription(description);
    provCho.addDcContributor("Andres Quast");
    provCho.addDcContributor("Björn Quast");
    provCho.setDctermsExtent(extent);
    provCho.setEdmType(edmType);
    provCho.addDcType(dcType);

    Aggregation aggregation = new SerializeAggregation();
    aggregation.setEdmDataProvider("Hochschulbibliothekszentrum NRW");
    aggregation.setEdmAggregatedCHO(new SerializeResourceAttribute("12345"));
    
    ArrayList<OaiRecord> oRecord = edm.getOaiMethod().getRecord();
    oRecord.get(0).getMetadata().getRdf().setProvidedCho(provCho);
    oRecord.get(0).getMetadata().getRdf().addAggregation(aggregation);
    return edm;
    
  }

}
