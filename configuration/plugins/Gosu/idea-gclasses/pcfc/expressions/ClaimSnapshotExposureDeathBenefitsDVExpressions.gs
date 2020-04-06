package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/default/ClaimSnapshotExposureDeathBenefitsDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimSnapshotExposureDeathBenefitsDVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/default/ClaimSnapshotExposureDeathBenefitsDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotExposureDeathBenefitsDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextInput (id=LostWagesBenefits_BenefitsBeginDate) at ClaimSnapshotExposureDeathBenefitsDV.pcf: line 17, column 38
    function valueRoot_2 () : java.lang.Object {
      return Exposure.PIPDeathBenefits
    }
    
    // 'value' attribute on TextInput (id=LostWagesBenefits_BenefitsBeginDate) at ClaimSnapshotExposureDeathBenefitsDV.pcf: line 17, column 38
    function value_0 () : dynamic.Dynamic {
      return Exposure.PIPDeathBenefits.BenefitsBeginDate
    }
    
    // 'value' attribute on TextInput (id=LostWagesBenefits_MaxBurialRate) at ClaimSnapshotExposureDeathBenefitsDV.pcf: line 39, column 38
    function value_12 () : dynamic.Dynamic {
      return Exposure.PIPDeathBenefits.MaxBurialRate
    }
    
    // 'value' attribute on TextInput (id=LostWagesBenefits_Description) at ClaimSnapshotExposureDeathBenefitsDV.pcf: line 44, column 38
    function value_15 () : dynamic.Dynamic {
      return Exposure.PIPDeathBenefits.Description
    }
    
    // 'value' attribute on TextInput (id=LostWagesBenefits_BenefitsEndDate) at ClaimSnapshotExposureDeathBenefitsDV.pcf: line 22, column 38
    function value_3 () : dynamic.Dynamic {
      return Exposure.PIPDeathBenefits.BenefitsEndDate
    }
    
    // 'value' attribute on TextInput (id=LostWagesBenefits_WeeklyCompRate) at ClaimSnapshotExposureDeathBenefitsDV.pcf: line 28, column 38
    function value_6 () : dynamic.Dynamic {
      return Exposure.PIPDeathBenefits.WeeklyCompRate
    }
    
    // 'value' attribute on TextInput (id=LostWagesBenefits_PaymentFrequency) at ClaimSnapshotExposureDeathBenefitsDV.pcf: line 33, column 38
    function value_9 () : dynamic.Dynamic {
      return Exposure.PIPDeathBenefits.PaymentFrequency
    }
    
    property get Exposure () : dynamic.Dynamic {
      return getRequireValue("Exposure", 0) as dynamic.Dynamic
    }
    
    property set Exposure ($arg :  dynamic.Dynamic) {
      setRequireValue("Exposure", 0, $arg)
    }
    
    
  }
  
  
}