package gw.entity

uses gw.api.locale.DisplayKey

@Export
enhancement GWIncidentEnhancement : entity.Incident {
  
  /**
   * Gets the incident's display name prefixed with the incidents type
   */
  property get TypePrefixedIncidentName(): String {

    var subtype = this.Subtype
    var incidentDisplayName = this.DisplayName
    
    // Incident description has not been added
    if (incidentDisplayName.equals(DisplayKey.get("DisplayName.EmptyAddress")) or incidentDisplayName.equals(DisplayKey.get("Java.DisplayName.NewlyCreated")) or incidentDisplayName.Empty) {
      incidentDisplayName = DisplayKey.get("Web.Incident.NoDescription")

      if(this.Exposures.Count > 0) {
        var incidentExposureType = this.Exposures.first().ExposureType
        if(this.Exposures.allMatch( \ exposure -> exposure.ExposureType == incidentExposureType)) {
          incidentDisplayName = incidentExposureType.DisplayName
        }
      }
    }
    
    if (subtype == typekey.Incident.TC_INCIDENT) {
        return incidentDisplayName
    }
    
    var prefix = ""
    var displayKeyName = "Web.Incident.PrefixName." + subtype.Code
    prefix = gw.api.locale.DisplayKey.get(displayKeyName)       
    
    if (prefix == displayKeyName) {
      return incidentDisplayName
    }    
    
    return prefix + ": " + incidentDisplayName
  }
}
