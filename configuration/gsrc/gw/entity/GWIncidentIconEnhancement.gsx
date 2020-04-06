package gw.entity
uses gw.api.claim.IncidentIconSet
uses java.lang.IllegalStateException

@Export
enhancement GWIncidentIconEnhancement : entity.Incident {

  /**
   * Return the default icon set registered for incidents of this incident's type.
   * the icon set contains icons used when displaying incidents of this type in the
   * UI.
   * <p>
   * Throws IllegalStateException if there is no icon set registered for this type of incident
   */
  property get DefaultIconSet() : IncidentIconSet {
    var iconSet = IncidentIconSet.getIconSetForType(typeof this)
    if (iconSet == null) {
      throw new IllegalStateException("No default icon set registered for incidents of type " + typeof this
              + " please add a new entry to the list of registered icon sets in IncidentIconSet")
    }
    return iconSet
  }

  /**
   * Return the header icon used in the toolbar header when displaying details of
   * this type of incident
   * <p>
   * Throws IllegalStateException if there is no icon set registered for this type of incident
   */
  property get HeaderIcon() : String {
    return DefaultIconSet.getHeaderIcon(this)
  }

  /**
   * Return the panel icon used when displaying icons of this type in small detail
   * view summary panels (typically used on loss details pages)
   * <p>
   * Throws IllegalStateException if there is no icon set registered for this type of incident
   */
  property get PanelIcon() : String {
    return DefaultIconSet.getPanelIcon(this)
  }
}
