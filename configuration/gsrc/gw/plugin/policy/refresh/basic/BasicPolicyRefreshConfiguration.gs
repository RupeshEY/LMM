package gw.plugin.policy.refresh.basic

uses entity.VehicleRU
uses gw.plugin.policy.refresh.ExtendablePolicyRefreshConfiguration
uses entity.Contact
uses entity.Coverage
uses entity.PolicyLocation
uses entity.Policy
uses entity.RiskUnit
uses entity.KeyableBean
uses gw.lang.Export

uses java.util.Set
uses gw.api.util.NonNullSet

/**
 * Implementation of <code>PolicyRefreshConfiguration</code> where the <code>getPolicyOnly(Policy)</code>
 * method is implemented by manually walking the graph of Policy-related entities and marking the appropriate
 * entities as being "Policy only".
 * 
 * Note that the definition of Policy-only entities should be all entities which are created
 * in ClaimCenter through the IPolicySearchAdapter, and hence all the entities which would get
 * replaced when the Policy is refreshed from the Policy Administration System.
 */
@Export
class BasicPolicyRefreshConfiguration extends ExtendablePolicyRefreshConfiguration 
{
    /**
     * This method extracts all Policy-only entities from the existing Policy (which is linked
     * to a Claim and other non-Policy entities). Note that this implementation uses the getEntireArray()
     * method, which returns all members of the array including retired beans. Including retired beans is
     * necessary here because of issues purging policy entities if retired beans have a foreign key to
     * one of those entities.
     */
    override function getPolicyOnly(existingPolicy : Policy) : Set<KeyableBean> {
      var policyOnly = new NonNullSet<KeyableBean>()
      policyOnly.add(existingPolicy)
      getEntireArray(existingPolicy, "Roles", ClaimContactRole).each(\ r -> {
        policyOnly.add(r)
        policyOnly.add(r.ClaimContact)
        includeContact(policyOnly, r.ClaimContact.Contact)
      })
      getEntireArray(existingPolicy, "ClassCodes", ClassCode).each(\ c -> policyOnly.add(c))
      getEntireArray(existingPolicy, "StatCodes", StatCode).each(\ s -> policyOnly.add(s))
      getEntireArray(existingPolicy, "Endorsements", Endorsement).each(\ e -> policyOnly.add(e))
      getEntireArray(existingPolicy, "RiskUnits", RiskUnit).each(\ ru -> includeRiskUnit(policyOnly, ru))
      getEntireArray(existingPolicy, "Coverages", Coverage).each(\ cov -> includeCoverage(policyOnly, cov))
      getEntireArray(existingPolicy, "PolicyLocations", PolicyLocation).each(\ p -> includeLocation(policyOnly, p))
      return policyOnly
    }
    
    private function includeLocation(policyOnly: Set<KeyableBean>, p:PolicyLocation) {
      policyOnly.add(p)
      policyOnly.add(p.Address)
      getEntireArray(p, "Buildings", Building).each(\ b -> policyOnly.add(b))
      getEntireArray(p, "HighValueItems", PropertyItem).each(\ hv -> policyOnly.add(hv))
      getEntireArray(p, "Lienholders", PropertyOwner).each(\ lh -> {
          policyOnly.add(lh)
          if(not policyOnly.contains(lh.Lienholder)) {
            includeContact(policyOnly, lh.Lienholder)
          }
      })
    }
    
    private function includeRiskUnit(policyOnly: Set<KeyableBean>, ru:RiskUnit) {
      policyOnly.add(ru)
      getEntireArray(ru, "Coverages", RUCoverage).each(\ cov -> includeCoverage(policyOnly, cov))
      if(ru typeis VehicleRU and ru.Vehicle!=null) {
          policyOnly.add(ru.Vehicle)
          getEntireArray(ru.Vehicle, "Lienholders", VehicleOwner).each(\ vo -> {
            policyOnly.add(vo)
            if(not policyOnly.contains(vo.Lienholder)) {
              includeContact(policyOnly, vo.Lienholder)
            }
          })
      }
    }
    
    private function includeCoverage(policyOnly: Set<KeyableBean>, cov:Coverage) {
      policyOnly.add(cov)
      getEntireArray(cov, "CovTerms", CovTerm).each(\ ct -> policyOnly.add(ct))
    }
    
    private function includeContact(policyOnly: Set<KeyableBean>, c:Contact) {
      policyOnly.add(c)
      policyOnly.add(c.PrimaryAddress)
      getEntireArray(c, "ContactAddresses", ContactAddress).each(\ ca -> {
        policyOnly.add(ca)
        policyOnly.add(ca.Address)
      })
      includeRelatedContacts(policyOnly, c)
    }
    
    private function includeRelatedContacts(policyOnly: Set<KeyableBean>, c:Contact) {
      getEntireArray(c, "TargetRelatedContacts", ContactContact).each(\ cc -> {
          policyOnly.add(cc)
          if(not policyOnly.contains(cc.RelatedContact)) {
            //avoid traversing contacts that have already been included
            includeContact(policyOnly, cc.RelatedContact)
          }
      })
    }
}
