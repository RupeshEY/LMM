package gw.entity

uses gw.api.locale.DisplayKey
uses gw.api.util.DisplayableException
uses gw.api.database.Query
uses java.lang.StringBuilder

@Export
enhancement GWBusinessWeekEnhancement : entity.BusinessWeek {
  /**
   * Used for validating new or edited BusinessWeeks. Finds any existing BusinessWeekZones that conflict with those that
   * are already in the database and throws a DisplayableException if it does.
   */  
  function validateNoOverlapWithExisting() {
    var theseZones = this.BusinessWeekZones
    if(theseZones.IsEmpty) return
    var existing = Query.make(BusinessWeekZone).or(\ restrict -> {
        for(bwz in theseZones) {
          restrict.and(\ r1 -> {
            r1.compare("Code", Equals, bwz.Code)
            r1.compare("Country", Equals, bwz.Country)
            r1.compare("ZoneType", Equals, bwz.ZoneType)
          })
        }
    }).select().toList()
    if(!this.New)
      existing = existing.where(\ e -> e.BusinessWeek.ID!=this.ID)  //if editing existing BW, filter out 'this'
    if(!existing.Empty) {
      var sb = new StringBuilder()
      existing.eachWithIndex(\ e, i -> { 
        if(i>0) sb.append("; ")
        sb.append(e.ShortDescription)
      })
      throw new DisplayableException(DisplayKey.get("Web.Admin.BusinessWeek.DuplicateZones", this.Name, sb.toString()))
    }
  }
}
