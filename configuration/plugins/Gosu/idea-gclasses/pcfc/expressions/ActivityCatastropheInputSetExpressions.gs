package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/activity/ActivityCatastropheInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ActivityCatastropheInputSetExpressions {
  @javax.annotation.Generated("config/web/pcf/shared/activity/ActivityCatastropheInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ActivityCatastropheInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at ActivityCatastropheInputSet.pcf: line 26, column 54
    function sortValue_0 (catastrophe :  entity.Catastrophe) : java.lang.Object {
      return catastrophe.CatastropheNumber
    }
    
    // 'value' attribute on RowIterator at ActivityCatastropheInputSet.pcf: line 30, column 41
    function sortValue_1 (catastrophe :  entity.Catastrophe) : java.lang.Object {
      return catastrophe.Name
    }
    
    // 'value' attribute on RowIterator at ActivityCatastropheInputSet.pcf: line 34, column 301
    function sortValue_2 (catastrophe :  entity.Catastrophe) : java.lang.Object {
      return DisplayKey.get("LV.Claim.Catastrophes.Catastrophe.ValidToAndFrom", catastrophe.CatastropheValidFrom.format(gw.api.util.LocaleUtil.getCurrentLocale().DateFormat.Short), catastrophe.CatastropheValidTo.format(gw.api.util.LocaleUtil.getCurrentLocale().DateFormat.Short))
    }
    
    // 'value' attribute on RowIterator at ActivityCatastropheInputSet.pcf: line 21, column 44
    function value_11 () : entity.Catastrophe[] {
      return claim.getCatastropheMatchesByZone()
    }
    
    property get claim () : Claim {
      return getRequireValue("claim", 0) as Claim
    }
    
    property set claim ($arg :  Claim) {
      setRequireValue("claim", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/shared/activity/ActivityCatastropheInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ActivityCatastropheInputSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=CatastropheNumber) at ActivityCatastropheInputSet.pcf: line 26, column 54
    function valueRoot_5 () : java.lang.Object {
      return catastrophe
    }
    
    // 'value' attribute on TextCell (id=CatastropheNumber) at ActivityCatastropheInputSet.pcf: line 26, column 54
    function value_3 () : java.lang.String {
      return catastrophe.CatastropheNumber
    }
    
    // 'value' attribute on TextCell (id=CatastropheName) at ActivityCatastropheInputSet.pcf: line 30, column 41
    function value_6 () : java.lang.String {
      return catastrophe.Name
    }
    
    // 'value' attribute on TextCell (id=CatastropheValidDates) at ActivityCatastropheInputSet.pcf: line 34, column 301
    function value_9 () : java.lang.String {
      return DisplayKey.get("LV.Claim.Catastrophes.Catastrophe.ValidToAndFrom", catastrophe.CatastropheValidFrom.format(gw.api.util.LocaleUtil.getCurrentLocale().DateFormat.Short), catastrophe.CatastropheValidTo.format(gw.api.util.LocaleUtil.getCurrentLocale().DateFormat.Short))
    }
    
    property get catastrophe () : entity.Catastrophe {
      return getIteratedValue(1) as entity.Catastrophe
    }
    
    
  }
  
  
}