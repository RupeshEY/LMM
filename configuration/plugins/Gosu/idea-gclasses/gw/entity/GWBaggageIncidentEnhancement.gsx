package gw.entity

@Export
enhancement GWBaggageIncidentEnhancement : entity.BaggageIncident
{
  function createTravelContentItemLine() : AssessmentContentItem {
    var item = new AssessmentContentItem()
    var maxOrderedItem = this.OrderedContentItemLine.lastWhere( \ a -> a.IncidentOrder != null )
    if(maxOrderedItem != null and maxOrderedItem.IncidentOrder != null) {
      item.IncidentOrder = maxOrderedItem.IncidentOrder + 1
    } else {
      item.IncidentOrder = 1
    }
    item.ContentSchedule = ContentLineItemSchedule.TC_TRAVEL
    item.NumberOfItems = 1
    this.addToContentItemLine( item )
    return item
  }
  
  property get TravelContentItemLines() : AssessmentContentItem[] {
    return this.OrderedContentItemLine.where( \ a -> a.ContentSchedule == TC_TRAVEL )
  }
  
  function updateLineItemsBeforeCommit() {
    for (item in this.ContentItemLine) {
      if (item.New or item.Changed) {
        item.ItemComment = item.calculateNotes()
      }
      
    }
  }
}
