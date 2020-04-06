package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/default/ClaimSnapshotExposuresVocationalBenefitsDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimSnapshotExposuresVocationalBenefitsDVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/default/ClaimSnapshotExposuresVocationalBenefitsDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotExposuresVocationalBenefitsDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextInput (id=LostWagesBenefits_CaseManager) at ClaimSnapshotExposuresVocationalBenefitsDV.pcf: line 46, column 38
    function valueRoot_17 () : java.lang.Object {
      return Exposure.casemgr
    }
    
    // 'value' attribute on DateInput (id=LostWagesBenefits_BenefitsBeginDate) at ClaimSnapshotExposuresVocationalBenefitsDV.pcf: line 19, column 38
    function valueRoot_2 () : java.lang.Object {
      return Exposure.PIPVocBenefits
    }
    
    // 'value' attribute on TextInput (id=LostWagesBenefits_CaseManagementCompany) at ClaimSnapshotExposuresVocationalBenefitsDV.pcf: line 31, column 38
    function valueRoot_8 () : java.lang.Object {
      return Exposure.casemgmtco
    }
    
    // 'value' attribute on DateInput (id=LostWagesBenefits_BenefitsBeginDate) at ClaimSnapshotExposuresVocationalBenefitsDV.pcf: line 19, column 38
    function value_0 () : dynamic.Dynamic {
      return Exposure.PIPVocBenefits.BenefitsBeginDate
    }
    
    // 'value' attribute on TextInput (id=CaseManagementCompany_PrimaryPhone) at ClaimSnapshotExposuresVocationalBenefitsDV.pcf: line 41, column 38
    function value_12 () : dynamic.Dynamic {
      return Exposure.casemgmtco.PrimaryPhoneValue
    }
    
    // 'value' attribute on TextInput (id=LostWagesBenefits_CaseManager) at ClaimSnapshotExposuresVocationalBenefitsDV.pcf: line 46, column 38
    function value_15 () : dynamic.Dynamic {
      return Exposure.casemgr.DisplayName
    }
    
    // 'value' attribute on TextInput (id=CaseMgr_PrimaryPhone) at ClaimSnapshotExposuresVocationalBenefitsDV.pcf: line 51, column 38
    function value_18 () : dynamic.Dynamic {
      return Exposure.casemgr.PrimaryPhoneValue
    }
    
    // 'value' attribute on TextInput (id=LostWagesBenefits_Description) at ClaimSnapshotExposuresVocationalBenefitsDV.pcf: line 56, column 38
    function value_21 () : dynamic.Dynamic {
      return Exposure.PIPVocBenefits.Description
    }
    
    // 'value' attribute on DateInput (id=LostWagesBenefits_BenefitsEndDate) at ClaimSnapshotExposuresVocationalBenefitsDV.pcf: line 26, column 38
    function value_3 () : dynamic.Dynamic {
      return Exposure.PIPVocBenefits.BenefitsEndDate
    }
    
    // 'value' attribute on TextInput (id=LostWagesBenefits_CaseManagementCompany) at ClaimSnapshotExposuresVocationalBenefitsDV.pcf: line 31, column 38
    function value_6 () : dynamic.Dynamic {
      return Exposure.casemgmtco.DisplayName
    }
    
    // 'value' attribute on TextInput (id=CaseManagementCompany_PrimaryAddress) at ClaimSnapshotExposuresVocationalBenefitsDV.pcf: line 36, column 38
    function value_9 () : dynamic.Dynamic {
      return Exposure.casemgmtco.PrimaryAddressDisplayValue
    }
    
    property get Exposure () : dynamic.Dynamic {
      return getRequireValue("Exposure", 0) as dynamic.Dynamic
    }
    
    property set Exposure ($arg :  dynamic.Dynamic) {
      setRequireValue("Exposure", 0, $arg)
    }
    
    
  }
  
  
}