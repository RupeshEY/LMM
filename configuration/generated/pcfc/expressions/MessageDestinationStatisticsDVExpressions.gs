package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/messaging/MessageDestinationStatisticsDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class MessageDestinationStatisticsDVExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/messaging/MessageDestinationStatisticsDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MessageDestinationStatisticsDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'initialValue' attribute on Variable at MessageDestinationStatisticsDV.pcf: line 16, column 57
    function initialValue_0 () : gw.api.admin.DestinationMessageStatistics {
      return gw.api.admin.DestinationMessageStatisticsUtil.getMessageStatisticsForDestinationQuietly(destId)
    }
    
    // 'value' attribute on TextInput (id=Status) at MessageDestinationStatisticsDV.pcf: line 21, column 36
    function valueRoot_3 () : java.lang.Object {
      return statistics
    }
    
    // 'value' attribute on TextInput (id=Status) at MessageDestinationStatisticsDV.pcf: line 21, column 36
    function value_1 () : java.lang.String {
      return statistics.Status
    }
    
    // 'value' attribute on TextInput (id=InFlight) at MessageDestinationStatisticsDV.pcf: line 36, column 40
    function value_10 () : java.lang.Integer {
      return statistics.Inflight
    }
    
    // 'value' attribute on TextInput (id=Unsent) at MessageDestinationStatisticsDV.pcf: line 41, column 40
    function value_13 () : java.lang.Integer {
      return statistics.Unsent
    }
    
    // 'value' attribute on TextInput (id=Batched) at MessageDestinationStatisticsDV.pcf: line 46, column 40
    function value_16 () : java.lang.Integer {
      return statistics.BatchSize
    }
    
    // 'value' attribute on TextInput (id=ErrorCount) at MessageDestinationStatisticsDV.pcf: line 51, column 40
    function value_19 () : java.lang.Integer {
      return statistics.AwaitingRetry
    }
    
    // 'value' attribute on TextInput (id=Error) at MessageDestinationStatisticsDV.pcf: line 26, column 40
    function value_4 () : java.lang.Integer {
      return statistics.Error
    }
    
    // 'value' attribute on TextInput (id=Retry) at MessageDestinationStatisticsDV.pcf: line 31, column 40
    function value_7 () : java.lang.Integer {
      return statistics.RetryableError
    }
    
    // 'visible' attribute on DetailViewPanel (id=MessageDestinationStatisticsDV) at MessageDestinationStatisticsDV.pcf: line 8, column 34
    function visible_22 () : java.lang.Boolean {
      return statistics != null
    }
    
    property get destId () : java.lang.Integer {
      return getRequireValue("destId", 0) as java.lang.Integer
    }
    
    property set destId ($arg :  java.lang.Integer) {
      setRequireValue("destId", 0, $arg)
    }
    
    property get statistics () : gw.api.admin.DestinationMessageStatistics {
      return getVariableValue("statistics", 0) as gw.api.admin.DestinationMessageStatistics
    }
    
    property set statistics ($arg :  gw.api.admin.DestinationMessageStatistics) {
      setVariableValue("statistics", 0, $arg)
    }
    
    
  }
  
  
}