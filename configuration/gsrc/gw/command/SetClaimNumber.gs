package gw.command
uses gw.api.util.DisplayableException
uses com.guidewire.pl.quickjump.Argument

@Export
class SetClaimNumber extends CCBaseCommand {

  /**
   * To use: "Run SetClaimNumber to 123-45-678901"
   */
  @Argument("new ClaimNumber")
  function to() {
     var claim = TopLocation.getVariable("Claim").Value
     if (claim typeis Claim) {
       claim.ClaimNumber = Argument
       claim.ClaimInfo.ClaimNumber = Argument
       claim.Bundle.commit()
     } else {
       throw new DisplayableException("Expected Claim but found " + typeof claim);
     }
  }

}
