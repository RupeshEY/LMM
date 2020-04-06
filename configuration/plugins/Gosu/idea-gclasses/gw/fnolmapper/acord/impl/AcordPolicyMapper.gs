package gw.fnolmapper.acord.impl
uses entity.Policy
uses java.lang.String
uses typekey.Currency
uses gw.fnolmapper.acord.AcordConfig
uses gw.fnolmapper.acord.IPolicyMapper

uses xsd.acord.ClaimsNotificationAddRq

/**
 * Maps an ACORD PCPOLICY element to a Policy.
 */
@Export
class AcordPolicyMapper implements IPolicyMapper
{
  var config:AcordConfig
  
  construct(configuration:AcordConfig) {
    this.config = configuration
  }
  
  //populate the policy from the ACORD <ClaimNotificationAddReq>
  override function populate(claimPolicy:Policy, req:ClaimsNotificationAddRq) {
    var policyElem = req.Policy
    claimPolicy.PolicyNumber = policyElem.PolicyNumber
    claimPolicy.Currency = getCurrency(req)
    claimPolicy.PolicyType = config.getPolicyTypeMap().get(policyElem.LOBCd_elem.$Text)
    if(policyElem.ContractTerm.EffectiveDt_elem!=null)
      claimPolicy.EffectiveDate = policyElem.ContractTerm.EffectiveDt_elem.$TypeInstance.toDate()
    if(policyElem.ContractTerm.ExpirationDt_elem!=null)
      claimPolicy.ExpirationDate = policyElem.ContractTerm.ExpirationDt_elem.$TypeInstance.toDate()
  }
  
    
  //returns the default currency for the claim
  private function getCurrency(req:ClaimsNotificationAddRq):Currency {
     var currCode:String = req.CurCd
     if(currCode==null) {
       //set default for locale
       currCode = getCurrencyForDefaultLocale()
     }
     return Currency.get(currCode.toLowerCase())
  }
  
  //returns the default currency for the default locale
  private function getCurrencyForDefaultLocale():String {
    return java.util.Currency.getInstance(java.util.Locale.getDefault()).CurrencyCode
  }
}
