package gw.entity

uses gw.api.locale.DisplayKey

@Export
enhancement GWBusinessWeekZoneEnhancement : entity.BusinessWeekZone {
  property get ShortDescription() : String {
    return DisplayKey.get("Web.Admin.BusinessWeek.DuplicateZones.Zone", this.BusinessWeek.Name, this.Country.DisplayName, this.ZoneType.DisplayName, this.Code)
  }
}
