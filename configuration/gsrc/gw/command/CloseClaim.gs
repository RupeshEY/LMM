package gw.command

uses gw.api.util.DisplayableException
uses com.guidewire.pl.quickjump.BaseCommand
uses com.guidewire.pl.quickjump.DefaultMethod
uses com.guidewire.pl.quickjump.Argument

@DefaultMethod("withDefault")
@Export
class CloseClaim extends BaseCommand {
  
  
  @Argument("claims", "claim")
  function multiple() {
    var claims = getArgument("claims").split(",")
    for (claim in claims) {
      number(claim)
    }
  }
  
  @Argument("claim", "claim")
  function number() {
    number(getArgument("claim"))
  }
  
  private function number(claimNumber:String) {
     var claim = Claim.finder.findClaimByClaimNumber(claimNumber)
     gw.transaction.Transaction.runWithNewBundle(\ bundle -> {
           claim = bundle.add(claim)
           if (claim typeis Claim) {
             if (!claim.Closed) {
                 for (act in claim.Activities) {
                   if (act.canSkip()) {
                      act.skip()
                   }
                   else if (act.canComplete()) {
                     act.complete()
                   }
                 }
                 for (exp in claim.Exposures) {
                   if (!exp.Closed) {
                    exp.close(TC_COMPLETED, "Forced close")
                   }
                 }
                 for (matter in claim.Matters) {
                   if (!matter.Closed) {
                    matter.close(TC_SO, "Forced close")
                   }
                 }
                 if (claim.FaultRating == null || claim.FaultRating == TC_0) {
                   claim.FaultRating = TC_NOFAULT
                 }
                 for (var subrogation in claim.SubrogationSummary.Subrogations) {
                   if (subrogation.Status == TC_OPEN or  subrogation.Status ==TC_REVIEW) {
                     subrogation.Status = TC_CLOSED
                   }
                 }
                 claim.close(TC_COMPLETED, "Forced close")
                 claim.Bundle.commit()
             }
           }
           else {
             throw new DisplayableException("Expected Claim but found " + typeof claim);
           }
     } )//end transaction     
  }
  
    function withDefault() {
     var foundVar = TopLocation.getVariable("Claim")
     var claim = foundVar.Value
     if (claim typeis Claim) {
       number(claim.ClaimNumber)
     }
     else {
       throw new DisplayableException("Expected Claim but found " + typeof claim);
     }
  }

}
