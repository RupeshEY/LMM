package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/addressbook/AddressBookDirectionsScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class AddressBookDirectionsScreenExpressions {
  @javax.annotation.Generated("config/web/pcf/addressbook/AddressBookDirectionsScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddressBookDirectionsScreenExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // TemplatePanel at AddressBookDirectionsScreen.pcf: line 69, column 22
    function renderCall_15 (__writer :  java.io.Writer, __escaper :  gw.lang.parser.template.StringEscaper, __renderContext :  com.guidewire.pl.web.render.RenderContext, __valueProvider :  com.guidewire.pl.web.render.template.RenderTemplateValueProvider) : void {
      pcfc.expressions.AddressBookDirectionsScreen_TemplatePanel1.render(__writer, __escaper, directions)
    }
    
    // 'value' attribute on TextInput (id=FromLoc) at AddressBookDirectionsScreen.pcf: line 21, column 42
    function value_0 () : java.lang.String {
      return directions.getStart()
    }
    
    // 'value' attribute on RowIterator at AddressBookDirectionsScreen.pcf: line 44, column 66
    function value_14 () : gw.api.contact.DrivingDirectionsElem[] {
      return directions.getElements()
    }
    
    // 'value' attribute on PanelIterator at AddressBookDirectionsScreen.pcf: line 80, column 48
    function value_18 () : gw.api.contact.MapImageUrl[] {
      return directions.getMapURLs()
    }
    
    // 'value' attribute on TextInput (id=ToLoc) at AddressBookDirectionsScreen.pcf: line 25, column 43
    function value_2 () : java.lang.String {
      return directions.getFinish()
    }
    
    // 'value' attribute on TextInput (id=TotalTime) at AddressBookDirectionsScreen.pcf: line 29, column 55
    function value_4 () : java.lang.String {
      return directions.getTotalTimeInMinutes()
    }
    
    // 'value' attribute on TextInput (id=TotalDist) at AddressBookDirectionsScreen.pcf: line 33, column 56
    function value_6 () : java.lang.String {
      return directions.getTotalDistanceString()
    }
    
    // 'visible' attribute on PanelSet at AddressBookDirectionsScreen.pcf: line 68, column 48
    function visible_16 () : java.lang.Boolean {
      return directions.hasMapOverviewUrl()
    }
    
    property get directions () : gw.api.contact.DrivingDirections {
      return getRequireValue("directions", 0) as gw.api.contact.DrivingDirections
    }
    
    property set directions ($arg :  gw.api.contact.DrivingDirections) {
      setRequireValue("directions", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/addressbook/AddressBookDirectionsScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry2ExpressionsImpl extends AddressBookDirectionsScreenExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // TemplatePanel at AddressBookDirectionsScreen.pcf: line 81, column 22
    function renderCall_17 (__writer :  java.io.Writer, __escaper :  gw.lang.parser.template.StringEscaper, __renderContext :  com.guidewire.pl.web.render.RenderContext, __valueProvider :  com.guidewire.pl.web.render.template.RenderTemplateValueProvider) : void {
      pcfc.expressions.AddressBookDirectionsScreen_TemplatePanel2.render(__writer, __escaper, mapURL)
    }
    
    property get mapURL () : gw.api.contact.MapImageUrl {
      return getIteratedValue(1) as gw.api.contact.MapImageUrl
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/addressbook/AddressBookDirectionsScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends AddressBookDirectionsScreenExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=Distance) at AddressBookDirectionsScreen.pcf: line 55, column 53
    function value_10 () : java.lang.String {
      return hop.getSegmentDistance()
    }
    
    // 'value' attribute on TextCell (id=Time) at AddressBookDirectionsScreen.pcf: line 60, column 58
    function value_12 () : java.lang.String {
      return hop.getSegmentTimeInMinutes()
    }
    
    // 'value' attribute on TextCell (id=TextDescription) at AddressBookDirectionsScreen.pcf: line 50, column 42
    function value_8 () : java.lang.String {
      return hop.getText()
    }
    
    property get hop () : gw.api.contact.DrivingDirectionsElem {
      return getIteratedValue(1) as gw.api.contact.DrivingDirectionsElem
    }
    
    
  }
  
  
}