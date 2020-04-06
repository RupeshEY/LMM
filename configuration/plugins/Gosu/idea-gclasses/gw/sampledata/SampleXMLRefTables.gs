package gw.sampledata
uses gw.cc.config.Resources
uses gw.pl.persistence.core.Bundle

@Export
class SampleXMLRefTables extends SampleDataBase {

  construct(inCache : SampleDataCache) {
    super(inCache)
  }

  override property get Description() : String {
    return "WC ref Tables, ICD Codes"
  }
    
  // use builders for the test data, don't include ICD Codes
  override function testSampleData(bundle : Bundle) {
    XMLSampleDataImporter.importFromFile(Resources.WC_REF_DATA_XML, bundle)
  }
  
  // load demo data from the xml sources
  override function demoSampleData(bundle : Bundle) {
    XMLSampleDataImporter.importFromFile(Resources.WC_REF_DATA_XML, bundle)
    XMLSampleDataImporter.importFromFile(Resources.ICD10, bundle)
  }

}
