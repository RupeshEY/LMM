package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/EditableRoomsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class EditableRoomsLVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/lossdetails/EditableRoomsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditableRoomsLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at EditableRoomsLV.pcf: line 39, column 41
    function sortValue_0 (room :  entity.DwellingRoomDamage) : java.lang.Object {
      return room.RoomType
    }
    
    // 'toAdd' attribute on RowIterator at EditableRoomsLV.pcf: line 20, column 47
    function toAdd_9 (room :  entity.DwellingRoomDamage) : void {
      dwellingIncident.addToDwellingRoomDamages( room )
    }
    
    // 'toRemove' attribute on RowIterator at EditableRoomsLV.pcf: line 20, column 47
    function toRemove_10 (room :  entity.DwellingRoomDamage) : void {
      dwellingIncident.removeFromDwellingRoomDamages( room )
    }
    
    // 'value' attribute on RowIterator at EditableRoomsLV.pcf: line 20, column 47
    function value_11 () : entity.DwellingRoomDamage[] {
      return dwellingIncident.DwellingRoomDamages
    }
    
    property get dwellingIncident () : DwellingIncident {
      return getRequireValue("dwellingIncident", 0) as DwellingIncident
    }
    
    property set dwellingIncident ($arg :  DwellingIncident) {
      setRequireValue("dwellingIncident", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/lossdetails/EditableRoomsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends EditableRoomsLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=NumberOfRooms) at EditableRoomsLV.pcf: line 31, column 29
    function defaultSetter_3 (__VALUE_TO_SET :  java.lang.Object) : void {
      room.NumberOfRooms = (__VALUE_TO_SET as java.lang.Integer)
    }
    
    // 'value' attribute on TypeKeyCell (id=RoomType) at EditableRoomsLV.pcf: line 39, column 41
    function defaultSetter_7 (__VALUE_TO_SET :  java.lang.Object) : void {
      room.RoomType = (__VALUE_TO_SET as typekey.RoomType)
    }
    
    // 'value' attribute on TextCell (id=NumberOfRooms) at EditableRoomsLV.pcf: line 31, column 29
    function valueRoot_4 () : java.lang.Object {
      return room
    }
    
    // 'value' attribute on TextCell (id=NumberOfRooms) at EditableRoomsLV.pcf: line 31, column 29
    function value_1 () : java.lang.Integer {
      return room.NumberOfRooms
    }
    
    // 'value' attribute on TypeKeyCell (id=RoomType) at EditableRoomsLV.pcf: line 39, column 41
    function value_5 () : typekey.RoomType {
      return room.RoomType
    }
    
    property get room () : entity.DwellingRoomDamage {
      return getIteratedValue(1) as entity.DwellingRoomDamage
    }
    
    
  }
  
  
}