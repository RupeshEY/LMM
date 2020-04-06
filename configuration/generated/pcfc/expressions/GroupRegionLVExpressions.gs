package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/groups/GroupRegionLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class GroupRegionLVExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/groups/GroupRegionLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class GroupRegionLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'conversionExpression' attribute on RowIterator at GroupRegionLV.pcf: line 22, column 40
    function conversionExpression_1 (PickedValue :  Region[]) : entity.GroupRegion[] {
      return gw.api.admin.GroupUtil.createGroupRegions(PickedValue, CurrentLocation)
    }
    
    // 'pickLocation' attribute on RowIterator at GroupRegionLV.pcf: line 22, column 40
    function pickLocation_8 () : void {
      GroupRegionPopup.push()
    }
    
    // 'value' attribute on RowIterator at GroupRegionLV.pcf: line 27, column 44
    function sortValue_0 (GroupRegion :  entity.GroupRegion) : java.lang.Object {
      return GroupRegion.Region.Name
    }
    
    // 'toAdd' attribute on RowIterator at GroupRegionLV.pcf: line 22, column 40
    function toAdd_9 (GroupRegion :  entity.GroupRegion) : void {
      Group.addToRegions(GroupRegion)
    }
    
    // 'toRemove' attribute on RowIterator at GroupRegionLV.pcf: line 22, column 40
    function toRemove_10 (GroupRegion :  entity.GroupRegion) : void {
      Group.removeFromRegions(GroupRegion)
    }
    
    // 'value' attribute on RowIterator at GroupRegionLV.pcf: line 22, column 40
    function value_11 () : entity.GroupRegion[] {
      return Group.Regions
    }
    
    property get Group () : Group {
      return getRequireValue("Group", 0) as Group
    }
    
    property set Group ($arg :  Group) {
      setRequireValue("Group", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/admin/groups/GroupRegionLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends GroupRegionLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=Name) at GroupRegionLV.pcf: line 27, column 44
    function valueRoot_4 () : java.lang.Object {
      return GroupRegion.Region
    }
    
    // 'value' attribute on TextCell (id=Name) at GroupRegionLV.pcf: line 27, column 44
    function value_2 () : java.lang.String {
      return GroupRegion.Region.Name
    }
    
    // 'value' attribute on TextCell (id=Zones) at GroupRegionLV.pcf: line 32, column 45
    function value_5 () : java.lang.String {
      return GroupRegion.Region.Zones
    }
    
    property get GroupRegion () : entity.GroupRegion {
      return getIteratedValue(1) as entity.GroupRegion
    }
    
    
  }
  
  
}