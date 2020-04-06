package gw.sampledata

uses gw.pl.persistence.core.Bundle

@Export
class SampleSpecialistServiceTree extends SampleDataBase {

  construct(inCache : SampleDataCache) {
    super(inCache)
  }

  override property get Description(): String {
    return "Specialist Service Tree"
  }

  override function testSampleData(bundle : Bundle) {
    SampleSpecialistServicesBase.getSampleSpecialistServices(bundle)
  }

  override function minimalTestSampleData(bundle : Bundle) {
    testSampleData(bundle)
  }
}