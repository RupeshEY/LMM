package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/financials/checks/ApprovalHistoryLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ApprovalHistoryLVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/financials/checks/ApprovalHistoryLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ApprovalHistoryLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at ApprovalHistoryLV.pcf: line 25, column 39
    function sortValue_0 (Activity :  entity.Activity) : java.lang.Object {
      return Activity.CloseDate
    }
    
    // 'value' attribute on RowIterator at ApprovalHistoryLV.pcf: line 29, column 61
    function sortValue_1 (Activity :  entity.Activity) : java.lang.Object {
      return getApprovalUserOrGroupString( Activity )
    }
    
    // 'value' attribute on RowIterator at ApprovalHistoryLV.pcf: line 33, column 48
    function sortValue_2 (Activity :  entity.Activity) : java.lang.Object {
      return getApprovalString(Activity)
    }
    
    // 'value' attribute on RowIterator at ApprovalHistoryLV.pcf: line 37, column 43
    function sortValue_3 (Activity :  entity.Activity) : java.lang.Object {
      return Activity.ApprovalIssue
    }
    
    // 'value' attribute on RowIterator at ApprovalHistoryLV.pcf: line 41, column 47
    function sortValue_4 (Activity :  entity.Activity) : java.lang.Object {
      return Activity.ApprovalRationale
    }
    
    // 'value' attribute on RowIterator at ApprovalHistoryLV.pcf: line 16, column 37
    function value_18 () : entity.Activity[] {
      return ActivityList
    }
    
    property get ActivityList () : Activity[] {
      return getRequireValue("ActivityList", 0) as Activity[]
    }
    
    property set ActivityList ($arg :  Activity[]) {
      setRequireValue("ActivityList", 0, $arg)
    }
    
    
    function getApprovalUserOrGroupString(approvalHistory : Activity) : String {
      var closeUser = approvalHistory.CloseUser
      var assignedUser = approvalHistory.AssignedUser
      var assignedGroup = approvalHistory.AssignedGroup
      
      if( closeUser != null )  {
        return closeUser.DisplayName
      } 
      else if( assignedUser != null ) {
        return assignedUser.DisplayName
      }  
      else if( assignedGroup != null ) {
        return assignedGroup.DisplayName
      } 
      else {
        return ""
      }
    }
    
    function getApprovalString( activity : Activity ) : String {
      if (activity.Approved == null) {
        return DisplayKey.get("Java.ApprovalHistory.PendingApproval")
      } else if (activity.Approved) {
        return DisplayKey.get("Java.ApprovalHistory.Approved")
      } else {
        return DisplayKey.get("Java.ApprovalHistory.Rejected")
      }
    }
        
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/financials/checks/ApprovalHistoryLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ApprovalHistoryLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on DateCell (id=ApprovalHistory_Date) at ApprovalHistoryLV.pcf: line 25, column 39
    function valueRoot_7 () : java.lang.Object {
      return Activity
    }
    
    // 'value' attribute on TextCell (id=Approved) at ApprovalHistoryLV.pcf: line 33, column 48
    function value_10 () : java.lang.String {
      return getApprovalString(Activity)
    }
    
    // 'value' attribute on TextCell (id=ApprovalIssue) at ApprovalHistoryLV.pcf: line 37, column 43
    function value_12 () : java.lang.String {
      return Activity.ApprovalIssue
    }
    
    // 'value' attribute on TextCell (id=ApprovalRationale) at ApprovalHistoryLV.pcf: line 41, column 47
    function value_15 () : java.lang.String {
      return Activity.ApprovalRationale
    }
    
    // 'value' attribute on DateCell (id=ApprovalHistory_Date) at ApprovalHistoryLV.pcf: line 25, column 39
    function value_5 () : java.util.Date {
      return Activity.CloseDate
    }
    
    // 'value' attribute on TextCell (id=User) at ApprovalHistoryLV.pcf: line 29, column 61
    function value_8 () : java.lang.String {
      return getApprovalUserOrGroupString( Activity )
    }
    
    property get Activity () : entity.Activity {
      return getIteratedValue(1) as entity.Activity
    }
    
    
  }
  
  
}