package gw.pcf

uses gw.api.locale.DisplayKey

@Export
class RelatedToUtil {

  /**
   * Identify the input group of a keyable bean in the RelatedTo typelist.
   *
   * Beans will be categorized by their type: Contact, Exposure, Matter, ServiceRequest
   */
  public static function getOptionGroupLabel(aKeyableBean : KeyableBean) : String {

    if (aKeyableBean typeis Contact) {
      return DisplayKey.get("Web.RelatedTo.OptionGroups.Contact")
    } else if (aKeyableBean typeis Exposure) {
      return DisplayKey.get("Web.RelatedTo.OptionGroups.Exposure")
    } else if (aKeyableBean typeis Matter) {
      return DisplayKey.get("Web.RelatedTo.OptionGroups.Matter")
    } else if (aKeyableBean typeis ServiceRequest) {
      return DisplayKey.get("Web.RelatedTo.OptionGroups.ServiceRequest")
    }
    // There is only one claim.. but we separate it from the other groups
    // into a blank group.
    return DisplayKey.get("Web.RelatedTo.OptionGroups.Claim")


  }

  /**
   * RelatedTo Field shows different types of beans.
   * Render the label using display name except for the claim bean.
   *
   * Show claim bean as "Claim" instead of the default display name (claim number).
   */
  public static function getOptionLabel(aKeyableBean : KeyableBean) : String {
    if (aKeyableBean typeis Claim) {
      return DisplayKey.get("Web.RelatedTo.OptionLabel.Claim")
    } else {
      return aKeyableBean.DisplayName
    }
  }

  /**
   * Identify the input group of a keyable bean in the RelatedTo drop down.
   *
   * Beans will be categorized by their type: Claim, Incident, Exposure.
   */
  public static function getServiceRequestOptionGroupLabel(aKeyableBean: KeyableBean): String {
    if (aKeyableBean typeis Claim) {
      return DisplayKey.get("Web.ServiceRequest.RelatedTo.OptionGroups.Claim")
    } else if (aKeyableBean typeis Incident) {
      return DisplayKey.get("Web.ServiceRequest.RelatedTo.OptionGroups.Incident")
    } else if (aKeyableBean typeis Exposure) {
      return DisplayKey.get("Web.ServiceRequest.RelatedTo.OptionGroups.Exposure")
    }
    return ""
  }

  /**
   * RelatedTo Field shows different types of beans.
   * Render the label using display name except for the claim bean.
   *
   * Show claim bean as "Claim" instead of the default display name (claim number).
   */
  public static function getServiceRequestOptionLabel(aKeyableBean: KeyableBean): String {
    if (aKeyableBean typeis Claim) {
      return DisplayKey.get("Web.RelatedTo.OptionLabel.Claim")
    } else if (aKeyableBean typeis Incident) {
      return aKeyableBean.TypePrefixedIncidentName
    } else {
      return aKeyableBean.DisplayName
    }
  }
}