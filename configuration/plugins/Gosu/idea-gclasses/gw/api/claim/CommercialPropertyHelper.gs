package gw.api.claim

@Export
class CommercialPropertyHelper {

  /**
   * Keeps track of a damage sub object on a claim, such as a PropertyFireDamage
   */
  static class DamageManager {
  
    var _claim : Claim as readonly Claim
    var _claimProperty : gw.lang.reflect.IPropertyInfo as readonly ClaimProperty
  
    construct(inClaim : Claim, propertyName : String) {
      _claim = inClaim
      _claimProperty = entity.Claim.Type.TypeInfo.getProperty(propertyName)
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
  protected var _propertyFireDamage : DamageManager

  construct(claim : Claim) {
    _claim = claim
    _propertyFireDamage = new DamageManager(claim, "PropertyFireDamage")
  }

  property get PropertyFireDamage() : DamageManager {
    return _propertyFireDamage
  }
  
  function createDamageTypesPerLossCause() {
    if(_claim.LossCause == TC_FIRE) {
      _propertyFireDamage.Present = true
    } else {
      _propertyFireDamage.Present = false
    }
  }
}
