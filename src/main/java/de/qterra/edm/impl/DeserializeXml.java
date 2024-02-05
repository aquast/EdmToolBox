/**
 * 
 */
package de.qterra.edm.impl;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import de.qterra.edm.model.Edm;

/**
 * 
 */
public class DeserializeXml {
    
  public DeserializeXml(File file) {
    this.importFile = file;
    edmIs = loadXml();
  }

  public DeserializeXml(String fileName) {
    importFile = new File(fileName);
    edmIs = loadXml();
  }

  private Edm edm = new Edm();
  private File importFile = null;
  private InputStream edmIs = null;
  
  private InputStream loadXml() {
    BufferedInputStream bis = null;
    try {
      FileInputStream fis = new FileInputStream(importFile);
      bis = new BufferedInputStream(fis);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
    
    return bis;
  }
  
  public Edm deserialize() {
    Edm edm = null;
    XmlMapper xmlMapper = new XmlMapper();
    try {
      edm = xmlMapper.readValue(edmIs, Edm.class);

    } catch (StreamReadException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (DatabindException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

    
    return edm;
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
