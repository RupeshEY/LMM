package gw.entity

uses java.lang.Integer
uses java.lang.Long
uses gw.api.upgrade.Coercions

/**
 * Properties for accessing StatCode properties on a PolicyStatCodeFilterCriteria.
 */
@Export
enhancement GWPolicyStatCodeFilterCriteriaEnhancement : entity.PolicyStatCodeFilterCriteria {

  property get LineNumber() : Integer { return Coercions.makeIntFrom(this.getPropertyValueToMatch("LineNumber")) }
  property set LineNumber(value : Integer) { this.setPropertyValueToMatch("LineNumber", value) }

  property get LocationNumber() : String { return this.getPropertyValueToMatch("LocationNumber") as String }
  property set LocationNumber(value : String) { this.setPropertyValueToMatch("LocationNumber", value) }

  property get BuildingNumber() : String { return this.getPropertyValueToMatch("BuildingNumber") as String }
  property set BuildingNumber(value : String) { this.setPropertyValueToMatch("BuildingNumber", value) }

  property get VehicleNumber() : String { return this.getPropertyValueToMatch("VehicleNumber") as String }
  property set VehicleNumber(value : String) { this.setPropertyValueToMatch("VehicleNumber", value) }

  property get ClassCode() : String { return this.getPropertyValueToMatch("ClassCode") as String }
  property set ClassCode(value : String) { this.setPropertyValueToMatch("ClassCode", value) }

  property get Notes() : String { return this.getPropertyValueToMatch("Notes") as String }
  property set Notes(value : String) { this.setPropertyValueToMatch("Notes", value) }

  property get InsuranceLine() : InsuranceLine { return this.getPropertyValueToMatch("InsuranceLine") as InsuranceLine }
  property set InsuranceLine(value : InsuranceLine) { this.setPropertyValueToMatch("InsuranceLine", value) }

  property get InsuranceSubLine() : InsuranceSubLine { return this.getPropertyValueToMatch("InsuranceSubLine") as InsuranceSubLine }
  property set InsuranceSubLine(value : InsuranceSubLine) { this.setPropertyValueToMatch("InsuranceSubLine", value) }

  property get State() : State { return this.getPropertyValueToMatch("State") as State }
  property set State(value : State) { this.setPropertyValueToMatch("State", value) }

  property get MajorPeril() : MajorPerils { return this.getPropertyValueToMatch("MajorPeril") as MajorPerils }
  property set MajorPeril(value : MajorPerils) { this.setPropertyValueToMatch("MajorPeril", value) }

  property get LoadCommandID() : Long { return Coercions.makeLongFrom(this.getPropertyValueToMatch("LoadCommandID")) }
  property set LoadCommandID(value : Long) { this.setPropertyValueToMatch("LoadCommandID", value) }

}
