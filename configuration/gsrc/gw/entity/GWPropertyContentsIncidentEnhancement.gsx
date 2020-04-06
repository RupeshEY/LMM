package gw.entity

@Export
enhancement GWPropertyContentsIncidentEnhancement : PropertyContentsIncident
{
  function createHomeownersContentItemLine() : AssessmentContentItem {
    var item = new AssessmentContentItem()
    var maxOrderedItem = this.OrderedContentItemLine.lastWhere( \ a -> a.IncidentOrder != null )
    if(maxOrderedItem != null and maxOrderedItem.IncidentOrder != null) {
      item.IncidentOrder = maxOrderedItem.IncidentOrder + 1
    } else {
      item.IncidentOrder = 1
    }
    item.ContentSchedule = ContentLineItemSchedule.TC_HOMEOWNERS
    item.NumberOfItems = 1
    this.addToContentItemLine( item )
    return item
  }
  
  property get HomeownersContentItemLines() : AssessmentContentItem[] {
    return this.OrderedContentItemLine.where( \ a -> a.ContentSchedule == TC_HOMEOWNERS )
  }
  
}
