package libraries

@Export
enhancement Payment : entity.Payment
{
  
  //If this method is still used, please uncomment the following code and 
  //make sure deductiblestatus is added in the extensions table
  /*function showDeductible(): Boolean {

    
  if (this.Claim.DeductibleStatus!="paid" and
  (this.Claim.LOBCode=="pr" or this.Claim.LOBCode == "auto" or
  this.Claim.LOBCode =="gl" or this.Claim.LOBCode == "wc" ) and
  this.CostType == "claimcost") {

  return true
  }

  else return false
  }*/

  function isPayeeClaimant() : Boolean {
    for (payee in this.Check.Payees) {
      if (payee.PayeeType==TC_CLAIMANT or payee.PayeeType==TC_INSURED) {
        return true
      }
    }
    return false
  }

  function sampleDeductible () : java.math.BigDecimal {

  if (this.Exposure.Coverage.Deductible!=null) {

  return this.Exposure.Coverage.Deductible

  }

  else {

  return 0

  }

  }

  //If this method is still used, please uncomment the following code and 
  //make sure originalamount and deductibleamount are added in the extensions table
  /*function calculateNetAmount() : java.math.BigDecimal {
  
      if (this.OriginalAmount==null or this.DeductibleAmount==null or this.OriginalAmount<this.DeductibleAmount) {
  
  return 0
  
  }
  else return  (this.OriginalAmount - this.DeductibleAmount)
  
  }
*/
  function isNewPayment() : boolean {
    return this.New
  }

}