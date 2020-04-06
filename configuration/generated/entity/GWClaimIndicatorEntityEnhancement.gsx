package entity

@javax.annotation.Generated("com.guidewire.pl.metadata.codegen.Codegen", "", "ClaimIndicator.eti;ClaimIndicator.eix;ClaimIndicator.etx")
enhancement GWClaimIndicatorEntityEnhancement : entity.ClaimIndicator {
  function update () : void {
    (com.guidewire.pl.persistence.code.EntityInternalAccess.getImplementation(this, "gw.api.claim.indicator.ClaimIndicatorMethods") as gw.api.claim.indicator.ClaimIndicatorMethods).update()
  }
  
  property get HoverText () : java.lang.String {
    return (com.guidewire.pl.persistence.code.EntityInternalAccess.getImplementation(this, "gw.api.claim.indicator.ClaimIndicatorMethods") as gw.api.claim.indicator.ClaimIndicatorMethods).HoverText
  }
  
  property get Icon () : java.lang.String {
    return (com.guidewire.pl.persistence.code.EntityInternalAccess.getImplementation(this, "gw.api.claim.indicator.ClaimIndicatorMethods") as gw.api.claim.indicator.ClaimIndicatorMethods).Icon
  }
  
  property get Text () : java.lang.String {
    return (com.guidewire.pl.persistence.code.EntityInternalAccess.getImplementation(this, "gw.api.claim.indicator.ClaimIndicatorMethods") as gw.api.claim.indicator.ClaimIndicatorMethods).Text
  }
  
  
}