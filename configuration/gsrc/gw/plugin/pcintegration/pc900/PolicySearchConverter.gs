package gw.plugin.pcintegration.pc900

uses gw.api.util.CurrencyUtil
uses gw.api.util.mapping.NameTranslator
uses gw.api.util.mapping.ObjectConverter
uses wsi.remote.gw.webservice.pc.pc900.entities.types.complex.CCPCSearchCriteria
uses wsi.remote.gw.webservice.pc.pc900.entities.types.complex.CCPolicy
uses wsi.remote.gw.webservice.pc.pc900.entities.types.complex.CCPolicySummary

/**
 * Handles the conversion of the CC search criteria to a PC search criteria and the 
 * conversion of objects returned from PC.
 */
@Export
class PolicySearchConverter {
  public static var INSTANCE : PolicySearchConverter = new PolicySearchConverter()

  private var _pcToCC : ObjectConverter
  private var _nameTranslator : NameTranslator as readonly NameMapper
  
  public construct()   {
    var converterFactory = new PCObjectConverterFactory()
    _nameTranslator = converterFactory.PCNameTranslator
    _pcToCC = converterFactory.getPCToCC()
  }
  
  /**
   * Given a cc PolicySearchCriteria (as created in the policy search UI), translates
   * to the soap object which the policy service uses.
   */
  public function createPCSearchCriteria( ccCriteria : PolicySearchCriteria ) : CCPCSearchCriteria {
    var pcCriteria = new CCPCSearchCriteria()
    pcCriteria.PolicyNumber = ccCriteria.PolicyNumber
    pcCriteria.ProductCode = ccCriteria.PolicyType.Code
    pcCriteria.AsOfDate = ccCriteria.LossDate
    pcCriteria.CompanyName = ccCriteria.CompanyName
    pcCriteria.CompanyNameKanji = ccCriteria.NameKanji
    pcCriteria.LastName = ccCriteria.LastName
    pcCriteria.LastNameKanji = ccCriteria.LastNameKanji
    pcCriteria.FirstName = ccCriteria.FirstName
    pcCriteria.FirstNameKanji = ccCriteria.FirstNameKanji
    pcCriteria.TaxID = ccCriteria.TaxIdString
    pcCriteria.PrimaryInsuredCity = ccCriteria.InsuredAddress.City
    pcCriteria.PrimaryInsuredCityKanji = ccCriteria.InsuredAddress.CityKanji
    pcCriteria.PrimaryInsuredState = ccCriteria.InsuredAddress.State as String
    pcCriteria.PrimaryInsuredPostalCode = ccCriteria.InsuredAddress.PostalCode
    pcCriteria.PrimaryInsuredCountry = ccCriteria.InsuredAddress.Country.Code
    pcCriteria.IncludeArchived = ccCriteria.IncludeArchived
/* Other potentially useful fields    
    ccCriteria.Vin
    ccCriteria.PropertyAddress    
    pcCriteria.AccountNumber
*/
    return pcCriteria
  }
  
  /**
   * Converts the policy object returned from PC into a CC policy entity (recursively converting
   * the entire object map).
   */
  public function convertPCPolicy(pcPolicy : CCPolicy) : Policy {
    var policy = _pcToCC.convert( pcPolicy, CCPolicy ) as Policy
    if (policy != null) {
      ensureCurrencyNotNull(policy)
      ensureRiskUnitCoveragesAndClassCodesLinkedToPolicy(policy)
    }
    return policy
  }

  private function ensureCurrencyNotNull(policy : Policy) {
    if( policy.Currency == null ) {
      policy.Currency = CurrencyUtil.getDefaultCurrency()
    }
  }
  
  private function ensureRiskUnitCoveragesAndClassCodesLinkedToPolicy(policy : Policy) {
    for (riskUnit in policy.RiskUnits) {
      for (coverage in riskUnit.Coverages) {
        coverage.Policy = policy
      }
      var cc = riskUnit.ClassCode
      if(cc!=null and cc.Policy==null) {
        riskUnit.ClassCode.Policy = policy
      }
    }
  }

  /**
   * Converts the policysummary array returned from PC into an array of CC policysummary 
   * entities.
   */
  public function convertPCPolicySummary(pcSummaries : CCPolicySummary[]) : PolicySummary[] {
    return _pcToCC.convert( pcSummaries, CCPolicySummary[] ) as PolicySummary[]
  }
    
}
