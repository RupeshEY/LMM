package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/FNOL/NewClaimWizard_PartyInvolvedPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class NewClaimWizard_PartyInvolvedPopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.NewClaimWizard_PartyInvolvedPopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (Wizard :  gw.api.claim.NewClaimWizardInfo, ClaimContact :  ClaimContact, IsNew :  boolean) : pcf.api.Destination {
    return __newDestination(config(), {Wizard, ClaimContact, IsNew}, 0)
  }
  
  static function createDestination (WizardBase :  gw.api.claim.NewClaimWizardInfoBase, ClaimContact :  ClaimContact, IsNew :  boolean, IsDuplicate :  boolean, roles :  gw.api.contact.ClaimContactRoleWrapper) : pcf.api.Destination {
    return __newDestination(config(), {WizardBase, ClaimContact, IsNew, IsDuplicate, roles}, 1)
  }
  
  static function push (Wizard :  gw.api.claim.NewClaimWizardInfo, ClaimContact :  ClaimContact, IsNew :  boolean) : pcf.api.Location {
    return __newDestination(config(), {Wizard, ClaimContact, IsNew}, 0).push()
  }
  
  static function push (WizardBase :  gw.api.claim.NewClaimWizardInfoBase, ClaimContact :  ClaimContact, IsNew :  boolean, IsDuplicate :  boolean, roles :  gw.api.contact.ClaimContactRoleWrapper) : pcf.api.Location {
    return __newDestination(config(), {WizardBase, ClaimContact, IsNew, IsDuplicate, roles}, 1).push()
  }
  
  
}