package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/700/ClaimSnapshotExposureWageBenefits700DV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimSnapshotExposureWageBenefits700DVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/700/ClaimSnapshotExposureWageBenefits700DV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotExposureWageBenefits700DVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotExposureWageBenefits700DV.pcf: line 106, column 81
    function sortValue_44 (WorkStatusChange :  dynamic.Dynamic) : java.lang.Object {
      return util.Snapshot.renderValue(WorkStatusChange.StatusDate)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotExposureWageBenefits700DV.pcf: line 111, column 46
    function sortValue_45 (WorkStatusChange :  dynamic.Dynamic) : java.lang.Object {
      return WorkStatusChange.Status
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotExposureWageBenefits700DV.pcf: line 116, column 46
    function sortValue_46 (WorkStatusChange :  dynamic.Dynamic) : java.lang.Object {
      return WorkStatusChange.Comments
    }
    
    // 'value' attribute on TextInput (id=Company_PrimaryContact) at ClaimSnapshotExposureWageBenefits700DV.pcf: line 31, column 38
    function valueRoot_10 () : java.lang.Object {
      return Exposure.Claimant.ContactCompany.PrimaryContact
    }
    
    // 'value' attribute on TextInput (id=PartialPIPDamages_Employer) at ClaimSnapshotExposureWageBenefits700DV.pcf: line 215, column 40
    function valueRoot_105 () : java.lang.Object {
      return Exposure.Employer
    }
    
    // 'value' attribute on TextInput (id=PartialEmployer_PrimaryContact) at ClaimSnapshotExposureWageBenefits700DV.pcf: line 225, column 40
    function valueRoot_111 () : java.lang.Object {
      return Exposure.Employer.PrimaryContact
    }
    
    // 'value' attribute on TextInput (id=PartialEmploymentData_NumHoursWorkedPerDay) at ClaimSnapshotExposureWageBenefits700DV.pcf: line 235, column 40
    function valueRoot_117 () : java.lang.Object {
      return Exposure.NewEmpData
    }
    
    // 'value' attribute on DateInput (id=EmploymentData_HireDate) at ClaimSnapshotExposureWageBenefits700DV.pcf: line 37, column 38
    function valueRoot_13 () : java.lang.Object {
      return Exposure.PriorEmpData
    }
    
    // 'value' attribute on TextInput (id=Person_Occupation) at ClaimSnapshotExposureWageBenefits700DV.pcf: line 21, column 38
    function valueRoot_4 () : java.lang.Object {
      return Exposure.Claimant
    }
    
    // 'value' attribute on TextInput (id=CompBenefits_BenefitsBeginDate) at ClaimSnapshotExposureWageBenefits700DV.pcf: line 129, column 38
    function valueRoot_58 () : java.lang.Object {
      return Exposure.CompBenefits
    }
    
    // 'value' attribute on TextInput (id=Person_Employer) at ClaimSnapshotExposureWageBenefits700DV.pcf: line 26, column 38
    function valueRoot_7 () : java.lang.Object {
      return Exposure.Claimant.ContactCompany
    }
    
    // 'value' attribute on TextInput (id=WorkersCompCollected_Question) at ClaimSnapshotExposureWageBenefits700DV.pcf: line 152, column 38
    function valueRoot_70 () : java.lang.Object {
      return Exposure
    }
    
    // 'value' attribute on TextInput (id=PIPDamages_WCCarrier) at ClaimSnapshotExposureWageBenefits700DV.pcf: line 159, column 40
    function valueRoot_73 () : java.lang.Object {
      return Exposure.WCCarrier
    }
    
    // 'value' attribute on TextInput (id=WCCarrier_PrimaryContact) at ClaimSnapshotExposureWageBenefits700DV.pcf: line 169, column 40
    function valueRoot_79 () : java.lang.Object {
      return Exposure.WCCarrier.PrimaryContact
    }
    
    // 'value' attribute on TextInput (id=WCBenefits_BenefitsBeginDate) at ClaimSnapshotExposureWageBenefits700DV.pcf: line 179, column 40
    function valueRoot_85 () : java.lang.Object {
      return Exposure.WCBenefits
    }
    
    // 'value' attribute on TextInput (id=SSDIBenefits_BeginDate) at ClaimSnapshotExposureWageBenefits700DV.pcf: line 194, column 40
    function valueRoot_94 () : java.lang.Object {
      return Exposure.SSDIBenefits
    }
    
    // 'value' attribute on TextInput (id=PIPDamages_Claimant) at ClaimSnapshotExposureWageBenefits700DV.pcf: line 16, column 63
    function value_0 () : java.lang.String {
      return util.Snapshot.renderValue(Exposure.Claimant)
    }
    
    // 'value' attribute on TextInput (id=PartialWageBenefitCollected_Question) at ClaimSnapshotExposureWageBenefits700DV.pcf: line 208, column 38
    function value_100 () : dynamic.Dynamic {
      return Exposure.WageBenefit
    }
    
    // 'value' attribute on TextInput (id=PartialPIPDamages_Employer) at ClaimSnapshotExposureWageBenefits700DV.pcf: line 215, column 40
    function value_103 () : dynamic.Dynamic {
      return Exposure.Employer.DisplayName
    }
    
    // 'value' attribute on TextInput (id=PartialEmployer_PrimaryAddress) at ClaimSnapshotExposureWageBenefits700DV.pcf: line 220, column 40
    function value_106 () : dynamic.Dynamic {
      return Exposure.Employer.PrimaryAddressDisplayValue
    }
    
    // 'value' attribute on TextInput (id=PartialEmployer_PrimaryContact) at ClaimSnapshotExposureWageBenefits700DV.pcf: line 225, column 40
    function value_109 () : dynamic.Dynamic {
      return Exposure.Employer.PrimaryContact.DisplayName
    }
    
    // 'value' attribute on DateInput (id=EmploymentData_HireDate) at ClaimSnapshotExposureWageBenefits700DV.pcf: line 37, column 38
    function value_11 () : dynamic.Dynamic {
      return Exposure.PriorEmpData.HireDate
    }
    
    // 'value' attribute on TextInput (id=PartialEmployer_PrimaryPhone) at ClaimSnapshotExposureWageBenefits700DV.pcf: line 230, column 40
    function value_112 () : dynamic.Dynamic {
      return Exposure.Employer.PrimaryPhoneValue
    }
    
    // 'value' attribute on TextInput (id=PartialEmploymentData_NumHoursWorkedPerDay) at ClaimSnapshotExposureWageBenefits700DV.pcf: line 235, column 40
    function value_115 () : dynamic.Dynamic {
      return Exposure.NewEmpData.NumHoursWorked
    }
    
    // 'value' attribute on TextInput (id=PartialEmploymentData_NumDaysWorkedPerWeek) at ClaimSnapshotExposureWageBenefits700DV.pcf: line 240, column 40
    function value_118 () : dynamic.Dynamic {
      return Exposure.NewEmpData.NumDaysWorked
    }
    
    // 'value' attribute on TextInput (id=PartialEmploymentData_WageAmount) at ClaimSnapshotExposureWageBenefits700DV.pcf: line 245, column 40
    function value_121 () : dynamic.Dynamic {
      return Exposure.NewEmpData.WageAmount
    }
    
    // 'value' attribute on TextInput (id=PartialEmploymentData_PayPeriod) at ClaimSnapshotExposureWageBenefits700DV.pcf: line 250, column 40
    function value_124 () : dynamic.Dynamic {
      return Exposure.NewEmpData.PayPeriod
    }
    
    // 'value' attribute on TextInput (id=EmploymentData_EmploymentStatus) at ClaimSnapshotExposureWageBenefits700DV.pcf: line 42, column 38
    function value_14 () : dynamic.Dynamic {
      return Exposure.PriorEmpData.EmploymentStatus
    }
    
    // 'value' attribute on TextInput (id=EmploymentData_NumHoursWorkedPerDay) at ClaimSnapshotExposureWageBenefits700DV.pcf: line 47, column 38
    function value_17 () : dynamic.Dynamic {
      return Exposure.PriorEmpData.NumHoursWorked
    }
    
    // 'value' attribute on TextInput (id=Person_Occupation) at ClaimSnapshotExposureWageBenefits700DV.pcf: line 21, column 38
    function value_2 () : dynamic.Dynamic {
      return Exposure.Claimant.Occupation
    }
    
    // 'value' attribute on TextInput (id=EmploymentData_NumDaysWorkedPerWeek) at ClaimSnapshotExposureWageBenefits700DV.pcf: line 52, column 38
    function value_20 () : dynamic.Dynamic {
      return Exposure.PriorEmpData.NumDaysWorked
    }
    
    // 'value' attribute on TextInput (id=EmploymentData_WageAmount) at ClaimSnapshotExposureWageBenefits700DV.pcf: line 57, column 38
    function value_23 () : dynamic.Dynamic {
      return Exposure.PriorEmpData.WageAmount
    }
    
    // 'value' attribute on TextInput (id=EmploymentData_OvertimeRate) at ClaimSnapshotExposureWageBenefits700DV.pcf: line 62, column 38
    function value_26 () : dynamic.Dynamic {
      return Exposure.PriorEmpData.OvertimeRate
    }
    
    // 'value' attribute on TextInput (id=EmploymentData_LastYearIncome) at ClaimSnapshotExposureWageBenefits700DV.pcf: line 67, column 38
    function value_29 () : dynamic.Dynamic {
      return Exposure.PriorEmpData.LastYearIncome
    }
    
    // 'value' attribute on TextInput (id=EmploymentData_PayPeriod) at ClaimSnapshotExposureWageBenefits700DV.pcf: line 72, column 38
    function value_32 () : dynamic.Dynamic {
      return Exposure.PriorEmpData.PayPeriod
    }
    
    // 'value' attribute on TextInput (id=EmploymentData_WagePaymentCont) at ClaimSnapshotExposureWageBenefits700DV.pcf: line 77, column 38
    function value_35 () : dynamic.Dynamic {
      return Exposure.PriorEmpData.WagePaymentCont
    }
    
    // 'value' attribute on DateInput (id=EmploymentData_InjuryStartTime) at ClaimSnapshotExposureWageBenefits700DV.pcf: line 84, column 38
    function value_38 () : dynamic.Dynamic {
      return Exposure.PriorEmpData.InjuryStartTime
    }
    
    // 'value' attribute on TextInput (id=EmploymentData_DaysWorkedWeek) at ClaimSnapshotExposureWageBenefits700DV.pcf: line 89, column 38
    function value_41 () : dynamic.Dynamic {
      return Exposure.PriorEmpData.DaysWorkedWeek
    }
    
    // 'value' attribute on TextInput (id=Person_Employer) at ClaimSnapshotExposureWageBenefits700DV.pcf: line 26, column 38
    function value_5 () : dynamic.Dynamic {
      return Exposure.Claimant.ContactCompany.DisplayName
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotExposureWageBenefits700DV.pcf: line 101, column 41
    function value_55 () : dynamic.Dynamic {
      return Exposure.PriorEmpData.WorkStatusChanges
    }
    
    // 'value' attribute on TextInput (id=CompBenefits_BenefitsBeginDate) at ClaimSnapshotExposureWageBenefits700DV.pcf: line 129, column 38
    function value_56 () : dynamic.Dynamic {
      return Exposure.CompBenefits.BenefitsBeginDate
    }
    
    // 'value' attribute on TextInput (id=CompBenefits_BenefitsEndDate) at ClaimSnapshotExposureWageBenefits700DV.pcf: line 134, column 38
    function value_59 () : dynamic.Dynamic {
      return Exposure.CompBenefits.BenefitsEndDate
    }
    
    // 'value' attribute on TextInput (id=CompBenefits_WeeklyCompRate) at ClaimSnapshotExposureWageBenefits700DV.pcf: line 139, column 38
    function value_62 () : dynamic.Dynamic {
      return Exposure.CompBenefits.WeeklyCompRate
    }
    
    // 'value' attribute on TextInput (id=CompBenefits_PaymentFrequency) at ClaimSnapshotExposureWageBenefits700DV.pcf: line 144, column 38
    function value_65 () : dynamic.Dynamic {
      return Exposure.CompBenefits.PaymentFrequency
    }
    
    // 'value' attribute on TextInput (id=WorkersCompCollected_Question) at ClaimSnapshotExposureWageBenefits700DV.pcf: line 152, column 38
    function value_68 () : dynamic.Dynamic {
      return Exposure.WCBenefit
    }
    
    // 'value' attribute on TextInput (id=PIPDamages_WCCarrier) at ClaimSnapshotExposureWageBenefits700DV.pcf: line 159, column 40
    function value_71 () : dynamic.Dynamic {
      return Exposure.WCCarrier.DisplayName
    }
    
    // 'value' attribute on TextInput (id=WCCarrier_PrimaryAddress) at ClaimSnapshotExposureWageBenefits700DV.pcf: line 164, column 40
    function value_74 () : dynamic.Dynamic {
      return Exposure.WCCarrier.PrimaryAddressDisplayValue
    }
    
    // 'value' attribute on TextInput (id=WCCarrier_PrimaryContact) at ClaimSnapshotExposureWageBenefits700DV.pcf: line 169, column 40
    function value_77 () : dynamic.Dynamic {
      return Exposure.WCCarrier.PrimaryContact.DisplayName
    }
    
    // 'value' attribute on TextInput (id=Company_PrimaryContact) at ClaimSnapshotExposureWageBenefits700DV.pcf: line 31, column 38
    function value_8 () : dynamic.Dynamic {
      return Exposure.Claimant.ContactCompany.PrimaryContact.DisplayName
    }
    
    // 'value' attribute on TextInput (id=WCCarrier_PrimaryPhone) at ClaimSnapshotExposureWageBenefits700DV.pcf: line 174, column 40
    function value_80 () : dynamic.Dynamic {
      return Exposure.WCCarrier.PrimaryPhoneValue
    }
    
    // 'value' attribute on TextInput (id=WCBenefits_BenefitsBeginDate) at ClaimSnapshotExposureWageBenefits700DV.pcf: line 179, column 40
    function value_83 () : dynamic.Dynamic {
      return Exposure.WCBenefits.BenefitsBeginDate
    }
    
    // 'value' attribute on TextInput (id=SSCollected_Question) at ClaimSnapshotExposureWageBenefits700DV.pcf: line 188, column 38
    function value_87 () : dynamic.Dynamic {
      return Exposure.SSBenefit
    }
    
    // 'value' attribute on TextInput (id=SSDIBenefits_BeginDate) at ClaimSnapshotExposureWageBenefits700DV.pcf: line 194, column 40
    function value_91 () : dynamic.Dynamic {
      return Exposure.SSDIBenefits.BenefitsBeginDate
    }
    
    // 'value' attribute on TextInput (id=LostWagesBenefits_MonthlyCompRate) at ClaimSnapshotExposureWageBenefits700DV.pcf: line 200, column 40
    function value_96 () : dynamic.Dynamic {
      return Exposure.SSDIBenefits.MonthlyCompRate
    }
    
    // 'visible' attribute on InputSet at ClaimSnapshotExposureWageBenefits700DV.pcf: line 210, column 40
    function visible_127 () : java.lang.Boolean {
      return Exposure.WageBenefit
    }
    
    // 'visible' attribute on InputSet at ClaimSnapshotExposureWageBenefits700DV.pcf: line 154, column 38
    function visible_86 () : java.lang.Boolean {
      return Exposure.WCBenefit
    }
    
    // 'visible' attribute on TextInput (id=SSDIBenefits_BeginDate) at ClaimSnapshotExposureWageBenefits700DV.pcf: line 194, column 40
    function visible_90 () : java.lang.Boolean {
      return  Exposure.SSBenefit
    }
    
    property get Exposure () : dynamic.Dynamic {
      return getRequireValue("Exposure", 0) as dynamic.Dynamic
    }
    
    property set Exposure ($arg :  dynamic.Dynamic) {
      setRequireValue("Exposure", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/700/ClaimSnapshotExposureWageBenefits700DV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ClaimSnapshotExposureWageBenefits700DVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=Status) at ClaimSnapshotExposureWageBenefits700DV.pcf: line 111, column 46
    function valueRoot_51 () : java.lang.Object {
      return WorkStatusChange
    }
    
    // 'value' attribute on TextCell (id=StatusDate) at ClaimSnapshotExposureWageBenefits700DV.pcf: line 106, column 81
    function value_47 () : java.lang.String {
      return util.Snapshot.renderValue(WorkStatusChange.StatusDate)
    }
    
    // 'value' attribute on TextCell (id=Status) at ClaimSnapshotExposureWageBenefits700DV.pcf: line 111, column 46
    function value_49 () : dynamic.Dynamic {
      return WorkStatusChange.Status
    }
    
    // 'value' attribute on TextCell (id=Comments) at ClaimSnapshotExposureWageBenefits700DV.pcf: line 116, column 46
    function value_52 () : dynamic.Dynamic {
      return WorkStatusChange.Comments
    }
    
    property get WorkStatusChange () : dynamic.Dynamic {
      return getIteratedValue(1) as dynamic.Dynamic
    }
    
    
  }
  
  
}