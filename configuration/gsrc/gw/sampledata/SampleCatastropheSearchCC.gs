package gw.sampledata
uses gw.pl.persistence.core.Bundle
uses gw.command.NewClaim
uses java.util.ArrayList
uses gw.sample.heatmap.SampleCatastropheSearch

@Export
class SampleCatastropheSearchCC extends SampleDataBase {

  construct(inCache : SampleDataCache) {
    super(inCache)
  }

  override property get Description() : String {
    return "CatastropheMap"
  }
  
  override function testSampleData(bundle : Bundle) {
    new NewClaim().catPaulaClaims()
  }

  static var _startingPolicyNumber : long as StartingPolicyNumber = SampleCatastropheSearch.StartingPolicyNumber

  static property get Dollars() : ArrayList<ArrayList<String>> {
    return SampleCatastropheSearch.Dollars
  }

  static property get Insureds() : ArrayList<ArrayList<String>> {
    return SampleCatastropheSearch.Insureds
  }
      
  static property get Adjusters() : ArrayList<ArrayList<String>> {
    return SampleCatastropheSearch.Adjusters
  }

  static property get Addresses() : ArrayList<ArrayList<String>> {
    return SampleCatastropheSearch.Addresses
  }

}
