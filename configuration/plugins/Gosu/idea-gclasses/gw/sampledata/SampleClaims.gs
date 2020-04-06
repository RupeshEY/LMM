package gw.sampledata

uses gw.pl.persistence.core.Bundle

@Export
class SampleClaims extends SampleDataBase {

  construct(inCache : SampleDataCache) {
    super(inCache)
  }

  override property get Description() : String {
    return "Contacts, Policies, Claims, Exposures, Notes, ClaimContacts, Activities and Financials"
  }

  override function testSampleData(bundle : Bundle) {
    new SamplePersonalAutoClaims(Cache).demoSampleData(bundle)
    new SampleCommercialPropertyClaims(Cache).demoSampleData(bundle)
    new SampleHomeownersClaims(Cache).demoSampleData(bundle)
    new SampleWorkersCompClaims(Cache).demoSampleData(bundle)
    new SampleCommercialAutoClaims(Cache).demoSampleData(bundle)
    new SampleGeneralLiabilityClaims(Cache).demoSampleData(bundle)
    new SampleTravelClaims(Cache).demoSampleData(bundle)
  }

  override function demoSampleData(bundle : Bundle) {
    testSampleData(bundle)
    new SampleClaimsForPCIntegration(Cache).demoSampleData(bundle)
  }
}
