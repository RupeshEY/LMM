package libraries

@Export
enhancement PolicySearchCriteria : entity.PolicySearchCriteria
{
  /**this method resets the fields on PolicySearchCriteria, add/remove fields for customization
    */
  function resetPolicySearchCriteria()
  {
    this.PolicyNumber = null
    this.FirstName = null
    this.LastName = null
    this.CompanyName = null
    var currentUser: User = User.util.getCurrentUser()
    this.PolicyType = currentUser.PolicyType
    this.LossDate = null
    this.TaxIdString = null
    //this.City = null;
    this.InsuredAddress.City = null
    this.InsuredAddress.CityKanji = null
    this.InsuredAddress.State = null
    this.InsuredAddress.PostalCode = null
    this.InsuredAddress.Country = null
    this.Vin = null
    this.IncludeArchived = false
  }

}