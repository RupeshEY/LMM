package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/newother/NewMatter.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewMatterExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/newother/NewMatter.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewMatterExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Claim :  Claim) : int {
      return 0
    }
    
    // 'afterCancel' attribute on Page (id=NewMatter) at NewMatter.pcf: line 15, column 68
    function afterCancel_4 () : void {
      ClaimMatterForward.go(Claim, null)
    }
    
    // 'afterCancel' attribute on Page (id=NewMatter) at NewMatter.pcf: line 15, column 68
    function afterCancel_dest_5 () : pcf.api.Destination {
      return pcf.ClaimMatterForward.createDestination(Claim, null)
    }
    
    // 'afterCommit' attribute on Page (id=NewMatter) at NewMatter.pcf: line 15, column 68
    function afterCommit_6 (TopLocation :  pcf.api.Location) : void {
      ClaimMatterForward.go(Claim, Matter)
    }
    
    // 'beforeCommit' attribute on Page (id=NewMatter) at NewMatter.pcf: line 15, column 68
    function beforeCommit_7 (pickedValue :  java.lang.Object) : void {
      assignMatter(AssigneeHolder[0], Matter)
    }
    
    // 'canVisit' attribute on Page (id=NewMatter) at NewMatter.pcf: line 15, column 68
    static function canVisit_8 (Claim :  Claim) : java.lang.Boolean {
      return perm.Claim.creatematter(Claim)
    }
    
    // 'def' attribute on PanelRef at NewMatter.pcf: line 33, column 51
    function def_onEnter_2 (def :  pcf.NewMatterDV) : void {
      def.onEnter(Matter, AssigneeHolder)
    }
    
    // 'def' attribute on PanelRef at NewMatter.pcf: line 33, column 51
    function def_refreshVariables_3 (def :  pcf.NewMatterDV) : void {
      def.refreshVariables(Matter, AssigneeHolder)
    }
    
    // 'initialValue' attribute on Variable at NewMatter.pcf: line 24, column 22
    function initialValue_0 () : Matter {
      return Claim.newMatter()
    }
    
    // 'initialValue' attribute on Variable at NewMatter.pcf: line 28, column 44
    function initialValue_1 () : gw.api.assignment.Assignee[] {
      return new gw.api.assignment.Assignee[] {gw.api.assignment.AutoAssignAssignee.INSTANCE}
    }
    
    // 'parent' attribute on Page (id=NewMatter) at NewMatter.pcf: line 15, column 68
    static function parent_9 (Claim :  Claim) : pcf.api.Destination {
      return pcf.Claim.createDestination(Claim)
    }
    
    // 'startEditing' attribute on Page (id=NewMatter) at NewMatter.pcf: line 15, column 68
    function startEditing_10 () : void {
      Matter.setInitialValues()
    }
    
    property get AssigneeHolder () : gw.api.assignment.Assignee[] {
      return getVariableValue("AssigneeHolder", 0) as gw.api.assignment.Assignee[]
    }
    
    property set AssigneeHolder ($arg :  gw.api.assignment.Assignee[]) {
      setVariableValue("AssigneeHolder", 0, $arg)
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.NewMatter {
      return super.CurrentLocation as pcf.NewMatter
    }
    
    property get Matter () : Matter {
      return getVariableValue("Matter", 0) as Matter
    }
    
    property set Matter ($arg :  Matter) {
      setVariableValue("Matter", 0, $arg)
    }
    
    
            function assignMatter(Assignee : gw.api.assignment.Assignee, aMatter : Matter){
              Assignee.assignToThis(aMatter);
              aMatter.saveAndSetup();
            }
          
        
    
    
  }
  
  
}