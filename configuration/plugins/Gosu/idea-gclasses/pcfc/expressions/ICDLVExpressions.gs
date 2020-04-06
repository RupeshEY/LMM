package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/icd/ICDLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ICDLVExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/icd/ICDLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ICDLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'pickLocation' attribute on RowIterator (id=ICDIterator) at ICDLV.pcf: line 19, column 74
    function pickLocation_26 () : void {
      ICDPopup.push()
    }
    
    // 'value' attribute on RowIterator (id=ICDIterator) at ICDLV.pcf: line 28, column 34
    function sortValue_0 (ICD_Code :  entity.ICDCode) : java.lang.Object {
      return ICD_Code.Code
    }
    
    // 'value' attribute on RowIterator (id=ICDIterator) at ICDLV.pcf: line 33, column 38
    function sortValue_1 (ICD_Code :  entity.ICDCode) : java.lang.Object {
      return ICD_Code.CodeDesc
    }
    
    // 'value' attribute on RowIterator (id=ICDIterator) at ICDLV.pcf: line 38, column 46
    function sortValue_2 (ICD_Code :  entity.ICDCode) : java.lang.Object {
      return ICD_Code.BodySystem
    }
    
    // 'value' attribute on RowIterator (id=ICDIterator) at ICDLV.pcf: line 42, column 37
    function sortValue_3 (ICD_Code :  entity.ICDCode) : java.lang.Object {
      return ICD_Code.Chronic
    }
    
    // 'value' attribute on RowIterator (id=ICDIterator) at ICDLV.pcf: line 47, column 46
    function sortValue_4 (ICD_Code :  entity.ICDCode) : java.lang.Object {
      return ICD_Code.AvailabilityDate
    }
    
    // 'value' attribute on RowIterator (id=ICDIterator) at ICDLV.pcf: line 52, column 40
    function sortValue_5 (ICD_Code :  entity.ICDCode) : java.lang.Object {
      return ICD_Code.ExpiryDate
    }
    
    // 'value' attribute on RowIterator (id=ICDIterator) at ICDLV.pcf: line 19, column 74
    function value_27 () : gw.api.database.IQueryBeanResult<entity.ICDCode> {
      return ICDs
    }
    
    property get ICDs () : gw.api.database.IQueryBeanResult<ICDCode> {
      return getRequireValue("ICDs", 0) as gw.api.database.IQueryBeanResult<ICDCode>
    }
    
    property set ICDs ($arg :  gw.api.database.IQueryBeanResult<ICDCode>) {
      setRequireValue("ICDs", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/admin/icd/ICDLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ICDLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextCell (id=ICDFullCode) at ICDLV.pcf: line 28, column 34
    function action_7 () : void {
      ICDPopup.push(ICD_Code)
    }
    
    // 'action' attribute on TextCell (id=ICDFullCode) at ICDLV.pcf: line 28, column 34
    function action_dest_8 () : pcf.api.Destination {
      return pcf.ICDPopup.createDestination(ICD_Code)
    }
    
    // 'value' attribute on TextCell (id=ICDFullCode) at ICDLV.pcf: line 28, column 34
    function valueRoot_10 () : java.lang.Object {
      return ICD_Code
    }
    
    // 'value' attribute on TextCell (id=ICDDesc) at ICDLV.pcf: line 33, column 38
    function value_11 () : java.lang.String {
      return ICD_Code.CodeDesc
    }
    
    // 'value' attribute on TypeKeyCell (id=Body_System) at ICDLV.pcf: line 38, column 46
    function value_14 () : typekey.ICDBodySystem {
      return ICD_Code.BodySystem
    }
    
    // 'value' attribute on CheckBoxCell (id=Chronic) at ICDLV.pcf: line 42, column 37
    function value_17 () : java.lang.Boolean {
      return ICD_Code.Chronic
    }
    
    // 'value' attribute on DateCell (id=Date_Available) at ICDLV.pcf: line 47, column 46
    function value_20 () : java.util.Date {
      return ICD_Code.AvailabilityDate
    }
    
    // 'value' attribute on DateCell (id=Expiry_Date) at ICDLV.pcf: line 52, column 40
    function value_23 () : java.util.Date {
      return ICD_Code.ExpiryDate
    }
    
    // 'value' attribute on TextCell (id=ICDFullCode) at ICDLV.pcf: line 28, column 34
    function value_6 () : java.lang.String {
      return ICD_Code.Code
    }
    
    property get ICD_Code () : entity.ICDCode {
      return getIteratedValue(1) as entity.ICDCode
    }
    
    
  }
  
  
}