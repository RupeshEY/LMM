package gw.sampledata

uses gw.cc.config.Resources
uses gw.pl.persistence.core.Bundle

/**
 * Creates CC-specific entities that link SpecialistServices, which is part of platform. This class
 * requries that SampleSpecialistServiceTree has already been loaded.
 */
@Export
class SampleSpecialistServiceDetails extends SampleDataBase {

  construct(inCache : SampleDataCache) {
    super(inCache)
  }

  override property get Description() : String {
    return "Specialist Service Details"
  }

  override function testSampleData(bundle : Bundle) {
    XMLSampleDataImporter.importFromFile(Resources.VENDOR_SERVICE_DETAILS, bundle)
  }

  override function minimalTestSampleData(bundle : Bundle) {
    testSampleData(bundle)
  }
}
