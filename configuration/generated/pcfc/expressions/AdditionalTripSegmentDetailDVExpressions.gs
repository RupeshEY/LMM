package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/AdditionalTripSegmentDetailDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class AdditionalTripSegmentDetailDVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/lossdetails/AdditionalTripSegmentDetailDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AdditionalTripSegmentDetailDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on InputSetRef at AdditionalTripSegmentDetailDV.pcf: line 17, column 26
    function def_onEnter_0 (def :  pcf.AdditionalTripSegmentInputSet) : void {
      def.onEnter(anAddnlTripSegment, affectedTripSegment.TripIncident)
    }
    
    // 'def' attribute on InputSetRef at AdditionalTripSegmentDetailDV.pcf: line 17, column 26
    function def_refreshVariables_1 (def :  pcf.AdditionalTripSegmentInputSet) : void {
      def.refreshVariables(anAddnlTripSegment, affectedTripSegment.TripIncident)
    }
    
    property get affectedTripSegment () : TripSegment {
      return getRequireValue("affectedTripSegment", 0) as TripSegment
    }
    
    property set affectedTripSegment ($arg :  TripSegment) {
      setRequireValue("affectedTripSegment", 0, $arg)
    }
    
    property get anAddnlTripSegment () : AddnlTripSegment {
      return getRequireValue("anAddnlTripSegment", 0) as AddnlTripSegment
    }
    
    property set anAddnlTripSegment ($arg :  AddnlTripSegment) {
      setRequireValue("anAddnlTripSegment", 0, $arg)
    }
    
    
  }
  
  
}