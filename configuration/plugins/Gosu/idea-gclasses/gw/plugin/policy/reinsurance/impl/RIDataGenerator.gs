package gw.plugin.policy.reinsurance.impl

uses com.google.common.collect.*
uses gw.api.databuilder.DataBuilder
uses gw.api.databuilder.QuotaShareRITreatyBuilder
uses gw.api.databuilder.SurplusRITreatyBuilder
uses gw.api.databuilder.XolRIAgreementBuilder
uses gw.api.databuilder.RIAgreementGroupBuilder
uses java.util.Collection
uses gw.api.databuilder.RIAgreementBuilder
uses java.util.Set
uses gw.api.financials.CurrencyAmount
uses gw.api.util.CurrencyUtil
uses gw.api.databuilder.ClaimBuilder
uses gw.util.Pair

/**
 * Demo data for reinsurance agreements.
 */
@Export
class RIDataGenerator
{
  //key is Pair(policyNumber, CoverageType), value is a Collection of RIAgreement builders
  // CoverageType in the key can be null, to register a group of agreements for all exposures on a claim
  // with that policyNumber.
  var _dataMap : Multimap<Pair<String, CoverageType>, DataBuilder<RIAgreement, RIAgreementBuilder >>

  construct() {
    _dataMap = HashMultimap.create<Pair<String, CoverageType>, DataBuilder<RIAgreement, RIAgreementBuilder >>()
    loadDemoData()
  }

  /**
   * Initializes the Demo data.
   */
  final function loadDemoData() {
    
    /*
     * When adding demo data to be returned by the RI demo plugin, preserve the following invariant:
     *  INVARIANT:  All agreements that are inserted into the
     *    data map under a particular key Pair(policyNumber, CoverageType) should be members
     *    of the same agreement group.
     *
     *  For example notice that agreements RA11224, RA12458, and RA12246, which all map from (23-502012, null),
     *      are all "onRIAgreementGroup" group1.  This is because the RI Demo plugin just grabs the RIRiskID from
     *      the Agreement Group of the first agreement in the list. It assume all agreements in the list are
     *      in the same group.
     */
    var defaultCurrency = CurrencyUtil.getDefaultCurrency()

    var claim = new ClaimBuilder().withCurrency( defaultCurrency ).share()

    //Demo agreement set -- proportional agreements on commercial property policy
    var group1 = new RIAgreementGroupBuilder()
        .withExternalRiskID("RI:1")
        .withRiskName("Commercial Property Risk")
        .onClaim( claim )
        .share()
    
    //for the same coverage on a policy, we use the same group.
    //for different coverages on a policy, use different groups.    
    var key23502012 = Pair.make<String, CoverageType>("23-502012", null)
    _dataMap.put(key23502012, new QuotaShareRITreatyBuilder()
        .onRIAgreementGroup(group1)
        .withAgreementNumber("RA11224")
        .withAgreementName("Quota Share 25%")
        .withRecoveryLimit(new CurrencyAmount(250000, defaultCurrency))
        .withTopOfLayer(new CurrencyAmount(1000000, defaultCurrency))
        .withNotificationThreshold(new CurrencyAmount(150000, defaultCurrency))
        .withCededShare(25)
        .withProportionalShare(4.2))
    _dataMap.put(key23502012, new SurplusRITreatyBuilder()
        .onRIAgreementGroup(group1)
        .withAgreementName("Surplus Share 1")
        .withAgreementNumber("RA12458")
        .withAttachmentPoint(new CurrencyAmount(1000000, defaultCurrency))
        .withRecoveryLimit(new CurrencyAmount(3000000, defaultCurrency))
        .withTopOfLayer(new CurrencyAmount(4000000, defaultCurrency))
        .withNotificationThreshold(new CurrencyAmount(750000, defaultCurrency))
        .withProportionalShare(50))
    _dataMap.put(key23502012, new SurplusRITreatyBuilder()
        .onRIAgreementGroup(group1)
        .withAgreementName("Surplus Share 2")
        .withAgreementNumber("RA12246")
        .withAttachmentPoint(new CurrencyAmount(4000000, defaultCurrency))
        .withRecoveryLimit(new CurrencyAmount(1000000, defaultCurrency))
        .withTopOfLayer(new CurrencyAmount(15000000, defaultCurrency))
        .withNotificationThreshold(new CurrencyAmount(3000000, defaultCurrency))
        .withProportionalShare(33.3))

    //Group with single surplus agreement
    var group3 = new RIAgreementGroupBuilder()
        .withExternalRiskID("RI:3")
        .withRiskName("Commercial Property Risk")
        .onClaim( claim )
        .share()

    var key23502011 = new Pair<String, CoverageType>("23-502011", null)
    _dataMap.put(key23502011, new SurplusRITreatyBuilder()
        .onRIAgreementGroup(group3)
        .withAgreementName("Surplus Share 1")
        .withAgreementNumber("RA12433")
        .withAttachmentPoint(new CurrencyAmount(1500000,defaultCurrency))
        .withRecoveryLimit(new CurrencyAmount(17000000, defaultCurrency))
        .withTopOfLayer(new CurrencyAmount(18500000, defaultCurrency))
        .withNotificationThreshold(new CurrencyAmount(1000000, defaultCurrency))
        .withProportionalShare(83))

     //proportional agreements on commercial property policy
     var group4 = new RIAgreementGroupBuilder()
        .withExternalRiskID("RI:4")
        .withRiskName("Commercial Property Risk")
        .onClaim( claim )
        .share()
     var key23502021 = new Pair<String, CoverageType>("23-502021", null)
     _dataMap.put(key23502021, new QuotaShareRITreatyBuilder()
        .onRIAgreementGroup(group4)
        .withAgreementName("25% Quota Share")
        .withAgreementNumber("RA11524")
        .withRecoveryLimit(new CurrencyAmount(250000, defaultCurrency))
        .withTopOfLayer(new CurrencyAmount(1000000, defaultCurrency))
        .withNotificationThreshold(new CurrencyAmount(150000, defaultCurrency))
        .withCededShare(25)
        .withProportionalShare(5))
     _dataMap.put(key23502021, new SurplusRITreatyBuilder()
        .onRIAgreementGroup(group4)
        .withAgreementName("Surplus Share 1")
        .withAgreementNumber("RA15458")
        .withAttachmentPoint(new CurrencyAmount(1000000, defaultCurrency))
        .withRecoveryLimit(new CurrencyAmount(3000000, defaultCurrency))
        .withTopOfLayer(new CurrencyAmount(4000000, defaultCurrency))
        .withNotificationThreshold(new CurrencyAmount(750000, defaultCurrency))
        .withProportionalShare(60))
     _dataMap.put(key23502021, new SurplusRITreatyBuilder()
        .onRIAgreementGroup(group4)
        .withAgreementName("Surplus Share 2")
        .withAgreementNumber("RA15246")
        .withAttachmentPoint(new CurrencyAmount(4000000, defaultCurrency))
        .withRecoveryLimit(new CurrencyAmount(1000000, defaultCurrency))
        .withTopOfLayer(new CurrencyAmount(15000000, defaultCurrency))
        .withNotificationThreshold(new CurrencyAmount(3000000, defaultCurrency))
        .withProportionalShare(20))

     //Demo WC agreement
     var group2 = new RIAgreementGroupBuilder()
        .withExternalRiskID("RI:2")
        .withRiskName("Workers Comp Risk")
        .onClaim( claim )
        .share()
     var key32300869 = new Pair<String, CoverageType>("32-300869", null)
     _dataMap.put(key32300869, new XolRIAgreementBuilder()
        .onRIAgreementGroup(group2)
        .withAgreementName("Excess of Loss")
        .withAgreementNumber("RA14456")
        .withAttachmentPoint(new CurrencyAmount(1000000, defaultCurrency))
        .withCededShare(25)
        .withTopOfLayer(new CurrencyAmount(3000000, defaultCurrency))
        .withNotificationThreshold(new CurrencyAmount(750000, defaultCurrency))
        .withRecoveryLimit(new CurrencyAmount(2000000, defaultCurrency)))

    var group5 = new RIAgreementGroupBuilder()
       .withExternalRiskID("RI:5")
       .withRiskName("Dwelling Risk Group")
       .onClaim( claim )
       .share()

    var key53235675Dwelling = new Pair<String,CoverageType>("53-235675", CoverageType.TC_HODW_DWELLING_COV_HOE)
    _dataMap.put(key53235675Dwelling, new SurplusRITreatyBuilder()
       .onRIAgreementGroup(group5)
       .withAgreementName("Surplus Share 5a")
       .withAgreementNumber("RA12246-5ea")
       .withAttachmentPoint(new CurrencyAmount(4000000, defaultCurrency))
       .withRecoveryLimit(new CurrencyAmount(1000000, defaultCurrency))
       .withTopOfLayer(new CurrencyAmount(15000000, defaultCurrency))
       .withNotificationThreshold(new CurrencyAmount(3000000, defaultCurrency))
       .withProportionalShare(33.3))
    _dataMap.put(key53235675Dwelling, new SurplusRITreatyBuilder()
       .onRIAgreementGroup(group5)
       .withAgreementName("Surplus Share 5b")
       .withAgreementNumber("RA12246-5eb")
       .withAttachmentPoint(new CurrencyAmount(4000000, defaultCurrency))
       .withRecoveryLimit(new CurrencyAmount(1000000, defaultCurrency))
       .withTopOfLayer(new CurrencyAmount(15000000, defaultCurrency))
       .withNotificationThreshold(new CurrencyAmount(3000000, defaultCurrency))
       .withProportionalShare(33.3))
    
    var group6 = new RIAgreementGroupBuilder()
       .withExternalRiskID("RI:6")
       .withRiskName("Personal Property Risk")
       .onClaim( claim )
       .share()
    
    var key53235675PerProp = new Pair<String,CoverageType>("53-235675", CoverageType.TC_HODW_PERSONAL_PROPERTY_HOE)
    _dataMap.put(key53235675PerProp, new SurplusRITreatyBuilder()
       .onRIAgreementGroup(group6)
       .withAgreementName("Surplus Share 6")
       .withAgreementNumber("RA12246-e")
       .withAttachmentPoint(new CurrencyAmount(4000000, defaultCurrency))
       .withRecoveryLimit(new CurrencyAmount(1000000, defaultCurrency))
       .withTopOfLayer(new CurrencyAmount(15000000, defaultCurrency))
       .withNotificationThreshold(new CurrencyAmount(3000000, defaultCurrency))
       .withProportionalShare(33.3))
  }
  
  function getBuildersForPolicy(policyNumber:String, coverageType:CoverageType) : Collection<DataBuilder<RIAgreement, RIAgreementBuilder >> {
    // Backwards compatibility, simpler setup: Check if registered under policyNumber only, so all exposure go in same agreement group.
    var agrList = _dataMap.get(new Pair<String,CoverageType>(policyNumber, null))
    if (agrList.HasElements) {
      return agrList
    }
    // Otherwise lookup by policyNumber and Coverage.
    return _dataMap.get(new Pair<String,CoverageType>( policyNumber, coverageType))
  }

  function getPoliciesWithReinsurance() : Set<String> {
    return _dataMap.keys().map(\ k -> k.First).toSet()
  }
}
