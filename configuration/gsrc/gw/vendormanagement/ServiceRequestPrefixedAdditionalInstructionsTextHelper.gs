package gw.vendormanagement

uses gw.api.locale.DisplayKey

//utility class for stripping off and adding back a hidden prefix from a service request instruction's additional instruction text.
@Export
class ServiceRequestPrefixedAdditionalInstructionsTextHelper {

  static function getStrippedDisplayText(sr : ServiceRequest) : String{
    var insText = sr.Instruction.InstructionText
    if (insText == null) {insText = ""}
    var delim = DisplayKey.get("Web.ServiceRequest.InstructionPrefixSeparator")
    var subIndex = insText.indexOf(delim)
    return (subIndex == -1 ? insText : insText.substring(subIndex + delim.length())).trim()
  }

  static function updateInstructionText(sr : ServiceRequest, prefix : String, newSuffix : String = null) {
    var suffix = newSuffix == null ? getStrippedDisplayText(sr) : newSuffix
    sr.Instruction.InstructionText = prefix + "\n" + DisplayKey.get("Web.ServiceRequest.InstructionPrefixSeparator") + "\n" + suffix
  }
}