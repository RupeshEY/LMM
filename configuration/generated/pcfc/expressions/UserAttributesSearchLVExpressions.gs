package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/users/UserAttributesSearchLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class UserAttributesSearchLVExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/users/UserAttributesSearchLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends UserAttributesSearchLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=Name) at UserAttributesSearchLV.pcf: line 23, column 35
    function valueRoot_5 () : java.lang.Object {
      return Attribute
    }
    
    // 'value' attribute on TextCell (id=Name) at UserAttributesSearchLV.pcf: line 23, column 35
    function value_3 () : java.lang.String {
      return Attribute.Name
    }
    
    // 'value' attribute on TextCell (id=Description) at UserAttributesSearchLV.pcf: line 27, column 42
    function value_6 () : java.lang.String {
      return Attribute.Description
    }
    
    // 'value' attribute on TypeKeyCell (id=Type) at UserAttributesSearchLV.pcf: line 32, column 50
    function value_9 () : typekey.UserAttributeType {
      return Attribute.Type
    }
    
    property get Attribute () : entity.Attribute {
      return getIteratedValue(1) as entity.Attribute
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/admin/users/UserAttributesSearchLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class UserAttributesSearchLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at UserAttributesSearchLV.pcf: line 23, column 35
    function sortValue_0 (Attribute :  entity.Attribute) : java.lang.Object {
      return Attribute.Name
    }
    
    // 'value' attribute on RowIterator at UserAttributesSearchLV.pcf: line 27, column 42
    function sortValue_1 (Attribute :  entity.Attribute) : java.lang.Object {
      return Attribute.Description
    }
    
    // 'value' attribute on RowIterator at UserAttributesSearchLV.pcf: line 32, column 50
    function sortValue_2 (Attribute :  entity.Attribute) : java.lang.Object {
      return Attribute.Type
    }
    
    // 'value' attribute on RowIterator at UserAttributesSearchLV.pcf: line 18, column 76
    function value_12 () : gw.api.database.IQueryBeanResult<entity.Attribute> {
      return SearchResult
    }
    
    property get SearchResult () : gw.api.database.IQueryBeanResult<Attribute> {
      return getRequireValue("SearchResult", 0) as gw.api.database.IQueryBeanResult<Attribute>
    }
    
    property set SearchResult ($arg :  gw.api.database.IQueryBeanResult<Attribute>) {
      setRequireValue("SearchResult", 0, $arg)
    }
    
    
  }
  
  
}