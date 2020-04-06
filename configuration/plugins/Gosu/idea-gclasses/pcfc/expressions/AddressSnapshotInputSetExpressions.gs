package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/default/shared/AddressSnapshotInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class AddressSnapshotInputSetExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/default/shared/AddressSnapshotInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddressSnapshotInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextInput (id=LossLocationCode) at AddressSnapshotInputSet.pcf: line 33, column 117
    function valueRoot_13 () : java.lang.Object {
      return Claim
    }
    
    // 'value' attribute on TextInput (id=Address_Name) at AddressSnapshotInputSet.pcf: line 17, column 36
    function valueRoot_2 () : java.lang.Object {
      return Address
    }
    
    // 'value' attribute on TextInput (id=Address_Name) at AddressSnapshotInputSet.pcf: line 17, column 36
    function value_0 () : dynamic.Dynamic {
      return Address.DisplayName
    }
    
    // 'value' attribute on TextInput (id=LossLocationCode) at AddressSnapshotInputSet.pcf: line 33, column 117
    function value_10 () : dynamic.Dynamic {
      return Claim.LossLocationCode
    }
    
    // 'value' attribute on TextInput (id=JurisdictionState) at AddressSnapshotInputSet.pcf: line 39, column 30
    function value_15 () : dynamic.Dynamic {
      return Claim.JurisdictionState
    }
    
    // 'value' attribute on TextInput (id=AddressType) at AddressSnapshotInputSet.pcf: line 22, column 36
    function value_3 () : dynamic.Dynamic {
      return Address.AddressType
    }
    
    // 'value' attribute on TextInput (id=ValidUntil) at AddressSnapshotInputSet.pcf: line 27, column 36
    function value_6 () : dynamic.Dynamic {
      return Address.ValidUntil
    }
    
    // 'visible' attribute on TextInput (id=JurisdictionState) at AddressSnapshotInputSet.pcf: line 39, column 30
    function visible_14 () : java.lang.Boolean {
      return Claim!=null
    }
    
    // 'visible' attribute on TextInput (id=LossLocationCode) at AddressSnapshotInputSet.pcf: line 33, column 117
    function visible_9 () : java.lang.Boolean {
      return Claim != null and Address.Country.Code == "US" and Claim.LossType.Code != "WC"
    }
    
    property get Address () : dynamic.Dynamic {
      return getRequireValue("Address", 0) as dynamic.Dynamic
    }
    
    property set Address ($arg :  dynamic.Dynamic) {
      setRequireValue("Address", 0, $arg)
    }
    
    property get Claim () : dynamic.Dynamic {
      return getRequireValue("Claim", 0) as dynamic.Dynamic
    }
    
    property set Claim ($arg :  dynamic.Dynamic) {
      setRequireValue("Claim", 0, $arg)
    }
    
    
  }
  
  
}