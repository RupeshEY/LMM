package gw.entity

@Export
enhancement GWPropertyIncidentEnhancement : PropertyIncident {
  
  property get EstimatesReceivedBoolean() : Boolean {
    return this.EstimatesReceived == null or this.EstimatesReceived == YesNo.TC_UNKNOWN
        ? null
        : this.EstimatesReceived == YesNo.TC_YES
  }

  property set EstimatesReceivedBoolean(value : Boolean) {
    this.EstimatesReceived = value == null
        ? null
        : (value ? YesNo.TC_YES : YesNo.TC_NO)
  }
}
