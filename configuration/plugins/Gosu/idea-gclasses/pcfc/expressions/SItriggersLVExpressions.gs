package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/sidetails/SItriggersLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class SItriggersLVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/lossdetails/sidetails/SItriggersLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends SItriggersLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=SItriggers_PointValue) at SItriggersLV.pcf: line 22, column 53
    function valueRoot_7 () : java.lang.Object {
      return SITriggersEntity
    }
    
    // 'value' attribute on TextCell (id=SItriggers_AdditionalInfo) at SItriggersLV.pcf: line 30, column 59
    function value_11 () : java.lang.String {
      return SITriggersEntity.AdditionalInformation
    }
    
    // 'value' attribute on TextCell (id=SItriggers_PointValue) at SItriggersLV.pcf: line 22, column 53
    function value_5 () : java.lang.Integer {
      return SITriggersEntity.PointValue
    }
    
    // 'value' attribute on TextCell (id=SItriggers_Description) at SItriggersLV.pcf: line 26, column 56
    function value_8 () : java.lang.String {
      return SITriggersEntity.TriggerDescription
    }
    
    // 'visible' attribute on TextCell (id=SItriggers_PointValue) at SItriggersLV.pcf: line 22, column 53
    function visible_4 () : java.lang.Boolean {
      return perm.System.viewSensSIUdetails
    }
    
    property get SITriggersEntity () : entity.SITrigger {
      return getIteratedValue(1) as entity.SITrigger
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/lossdetails/sidetails/SItriggersLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SItriggersLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at SItriggersLV.pcf: line 22, column 53
    function sortValue_1 (SITriggersEntity :  entity.SITrigger) : java.lang.Object {
      return SITriggersEntity.PointValue
    }
    
    // 'value' attribute on RowIterator at SItriggersLV.pcf: line 26, column 56
    function sortValue_2 (SITriggersEntity :  entity.SITrigger) : java.lang.Object {
      return SITriggersEntity.TriggerDescription
    }
    
    // 'value' attribute on RowIterator at SItriggersLV.pcf: line 30, column 59
    function sortValue_3 (SITriggersEntity :  entity.SITrigger) : java.lang.Object {
      return SITriggersEntity.AdditionalInformation
    }
    
    // 'value' attribute on RowIterator at SItriggersLV.pcf: line 15, column 38
    function value_14 () : entity.SITrigger[] {
      return Claim.SITriggers
    }
    
    // 'visible' attribute on RowIterator at SItriggersLV.pcf: line 22, column 53
    function visible_0 () : java.lang.Boolean {
      return perm.System.viewSensSIUdetails
    }
    
    property get Claim () : Claim {
      return getRequireValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setRequireValue("Claim", 0, $arg)
    }
    
    
  }
  
  
}