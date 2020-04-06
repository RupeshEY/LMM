package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/exposures/iso/ISOMatchReportDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ISOMatchReportDVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/exposures/iso/ISOMatchReportDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ISOMatchReportDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextInput (id=InsuringCompany) at ISOMatchReportDV.pcf: line 17, column 49
    function valueRoot_2 () : java.lang.Object {
      return ISOMatchReport
    }
    
    // 'value' attribute on TextInput (id=InsuringCompany) at ISOMatchReportDV.pcf: line 17, column 49
    function value_0 () : java.lang.String {
      return ISOMatchReport.InsuringCompany
    }
    
    // 'value' attribute on DateInput (id=LossDate) at ISOMatchReportDV.pcf: line 39, column 44
    function value_12 () : java.util.Date {
      return ISOMatchReport.DateOfLoss
    }
    
    // 'value' attribute on TextInput (id=PolicyNumber) at ISOMatchReportDV.pcf: line 43, column 46
    function value_15 () : java.lang.String {
      return ISOMatchReport.PolicyNumber
    }
    
    // 'value' attribute on TextInput (id=PolicyType) at ISOMatchReportDV.pcf: line 47, column 44
    function value_18 () : java.lang.String {
      return ISOMatchReport.PolicyType
    }
    
    // 'value' attribute on TextInput (id=MatchReasons) at ISOMatchReportDV.pcf: line 53, column 56
    function value_21 () : java.lang.String {
      return ISOMatchReport.MatchReasonsForDisplay
    }
    
    // 'value' attribute on DateInput (id=ReceivedDate) at ISOMatchReportDV.pcf: line 59, column 46
    function value_24 () : java.util.Date {
      return ISOMatchReport.ReceivedDate
    }
    
    // 'value' attribute on TextAreaInput (id=InsurerAddress) at ISOMatchReportDV.pcf: line 23, column 58
    function value_3 () : java.lang.String {
      return ISOMatchReport.InsurerAddressForDisplay
    }
    
    // 'value' attribute on TextInput (id=InsurerPhone) at ISOMatchReportDV.pcf: line 27, column 46
    function value_6 () : java.lang.String {
      return ISOMatchReport.InsurerPhone
    }
    
    // 'value' attribute on TextInput (id=ClaimNumber) at ISOMatchReportDV.pcf: line 33, column 45
    function value_9 () : java.lang.String {
      return ISOMatchReport.ClaimNumber
    }
    
    property get ISOMatchReport () : ISOMatchReport {
      return getRequireValue("ISOMatchReport", 0) as ISOMatchReport
    }
    
    property set ISOMatchReport ($arg :  ISOMatchReport) {
      setRequireValue("ISOMatchReport", 0, $arg)
    }
    
    
  }
  
  
}