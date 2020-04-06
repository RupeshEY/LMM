package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/EditableWorkStatusChangesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class EditableWorkStatusChangesLVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/lossdetails/EditableWorkStatusChangesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditableWorkStatusChangesLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'pickLocation' attribute on RowIterator at EditableWorkStatusChangesLV.pcf: line 24, column 39
    function pickLocation_14 () : void {
      NewWorkStatusPopup.push(EmploymentData, verifyEmploymentDataExists())
    }
    
    // 'value' attribute on RowIterator at EditableWorkStatusChangesLV.pcf: line 30, column 42
    function sortValue_0 (WorkStatus :  entity.WorkStatus) : java.lang.Object {
      return WorkStatus.StatusDate
    }
    
    // 'value' attribute on RowIterator at EditableWorkStatusChangesLV.pcf: line 34, column 45
    function sortValue_1 (WorkStatus :  entity.WorkStatus) : java.lang.Object {
      return WorkStatus.StatusEndDate
    }
    
    // 'value' attribute on RowIterator at EditableWorkStatusChangesLV.pcf: line 40, column 45
    function sortValue_2 (WorkStatus :  entity.WorkStatus) : java.lang.Object {
      return WorkStatus.Status
    }
    
    // 'toAdd' attribute on RowIterator at EditableWorkStatusChangesLV.pcf: line 24, column 39
    function toAdd_15 (WorkStatus :  entity.WorkStatus) : void {
      EmploymentData.addToWorkStatusChanges( WorkStatus )
    }
    
    // 'toRemove' attribute on RowIterator at EditableWorkStatusChangesLV.pcf: line 24, column 39
    function toRemove_16 (WorkStatus :  entity.WorkStatus) : void {
      EmploymentData.removeFromWorkStatusChanges(WorkStatus)
    }
    
    // 'value' attribute on RowIterator at EditableWorkStatusChangesLV.pcf: line 24, column 39
    function value_17 () : entity.WorkStatus[] {
      return EmploymentData.WorkStatusChanges
    }
    
    property get EmploymentData () : EmploymentData {
      return getRequireValue("EmploymentData", 0) as EmploymentData
    }
    
    property set EmploymentData ($arg :  EmploymentData) {
      setRequireValue("EmploymentData", 0, $arg)
    }
    
    
    function verifyEmploymentDataExists() : boolean {
      if (EmploymentData == null) {
        throw new gw.api.util.DisplayableException(DisplayKey.get("NVV.Claim.SubView.LossDetailsWorkersComp.Claim.EmploymentData.Missing"))
      } 
      return true
    }
          
        
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/lossdetails/EditableWorkStatusChangesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends EditableWorkStatusChangesLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on DateCell (id=Date) at EditableWorkStatusChangesLV.pcf: line 30, column 42
    function action_4 () : void {
      WorkStatusPopup.push(WorkStatus, CurrentLocation.InEditMode)
    }
    
    // 'action' attribute on DateCell (id=Date) at EditableWorkStatusChangesLV.pcf: line 30, column 42
    function action_dest_5 () : pcf.api.Destination {
      return pcf.WorkStatusPopup.createDestination(WorkStatus, CurrentLocation.InEditMode)
    }
    
    // 'value' attribute on DateCell (id=Date) at EditableWorkStatusChangesLV.pcf: line 30, column 42
    function valueRoot_7 () : java.lang.Object {
      return WorkStatus
    }
    
    // 'value' attribute on TypeKeyCell (id=Type) at EditableWorkStatusChangesLV.pcf: line 40, column 45
    function value_11 () : typekey.WorkCapacity {
      return WorkStatus.Status
    }
    
    // 'value' attribute on DateCell (id=Date) at EditableWorkStatusChangesLV.pcf: line 30, column 42
    function value_3 () : java.util.Date {
      return WorkStatus.StatusDate
    }
    
    // 'value' attribute on DateCell (id=EndDate) at EditableWorkStatusChangesLV.pcf: line 34, column 45
    function value_8 () : java.util.Date {
      return WorkStatus.StatusEndDate
    }
    
    property get WorkStatus () : entity.WorkStatus {
      return getIteratedValue(1) as entity.WorkStatus
    }
    
    
  }
  
  
}