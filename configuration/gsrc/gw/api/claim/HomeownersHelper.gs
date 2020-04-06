package gw.api.claim
uses gw.api.locale.DisplayKey
uses gw.api.address.ClaimAddressOwner
uses gw.api.address.CCAddressOwner

@Export
abstract class HomeownersHelper {

  /**
   * Checkbox icon representing dwelling incidents
   */
  public static final var CHECKBOX_DWELLING_ICON : String = "checkbox_dwelling.png"

  /**
   * Checkbox icon representing other structures incidents
   */
  public static final var CHECKBOX_OTHER_STRUCTURES_ICON : String = "checkbox_otherStructures.png"

  /**
   * Checkbox icon representing living expenses incidents
   */
  public static final var CHECKBOX_LIVING_EXPENSES_ICON : String = "checkbox_lossOfUse.png"

  /**
   * Checkbox icon representing other proeprty contents incidents
   */
  public static final var CHECKBOX_PROPERTY_CONTENTS_ICON : String = "checkbox_contents.png"

  /**
   * Keeps track of a damage sub object on a claim, such as a PropertyFireDamage
   * or PropertyWaterDamage
   */
  static class DamageManager {
  
    var _claim : Claim as readonly Claim
    var _claimProperty : gw.lang.reflect.IPropertyInfo as readonly ClaimProperty
    var _icon : String as readonly Icon
  
    construct(inClaim : Claim, iconName : String, propertyName : String) {
      _claim = inClaim
      _claimProperty = entity.Claim.Type.TypeInfo.getProperty(propertyName)
      _icon = iconName
    }

    /** The name to use in the UI for this type of damage object */
    property get Name() : String {
      return DisplayKey.get("Web.Homeowners.LossDetails." + (ClaimProperty.Name))
    }
    
    /** Is the damage object present? */
    property get Present() : boolean {
      return _claimProperty.Accessor.getValue(_claim) != null
    }
    
    /** Set the presence of the damage object - creates or removes it as necessary */
    property set Present(newValue : boolean) {
      if (Present != newValue) {
        if (newValue) {
          var constructor = _claimProperty.FeatureType.TypeInfo.getConstructor({})
          _claimProperty.Accessor.setValue(_claim, constructor.Constructor.newInstance({}))
        } else {
          var bean = _claimProperty.Accessor.getValue(_claim) as KeyableBean
          bean.remove()
          _claimProperty.Accessor.setValue(_claim, null)
        }
      }
    }
  }

  protected var _claim : Claim
  protected var _damages : DamageManager[] as readonly Damages
  protected var _locationChoice : String
  protected var _dwellingIncident : DwellingIncident as readonly DwellingIncident
  protected var _otherStructureIncident : OtherStructureIncident as readonly OtherStructureIncident
  protected var _propertyContentsIncident : PropertyContentsIncident as readonly PropertyContentsIncident
  protected var _livingExpensesIncident : LivingExpensesIncident as readonly LivingExpensesIncident
  private var _incidentListUIHelper : IncidentListUIHelper as readonly IncidentListUIHelper
  

  private static class HomeownersClaimAddressOwner extends ClaimAddressOwner {

    construct(c : Claim) {
      super(c)
    }
    
    override property get Addresses() : Address[] {
      // Remove the primary address of the policy from the usual list
      var addressList = super.Addresses.toList()
      addressList.remove(Claim.Policy.PrimaryLocation.Address)
      return addressList.toTypedArray()
    }
    
  }
  
  construct(claim : Claim, listUIHelper : IncidentListUIHelper) {
    _claim = claim
    _damages = getDamages(claim)
    _dwellingIncident = claim.DwellingIncidentsOnly.length > 0 ? claim.DwellingIncidentsOnly[0] : null
    _otherStructureIncident = claim.OtherStructureIncidentsOnly.length > 0 ? claim.OtherStructureIncidentsOnly[0] : null
    _propertyContentsIncident = claim.PropertyContentsIncidentsOnly.length > 0 ? claim.PropertyContentsIncidentsOnly[0] : null
    _livingExpensesIncident = claim.LivingExpensesIncidentsOnly.length > 0 ? claim.LivingExpensesIncidentsOnly[0] : null
    _incidentListUIHelper = listUIHelper
  }

  static function getDamages(claim : Claim) : DamageManager[] {
    return {
      new DamageManager(claim, "icon_fire.png", "PropertyFireDamage"),
      new DamageManager(claim, "icon_water.png", "PropertyWaterDamage")
    }
  }

  property get DamageNames() : String[] {
    return Damages.map(\ d -> d.ClaimProperty.Name)
  }
  
  property get SelectedDamageNames() : String[] {
    return Damages.where(\ d -> d.Present).map(\ d -> d.ClaimProperty.Name)
  }
  
  property set SelectedDamageNames(selectedNames : String[]) {
    for (d in Damages) {
      d.Present = selectedNames.contains(d.ClaimProperty.Name)
    }
  }
  
  function getDamageManagerByPropertyName(propertyName : String) : DamageManager {
    return Damages.firstWhere(\ d -> d.ClaimProperty.Name == propertyName)
  }
  
  function setDamageAccordingToLossCause() {
    switch(_claim.LossCause) {
    case LossCause.TC_FIRE:
      setDamagePresent("PropertyFireDamage")
      break
    case LossCause.TC_WATERDAMAGE:
      setDamagePresent("PropertyWaterDamage")
      break
    }      
  }

  function setDamagePresent(propertyName : String) {
    Damages.firstWhere(\ d -> d.ClaimProperty.Name == propertyName).Present = true
  }
  
  function getAddressesWithoutPrimaryLocation() : CCAddressOwner {
    return new HomeownersClaimAddressOwner(_claim)
  }
  
  property set LocationChoice(v : String) {
    _locationChoice = v
    
    if (_claim.LossLocation != null && _locationChoice.equals("primary")) {
      _claim.LossLocation = _claim.Policy.PrimaryLocation.Address
    } else if (_locationChoice.equals("other")) {
      _claim.LossLocation = null 
    }
  }  

  property get LocationChoice() : String {
    return _locationChoice
  }
}
