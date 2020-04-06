package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/exposures/iso/ISOMatchReportsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ISOMatchReportsLVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/exposures/iso/ISOMatchReportsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ISOMatchReportsLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at ISOMatchReportsLV.pcf: line 22, column 51
    function sortValue_0 (isoMatchReport :  entity.ISOMatchReport) : java.lang.Object {
      return isoMatchReport.InsuringCompany
    }
    
    // 'value' attribute on RowIterator at ISOMatchReportsLV.pcf: line 26, column 48
    function sortValue_1 (isoMatchReport :  entity.ISOMatchReport) : java.lang.Object {
      return isoMatchReport.InsurerPhone
    }
    
    // 'value' attribute on RowIterator at ISOMatchReportsLV.pcf: line 31, column 47
    function sortValue_2 (isoMatchReport :  entity.ISOMatchReport) : java.lang.Object {
      return isoMatchReport.ClaimNumber
    }
    
    // 'value' attribute on RowIterator at ISOMatchReportsLV.pcf: line 36, column 46
    function sortValue_3 (isoMatchReport :  entity.ISOMatchReport) : java.lang.Object {
      return isoMatchReport.DateOfLoss
    }
    
    // 'value' attribute on RowIterator at ISOMatchReportsLV.pcf: line 40, column 48
    function sortValue_4 (isoMatchReport :  entity.ISOMatchReport) : java.lang.Object {
      return isoMatchReport.PolicyNumber
    }
    
    // 'value' attribute on RowIterator at ISOMatchReportsLV.pcf: line 46, column 48
    function sortValue_5 (isoMatchReport :  entity.ISOMatchReport) : java.lang.Object {
      return isoMatchReport.ReceivedDate
    }
    
    // 'value' attribute on RowIterator at ISOMatchReportsLV.pcf: line 16, column 43
    function value_28 () : entity.ISOMatchReport[] {
      return isoReportable.ISOMatchReports
    }
    
    property get isoReportable () : ISOReportable {
      return getRequireValue("isoReportable", 0) as ISOReportable
    }
    
    property set isoReportable ($arg :  ISOReportable) {
      setRequireValue("isoReportable", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/exposures/iso/ISOMatchReportsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ISOMatchReportsLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextCell (id=ClaimNumber) at ISOMatchReportsLV.pcf: line 31, column 47
    function action_15 () : void {
      ISOMatchReportDetailPopup.push(isoMatchReport)
    }
    
    // 'action' attribute on TextCell (id=Insurer) at ISOMatchReportsLV.pcf: line 22, column 51
    function action_7 () : void {
      ISOMatchReportDetailPopup.push(isoMatchReport)
    }
    
    // 'action' attribute on TextCell (id=ClaimNumber) at ISOMatchReportsLV.pcf: line 31, column 47
    function action_dest_16 () : pcf.api.Destination {
      return pcf.ISOMatchReportDetailPopup.createDestination(isoMatchReport)
    }
    
    // 'action' attribute on TextCell (id=Insurer) at ISOMatchReportsLV.pcf: line 22, column 51
    function action_dest_8 () : pcf.api.Destination {
      return pcf.ISOMatchReportDetailPopup.createDestination(isoMatchReport)
    }
    
    // 'value' attribute on TextCell (id=Insurer) at ISOMatchReportsLV.pcf: line 22, column 51
    function valueRoot_10 () : java.lang.Object {
      return isoMatchReport
    }
    
    // 'value' attribute on TextCell (id=InsurerPhone) at ISOMatchReportsLV.pcf: line 26, column 48
    function value_11 () : java.lang.String {
      return isoMatchReport.InsurerPhone
    }
    
    // 'value' attribute on TextCell (id=ClaimNumber) at ISOMatchReportsLV.pcf: line 31, column 47
    function value_14 () : java.lang.String {
      return isoMatchReport.ClaimNumber
    }
    
    // 'value' attribute on DateCell (id=LossDate) at ISOMatchReportsLV.pcf: line 36, column 46
    function value_19 () : java.util.Date {
      return isoMatchReport.DateOfLoss
    }
    
    // 'value' attribute on TextCell (id=PolicyNumber) at ISOMatchReportsLV.pcf: line 40, column 48
    function value_22 () : java.lang.String {
      return isoMatchReport.PolicyNumber
    }
    
    // 'value' attribute on DateCell (id=ReceivedDate) at ISOMatchReportsLV.pcf: line 46, column 48
    function value_25 () : java.util.Date {
      return isoMatchReport.ReceivedDate
    }
    
    // 'value' attribute on TextCell (id=Insurer) at ISOMatchReportsLV.pcf: line 22, column 51
    function value_6 () : java.lang.String {
      return isoMatchReport.InsuringCompany
    }
    
    property get isoMatchReport () : entity.ISOMatchReport {
      return getIteratedValue(1) as entity.ISOMatchReport
    }
    
    
  }
  
  
}