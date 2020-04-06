package gw.entity

uses gw.api.locale.DisplayKey
uses java.util.ArrayList
uses java.lang.StringBuffer
uses java.util.List

@Export
enhancement GWPolicyWorkCompEnhancement : entity.Policy {
  
  /**
   * Checks the covered party constraints to make sure they are satisfied. They are<ul>
   * <li>The covered parties may not contain the insured.</li>
   * <li>The covered parties may not contain any of the excluded parties.</li>
   * </ul>
   *
   * @return validation result contianing errors (if any) found during the check
   */
  public function checkCoveredPartyConstraints() : String {
    var messages = new ArrayList<String>()
    
    // Covered parties (additional covered parties) can't contain the insured on the policy
    var insured = this.getContactByRole(ContactRole.TC_INSURED)
    if (this.containsCoveredParty(insured)) {
      messages.add(DisplayKey.get("Java.Policy.CoveredParties.Error.ListedAsInsured", insured.getDisplayName()))
      
    }
    // or appear in the excluded parties list
    var excludedParties = this.getContactsByRole(ContactRole.TC_EXCLUDEDPARTY)
    for (excludedParty in excludedParties) {
      if (excludedParty != null) {
        if (this.containsCoveredParty(excludedParty)) {
          messages.add(DisplayKey.get("Java.Policy.CoveredParties.Error.ListedAsExcluded", excludedParty.DisplayName))
        }
      }
    }
    
    return formatConstraintsValidationMessage(messages)
  }

  /**
   * Checks the excluded party constraints to make sure they are satisfied. They are<ul>
   * <li>The excluded parties may not contain the insured.</li>
   * <li>The excluded parties may not contain any of the covered parties.</li>
   * </ul>
   *
   * @return validation result contianing errors (if any) found during the check
   */
  public function checkExcludedPartyConstraints() : String {
    var messages = new ArrayList<String>()
    // excluded parties can't contain the insured
    var insured = this.getContactByRole(ContactRole.TC_INSURED)
    if (this.containsExcludedParty(insured)) {
      messages.add(DisplayKey.get("Java.Policy.ExcludedParties.Error.ListedAsInsured", insured.getDisplayName()))
    }
    // or appear in the covered parties list
    var coveredParties = this.getContactsByRole(ContactRole.TC_COVEREDPARTY)
    for (coveredParty in coveredParties) {
      if (coveredParty != null) {
        if (this.containsExcludedParty(coveredParty)) {
          messages.add(DisplayKey.get("Java.Policy.ExcludedParties.Error.ListedAsCovered", coveredParty.getDisplayName()))
        }
      }
    }

    return formatConstraintsValidationMessage(messages)
  }
  
  private function formatConstraintsValidationMessage(messages : List<String>) : String {

    if (messages.Empty) {
      return null 
    } else {
      var result = new StringBuffer()
      
      messages.eachWithIndex(\ msg, i -> {
            if (i > 0) {
              result.append(" ")
            }
            result.append(msg)
      })
      
      return result.toString()
    }    
  }
}
